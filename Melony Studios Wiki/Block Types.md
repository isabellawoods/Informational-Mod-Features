# Block Types
> **Written On**: 16-11-26 - **Last Updated**: 17-11-26

As of 1.20 (or some version after it), Mojang introduced the concept of **block types**, which is now all blocks now have their properties defined.

This file will the format for block types added my own mods.

## Reutilities
### `bookshelf`
- ![*(float)*](/Revaried/Docs/Tags/float_tag.png) **enchanting_power**: *(optional, defaults to `1.0`)* An uncapped float — the enchanting power provided by this bookshelf block.
  - For this field to work, the bookshelf must be in the `#minecraft:enchantment_power_provider` block tag.

### `crafting_table`
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **container_title**: A [text component](https://minecraft.wiki/w/Text_component) of the text shown in the crafting table menu. The default title is the `container.crafting` translation key.

### `two_by_two_sapling`
- ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **tree**: A *tree grower* — the name here represents a registered tree grower. Vanilla trees don't have their namespace prefixed.

## Stancements
These block types have no extra fields:
- `album`;
- `crafting_table_cloth`;
- `crop_pot/empty`;
- `music_recorder`;
- `shelf`.

### `casing`
- ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hides_remixer_contents**: Defines whether this casing block obfuscates the contents of the music remixer it's part of when closed.
  - `false` for glass casings, and `true` for tinted glass casings.

### `crop_pot/filled`
The block types `crop_pot/beetroots` and `crop_pot/nether_wart` have the same fields, just with different `age` block states on the backend.

- ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **seeds**: An item ID — the seed item inside of this crop pot. This is used:
  - When shift-clicking the seed out of the crop pot;
  - When using pick-block on the crop pot.
- ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **equivalent_crop**: A block ID — this block's loot table is rolled when spawning the drops when the plant fully grows.
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **planting_result**: A [pot plantable](/Stancements/Docs/Pot%20Plantables.md).
  - ***Fields are functionally identical from pot plantables:***
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **crop_pot**: A block ID — the block placed when the seed is used on the crop pot. Defaults to the ID of *this* block.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **planting_sound**: An *identifier* of a sound event — the sound played when successfully planting the seed on the pot.
    - Wheat, carrot, potato and beetroot crop pots use `minecraft:item.crop.plant`, and Nether wart crop pots use `minecraft:item.nether_wart.plant`.

### `music_remixer`
- ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **casing**: A block ID — the casing this music remixer has attached to it.
  - This block will be added to the `REMIXER_TO_CASINGS` map on *MusicRemixerBlock*, which will make it possible for any remixer to use this as a casing.

### `tagging_rail`
- ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **detects_colors**: A list of *dye colors* — all colors in this list will be matched against those that the minecart has (or not).
  - On *Stancements*, tagging rails can only detect their own colors.
- ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **tag_matcher**: How to match the colors from this rail on the minecart. Can be one of the following:
  - **All** (`all`): Passes if the minecart contains **all** colors this rail detects;
  - **Any Of** (`any_of`): Passes if the minecart has **any** of the colors this rail detects.
  - All tagging rails in *Stancements* use **Any Of**.

## The Mato
### `two_by_two_sapling`
- ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **tree**: A *tree grower* — the name here represents a registered tree grower. Vanilla trees don't have the `minecraft` namespace prefixed.

## History
### Reutilities
| Version | Changes                                                 |
| ------- | ------------------------------------------------------- |
| 1.3.0   | Added the `bookshelf` and `crafting_table` block types. |
| 1.5.0   | Added the `two_by_two_sapling` block type.              |

### Stancements
| Version                                                             | Changes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| ------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [0.3.2](/Stancements/Changelogs/Changelog%200.3.2.md)               | Added the `crafting_table_cloth` block type. It has no extra fields.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| [0.4.0](/Stancements/Changelogs/Changelog%200.4.0.md)               | Added the `tagging_rail` block type, with the ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **colors_to_detect** and ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **matcher_type** *(optional)* fields.                                                                                                                                                                                                                                                                                                                                                                                                    |
| [5.0.0-beta.4](/Stancements/Changelogs/Changelog%205.0.0-beta.4.md) | <li>Added the following block types: `music_recorder`, `shelf`, `crop_pot/empty`, `crop_pot/filled`, `crop_pot/beetroots`, `crop_pot/nether_wart`, `album`, `casing` and `music_remixer`.</li> <li>The ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **colors_to_detect** field on `tagging_rail` has been renamed to ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **detects_colors**</li> <li>The ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **matcher_type** field on `tagging_rail` has been renamed to ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **tag_matcher**, and is now optional.</li> |

### The Mato
| Version | Changes                                    |
| ------- | ------------------------------------------ |
| 3.8.0   | Added the `two_by_two_sapling` block type. |
