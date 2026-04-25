# Pot Plantables
> [!NOTE]
> **Last Updated**: 25-04-26 (0.4.1 - 1.21.1 | 0.4.1.1 | 26.1.2)

`pot_plantables.json` is an **item data map** defining which items can be placed on crop pots, and which block it becomes.

This data map file is located at `data/stancements/data_maps/item/pot_plantables.json`.

## JSON format
Pot plantables are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) The root **values** object.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **\<item ID>**: The ID of a registered item. May be a non-existent item, but that will require a loading condition.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **crop_pot**: A string (block ID) defining which block gets placed when the base crop pot is interacted using this item.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **planting_sound**: A string (sound event) defining the sound played when successfully planting this item on a crop pot.
    - **Fields common to all data map entries, see below.**

###  NeoForge conditions
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **neoforge:conditions**: *(optional)* The root conditions field added by *NeoForge*.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **type**: A conditional codec type from the `neoforge:conditional_codecs` registry.
  - ##### **If type is `neoforge:mod_loaded`**: Returns true if the given mod ID is loaded.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **modid**: The mod ID to check.

### Example
```json
{
  "values": {
    "minecraft:wheat_seeds": {
      "crop_pot": "stancements:wheat_crop_pot",
      "planting_sound": "minecraft:item.crop.plant"
    }
  }
}
```

## History
| Version                                              | Changes                                                                            |
| ---------------------------------------------------- | ---------------------------------------------------------------------------------- |
| [0.3.1](Stancements/Changelogs/Changelog%200.3.1.md) | Added the "pot plantable" data map.                                                |
| [0.3.2](Stancements/Changelogs/Changelog%200.3.2.md) | Renamed to "pot plantables", since all data maps from *NeoForge* use plural names. |

## Issues
Issues relating to "Pot plantables" are maintained on [*Stancements*' issue tracker](https://github.com/isabellawoods/Stancements/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) [Crystallizer Recipes](Back%20Math/Docs/Crystallizer%20Recipes.md) ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) [Outfit Definition](Reutilities/Docs/Outfit%20Definition.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md)                                                                                                                                                                                                                                                                                                                              |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) [Mossifiables](Stacked%20Goods/Docs/Mossifiables.md) ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                                                          |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) **Pot Plantables**  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](Stancements/Docs/Recorded%20Song%20Styles.md)                                                                                                                                                                                                                                                                                                                                                                                                                               |
