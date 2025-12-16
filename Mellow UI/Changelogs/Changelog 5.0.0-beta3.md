<h1 style="text-align: center;">- Mellow UI 5.0.0 Beta 3 -</h1>

> **Written On:** 16-12-25 - **Last Updated:** 16-12-25

**5.0.0 Beta 3** is a minor release for *Mellow UI*, released on December 13, 2025 on 1.16.[^1]

## Changes
### Miscellaneous
- **(1.16)** The update available icon is now rendered slightly further into the button when in the corner.
- **(1.16)** Scrollers in lists and panels now change the cursor to the "pointing hand" shape when hovered but not pressed.
- **(1.16)** When fading panoramas, if both of them are the same, the panorama no longer spins a bit faster during the "fading" period.
- Per-screen panoramas are now controlled by the panorama definition itself.

### Translations
- **(1.16)** Song translations in Brazilian Portuguese now use an em dash (—) instead of a hyphen (-).
- **(1.16)** Changed the "WHAT!" in the "cannot find *Forge*" error message to "... how?".
  - Changed from "QUE!" to "... como?" in Brazilian Portuguese.
- **(1.16)** Removed all translations strings related to the `CustomizedWorldOptionScreen`.
- **(1.16)** Updated the tooltip of the **Screen Background** style option to include **Fading Blur**.
- **(1.16)** The "Autor(es)" text in *Mellow UI*'s mod list has been changed to "Autor(es):" in Brazilian Portuguese.
- Changed the breast settings error message to say "options" instead of "skin customization".
- Added the word "mod" before the mod id in the "broken config screen" error message.

### Options
- Removed an extra ")" on the description of `listBackgroundStyle`.
- The **String Widget Text Padding** option is now clamped when used.
- The **UI** volume slider now plays its preview sound.

### Screens
- **(1.16)** *Mellomedley*'s title screen title now obeys the **Title Text** color option, despite not being visible.

### *Mellow UI*'s Mod List
- **(1.16)** Going to another screen and coming back now centers the list on the previously selected mod.
- **(1.16)** The search text no longer persists after closing the screen.
- Going to another screen and coming back now selects the entry of the previously selected mod.

## Technical
### Additions
- Added the ![list_tag](list_tag.png) **used_in** field to panorama definitions.
  - This field provides a list of `Screen` class paths that the panorama renders in. See [panorama](Panorama.md) for the full description.
- The ![integer_tag](integer_tag.png) **accent_color** field in flair definitions now accepts hexadecimal values (prefixed with "#").
  - All flairs added by this mod have been changed to use hexadecimal.

### Changes
- **(1.16)** The non-translated version of the flair logger messages now use "flair" instead of "mod list flair".
- Panoramas with more or less than 6 `cube_map` textures now fail to parse.
- Panoramas with a negative `blur_strength` now fail to parse.
- **(1.16)** Renamed `GUISpriteUploader` to `GUITextureManager`, to match 1.18.
  - Renamed `registerGUISpriteUploader()` to `registerGUITextureManager()` to match.
- `VanillaRenderComponents` no longer has a `font` field. This was causing crashes in both versions.

### References
[^1]: **(1.16)** ["5.0.0 (B-III P-I): Panorama Transition Fixes"](https://github.com/isabellawoods/Mellow-UI/commit/24eed3627dd55711b51d5372c7fd2c4bdcc3a5d8) (Commit `24eed36`) – GitHub, December 13, 2025.
