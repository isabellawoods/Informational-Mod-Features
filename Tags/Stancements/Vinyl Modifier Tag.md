# Vinyl Modifier Tag
> [!NOTE]
> **Last Updated**: 17-08-26 (5.0.0-beta.1 - 1.21.1)

A **vinyl modifier tag** is a collection of [vinyl modifiers](/Stancements/Docs/Vinyl%20Modifier.md). Currently, their only use is to prioritize certain modifiers to ensure the consistency of the outputted disc.

The vinyl modifier tags are defined under `data/<namespace>/tags/stancements/vinyl_modifier/`.

## List of tags
### priority_modification
Vinyl modifiers in this tag run before all other modifiers when a recording begins or finishes.

**Added in**: [*Stancements* `0.4.4`](/Stancements/Changelogs/Changelog%200.4.4.md)

![*(list)*](/Revaried/Docs/Tags/list_tag.png) **#stancements:priority_modification** *(2 values)*
- `stancements:pipeline/finish_recording`
- `stancements:pipeline/sculk_ejection_chance`

## History
| Version                                                             | Changes                                                                                 |
| ------------------------------------------------------------------- | --------------------------------------------------------------------------------------- |
| [0.4.4](/Stancements/Changelogs/Changelog%200.4.4.md)               | <li>Added vinyl modifier tags.</li> <li>Added the `#priority_modification` tag.</li>    |
| [5.0.0-beta.1](/Stancements/Changelogs/Changelog%205.0.0-beta.1.md) | Added `stancements:pipeline/sculk_ejection_chance` to the `#priority_modification` tag. |

## Navigation
### Tags
|                 |                                                                                                        |
| --------------- | ------------------------------------------------------------------------------------------------------ |
| **`melony`**    | [Item](Tags/Melony%20Convention/Item%20Tags.md)                                                        |
| **Reutilities** | [Item](/Tags/Reutilities/Item%20Tags.md) ▪ [Trim Material](Tags/Reutilities/Trim%20Material%20Tags.md) |
| **Stancements** | [Vinyl Modifier](/Tags/Stancements/Vinyl%20Modifier%20Tag.md)                                          |
