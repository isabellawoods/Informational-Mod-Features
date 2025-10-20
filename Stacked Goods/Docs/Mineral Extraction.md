# Mineral Extraction
> [!NOTE]
> This feature is exclusive to *Stacked Goods*.
>
> ***Last Updated**: 4.0.2 (19-10-25)*

**Mineral extractions** define which blocks use which loot table when right-clicking a mineral extractor with a hammer. Mineral extractions can be defined using JSON files in a data pack at the path `data/<namespace>/stackedgoods/mineral_extraction/`.

Mineral extractions can have tags defined at the path `data/<namespace>/tags/stackedgoods/mineral_extraction/`.

## JSON Format
Mineral extractions are defined using the following format:
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **blocks**: A block, block list or hashtagged block tag defining which blocks can be used to get the specified resources.
  - ![](/Revaried/Docs/Tags/string_tag.png) **extraction_table**: A loot table to use when extracting minerals from the defined blocks.

## History
| Version | Changes |
|---------|---------|
| 0.4     | Added mineral extractions to data packs, under the folder `mineral_extraction`. |
| 0.4.1   | <li> Renamed the ![](/Revaried/Docs/Tags/string_tag.png) **block** field to **blocks**. </li> <li> The **blocks** field now supports having single blocks and lists of blocks (tags now need to be hashtagged). </li> <li> Changed the folder to `stackedgoods/mineral_extraction`, as NeoForge prepends the mod id to registries. </li> |

## Issues
Issues relating to "Mineral extraction" or "Mineral extraction type" are maintained on [*Stacked Goods*' bug tracker](https://github.com/isabellawoods/Stacked-Goods/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) **Mineral Extraction** |
| **Melony Lib** | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md) |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md) |