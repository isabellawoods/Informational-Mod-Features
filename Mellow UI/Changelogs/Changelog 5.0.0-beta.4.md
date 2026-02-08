![Mellow UI 5.0.0 Beta 4 changelog photo](Assets/5.0.0-beta.4.png)

<h1 style="text-align: center;">- Mellow UI 5.0.0 Beta 4 -</h1>

> **Written On:** 06-02-26 - **Last Updated:** 06-02-26 - **1.16 Changelog:** [5.0.0-beta4](Changelog%205.0.0-beta4.md)

**5.0.0 Beta 4** is a minor upcoming release for *Mellow UI*.[^1] It updates most of the screens that weren't yet updated, and shifts all lists and separators to match vanilla.

This 1.18 changelog is in a different file because the version has a dot between the "beta" name and the number. Going forward, the 1.16 version will also have this dot.

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
- The **Classified As Containers** option now points to the correct `RecipesGui` class (from JEI) in 1.18.
- Changed the position of the options list scroller to match vanilla.
- The item category buttons on the statistics screen are now only hovered if the cursor is within the bounds of the list.
- **[Bra. Portuguese]** Updated the "Search..." translation to "Buscar", from "Pesquisar".
- Updated the mod's logo and pack icon.
  - Added the `logoBlur=false` property to the `mods.toml` file.

### Screens
- Moved all buttons on the updated options screen to match vanilla.
- Moved all buttons on the credits and attributions screen to match vanilla.
- Moved the Realms diamond update checker icon down by 1px.
- Removed the duplicate header rendering from the updated loading errors screen.
- Accidentally removed the header text from the pack selection screens.<sup>*[was it in beta 3?]*</sup>

#### Customization
- The search box on this screen is now focused initially.
- The narrator now narrates the selection of panoramas or themes.
- Readded the **Online Options** style option to the styles list, which was accidentally removed in [Beta 3](Changelog%205.0.0-beta3.md).
  - The button for the **Options** style option is no longer two buttons wide.

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
- Updated *Forge* to `40.3.0`, from `40.2.14`.
- Renamed the `TickingWidget.tick()` method to `tickWidget()`, to fix a crash in the updated Create New World screen.
- Changed *Mellow UI*'s accent color to **#FF2BDA**, from **#955AE0**.

### Removals

### References
[^1]: **(1.18)** ["5.0.0 (Beta IV P1): New Logo & Upd. Language Screen"](https://github.com/isabellawoods/Mellow-UI/commit/4c85247177935e85ac3d631a64a1ac0b25550ec9) (Commit `4c85247`) – GitHub, January 26, 2026.