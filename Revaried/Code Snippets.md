# Code Snippets
## `VSEvents` at `onBiomeLoading()`
```java
private static boolean biome(BiomeLoadingEvent event, RegistryKey<Biome> biome) {
  return event.getName() != null && event.getName().equals(biome.getRegistryName());
}
```

## `ExplodeBehavior`
```java
public static final Codec<Explosion.Mode> BLOCK_INTERACTION_CODEC = Codec.STRING.comapFlatMap(NBTUtils::readExplosionMode, mode -> mode.toString().toLowerCase(Locale.ROOT));
public static final Codec<ExplodeBehavior> CODEC = RecordCodecBuilder.create(instance -> instance.group(
    Codec.floatRange(0F, 128F).fieldOf("radius").forGetter(ExplodeBehavior::getExplosionRadius),
    Codec.BOOL.fieldOf("creates_fire").orElse(false).forGetter(ExplodeBehavior::createsFire),
    Codec.BOOL.fieldOf("spawn_effect_cloud").orElse(false).forGetter(ExplodeBehavior::spawnsEffectCloud),
    BlockPos.CODEC.fieldOf("pos").orElse(BlockPos.ZERO).forGetter(ExplodeBehavior::getExplosionPos),
    Codec.STRING.fieldOf("source").forGetter(behavior -> "explosion"),
    BLOCK_INTERACTION_CODEC.fieldOf("mode").forGetter(ExplodeBehavior::getExplosionMode)
  ).apply(instance, ExplodeBehavior::new));
```

## `ConsumeBehavior` at `getBehaviorProperties()`
```java
if (this.getMultiBehaviorIndex() != 0) {
  CompoundNBT behaviorTag = stewStack.getTagElement("behavior");
  if (behaviorTag != null && behaviorTag.contains("properties", Constants.TagTypes.COMPOUND)) {
    CompoundNBT propertiesTag = behaviorTag.getCompound("behavior");
    if (propertiesTag.contains("behaviors", Constants.TagTypes.LIST)) {
      ListNBT behaviorList = propertiesTag.getList("behaviors", Constants.TagTypes.COMPOUND);
      for (int i = 0; i < behaviorList.size(); ++i) {
        if (i == this.getMultiBehaviorIndex() - 1) return behaviorList.getCompound(i);
      }
    }
  }
}

else if (stewStack.getItem() instanceof ExponentialStewItem) {
  CompoundNBT behaviorTag = stewStack.getTagElement("behavior");
  if (behaviorTag != null && behaviorTag.contains("properties", Constants.TagTypes.COMPOUND)) {
    return behaviorTag.getCompound("properties");
  }
}
```

## `NBTUtils`
```java
public static void saveMinecartDisplay(ItemStack stack, AbstractMinecartEntity minecart) {
  CompoundNBT tag = new CompoundNBT();
  if (minecart.hasCustomDisplay()) tag.put("block_state", NBTUtil.writeBlockState(minecart.getDisplayBlockState()));
  if (minecart.getDisplayOffset() != minecart.getDefaultDisplayOffset()) tag.putInt("display_offset", minecart.getDisplayOffset());
  if (!tag.isEmpty()) stack.getOrCreateTag().put("display_block", tag);
}

public static void loadMinecartDisplay(ItemStack stack, AbstractMinecartEntity minecart) {
  CompoundNBT tag = stack.getTag();
  if (tag != null && tag.contains("display_block", Constants.TagTypes.COMPOUND)) {
    CompoundNBT displayTag = tag.getCompound("display_block");
    minecart.setDisplayBlockState(NBTUtil.readBlockState(displayTag.getCompound("block_state")));
    minecart.setDisplayOffset(displayTag.getInt("display_offset"));
  }
}
```

## `DamageEntityBehavior` at `runBehavior()`
```java
if (propertiesTag != null && propertiesTag.contains("source", Constants.TagTypes.COMPOUND)) {
  CompoundNBT sourceTag = propertiesTag.getCompound("source");
  DamageBehaviorSource behaviorSource = new DamageBehaviorSource(sourceTag, livEntity);
  DamageSourceUtils.DATA_DRIVEN_SOURCES.put(namespace("damage_behavior", stringOrDefault("message_id", sourceTag, "generic")), behaviorSource);
  livEntity.hurt(behaviorSource, this.amount);
} else if (propertiesTag != null && propertiesTag.contains("source", Constants.TagTypes.STRING)) {
  DamageSource source1 = DamageSourceUtils.fromLocationWithKiller(livEntity, ResourceLocation.tryParse(stringOrDefault("source", propertiesTag, "minecraft:generic")));
  if (source1 != null) livEntity.hurt(source1, this.amount);
}
```

## Old `MultiBehavior`
```java
public class MultiBehavior extends StewBehavior {
  private final StewBehavior[] behaviors;

  public MultiBehavior(StewBehavior... behaviors) {
    this.behaviors = behaviors;
  }

  public StewBehavior[] getBehaviors() {
    return this.behaviors;
  }

  @Override
  public void executeBehavior(ItemStack stack, World world, LivingEntity livEntity) {}

  @Override
  public void executeFromStewNBT(ItemStack stewStack, World world, LivingEntity livEntity, CompoundNBT propertiesTag) {
    for (String tagKey : propertiesTag.getAllKeys()) {
      LogManager.getLogger().debug("Using tag key '{}'", tagKey);
      ResourceLocation behaviorLocation = ResourceLocation.tryParse(tagKey);
      if (behaviorLocation != null) {
        LogManager.getLogger().debug("Behavior location is {}", behaviorLocation);
        StewBehavior behavior = VSRegistries.STEW_BEHAVIOR.getValue(behaviorLocation);
        behavior.executeFromStewNBT(stewStack, world, livEntity, propertiesTag.getCompound(tagKey));
        LogManager.getLogger().debug("Tag key '{}'s compound is {}", tagKey, propertiesTag.getCompound(tagKey).getPrettyDisplay().getString());
      }
    }
  }

  @Override
  public CompoundNBT writePropertiesToNBT() {
    CompoundNBT properties = new CompoundNBT();
    for (StewBehavior behavior : this.behaviors) {
      properties.put(behavior.getBehaviorRegistry().getRegistryName().toString(), behavior.writePropertiesToNBT());
    }
    return properties;
  }

  @Override
  public StewBehavior getBehaviorRegistry() {
    return VSStewBehaviors.MULTI_BEHAVIOR.get();
  }
}
```

## `ConsumableCommand` at `register()`
```java
.then(Commands.literal("open_config_screen").executes(context -> {
  Minecraft minecraft = Minecraft.getInstance();
  VSConfigScreen screen = new VSConfigScreen(minecraft.screen, minecraft.options);
  screen.init(minecraft, minecraft.getWindow().getGuiScaledWidth(), minecraft.getWindow().getGuiScaledHeight());
  minecraft.screen = screen;
  return 1;
}))
```

## `SetBehaviorCommand` at `setBehaviorToItem()`
```java
if (handStack.getItem() instanceof ExponentialStewItem) {
  handStack.getOrCreateTag().remove("behavior");
  CompoundNBT behaviorTag = handStack.getOrCreateTagElement("behavior");
  behaviorTag.putString("id", behavior.behavior.getRegistryName().toString());
  behaviorTag.put("properties", behavior.properties);
  if (players.size() == 1) {
    source.sendSuccess(new TranslationTextComponent("commands.stewbehavior.set.success.single", players.iterator().next().getDisplayName(), behavior.behavior.getCommandDisplayName()), true);
  } else {
    source.sendSuccess(new TranslationTextComponent("commands.stewbehavior.set.success.multiple", players.size(), behavior.behavior.getCommandDisplayName()), true);
  }
}
```