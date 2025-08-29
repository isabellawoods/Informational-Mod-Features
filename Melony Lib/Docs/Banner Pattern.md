# Banner Pattern
> [!NOTE]
> This feature is exclusive to *Melony Lib*.
>
> ***Last Updated**: 1.4.2 (24-8-25)*

> [!WARNING]
> In my current implementation of data-driven "registries", it **doesn't work in multiplayer** due to the server not sending them to the client. Loading them beforehand may be a possible workaround.

A **banner pattern** is a shape that can be added to a banner. Banner patterns can be defined using JSON files in a data pack at the path `data/<namespace>/banner_pattern/`.

## JSON Format
Banner patterns are defined using the following format.

- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **asset_id**: The resource location and enum name of this banner pattern. Should match the filename and namespace of this pattern.
  - ![](/Revaried/Docs/Tags/string_tag.png) **hash_name**: A three letter abbreviation of this pattern's ![](/Revaried/Docs/Tags/string_tag.png) **asset_id**.
  - ![](/Revaried/Docs/Tags/boolean_tag.png) **has_pattern_item**: Whether this banner pattern has an associated banner pattern item. Defaults to `false`.

## History
| Version | Changes |
|---------|---------|
| [1.3](https://github.com/isabellawoods/Melony-Lib/commit/75e640c6a81699ec9d46f9d475902897ee678162) | Added banner patterns to data packs. |

## Issues
Issues relating to "Banner pattern" can be reported on [Melony Lib's bug tracker](https://github.com/isabellawoods/Melony-Lib/issues). However, this mod is **discontinued**, so any reports will not be addressed.

## Navigation
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md) |
| **Melony Lib** | ![](/Textures/navbox/banner_pattern.png) **Banner Pattern** |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md) |