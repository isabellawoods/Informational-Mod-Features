# Recorded Song Styles
> [!NOTE]
> **Last Updated**: 25-04-26 (0.4.1 - 1.21.1 | 0.4.1.1 - 26.1.2)

`recorded_song_styles.json` is a **jukebox song data map** defining a color and a label for when a song is recorded/copied. If not defined, the item will have a randomized color and label.

The data map file is located at `data/stancements/data_maps/jukebox_song/recorded_song_styles.json`.

## JSON format
Recorded song styles are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) The root **values** object.
  - ![*(compound)*|10](/Revaried/Docs/Tags/compound_tag.png) **\<jukebox song ID>**: The ID of a registered jukebox song definition. May be a non-existent song, but that will require a loading condition.
    - ![*(int or string)*](/Revaried/Docs/Tags/integer_tag.png)![](/Revaried/Docs/Tags/string_tag.png) **color**: An integer (decimal or hexadecimal) of the color applied to the item. Uncapped, but recommended to stay between **0** and **16777215** (`#ffffff`).
    - ![*(float)*](/Revaried/Docs/Tags/float_tag.png) **label**: A float defining the label applied to the item. Must be between **1** and **13**.
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
    "minecraft:blocks": {
      "color": "#e2543b",
      "label": 1.0
    }
  }
}
```

## History
| Version                                                         | Changes                                                                                                                                                                                                                                                                                                                                                                                                          |
| --------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [0.3.2](Stancements/Changelogs/Changelog%200.3.2.md)            | Added the "recorded song styles" data map.                                                                                                                                                                                                                                                                                                                                                                       |
| [0.4.0](Stancements/Changelogs/Changelog%200.4.0.md)            | <li>Added `stancements:game/end/alpha` to this map, using these values ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **color**: `10144191` and ![*(float)*](/Revaried/Docs/Tags/float_tag.png) **label**: `13.0`.</li> <li>Added the "Recorder Modded Songs" data pack, which includes definitions for the following mods: *Enderscape*, *The Aether*, *Vanilla Backport* and *Oh The Biomes We've Gone*.</li> |
| [0.4.1](Stancements/Changelogs/Changelog%200.4.1%20(1.21).md)   | The **color** field now accepts hexadecimal integers (prefixed with "#").                                                                                                                                                                                                                                                                                                                                        |
| (26.1) [0.4.1.1](Stancements/Changelogs/Changelog%200.4.1.1.md) | Added "Tears" and "Lava Chicken" to this data map. Previously, they were included in the "Recorder Modded Songs" data pack.                                                                                                                                                                                                                                                                                      |

## Issues
Issues relating to "Recorded song styles" are maintained on [*Stancements*' issue tracker](https://github.com/isabellawoods/Stancements/issues). Issues should be reported and viewed there.

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
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) **Recorded Song Styles**                                                                                                                                                                                                                                                                                                                                                                                                                                       |
