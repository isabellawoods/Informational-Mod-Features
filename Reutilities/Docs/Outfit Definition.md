# Outfit Definition
> [!NOTE]
> **Last Updated**: 25-04-26 (1.5.0)

An **outfit definition** is a set of textures to use for an equippable item with the `reutilities:outfit` component. Outfit definitions can be defined using JSON files in a data pack at the path `data/<namespace>/reutilities/outfit_definition/`.

Outfit definitions can have tags defined at the path `data/<namespace>/tags/reutilities/outfit_definition/`.

## JSON format
Outfit definitions are defined using the following format:

- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/compound_tag.png) **head**: *(optional)* The head outfit slot. Used when getting a texture for the entity's head.
    - ![](/Revaried/Docs/Tags/string_tag.png) **texture**: A resource location for the texture used by this outfit slot. Omits the `textures/` prefix and `.png` suffix.
    - ![](/Revaried/Docs/Tags/string_tag.png) **emissive_texture**: *(optional)* A resource location for the emissive texture used by this outfit slot. Omits the `textures/` prefix and `.png` suffix.
    - ![](/Revaried/Docs/Tags/string_tag.png) **overlay_texture**: *(optional)* 
    - ![](/Revaried/Docs/Tags/boolean_tag.png) **hides_skin_layers**: *(optional)* A boolean controlling whether this slot hides the skin layers related to this slot.
      | Outfit Slot | Skin Layers |
      |-|-|
      | **head** | Hat |
      | **chest** | Jacket and left and right sleeves |
      | **legs** | Left and right pants |
      | **feet** | Left and right pants |
      | **body** | None by default. Would be used for the entity's body |
      | **mainhand** | Player's main hand. Defaults to using **chest** if not present |
      | **offhand** | Player's off hand. Defaults to using **chest** if not present |
    - ![*(int or string)*](/Revaried/Docs/Tags/integer_tag.png)![](/Revaried/Docs/Tags/string_tag.png) **color**: *(optional)* An integer (decimal or hexadecimal) defining a set color for this outfit slot. When defined, this field overrides the item's default color and the `minecraft:dyed_color` component. Must be between **0** and **16777215** (`#ffffff`).
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **chest**, **legs**, **feet**, **body**, **mainhand** and **offhand**: *(all optional)* Same format as **head**.

## History
### Back Math
| Version                                                        | Changes                                                                                                                                       |
| -------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------- |
| [1.9.0.5](/Back%20Math/Changelogs/Changelog%201.9.0.5-beta.md) | <li> Added outfit definitions to data packs. </li> <li> Currently, the **emissive_texture** field doesn't work because I didn't implement it. |
| [1.9.0.6](/Back%20Math/Changelogs/Changelog%201.9.0.6-beta.md) | <li> Added the ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **color** field. </li> <li> The **emissive_texture** field now works. </li>    |
| [1.9.0.8](/Back%20Math/Changelogs/Changelog%201.9.0.8-beta.md) | Added the ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **hides_skin_layers** field.                                                    |

### Reutilities
| Version | Changes                                                                                                                                                                                                                                                                       |
| ------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| 1.1.0   | Added outfit definitions to data packs, ported from *Back Math*.                                                                                                                                                                                                              |
| 1.4.0   | <li>The **color** field now accepts hexadecimal integers (prefixed with "#").</li> <li>Added the ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **overlay_texture** field.</li> <li>*OutfitDefinition* and *OutfitSlot* now use use builder for making new instances.</li> |
| 1.5.0   | The **color** field is now capped between **0** and **16777215** (`ffffff`).                                                                                                                                                                                                  |

## Issues
Issues relating to "Outfit definition" are maintained on [*Reutilities*'s issue tracker](https://github.com/isabellawoods/Reutilities/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                  |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) [Crystallizer Recipes](Back%20Math/Docs/Crystallizer%20Recipes.md) ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) **Outfit Definition**                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                             |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md)                                                                                                                                                                                                                                                                                                                              |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) [Mossifiables](Stacked%20Goods/Docs/Mossifiables.md) ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                                                          |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](Stancements/Docs/Recorded%20Song%20Styles.md)                                                                                                                                                                                                                                                                                                                                                                                           |
