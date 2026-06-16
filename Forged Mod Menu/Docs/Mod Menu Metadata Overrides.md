# Mod Menu Metadata Overrides
> [!NOTE]
> **Last Updated**: 15-06-26 (11.2.0)

A **metadata** or **appearance override** is a way to change how a mod is displayed in *Forged Mod Menu*'s mods screen, allowing you to change its name, description, logo, badges and parents.

The overrides file is located at `.minecraft/config/forgedmodmenu_metadata_overrides.json`.

## JSON format
The overrides file is defined in the following format:

- ![*(list)*](/Revaried/Docs/Tags/list_tag.png) The root list object.
  - ![*(object)*](/Revaried/Docs/Tags/compound_tag.png) A single mod object.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **id**: The ID of the mod being overridden.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **name**: *(optional)* A name for the mod. This usually doesn't need to be overridden as *Mod Menu* provides a way to translate mod names: `modmenu.nameTranslation.<modid>`.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **description**: *(optional)* A description for the mod. This usually doesn't need to be overridden as *Mod Menu* provides a way to translate mod descriptions: `modmenu.descriptionTranslation.<modid>`.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **icon**: *(optional)* A resource location pointing to a valid texture in a resource pack, not omitting the `textures/` prefix and `.png` suffix.
    - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **badges**: *(optional)* A list of `Badge`s that this mod can have. Can be one of `library`, `client` or `deprecated`.
    - ![*(string or object)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **parent**: *(optional)* A parent for this mod. Can be defined as the ID for another mod (creating the parent mod if it doesn't exist), or as a full object:
      - **Same as the mod object, with the exception of the ![*(string or object)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) `parent` object.**

### Example
```json
[
  {
    "id": "wildfire_gender",
    "name": "Female Gender Mod",
    "icon": "modlogos:textures/mod_logos/female_gender_mod.png",
    "badges": [
      "client"
    ]
  }
]
```

## History
| Version                                                                                                    | Changes                                        |
| ---------------------------------------------------------------------------------------------------------- | ---------------------------------------------- |
| [11.2.0](https://github.com/isabellawoods/Forged-Mod-Menu/commit/e6a4db3ce486cc9cacefcf14a71dd8940a5bf2a1) | Added `forgedmodmenu_metadata_overrides.json`. |

## Issues
Issues relating to "Metadata overrides" or "Appearance overrides" are maintained on [*Forged Mod Menu*'s issue tracker](https://github.com/isabellawoods/Forged-Mod-Menu/issues). Issues should be reported and viewed there.

## Navigation
### Resource pack definitions
|                     |                                                                                                                                                                                                                         |
| ------------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Forged Mod Menu** | ![](/Textures/navbox/metadata_overrides.png) **Mod Menu Metadata Overrides**                                                                                                                                            |
| **Mellow UI**       | ![](/Textures/navbox/flair.png) [Flair](Mellow%20UI/Docs/Flair.md) ▪ ![](/Textures/navbox/panorama.png) [Panorama](/Mellow%20UI/Docs/Panorama.md) ▪ ![](/Textures/navbox/theme.png) [Theme](/Mellow%20UI/Docs/Theme.md) |
