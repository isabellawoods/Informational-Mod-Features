![[4.7.0.png]]

<h1 style="text-align: center;">- Mellow UI 4.7.0 -</h1>

> **Written On:** 31-10-25 - **Last Updated:** 31-10-25

**4.7.0** is a minor release for *Mellow UI*, released on October 27, 2025.[^1]

## Additions
### Backports
- Added a deprecation warning for 32-bit devices to the vanilla title screen, backported from 1.18.
- Updated the world loading screen to resemble the one from 1.21.9, including the chunk map colors.

### Options
- Added **2** new client configs:
  - `worldLoadingStyle`: Controls the style to use on the world loading screen;
  - `loadingErrorsStyle`: Controls the style to use on *Forge*'s loading warnings/errors screen.
- Added **5** new widget configs:
  - **Toasts** category:
    - `systemToastTitleColor`: Text color for the titles of system toasts (the blue ones);
    - `systemToastDescriptionColor`: Text color for the description of system toasts;
    - `musicToastTextColor`: Color for the text in music toasts.
  - **Backgrounds** category:
    - `warning32BitColor`: Color of the 32-bit deprecation warning background.
  - **Miscellaneous** category:
    - `titleTextColor`: Color of screen titles. Only applies to screens added or modified by *Mellow UI*.
      - This include the headers of pack selection screens.

### Screens
- Updated *Forge*'s loading warnings/errors screen.
  - All buttons are now centered on the middle of the screen, and added "Quit Game" / "Open latest.log" from newer versions.
  - The main title is now bold, and both lines now render properly.
  - Entries no longer span the whole screen, and and now expand in size depending on how many lines are present.

## Changes
### Miscellaneous
- When loading errors are present, *Mellow UI* changes all UI methods to use vanilla textures.
  - This was because, under some circumstances, the mod's mixins would apply but assets would not be loaded, causing the entire screen to use the missing texture.
- The text of system toasts now has shadow.
- The title of system toasts is now centered when the description is empty.
- The text field cursor no longer renders if the widget is not editable.

### Options
- The **Menu Background Blurriness** option now displays "OFF" when it's set to 0.

### Screens
- The generic message and accessibility onboarding screens now use proper text field widgets instead of simulating one.
- The text in the following places now obey the **Description Text** color option:
  - "Drag and drop packs" in the pack selection screen;
  - Descriptions in tooltips from the super secret settings screen, and in the panorama list;
  - "No mod selected" in the mod list screen.

#### Accessibility Onboarding
- The darkened background of this screen is now only used when **Default Background** is on.
- Changed the title to be the same as the text widget so it's narrated properly.

#### Create New World
- Improved tab management for this screen:
  - The selected tab is now saved when switching to/from screens (clicking "Data Packs", for example). This is why tabs now have names.
  - Tab instances are no longer recreated upon switching tabs.
    - Instead, widgets are now saved to an immutable map, that's then copied for use in the screen.
  - Tabs now properly remove widgets from the screen, and no longer add repeat listeners to the UI state manager.
    - Because of this change, the widgets no longer visually update, but tooltips still do.
- Widgets from tabs now use *Mellow UI*'s tooltip providers for tooltips.
- Changed the size of text field widgets to line up with other widgets.
- The hardcore widget tooltip title is now brighter tint of red (**#FF0000**).

#### Customization
- The customization screen now has a search box. Currently, it only applies to the panorama list.
  - Searching filters by names (regular) and namespaces (prefixing `@`). Any trailing whitespace is trimmed.
  - Depending on what you search, different error messages show up on the screen.
- Auto-generated panorama names are now handled properly.

#### Edit Value
- Boolean configs now have a button.
- Integer and long configs no have their initial values displayed as hexadecimal if the `displayColor` is `false`.
- The "accepts decimal and hexadecimal" text now only shows up if the config is an integer or long.
- The revert edit consumer now works when using Ctrl + Z to revert your edit.

#### Select World
- The "Hardcore Mode!" text in world summaries is now brighter tint of red (**#FF0000**).
- The entry text is no cut when it extends beyond the entry itself.
  - I did forget to add the tooltips from the newer versions, though.
- World titles now obey the widget text color options.
- The locked world tooltip now has a maximum width of `170`, from `175`.

#### Title
- The panorama and post effects are now applied when the onboarding is opened from *Mellomedley*'s title screen for the first time.
- The copyright text is now a proper widget -- it can now be selected using Tab navigation.

## Technical
### Additions
- All tab buttons now have a name. This is used on the create world screen to locate tabs.

### Changes
- The **Logo Style** option now uses the `LogoStyle` enum instead of `FourStyles`:
  - `OPTION_1` is now `PRE_ONE_SIXTEEN`;
  - `OPTION_2` is now `ONE_SIXTEEN`;
  - `OPTION_3` is now `ONE_TWENTY`;
  - `OPTION_4` is now `MELLOMEDLEY`.
  - With it, the render methods are now within the style fields themselves.
- `MUIOptionsScreenMixin` now cancels the rest of the `init()` method.
- `TooltipProvider.render()` now sets the display data to `null` after rendering, instead of relying on the screen to do it.
- `Panoramas` and `ShaderManager` no longer save a value if it's the same as before.
- Renamed the accessibility onboarding background to `overspin_protection.png`.
- Renamed the class `AttributionsScreen` to `CreditsAndAttributionsScreen`.
- Moved and renamed most text-related methods from `MellowUtils` to `TextComponents`:
  - Added `selectableStyle()`, combining both `withColor()` and `selectableColor()`.

| Old Name                       | New Name                |
| ------------------------------ | ----------------------- |
| `getSplashTextColor`           | `splashColor`           |
| `getSelectableTextColor`       | `selectableColor`       |
| `getSelectableTextShadowColor` | `selectableShadowColor` |
| `getShadowColor`               | `darkenColor`           |
#### Inter-Mod Comms
- Moved related methods from the mod's main class to the comms processor.
- When adding an integer config using `mellowui:add_to_color_list`, the tooltip now uses `.tooltip` instead of `.desc`.

### Removals
- Merged `GameTab`, `WorldTab` and `MoreTab` with the create world screen class.
- Removed `TabContents`.
- Temporarily removed the update checker URL due to GitHub giving `429: Too many requests`.

### References
[^1]: ["4.7.0: Vanilla Backports & Customization Screen Search"](https://github.com/isabellawoods/Mellow-UI/commit/d5c3b5462ae04f002eb891054a2a3d4158d2bd3e) (Commit `d5c3b54`)  – GitHub, October 27, 2025.