<div style="text-align: center;"> <img src=ChangelogPhoto.png width="1170"> </div>

<h1 style="text-align: center;">- Mellow UI 4.5.0 -</h1>

> **Written On:** 29-9-25 - **Last Updated:** 29-9-25

**4.5.0** is a major release for *Mellow UI*, released on September 28, 2025.[^1][^2][^3]

## Additions
### Backports
- Added the "UI" sound slider to the *"Music & Sound Options"* screen.
- Changed the "Show Subtitles" button to "Closed Captions", and added a tooltip.
- Backported the updated *"Statistics"* screen from snapshot [25w34a](https://minecraft.wiki/w/Java_Edition_25w34a). Its style config currently doesn't work with *Mellow UI*'s pause screen.
  - The "Retrieving statistics" text is rendered with a background.
  - If the retrieval takes longer than 2 seconds, a message is shown below the text, and the "Done" button is rendered.
- Items that render beyond their slot boundaries are now culled to fit.
  - This, however, is *very* broken, since the toggles don't work and the count is also culled.

### Options
- Added **3** new configs:
  - `cullOversizedItems`: Toggles whether items that don't fit their slot boundary should be culled.
    - This config has no effect in this version.
  - `oversizedInGUI`: A list of item ids that are allowed to render past their slot boundary.
    - Items in this config don't render in this version.
  - `uiVolume`: The volume of UI sounds.
- The `mellomedleyVersion` and `onboardAccessibility` configs can now be changed from *MUI*'s options screen.
- All client configs now have translations keys set.

## Changes
### Option Screens
- The *"Mouse Settings"* screen now uses the default list instead of a custom one. This should fix a crash with MrCrayfish's Gun Mod.

### Mod List Screen
- The right side of the mod information panel is now culled correctly.
- The "Update Available!" button is now only shown if the version checker status allows it.
- The "Done" button is now centered, with the "Open Mods Folder" button being to the right, and "Sort" on the left.

### Options
- All style options are now grouped together under a single "Styles" separator.
- Updated the descriptions of all configs to match.
- Renamed the `mellowUI` category to `mellowUIOptions`.
  - Moved the `styles` and `updates` subcategories to their own category: `styleOptions`.
- Renamed the `mainMenu` config to `titleScreen`.
- Renamed the `mellomedley` category to `mellomedleyOptions`.
- The `mellomedleyVersion` config now defaults to 0.6.

### Miscellaneous
- The sound engine mixins now have translated log messages.

## Technical
### Additions
- Added **flairs** to resource packs.
  > *Documentation: [**Flair**](/Mellow%20UI/Docs/Flair.md)*
- Added **panoramas** to resource packs.
  > *Documentation: [**Panorama**](/Mellow%20UI/Docs/Panorama.md)*

### Changes
- Updated *ForgeGradle* to 5.1.
- Updated the *Mixin* library to 0.8.5.
- Updated the *Gradle* version to 7.6.
- Most of *Mellow UI*'s logs are now named `mellowui/<name>`.
- Changed all config tooltips from `.desc` to `.tooltip`.
- Moved all of *Mellomedley*'s configs to its own class: `MellomedleyConfigEntries`.

### References
[^1]: ["4.4.1: Backports"](https://github.com/isabellawoods/Mellow-UI/commit/9dbdd3d465ed5bdfed945be6ab0590d6930fdf4b) (Commit `9dbdd3d`) – GitHub, Setember 25, 2025.
[^2]: ["4.4.1 (Part II): Flairs & Config Updates"](https://github.com/isabellawoods/Mellow-UI/commit/c9fb70c91f4624c3e7c965d0bbefdaa887581500) (Commit `c9fb70c`) – GitHub, September 26, 2025.
[^3]: ["4.5.0: The Customization Screen & Stats Screen Updates"](https://github.com/isabellawoods/Mellow-UI/commit/eaeca64dbe0ac3de6858157181a99dd4b3a6ab69) (Commit `eaeca64`) – GitHub, September 28, 2025.