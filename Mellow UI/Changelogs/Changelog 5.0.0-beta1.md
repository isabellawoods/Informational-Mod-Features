<h1 style="text-align: center;">- Mellow UI 5.0.0 Beta 1 -</h1>

> **Written On:** 16-12-25 - **Last Updated:** 16-12-25

**5.0.0 Beta 1** is a minor release for *Mellow UI*, released on November 14, 2025 on 1.16[^1], and on December 14, 2025 on 1.18.[^2]

## Changes
### Miscellaneous
- **(1.18)** *Mellow UI* no longer prints a duplicate "OpenAL initialized on \<device>" message, since in 1.18 vanilla shows the device's name on it.

## Technical
### Additions
- Added a vanilla variant of the *Render Components*: `VanillaRenderComponents`.
  - This class has methods copied from vanilla's render method class: `AbstractGui` (1.16) /`GuiComponent` (1.18) / `GuiGraphics` (1.21).
  - The provided `drawString()` methods can be aligned using `Alignment`, and can turn the text shadow off.
    - Some placed in *Mellow UI* that use *Render Components* have switched to these methods.
  - Has a new `setColor(int, float)` method which sets the color using a single integer, and float for alpha.
  - *Mellow UI*'s `RenderComponents` extends this class.
- Backported the GUI atlas.
  - It currently doesn't support texture tiling metadata, and animations aren't yet played.
  - Its main file directory is "gui/" instead of "gui/sprites/".

### Changes
- Moved most rendering elements, like widgets, toast and the *Render Components*, to a single `element` package.
  - It contains the `panel`, `tab`, `text`, `toast`, and `widget` folders.
  - `RenderComponents` and `WidgetTextureSet` were also moved to this package.
- **(1.16)** Added JavaDocs for `RenderComponents.renderCenteredLabelBackground()`.
- `PanelEntry.renderEntry()` no longer provides the matrix stack for rendering. Instead, it's now provided by *Render Components*.
- The logger used by *Mellomedley*'s title screen and *Mellow UI*'s mod list screen now have the name of their classes.

### References
[^1]: **(1.16)** ["5.0.0 (Beta I): GUI Atlas & Render Components"](https://github.com/isabellawoods/Mellow-UI/commit/359c3e46326213cc3b156b063c1e767e91823a75) (Commit `359c3e4`) – GitHub, November 14, 2025.
[^2]: **(1.18)** ["5.0.0 (Beta I): GUI Atlas & Render Components"](https://github.com/isabellawoods/Mellow-UI/commit/b94c50d0fad64df0455a9d6327b1c48495d5bb5a) (Commit `b94c50d`) – GitHub, December 14, 2025.