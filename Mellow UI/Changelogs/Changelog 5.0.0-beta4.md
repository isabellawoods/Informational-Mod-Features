![Mellow UI 5.0.0 Beta 4 changelog photo](Assets/5.0.0-beta4.png)

<h1 style="text-align: center;">- Mellow UI 5.0.0 Beta 4 -</h1>

> **Written On:** 04-01-26 - **Last Updated:** 06-02-26 - **1.18 Changelog:** [5.0.0-beta.4](Changelog%205.0.0-beta.4.md)

**5.0.0 Beta 4** is a minor upcoming release for *Mellow UI*.[^1][^2] It updates most of the screens that weren't yet updated, and shifts all lists and separators to match vanilla.

## Additions
### Options
- Added **1** new client config:
  - `languageStyle`: Controls the style of the language selection screen.

### Screens
#### Language
- Backported the language screen from the newer versions of the game.
  - The **Force Unicode Font** option is now in the "Font Settings" subscreen.
  - Added a search box to easily find languages.
  - The list selection background has been updated to *Mellow UI*'s style.

## Changes
### Miscellaneous
- Changed the position of the header/footer separators to match vanilla.
  - Most lists have been slightly shrunk to match, and the footer buttons have been moved up by 1px.
- Changed the position of the options list scroller to match vanilla.
- The item category buttons on the statistics screen are now only hovered if the cursor is within the bounds of the list.
- Updated the mod's logo and pack icon.
  - Added the `logoBlur=false` property to the `mods.toml` file.

### Screens
- Moved all buttons on the updated options screen to match vanilla.
- Moved all buttons on the credits and attributions screen to match vanilla.

#### Customization
- The search box on this screen is now focused initially.
- The narrator now narrates the selection of panoramas or themes.

#### *Mellow UI*'s Mod List
- The search box on this screens is now focused initially.
- Shifted the search box to match the new language screen.

#### Super Secret Settings
- The search box on this screen is now focused initially.
- Shifted the search box to match the new language screen.
- Increased the size of each entry by 2px, to match the new language screen.

## Technical
### Additions
- Added `RenderComponents.drawTitle()` to render the titles of screens. Subtitles still use the regular `drawCenteredString()` method.
- Added `WidgetComponents`, "a utility class that provides instances of widgets that are used more than once throughout the codebase".
  - Moved `switchStyle()`, `customize()`, `enablePacks()` and `disablePacks()`, from `RenderComponents`, here.
- Added `WidgetLocations`, which has methods for opening/getting the screen to open depending on the style options.
  - Moved `MellowUtils.openLink()` here.
- Moved the title y-offset fields from `MellowUtils` to `RenderComponents`.

### Changes
- Changed *Mellow UI*'s accent color to **#AB08B5**, from **#955AE0**.

### Removals
- Finally removed `MellowUtils`, now that all of its methods and fields were moved elsewhere.

### References
[^1]: **(1.16)** ["5.0.0 (Beta IV P1): List Alignment & Upd. Language Screen"](https://github.com/isabellawoods/Mellow-UI/commit/9116365c37fc26d4a92160327e581eead77bf187) (Commit `9116365`) – GitHub, January 2, 2026.
[^2]: **(1.16)** ["Updated README & Logos"](https://github.com/isabellawoods/Mellow-UI/commit/895c32581519c47fb16c20156df21b5fa759bdcc) (Commit `895c325`) – GitHub, January 2, 2026.