# Mellow Item Format
**Last Updated**: 15-05-26

This file is an attempt to document all item tags (NBT) across all my mods, showing their uses, quirks, examples, and more.

Unlike other files, all tags in this file are optional unless annotated with "*(required)*".

## Back Math
### Item Behaviors
> ***Documentation**: [Item Behaviors](Item%20Behaviors.md).*

## Revaried
### Consumables & Consume Behaviors
> ***Documentation***:
> - [*Consumables*](/Revaried/Docs/Consumables%20(1.8.0.2%20Onwards).md): from [1.8.0.2](/Revaried/Changelogs/1.16.5%20-%201.8.0.2%20(Markdown)/Changelog%201.8.0.2.md) onwards;
> - [*Exponential Stews*](/Revaried/Docs/Exponential%20Stews%20(After%201.7-pre5).md): from [1.7.0 pre-release 5](/Revaried/Changelogs/1.16.5%20-%201.7.0%20Pre-Release%205/Changelog%201.7.0%20Pre-Release%205%20(Part%20I%20and%20II).md) to [1.8.0.1](/Revaried/Changelogs/1.16.5%20-%201.8.0.1/Changelog%201.8.0.1.md);
> - [*Exponential Stews*](/Revaried/Docs/Exponential%20Stews%20(Before%201.7-pre5).md): before 1.7.0 pre-release 5.

All items in the game, when using *Revaried*, can be turned into consumables, although most of them won't work.

### Equippables
> ***Documentation**: [Equippables](/Revaried/Docs/Equippables.md).*

### Wool Sweater
> ***Documentation***:
> - [*Wool Armor (Updated)*](/Revaried/Docs/Wool%20Armor%20(Updated).md): from [1.8.0.3](/Revaried/Changelogs/1.16.5%20-%201.8.0.3/Changelog%201.8.0.3.md) onwards;
> - [*Wool Armor*](/Revaried/Docs/Wool%20Armor.md): before 1.8.0.3.

### Hiding Tags
*Revaried* has various hiding tags for hiding specific parts of the item's tooltip, like with vanilla's ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **HideFlags**.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_armor_design**: Hides the *"Armor Design: \<name>"* tooltip from wool sweaters.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_behavior_tooltips**: Hides tooltips added by consume behaviors.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_bowl_name**: Hides the *"Bowl: \<item name>"* tooltip from exponential stews.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_compat_mod**: Hides the *"Block/Item compatibility between: \<mod>."* tooltip from compatibility items.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_consume_behavior**: Hides the *"Behavior: \<behavior name>"* tooltip from exponential stews.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_horse_armor_armor_points**: Hides the *"When equipped: +X Armor"* tooltip from horse armor.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hide_item_tags**: Hides the *"Hold \[Left Alt] for Tags"* tooltip from all items.

### Debug Bow, Arrow and Sticks
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **debug_property**: Stores the block states for a debug stick or bow. Same as vanilla's ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **DebugProperty**.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) ***Block ID***: A block state key to edit, for example: `"minecraft:powered_rail": "powered"`.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **debug_arrow_state**: Same as ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **debug_property**.

### Enchanted Knowledge Book
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **recipes**: A list of resource locations for recipes to grant the player when this items is right-clicked.
  - **Example:** `{recipes:["minecraft:recipes/decorations/crafting_table"]}`

### Magma Sword
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **seconds_on_fire**: An integer overriding how many seconds the target entity will be set on fire for. Defaults to `10` if not defined.

### Minecart with Spawner
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **spawn_data**: Stores the spawner data for this minecart with spawner.
    > **Tags common to spawners.**

### Spyglasses
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **use_duration**: An integer overriding the use duration, in ticks, of *Revaried*'s spyglasses. Defaults to `1200` if not defined.

### Stained Bottles
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **color_name**: A resource location that overrides the color display from the bottle.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **glass_color**: An integer overriding the particle color for stained bottles o'experience. Should be between **0** and **16777215**.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **texture_id**: The texture identifier for item model overrides. Used by exponential stews and stained bottles.

### Miscellaneous
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **burn_time**: An integer overriding how long, in ticks, this item burns in a furnace. **Applies to**:
    - Oak, spruce, birch, jungle, acacia, dark oak, painting and enderwood sticks, debug sticks and bowls;
    - Soul lava buckets, soul blaze rods and soul blaze powder;
    - Wooden railbeds;
    - Coal shears.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **wood_type**: A string overriding the wood type of a *Revaried* boat. Can be one of `painting`, `crimson`, `warped` or `enderwood`.

> [!NOTE]
> While the ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **wood_type** tag is also used in *Back Math*'s boats, the wood types can't be exchanged.

## Mob Taker
### No-Releasing Crossbow
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **charged**: Whether this crossbow is charged.
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **charged_projectiles**: A list of 1 or 3 item stacks (usually arrows) to shoot.
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) A single item stack entry.
      > **Tags common to all items saved by vanilla:**
      > - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **id**: *(required)* The ID of the item.
      > - ![*(byte)*](/Revaried/Docs/Tags/byte_tag.png) **Count**: *(required)* How many items there are in this stack.
      > - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **tag**: The tags this item stack has.

## Stancements
### Recorded Disc
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **music_id**: A resource location of the sound file this music disc will play. This is also used to display the disc tooltip.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **label**: A custom model data value for this disc's label.
    > | Label ID | From Disc |
    > |----------|------------|
    > | `0` (none) and `1` | C418 - blocks / stal / strad |
    > | `2` | C418 - cat / mall |
    > | `3` | C418 - chirp |
    > | `4` | C418 - far |
    > | `5` | C418 - mellohi |
    > | `6` | Lena Raine - Pigstep / Aaron Cherof - Relic |
    > | `7` | Aaron Cherof - Precipice |
    > | `8` | Amos Roddy - Tears |
    > | `9` | C418 - 13 / ward |
    > | `10` | Lena Raine - Creator / Creator (Music Box) |
    > | `11`[^1] | Samuel Åberg - 5 |

## The Mato
### Dyed Water Bucket
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) Root tag for this item.
  - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **dyed_water_color**: An integer defining the color of the water in this bucket, used to color the item and the cauldron. Should be between **0** and **16777215**.

## Footnotes
[^1]: Due to a bug in the code, labels range between `0` and `10`, instead of `1` to `11`.