<div style="text-align: center;"> <img src=ChangelogPhoto.png width="1500"> </div>

# <div style="text-align: center;">- Revaried - 1.8.0.10 -</div>
### <div style="text-align: center;">A Revaried Release Changelog made on *26/07/2025*</div>

**1.8.0.10** is the tenth version for [*Revaried* 1.8.0](/Revaried/Changelogs/1.16.5%20-%201.8.0/Changelog%201.8.0.md), released on July 20, 2024.[^1][^2]

## Fixes
- Fixed a crash with chorus flowers/plants when playing with [Endergetic Expansion](https://modrinth.com/mod/endergetic).

## Additions
### Blocks
- Added loot tables to melting beets and wild melting beets.

### Translations
- Added a translation for the song "Moog City", used by *Mellow UI*.
- **[Bra. Portuguese]** Added translations for the "Dye stains" and "Ink Sac splotches" subtitles.

## Changes
### Blocks
- Removed the **#63 PAINTING** map color. Any blocks that used it now use **#13 WOOD**.

### Items
- Rarities can no longer be changed by using the ![](/Revaried/Docs/Tags/string_tag.png) **rarity** tag.
  - This is to prioritize *Stancements* updating the rarities to match newer versions.

### Screens
- The panorama overlay now renders on *Revaried*'s config screens.
- Notice buttons now only change the color of the text, instead of replacing the button rendering.
- Moved the "Done" buttons 2px down.
- The list background and separators are now set in `init()` instead of `render()`.
- The "saved config" toast now shows up again when changing a config.

### Miscellaneous
- Fixed a multiplayer crash with rendering the weaponry tab.
  - This is due to data-driven registries not being sent to the client, thus crashing the game when rolling for a random color.
  - Returns a glow black wool sweater if that's the case.
- Removed the *"Revaried:"* prefix from all logged messages.

## Technical
### Additions
- Properly registered all argument types (potion, use animation, damage source and consume behavior).
- The description of *Revaried*'s default data pack is now translatable.

### Changes
- Updated the Mixin library to **0.8.4**.
- Updated JEI to **7.8.0.1013**.
- The main *Revaried* logger is now called *"revaried"*.
  - Any classes that used loggers now use the main class' logger.
- Removed the access transformers file.
  - This was because either my IntelliJ or Forge broke the libraries, so it just doesn't download it (and thus breaks the project).
  - Most of the functionality provided by it was replaces with mixins and/or classes.
- Updated the homepage link on the update checker file.
- Renamed the following classes methods:

| Old Name | New name |
|----------|----------|
| *ConsumeBehavior*`.getBehaviorPropertiesStatic` | *ConsumeBehavior*`.getBehaviorProperties` (overwrote other method) |
| *DamageSourceArgument*`.sources` | *DamageSourceArgument*`.source` |
| *UseAnimationArgument*`.animations` | *UseAnimationArgument*`.animation` |
| *VSBlockTags*`.mod` | *VSBlockTags*`.revaried` |
| *VSChorusFlowerMixin* | *RVChorusFlowerMixin* |
| *VSChorusPlantMixin* | *RVChorusPlantMixin* |

## Tags
### Additions
- Added `#variants:chorus_plant_plantable_on` block tag to `#endergetic:chorus_plantable`.
- Added `#variants:has_ender_nylium` block tag, and all *Revaried* end stone blocks to `#endergetic:ender_fire_base_blocks` block tag.
- Added `#endergetic:end_plantables` block tag to `#variants:end_plants_plantable_on`.

### References
[^1]: ["1.8.0.10 (I): Updated Screens & No Acc. Transformer"](https://github.com/isabellawoods/Revaried/commit/e5aeee2ff1acb9ac717638ff2e1d356943585613) (Commit `e5aeee2`) – GitHub, July 10, 2025.
[^2]: ["Endergetic Expansion Crash Fix"](https://github.com/isabellawoods/Revaried/commit/1093e24c9d04e40c40f63571adcb371019a37516) (Commit `1093e24`) – GitHub, July 20, 2025.