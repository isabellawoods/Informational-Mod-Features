# Item Behaviors
***Last Updated**: 7-7-25*

Item behaviors (formerly tool behaviors) are *Back Math*'s copy of *Revaried*'s [consume behaviors](/Revaried/Docs/Consumables%20(1.8.0.2%20Onwards).md), which instead of acting when the item is consumed, it's instead when the item is used.

In code, these are two different registries: **item behaviors** are a group of *item behavior effect types*, that are all ran at the same time, and these **effect types** are the individual effects an item has.

While item behaviors are hardcoded in 1.16, they may become [data components](https://minecraft.wiki/w/Data_component_format) in 1.21 due to the mod being remade from the ground up.

## List of behaviors

## List of effect types
| Effect Type | Class & Parameters |
|-------------|--------------------|
| Ignite | *IgniteEffectType* |
| Damage Entity (unused) | *DamageEntityEffectType* |
| Give Milked Sword Item | *GiveMilkedSwordItemEffectType* |
| Add Experience | *AddExperienceEffectType*: <li>**defaultAmount**: 500</li> |
| Add Bakugou Outfit | *AddBakugouOutfitEffectType* |
| Apply Mid-Term Effects | *ApplyTagEffectsEffectType*: <li>**Slowness III** (0:05)</li> |
| Apply Pink Gum Frying Pan Effects | *ApplyTagEffectsEffectType*: <li>**Slowness IV** (0:10)</li> <li>**Instant Damage** (0:10)</li> |
| Apply Patience Tea Effects | *ApplyTagEffectsEffectType*: <li>**Patience** (0:30)</li> |
| Apply Peace Tea Effects | *ApplyTagEffectsEffectType*[^1] |
| Apply Disgust Tea Effects | *ApplyTagEffectsEffectType*: <li>**Disgust** (0:30)</li> |
| Apply Mood Tea Effects | *ApplyTagEffectsEffectType*: <li>**Mood** (5:00)</li> |
| Apply Sparey Effects | *ApplySpareyEffectsType* |
| Apply Devil Sparey Effects | *ApplyDevilSpareyEffectsType* |

### Ignite (`IgniteEffectType`)
Sets the entity on fire for a specific amount of seconds.

This effect adds this tooltip to the item:
> <d style="color: #555555">[☒]</d> <d style="color: #E1A61E">Ablaze (duration)</d>

- *(int)* **seconds**: How long to set the entity on fire for. Defaults to `5` seconds.

#### NBT Format
- ![](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![](/Revaried/Docs/Tags/integer_tag.png) **seconds_on_fire**: An integer overriding how many seconds the target entity will be set on fire for. Defaults to `5` if not defined.

### Damage Entity (`DamageEntityEffectType`)
Damages the entity with a pre-existing damage source.

This effects adds this tooltip to the item:
> <d style="color: #555555">[☒]</d> <d style="color: #AAAAAA">Deals \<amount> damage to you using source "\<source>"</d>

- *(DamageSource)* **source**: The source to damage the entity with. Defaults to `GENERIC`.
- *(int)* **amount**: How much damage to apply to the entity. Defaults to `0`.

### Give Milked Sword Item (`GiveMilkedSwordItemEffectType`)
Gives a milk bucket (by default) when hitting an entity.

- *(ItemStack)* **bucketStack**: The item stack to give the attacker. Defaults to one milk bucket.

#### NBT Format
- ![](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **milked_sword_item**: An item stack to give the player. Can be defined as both a compound and string, with the string being an item id that's automatically converted into a compound.
    > **Tags common to all items saved by Revaried:**
    > - ![](/Revaried/Docs/Tags/string_tag.png)  **id**: The id of the item.
    > - ![](/Revaried/Docs/Tags/integer_tag.png)  **count**: *(optional)* How many items there are in this stack. Effectively capped at 127 due to the default count tag being a ![](/Revaried/Docs/Tags/byte_tag.png) byte.
    > - ![](/Revaried/Docs/Tags/compound_tag.png)  **tags**: *(optional)* The tags this item stack has.

### Add Experience (`AddExperienceEffectType`)
Gives the player a specific amount of experience points when either hitting an entity or eating the item.

This effects adds this tooltip to the item:
> <d style="color: #588039">[☑]</d> <d style="color: #80FF20">Gives \<amount> experience when eaten</d>

- *(int)* **defaultAmount**: Amount of experience points to give. Defaults to `500`.

#### NBT Format
- ![](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![](/Revaried/Docs/Tags/integer_tag.png) **stored_experience**: Amount of experience points to give.

### Add Bakugou Outfit (`AddBakugouOutfitEffectType`)
Puts the entity in a full Bakugou outfit (or partial if they're wearing something).

This effects adds this tooltip to the item:
> <d style="color: #CD473B">[☐]</d> <d style="color: #FF8A50">Puts you in Bakugou's outfit</d>

### Apply Tag Effects (`AppleTagEffectsEffectType`)
Applies a list of effect instances to the attacker.

This effects adds these tooltips to the item:
#### Positive Effect (Speed) with Attribute
> <d style="color: #555555">[☑]</d> <d style="color: #7CAFC6">Speed (3:00)</d>

> <d style="color: #4F7A4F">[☑]</d> <d style="color: #6FC56F">+20% Speed</d>

#### Negative Effect (Slowness) with Attribute
> <d style="color: #555555">[☒]</d> <d style="color: #5A6C81">Slowness (1:30)</d>

> <d style="color: #7F4B4B">[☒]</d> <d style="color: #D26D6D">-15% Speed</d>

- *(List\<EffectInstance>)* **appliedEffects**: The effect list to apply. Defaults to no effects.

### Apply Sparey Effects (`ApplySpareyEffectsType`)
Applies effects to the attacker when hitting an entity, based on said entity:
- Applies **Weakness LXIII** (63) for 30 seconds when hitting Queen Lucy (any `#backmath:sparey_prohibited`);
- Applies **Strength II** for 10 seconds when hitting angry sophies (any `#backmath:sparey_effectives`);
- Applies **Weakness III** for 2.5 seconds when hitting anything else.

This effects adds these tooltips to the item:

#### NBT Format
- ![](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![](/Revaried/Docs/Tags/string_tag.png) **effective_entities**: A hashtagged entity type tag defining which entities count as "effective".
  - ![](/Revaried/Docs/Tags/string_tag.png) **prohibited_entities**: A hashtagged entity type tag defining which entities count as "prohibited".
  - ![](/Revaried/Docs/Tags/string_tag.png) **strength_effect**: An effect id for the effectives strength effect.
  - ![](/Revaried/Docs/Tags/string_tag.png) **weakness_effect**: An effect id for the non-effectives weakness effect.
  - ![](/Revaried/Docs/Tags/string_tag.png) **prohibition_weakness_effect**: An effect id for the prohibition weakness effect.

### Apply Devil Sparey Effects (`ApplyDevilSpareyEffectsType`)
Applies effects to the attacker when hitting an entity, based on said entity.
- Applies **Weakness LXIII** (63) for 30 seconds when hitting Queen Lucy (any `#backmath:sparey_prohibited`);
- Applies **Strength III** for 2.5 seconds when hitting any `#backmath:devil_sparey_effectives`;
- Applies **Weakness II** for 10 seconds when hitting anything else.

This effects adds these tooltips to the item:

#### NBT Format
- ![](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![](/Revaried/Docs/Tags/string_tag.png) **effective_entities**: A hashtagged entity type tag defining which entities count as "effective".
  - ![](/Revaried/Docs/Tags/string_tag.png) **prohibited_entities**: A hashtagged entity type tag defining which entities count as "prohibited".
  - ![](/Revaried/Docs/Tags/string_tag.png) **strength_effect**: An effect id for the effectives strength effect.
  - ![](/Revaried/Docs/Tags/string_tag.png) **weakness_effect**: An effect id for the non-effectives weakness effect.
  - ![](/Revaried/Docs/Tags/string_tag.png) **prohibition_weakness_effect**: An effect id for the prohibition weakness effect.

## Issues
Issues relating to "Item behaviors" are maintained on [Back Math's bug tracker](https://github.com/isabellawoods/Back-Math/issues). Issues should be reported and viewed there.

## History
| Version | Changes |
|---------|---------|
| [*August 14th, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2014-08-24/Changelog%2014-08-24.md) (1.8.0) | Added tool behaviors. |

### Footnotes
[^1]: Absorption, Health Boost, Instant Health, Regeneration, Speed, Haste, Strength, Jump Boost, Resistance, Fire Resistance, Water Breathing, Night Vision, Saturation, Luck, Slow Falling, Conduit Power, Dolphin's Grace and Hero of the Village, all for 5 minutes. Also includes Invisibility and Glowing if their configs are on.