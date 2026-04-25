# Mossifiables
> [!NOTE]
> **Last Updated**: 25-04-26 (4.0.4)

`mossifiables.json` is a **block data map** defining blocks that moss balls are usable on, and which particles to spawn.

This data map file is located at `data/stackedgoods/data_maps/block/mossifiables.json`.

## JSON format
Entries on the mossifiables map are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) The root **values** object.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **\<block ID>**: The ID of a registered block. May be a non-existent block, but that will require a loading condition.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **mossy_block**: A string (block ID) of the mossy version of this block. If it's of the same type as the original (like both blocks being a slab), it will keep all the block states.
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **particle_options**: The particle to spawn when applying moss to this block.
      - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **type**: The ID of the particle type. See [Particles (Java Edition)](https://minecraft.wiki/w/Particles_(Java_Edition)) for valid values. Entries on this map use `stackedgoods:moss_scrape`.
      - **Other fields based on the type, see [here](https://minecraft.wiki/w/Particle_format#Configurations_of_particle_types).**

### Example
```json
{
  "values": {
    "minecraft:cobblestone": {
      "mossy_block": "minecraft:mossy_cobblestone",
      "particle_options": {
        "type": "stackedgoods:moss_scrape"
      }
    }
  }
}
```

## History
| Version | Changes                                                                                                                                                                                 |
| ------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 0.4.1   | Added the "mossifiables" data map.                                                                                                                                                      |
| 4.0.4   | The **particle_options** field is now supports any type of particle, instead of just *SimpleParticleType*s.<br>This means this field is now a compound, and must have a **type** field. |

## Issues
Issues relating to "Mossifiables" or "Moss ball" are maintained on [*Stacked Goods*' issue tracker](https://github.com/isabellawoods/Stacked-Goods/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) [Crystallizer Recipes](Back%20Math/Docs/Crystallizer%20Recipes.md) ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) [Outfit Definition](Reutilities/Docs/Outfit%20Definition.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md)                                                                                                                                                                                                                                                                                                                              |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) **Mossifiables** ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                                                                                              |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](Stancements/Docs/Recorded%20Song%20Styles.md)                                                                                                                                                                                                                                                                                                                                                                                           |
