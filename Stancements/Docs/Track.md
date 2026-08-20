# Track
> [!NOTE]
> **Last Updated**: 19-08-26 (5.0.0-beta.1 - 1.21.1)

A **track** is an "abstraction" of the `music_id` and `copying_song` fields used in code related to recording or copying music.

*Track* is located at `melonystudios.stancements.misc.recording.Track`.

## JSON format
### Direct codec
This is the default structure for tracks, using `Track.DIRECT_CODEC`:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **id**: The identifier of this track, storing which song (ambient or jukebox) it represents.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **resolved**: *(optional)* Whether this track represents an existing entry in the *jukebox song* registry.

### Codec
If ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **resolved** is `false`, the track will be stored as an identifier (using `Track.CODEC`).

### List codec
*Track* also provides a specialized `Track.LIST_CODEC` that saves a list of one track as a compound/string, instead of always using a list.

- **Saving a *List* with one track:**
```json
"track": "minecraft:music/game/watcher"
```

- **Saving a *List* with more than one track:**
```json
"track": [
  {
    "id": "minecraft:game/watcher",
    "resolved": true
  },
  "minecraft:music/game/watcher"
]
```

## History
| Version                                                             | Changes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [5.0.0-beta.1](/Stancements/Changelogs/Changelog%205.0.0-beta.1.md) | Added *Track*. Currently, it is used for: <li>The new `inventory_recorder` and `track_storage` components;</li> <li>The ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **excluded** and ![*(string or compound)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **track** fields in the `recorded_song` advancement trigger;</li> <li>The ![*(string or compound)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **targets** field in vinyl modifiers.</li> |

## Issues
Issues relating to "Track" are maintained on [*Stancements*' issue tracker](https://github.com/isabellawoods/Stancements/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ----------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) [Crystallizer Recipes](/Back%20Math/Docs/Crystallizer%20Recipes.md) ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) [Outfit Definition](/Reutilities/Docs/Outfit%20Definition.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md)                                                                                                                                                                                                                                                                                                                               |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) [Mossifiables](/Stacked%20Goods/Docs/Mossifiables.md) ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](/Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                                                         |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](/Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](/Stancements/Docs/Recorded%20Song%20Styles.md) ▪ ![](/Textures/navbox/recorded_disc_style.png) [Recorded Disc Style](/Stancements/Docs/Recorded%20Disc%20Style.md) ▪ ![](/Textures/navbox/track.png) **Track** ▪ ![](/Textures/navbox/vinyl_modifier.png) [Vinyl Modifier](/Stancements/Docs/Vinyl%20Modifier.md)                                                                                                                       |
