![[5.0.0-beta2.png]]

<h1 style="text-align: center;">- Mellow UI 5.0.0 Beta 2 -</h1>

> **Written On:** 16-12-25 - **Last Updated:** 16-12-25

**5.0.0 Beta 2** is a major release for *Mellow UI*, released on December 6, 2025 on 1.16[^1], and on December 15, 2025 on 1.18.[^2]

## Additions
### Backports
- The cursor now changes shapes when hovering over UI elements, like in text fields, buttons, sliders, scrollers, etc.
  - This is controlled by the "Allow Cursor Shapes" option under mouse settings.
  - Not everything than can be clicked changes the cursor shape, and most modded buttons don't change it either.
  - The "blocked" shape doesn't exist in 1.16 or 1.18, so hovering over disabled buttons won't change the cursor.
  - **(1.16)** Scrollers in lists and panels don't change to "pointing hand" when only hovering over them.
  - Selected tabs don't change the cursor, unlike in newer versions.
- Changing the volume of sound sliders outside of a world now plays a preview sound.
  - This doesn't work with the UI volume slider, as it's added by *Mellow UI*.

### Options
- Added **4** new client configs:
  - `panelBackgroundStyle`: Controls the background style of *Forge*'s scroll panels, used only in its mod list screen;
  - `updateAvailableIconStyle`: Controls the style to use for the "Update Available!" icon on mod buttons and entries. Can be the *Forge* emerald (`false`) or the Realms diamond (`true`);
  - `fadingBlur`: Makes the blurry background fade in/out when switching from a screen (or lack of) without a blur to one with;
  - `allowCursorChanges`: Changes the cursor shape when hovering over certain UI elements.
- Added **1** new widget config:
  - `stringWidgetTextPadding`: The padding amount of a string widget. Clamping doesn't apply to this option due to an oversight.

### Miscellaneous
- All panoramas added by *Blue Skies* and *Create* are now shipped with *Mellow UI* instead of being added by The 1.16 Pack.
  - This means that, when loading the game with these mods, their panoramas now show up in "Panoramas" tab by default.
  - Unlike this mod's panoramas, these don't have description as I was too lazy to make them.

### Screens
- Screens can now have their own panoramas.
  - Per-screen panoramas fade in/out when opening/closing the screen.
  - The bottom panorama stops rendering after the top panorama reaches full transparency.
  - **(1.16)** If the bottom and top panoramas are the same, no fading occurs, but it spins a little faster during the "fading" period.
  - This system is currently hardcoded, and only *Create*'s main menu, *Revaried*'s option screens are implemented (*Revaried*'s is 1.16 only).

## Changes
### Miscellaneous
- The music toast is now tiled properly, and the music notes now cycle through colors like in newer versions. It's also a pixel shorter now.
  - The music notes now use `.mcmeta` files for their animations.
  - The toast texture is now 256x256 so *Forge*'s tiling method works.
- Background shaders now render on the title screen panorama when the **Title** style option is Vanilla.
- "Raw Input" will now be added to mouse settings when it's supported.
- Hovering over the following list entries now changes the cursor to the "pointing hand" shape:
  - Panoramas;
  - The "Add +" text in config entries;
  - Post effects.

### Translations
- Changed "a nova" in the **Screen Background** and **List Background** tooltips to "à nova" in the Brazilian Portuguese translation.
- **(1.18)** Song translations in Brazilian Portuguese now use an em dash (—) instead of a hyphen (-).
- **(1.18)** Changed the "WHAT!" in the "cannot find *Forge*" error message to "... how?".
  - Changed from "QUE!" to "... como?" in Brazilian Portuguese.
- **(1.18)** Removed all translations strings related to the `CustomizedWorldOptionScreen`.
- **(1.18)** Updated the tooltip of the **Screen Background** style option to include **Fading Blur**.

### Options
- **Show Music Toast** has been renamed to **Music Toast**, and now has three options:
  - **Never**: never show the toast.
  - **Pause Menu**: only display in the pause menu (new option).
  - **Pause Menu and Toast**: displays both as a toast and on the pause menu.
  - Its id has changed to `musicToast`, from `showMusicToast`.
  - Updates its tooltips to match the newer versions.
- Changed the default color of the **Update Availability** color option to **#57FFE1** (light blue), from **#41F384** (green).

### Screens
#### *Forge*'s Mod List
- List entries now have shadow.
- List entries no longer span the "select entry" sound.
- The "Search" text is now on the text field, instead of above it.
- The scroll panel background is now controlled by the **Default Background** option.
  - Added two new textures for its background: `menu_panel` and `inworld_menu_panel`.
- The "No mod selected..." text is now rendered when no mod is selected.
- The update available icon is now controlled by the **Update Available Icon** style option.
- **(1.18)** The panorama spins twice as fast in this screen.
- Clicking on an entry to deselect still plays selection sound.

#### *Mellow UI*'s Mod List
- The update available icon on mod entries is now controlled by the **Update Available Icon** style option.
- Hovering over mod entries now changes the cursor to the "pointing hand" shape.
- The "Done" button now comes before "Open Mods Folder" when using Tab navigation.
- **(1.18)** Going to another screen and coming back now centers the list on the previously selected mod.
- **(1.18)** The search text no longer persists after closing the screen.

#### Mod Notification
- The update available icon is now controlled by the **Update Available Icon** style option.

#### Select World
- The world entry text in the Select World screen now has tooltips.
  - It now uses a string widget for rendering tooltips.
- Hovering over the world icon now changes the cursor to the "pointing hand" shape.
- **(1.18)** Worlds using experimental features now show the "Experimental" tag instead of *Forge*'s warning icon.

#### Statistics
- In the items tab, hovering over the category buttons now makes their texture indented, and changes the cursor shape to the "pointing hand" shape.
- In the items tab, category button tooltips now only render on the buttons themselves, not on the entire column.

## Technical
### Additions
- Added a `changelogsURL` to the mod's `mods.toml` file, pointing to [this](https://github.com/isabellawoods/Informational-Mod-Features/tree/main/Mellow%20UI/Changelogs) location (this repository).

### Changes
- Text rendering via `ScrollingText` now uses the draw methods from the vanilla *Render Components*.
- *Mellow UI*'s tooltip provider now checks if the tooltip data is `null`before trying to render it.
- GUI atlas animations now work like other atlases (given the texture has a `.mcmeta` file). However, only textures that *use* the atlas in the code will be animated.

### References
[^1]: **(1.16)** ["5.0.0 (Beta II): Per-Screen Modded Panoramas"](https://github.com/isabellawoods/Mellow-UI/commit/d3fe48a55ce7c48b921e3e49366e0c07840feb52) (Commit `d3fe48a`) – GitHub, December 6, 2025.
[^2]: **(1.18)** ["5.0.0 (Beta II): Per-Screen Modded Panoramas"](https://github.com/isabellawoods/Mellow-UI/commit/b66c5088952f592151e0cb857acd1ade77287635) (Commit `b66c508`) – GitHub, December 15, 2025.