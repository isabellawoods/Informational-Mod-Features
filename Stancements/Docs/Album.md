# Album
> [!NOTE]
> **Written on**: 30-08-26 (5.0.0-beta.2 - 1.21.1) - **Last updated**: 30-08-26

An **album** defines a list of tracks that an **album block** will store, and provides information about the album, its songwriter(s) and its description.

Albums can be defined using JSON files in a data pack at the path `data/<namespace>/stancements/album/`, and can have tags defined at the path `data/<namespace>/tags/stancements/album/`.

## JSON format
Albums are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png): The root object.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **name**: A [text component](https://minecraft.wiki/w/Text_component) for the name of this album.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **description**: A [text component](https://minecraft.wiki/w/Text_component) for the album's description.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **cover_art**: *(optional)* An *identifier* — Points to a texture to use in the album block's side panel.
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **track_listing**: A list of [track lists](/Stancements/Docs/Track.md#List%20codec) — Every top-level entry represents one song within the album, and each entry within these entries are aliases for the original song.
    - For example, if the album looks for the jukebox song `minecraft:game/ebb`, but a recorded disc has `minecraft:music/game/ebb` stored within its data, that would also count for the album.
    - ![*(string or list)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **One or more track aliases.**
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **songwriters**: *(optional)* A list of strings — Each one is the name of a person that participated in the production of this album.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **link_tree**: *(optional)* A map of translation keys (string) to a valid URL (string) — This will be shown in the album block's interface.
    - **Example:** `"link_tree": {"link_tree.bandcamp": "https://c418.bandcamp.com"}`
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **genres**: *(optional)* A list of strings — Each one is a musical genre that represents this album. *Stancements* provides translations for some broader genres by default in its [translation files](https://github.com/isabellawoods/Stancements/blob/neoforge-1.21.1/src/main/resources/assets/stancements/lang/en_us.json#L262-L288).
    - The translation key for genres is `musical_genre.<genre>`.

### Example
```json
data/gameosts/stancements/album/excursions.json
// "gameosts" is the namespace for one of my playlists: "game osts"
{
  "name": {
    "translate": "album.gameosts.excursions.title",
    "italic": true
  },
  "description": {
    "translate": "album.gameosts.excursions.description",
    "color": "#a0a0a0"
  },
  "cover_art": "gameosts:gui/album/excursions",
  "track_listing": [
    [
      {
        "id": "gameosts:excursions/excursions",
        "resolved": true
      },
      {
        "id": "gameosts:excursions/cold_summer",
        "resolved": true
      }
    ]
  ],
  "songwriters": [
    "C418",
    "Jukio Kallio" // credited as Kuabee in the Bandcamp version
  ],
  "link_tree": {
    "link_tree.bandcamp": "https://c418.bandcamp.com/album/excursions",
    "link_tree.youtube_music": "https://music.youtube.com/playlist?list=OLAK5uy_n_b5cjnm9jtxbAi_20ybH8UIaLumcULOE"
  },
  "genres": [
    "ambient",
    "electronic",
    "house",
    "orchestral"
  ]
}
```

## History
| Version                                                             | Changes                                                                                                                                                                                                                                                      |
| ------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| [5.0.0-beta.2](/Stancements/Changelogs/Changelog%205.0.0-beta.2.md) | <li>Added albums to data packs.</li> <li>Currently, it includes the following albums (all under the `minecraft` namespace): `volume_alpha`, `volume_beta`, `nether_update`, `caves_and_cliffs`, `the_wild_update`, `trails_and_tales`, `tricky_trials`.</li> |

## Issues
Issues relating to "Vinyl modifier" are maintained on [*Stancements*' issue tracker](https://github.com/isabellawoods/Stancements/issues). Issues should be reported and viewed there.

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
| **Stancements**   | ![](/Textures/navbox/album.png) **Album** ▪ ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](/Stancements/Docs/Pot%20Plantables.md) ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](/Stancements/Docs/Recorded%20Song%20Styles.md) ▪ ![](/Textures/navbox/recorded_disc_style.png) [Recorded Disc Style](/Stancements/Docs/Recorded%20Disc%20Style.md) ▪ ![](/Textures/navbox/track.png) [Track](/Stancements/Docs/Track.md) ▪ ![](/Textures/navbox/vinyl_modifier.png) [Vinyl Modifier](/Stancements/Docs/Vinyl%20Modifier.md)                                                  |
