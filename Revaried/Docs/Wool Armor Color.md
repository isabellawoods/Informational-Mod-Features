# Wool Armor Color
> [!NOTE]
> This feature is exclusive to *Revaried*.
>
> **Last Updated**: 8.0.11 (25-04-26)

> [!WARNING]
> In my current implementation of data-driven "registries", it **doesn't work in multiplayer** due to the server not sending them to the client. Loading them beforehand may be a possible workaround.

A **wool armor color** is a color or design for a wool armor piece (currently is only sweaters). Wool armor colors can be defined using JSON files in a data pack at the path `data/<namespace>/wool_armor_color/`.

## JSON Format
Wool armor colors are defined using the following format:

- <img src=Tags/compound_tag.png> The root object.
  - <img src=Tags/string_tag.png> **asset_id**: The resource location of this wool armor color. Should match the location of this file inside the data pack.
  > **If this wool armor color is a color:**
  - <img src=Tags/integer_tag.png> **color**: The color of this definition, defined as either a decimal or hexadecimal integer. Uncapped, but recommended to stay within **0** and **16777215**.
  - <img src=Tags/string_tag.png> **color_name**: A translation key for this color definition's name. This is prepended with the wool armor item name.
  > **If this wool armor color is a design:**
  - <img src=Tags/integer_tag.png> **armor_design**: The number of this armor design. This is effectively the number of the custom model data for the item model.

## History
### Revaried
| Version                                                                     | Changes                                                                                                                                                                                                        |
| --------------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [1.8.0.3](/Revaried/Changelogs/1.16.5%20-%201.8.0.3/Changelog%201.8.0.3.md) | Added wool armor colors to data packs.                                                                                                                                                                         |
| [1.8.0.5](/Revaried/Changelogs/1.16.5%20-%201.8.0.5/Changelog%201.8.0.5.md) | <li> Removed the `red_yellow`, `aljan_light_blue`, `poison_brown` and `insomnian` armor colors. </li> <li> Internally, wool armor colors are now read as nullable integers instead of optional integers. </li> |
| [8.0.11](/Revaried/Changelogs/Changelog%208.0.11.md)                        | The **color** field now accepts hexadecimal integers (prefixed with "#").                                                                                                                                      |

### Back Math
| Version                                                                                                       | Changes                                                                                   |
| ------------------------------------------------------------------------------------------------------------- | ----------------------------------------------------------------------------------------- |
| [*October 22nd, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2022-10-24/Changelog%2022-10-24.md) (8.0) | Added `red_yellow`, `aljan_light_blue`, `poison_brown` and `insomnian` wool armor colors. |

## Issues
Issues relating to "Wool armor color" are maintained on [*Revaried*'s issue tracker](https://github.com/isabellawoods/Revaried/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) [Crystallizer Recipes](Back%20Math/Docs/Crystallizer%20Recipes.md) ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) [Outfit Definition](Reutilities/Docs/Outfit%20Definition.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) **Wool Armor Color**                                                                                                                                                                                                                                                                                                                                                                    |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) [Mossifiables](Stacked%20Goods/Docs/Mossifiables.md) ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                                                          |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](Stancements/Docs/Recorded%20Song%20Styles.md)                                                                                                                                                                                                                                                                                                                                                                                           |
