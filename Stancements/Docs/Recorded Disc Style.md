# Recorded Disc Style
> [!NOTE]
> **Last Updated**: 19-08-26 (5.0.0-beta.1 - 1.21.1)

**Recorded disc styles** define a color, a label, and optionally an item rarity for when a song is recorded/copied. If not defined, the item will have a randomized color and label.

Recorded disc styles can be defined using JSON files in a data pack at the path `data/<namespace>/stancements/recorded_disc_style/`, and can have tags defined at the path `data/<namespace>/tags/stancements/recorded_disc_style/`.

## JSON format
Recorded disc styles are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![*(int or string)*](/Revaried/Docs/Tags/integer_tag.png)![](/Revaried/Docs/Tags/string_tag.png) **color**: An integer (decimal or hexadecimal) of the color applied to the item. Uncapped, but recommended to stay between **0** and **16777215** (`#ffffff`).
  - ![*(float)*](/Revaried/Docs/Tags/float_tag.png) **label**: A float defining the label applied to the item. Must be between **1** and **14**.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **rarity**: *(optional)* Defines the rarity for the recorded disc item. Defaults to `uncommon`.

### Example
```json
{
  "color": "#ffdd99",
  "label": 10.0,
  "rarity": "rare"
}
```

## History
| Version                                                             | Chages                                                                                                                                                                                                   |
| ------------------------------------------------------------------- | -------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [0.4.2](/Stancements/Changelogs/Changelog%200.4.2.md)               | Added recorded disc styles, which supercede the [`recorded_song_styles`](/Stancements/Docs/Recorded%20Song%20Styles.md) data map.                                                                        |
| [0.4.3](Stancements/Changelogs/Changelog%200.4.3.md)                | With the addition of a label for "fingerspit - Bounce", the upper bounds of the **color** field is now `14.0`.                                                                                           |
| [0.4.4](/Stancements/Changelogs/Changelog%200.4.4.md)               | As a consequence to the vinyl modifier rewrite, song under the `minecraft` namespace will now locate disc styles under the `stancements` namespace.                                                      |
| [5.0.0-beta.1](/Stancements/Changelogs/Changelog%205.0.0-beta.1.md) | <li>The `stancements:game/end/alpha` disc style is now under the `minecraft` namespace.</li> <li> Songs under the `minecraft` namespace will now locate disc styles in the correct namespace again.</li> |

## Issues
Issues relating to "Recorded disc styles" are maintained on [*Stancements*' issue tracker](https://github.com/isabellawoods/Stancements/issues). Issues should be reported and viewed there.

## See also
- [Vinyl modifier tag](/Tags/Stancements/Vinyl%20Modifier%20Tag.md)

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
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](/Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](/Stancements/Docs/Recorded%20Song%20Styles.md) ▪ ![](/Textures/navbox/recorded_disc_style.png) **Recorded Disc Style** ▪ ![](/Textures/navbox/track.png) [Track](/Stancements/Docs/Track.md) ▪ ![](/Textures/navbox/vinyl_modifier.png) [Vinyl Modifier](/Stancements/Docs/Vinyl%20Modifier.md)                                                                                                                                         |
