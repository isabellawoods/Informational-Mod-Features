<h1 style="text-align: center;">- Stancements 0.4.0 -</h1>

> **Written On:** 23-12-25 - **Last Updated:** 09-01-26

**0.4.0** is an upcoming major release for *Stancements*.[^1][^2][^3] It adds a faster variant of powered rails, and the ability to tag minecarts with different color that tagging rails can detect.

## Additions
### Blocks
- Added gilded rails.
  - Gilded rails are a new type of rail crafted using gold, replacing the existing powered rail.
  - These rails are 1.5x faster than powered rails. However, minecarts may get stuck going up slopes or turning corners.
  - Coming off of a gilded rail maintains the speed slightly for up to 4 seconds.
  - When *Railcraft Reborn* is loaded, the recipe uses advanced rails instead of gold ingots.

### Items
- Added minecart tags.
  - Tags come in all 16 colors, and can be used on minecarts to tag them.
  - Can only stack to 16.
  - Tags are crafted using one paper, one string and one of the respective dye.
  - Tags can be removed from minecarts using shears.
  - The color of the tag is controlled by the `minecart_tag_color` component.

### Miscellaneous
- Added **2** new sound events:
  - `item.tag.latch` ("Tag latches onto minecart");
  - `entity.minecart.shear` ("Shears click").
- A copy of "Alpha", by C418, is now given to the player when viewing the credits for the first time.
  - The disc has an "epic" rarity, and is marked as a copy, so only one can be obtained per player.
  - Required for the "Miner's Music Group" advancement.
  - Always has the same color and label.
- Added a background for *Catalogue*, using the same location as the new banner.

## Changes
### Blocks
- Changed the texture and recipe of powered rails.
  - They're now crafted using copper ingots, instead of gold, and their texture was updated accordingly.
  - When *Railcraft Reborn* is loaded, the recipe uses electric rails instead of copper ingots.
- Milk cauldrons now have fluid container capabilities, like other cauldrons.

### Items
- Vinyl and recorded discs now appear after the music recorder in *Stancements*' creative tab.
- Using a vinyl disc on a recorder when no music is playing now increases the "item used" statistic.

### Miscellaneous
- Changed the options screen translations from "Settings" to "Options", to match *Reutilities*.
- Added a translation for the "Common Options" button.
  - It's never used since there's only one config file, but now it doesn't complain about it not existing.
- The square logo is now used by *Catalogue* (fixed a typo in the file location).

## Technical
### Additions
- Added the `minecart_tags` entity attachment type.
  - **Format**: a ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **colors** field containing 1-16 dye color names (with no duplicates), which may not exist.
- Added the `minecart_tag_color` data component.
  - **Format**: a string representing a dye color.
 - Items with this component can be used on minecarts to tag them.
 - Displays a tooltip showing how to use the tag. It can be disabled using *Reutilities*' "hide components" component.
 - *Stancements* now has an update checker at [this location](https://raw.githubusercontent.com/isabellawoods/Informational-Mod-Features/refs/heads/main/.versioncheck/stancements.json). It's disabled by default in the development environment.
 - Updated the README to include the a banner.

### Changes
- Renamed the `/melonystudios stancements update_recorded_disc` command to `/melonystudios stancements:update_recorded_disc`, to match *Reutilities*.
- *Reutilities* `1.4.0` is now properly required to run the mod.
- Renamed `STClientEventBus` to `STClientEvents`.

## Tags
### Additions
- Added the `#stancements:minecart_tags` item tag, containing all minecart tags.

### Changes
- Added gilded rails to the `#minecraft:rails` block tag.
- Added all tags to the `#c:dyed/<color>` item tags.

### References
[^1]: ["0.4.0: Minecart Tagging & Gilded Rails"](https://github.com/isabellawoods/Stancements/commit/d3b63ad6ab641ea88dfdd1adbbce308443c6b910) (Commit `d3b63ad`) – GitHub, December 16, 2025.
[^2]: ["0.4.0 (Part II): "Alpha" Music Disc from Credits"](https://github.com/isabellawoods/Stancements/commit/e2fff98eb0d8201bdd69bfbcabb1f1d20922fdce) (Commit `e2fff98`) – GitHub, December 24, 2025.
[^3]: ["0.4.0 (Part III): Railcraft Gilded Rails & Updated Logo"](https://github.com/isabellawoods/Stancements/commit/254c6e2c2ae0fed5533aa432b5b28bb38bbc51f6) (Commit `254c6e2`) – GitHub, January 9, 2026.