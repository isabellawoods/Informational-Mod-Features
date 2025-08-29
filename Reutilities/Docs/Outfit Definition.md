# Outfit Definition
> [!NOTE]
> ***Last Updated**: 1.2.0 (24-8-25)*

An **outfit definition** is a set of textures to use for an outfit item or `outfit` tag. Outfit definitions can be defined using JSON files in a data pack at the path `data/<namespace>/reutilities/outfit_definition/`.

Outfit definitions can have tags defined at the path `data/<namespace>/tags/outfit_definition/`.

## JSON Format
Outfit definitions are defined using the following format.

- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/compound_tag.png) **head**: *(optional)* The head outfit slot. Used when getting a texture for the entity's head.
    - ![](/Revaried/Docs/Tags/string_tag.png) **texture**: A resource location for the texture used by this outfit slot. Omits the `textures/` prefix and `.png` suffix.
    - ![](/Revaried/Docs/Tags/string_tag.png) **emissive_texture**: *(optional)* A resource location for the emissive texture used by this outfit slot. Omits the `textures/` prefix and `.png` suffix.
    - ![](/Revaried/Docs/Tags/boolean_tag.png) **hides_skin_layers**: *(optional)* A boolean controlling whether this slot hides the skin layers related to this slot.
      | Outfit Slot | Skin Layers |
      |-|-|
      | **head** | Hat |
      | **chest** | Jacket and left and right sleeves |
      | **legs** | Left and right pants |
      | **feet** | Left and right pants |
    - ![](/Revaried/Docs/Tags/integer_tag.png) **color**: *(optional)* An integer defining a set color for this outfit slot. When defined, this field overrides the item's default color and the `display.color` tag.
  - ![](/Revaried/Docs/Tags/compound_tag.png) **chest**, **legs** and **feet**: *(all optional)* Same format as ![](/Revaried/Docs/Tags/compound_tag.png) **head**.

## History
### Back Math
| Version | Changes |
|---------|---------|
| [1.9.0.5](/Back%20Math/Changelogs/Changelog%201.9.0.5-beta.md) | <li> Added outfit definitions to data packs. </li> <li> Currently, the `emissive_texture` field doesn't work because I didn't implement it. |
| [1.9.0.6](/Back%20Math/Changelogs/Changelog%201.9.0.6-beta.md) | <li> Added the `color` field. </li> <li> The `emissive_texture` field now works. </li> |
| [1.9.0.8](/Back%20Math/Changelogs/Changelog%201.9.0.8-beta.md) | Added the `hides_skin_layers` field. |

### Reutilities
| Version | Changes |
|---------|---------|
| 1.1.0 | Added outfit definitions to data packs, ported from *Back Math*. |

## Issues
Issues relating to "Outfit definition" are maintained on [Reutilities's bug tracker](https://github.com/isabellawoods/Reutilities/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) **Outfit Definition** ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md) |
| **Melony Lib** | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md) |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md) |