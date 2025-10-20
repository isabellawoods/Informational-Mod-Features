# Cluster Material
> [!NOTE]
> This feature is exclusive to *Mellotech*.
>
> ***Last Updated**: 1.1.0 (19-10-25)*

> [!WARNING]
> In my 1.16 implementation of data-driven "registries", it **doesn't work in multiplayer** due to the server not sending them to the client. Loading them beforehand may be a possible workaround.

A **cluster material** defines properties for endium clusters to use when spreading ores. Cluster materials can be defined using JSON files in a data pack at the path `data/<namespace>/mellotech/cluster_material/`.

Cluster materials can have tags defined at the path `data/<namespace>/tags/mellotech/cluster_material/`.

## JSON Format
Cluster materials are defined using the following format.

- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **mixed_ore**: The block id of the ore placed after spreading to one of the `target_blocks`.
  - ![](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **target_ores**: A block, block list or hashtagged block tag that, when placed next to the cluster, will set the cluster material to this.
  - ![](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **target_blocks**: A block, block list or hashtagged block tag of which blocks this material can spread to. This is usually set to end stone.
  - ![](/Revaried/Docs/Tags/float_tag.png) **growth_multiplier**: *(optional)* A time multiplier for how long it takes to spread this ore to another block, based on random ticks.
    - Every random tick, it rolls a number between *0* and *n*, with *n* being **5 * growth_multiplier**. If it equals 0, then it spreads to an adjacent block.

### In 1.16
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **asset_id**: The resource location of this cluster material. Should match the filename and namespace of this material.
  - **All other fields.**

## History
| Version | Changes |
|---------|---------|
| 1.0.0 | <li> Added cluster materials to data packs, under the folder `cluster_material`. </li> <li> The current growth rate formula is ***n* = 250 * growth_multiplier**. </li> |
| 1.1.0 | <li> Removed the ![](/Revaried/Docs/Tags/string_tag.png) **asset_id** field. </li> <li> The **target_ores** and **target_blocks** fields now support having single blocks and lists of blocks (tags now need to be hashtagged). </li> <li> Changed the folder to `mellotech/cluster_material`, as NeoForge prepends the mod id to registries. </li> <li> The growth rate formula is now ***n* = 5 * growth_multiplier**. </li> |

## Issues
Issues relating to "Cluster material" cannot be maintained anywhere due to *Mellotech* not having an associated *GitHub* repository.

## Navigation
### Data pack definitions
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md) |
| **Melony Lib** | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md) |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) **Cluster Material** |