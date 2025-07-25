# Queen Lucy Pet Variant
> [!NOTE]
> This feature is exclusive to *Back Math*.
>
> ***Last Updated**: 1.9.0.7 (0-7-25)*

> [!WARNING]
> In my current implementation of data-driven "registries", it **doesn't work in multiplayer** due to the server not sending them to the client. Loading them beforehand may be a possible workaround.

A **queen lucy pet variant** is an individual variant used for a queen lucy pet's textures. Queen lucy pet variants can be defined using JSON files in a data pack at the path `data/<namespace>/mob_variant/queen_lucy_pet/`.

Queen lucy pet variants can have tags defined at the path `data/<namespace>/tags/queen_lucy_pet_variant/`.

## JSON Format
Queen lucy pet variants are defined using the following format:

- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **asset_id**: The resource location of this queen lucy pet variant. Should match the location of this file inside the data pack.
  - ![](/Revaried/Docs/Tags/string_tag.png) **texture_location**: A resource location of where the texture for this variant is located. Omits the `textures/` prefix and `.png` suffix.
  - ![](/Revaried/Docs/Tags/string_tag.png) **emissive_texture**: *(optional)* A resource location of where the emissive texture for this variant is located. Omits the `textures/` prefix and `.png` suffix.
  - ![](/Revaried/Docs/Tags/compound_tag.png) **display_name**: A text component for this queen lucy pet's name.

## History
| Version | Changes |
|---------|---------|
| [*June 9th, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2009-06-24/Changelog%2009-06-24.md) (1.8.0) | <li> Added queen lucy pet variants as both a *Forge* and data-driven registry. <li> Currently, it includes the `texture_location` (read as `textureLocation`) and `display_name` fields. <li> The `display_name` field is not a text component. Instead, it is a hardcoded string/translatable text component. </li> |
| [*June 12th, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2012-06-24/Changelog%2012-06-24.md) (1.8.0) | <li>The `textureLocation` field is now read as `texture_location`. <li> If the `display_name` field is omitted, it now defaults to "No translation." |
| [*June 28th, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2028-06-24/Changelog%2028-06-24.md) (1.8.0) | The `display_name` field is now a proper text component, and can no longer be omitted.<sup>*[verify]*</sup> |
| [*October 6th, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2006-10-24/Changelog%2006-10-24.md) (1.8.0) | <li> Queen lucy pet variants are now loaded from data packs. <li> Added the `asset_id` field. |
| [1.9.0.5](/Back%20Math/Changelogs/1.9.0.5%20Beta%20-%2028-01-25/Changelog%201.9.0.5.md) | Added the `emissive_texture` field. |
| [1.9.0.7](/Back%20Math/Changelogs/1.9.0.7%20Beta%20-%2028-03-25/Changelog%201.9.0.7.md) | Moved the variants folder to `/mob_variant/queen_lucy_pet`, from `/queen_lucy_pet_variant`. |

## Issues
Issues relating to "Queen lucy pet variant" are maintained on [Back Math's bug tracker](https://github.com/isabellawoods/Back-Math/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) **Queen Lucy Pet Variant** ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md) |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md) |