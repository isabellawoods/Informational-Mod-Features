# Cluster Material
> [!NOTE]
> This feature is exclusive to *Mellotech*.
>
> ***Last Updated**: 1.0.0 (6-7-25)*

> [!WARNING]
> In my current implementation of data-driven "registries", it **doesn't work in multiplayer** due to the server not sending them to the client. Loading them beforehand may be a possible workaround.

A **cluster material** defines properties for endium clusters to use when spreading ores. Cluster materials can be defined using JSON files in a data pack at the path `data/<namespace>/cluster_material/`.

## JSON Format
Cluster materials are defined using the following format.

- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **asset_id**: The resource location of this cluster material. Should match the filename and namespace of this material.
  - ![](/Revaried/Docs/Tags/string_tag.png) **mixed_ore**: The block id of the ore placed after spreading to one of the `target_blocks`.
  - ![](/Revaried/Docs/Tags/string_tag.png) **target_ores**: A block tag that, when placed next to the cluster, will set the cluster material to this.
  - ![](/Revaried/Docs/Tags/string_tag.png) **target_blocks**: A block tag of which blocks this material can spread to. This is usually to end stone.
  - ![](/Revaried/Docs/Tags/float_tag.png) **growth_multiplier**: *(optional)* A time multiplier for how long it takes to spread this ore to another block, based on random ticks.
    - Every random tick, it rolls a number between *0* and *n*, with *n* being **250 * growth_multiplier**. If it equals 0, then it spreads to an adjacent block.

## History
| Version | Changes |
|---------|---------|
| 1.0.0 | Added cluster materials to data packs. |

## Issues
Issues relating to "Cluster material" cannot be maintained anywhere due to *Mellotech* not having an associated *GitHub* repository.

## Navigation
### Data pack definitions
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md) |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) **Cluster Material** |