<div style="text-align: center;"> <img src=ChangelogPhoto.png width="1500"> </div>

# <div style="text-align: center;">- Revaried - 1.8.0.9 -</div>
### <div style="text-align: center;">A Revaried Release Changelog made on *23/04/2025*</div>

**1.8.0.9** is the ninth version for [*Revaried* 1.8.0](/Revaried/Changelogs/1.16.5%20-%201.8.0/Changelog%201.8.0.md), released on April 12, 2024.[^1]

## Additions
### Entities
- Shulkers can now be dyed by right-clicking.
  - Clicking with any dye will apply that color to the shulker, consuming the item and playing a "Dye stains" sound.
  - Clicking with an ink sac will clear the color and set the shulker back to its regular color, consuming the item and playing an "Ink Sac splotches" sound.
  - Killing a dyed shulker now pulls from a different loot table, like with sheep.
    - This means dyed shulker shells can now be obtained in regular gameplay.
- Shulkers now drop 1 shell by default, and a maximum of 2 with looting.

## Screens
- All of *Revaried*'s config menus now render using vanilla methods when *Mellow UI* is loaded (for compatibility).
- Updated the config "home" screen to use a regular list (copied over from *Mellow UI*).
- All config subscreens are now consistent with both the accessibility screen and *Mellow UI*'s screens.
- Readded the "subtitute 'The End' biome with" text box, now located besides the "Done" button.
  - Currently, the footer bar in *Mellow UI* collides the text. This will be fixed eventually.
- Entries that require restarting the game will now be colored **#FFC55F** and will show a custom tooltip: "<h style="color: #FFC55F">[Requires a restart to take effect!]</h>".
- The panorama now spins consistently between screens.

## Miscellaneous
- Added **2** new sound events: `variants:item.dye.stain` and `variants:item.ink_sac.splotch`.
- Updated both of *Revaried*'s logos.
  - The square logo used on the data packs screen is now 16x16.

## Changes
### Items
- Attribute tooltips on food items are now grouped with the effects, have the checkmark boxes, and are colored with a faded green (**#4F7A4F**) or red (**#7F4B4B**).
  - This was copied from *Back Math*'s *"Apply Mob Effects"* item behavior effect type.
- Magma swords are now repaired using crystallized magma cream instead of magma blocks.
- Fireworks rockets no longer have duplicated "Hold \<Alt>" tooltips.
- (Hopefully) fixed swapping armor items with a broken armor piece retaining the durability, causing negative durability.
- Picking up a spawner with a minecart now carries over the minecart's NBT data to the spawner minecart item.
- Tipped arrow effect tooltips now shot "When shot:" instead of "When drank:".

#### Wool Armor
- Wool armor color and designs can now be cleared using cauldrons.
  - Clearing colors was already possible, but it now also clears the color name tag.
  - Clearing designs also clears the color name tag.
- The "#" in the infinity wool sweaters tab is now translatable: *"item.variants.\<item>.infinity"*.

#### Buckets
- Buckets can now collect water from cauldrons – the water bucket is dispensed.
- Water buckets can now put water inside cauldrons – the bucket is dispensed.
  - These behaviors *might* work with *The Mato*'s cauldrons.

## Blocks
- Crimson wheat now has its seeds set to crimson wheat seeds instead of air.
- Dyeing text in signs now plays the dye stains sound.

## Entities
- Dyeing sheep now plays the dye stains sound.
- Minecarts with spawner now carry their name onto the item they drop.

## Miscellaneous
- Updated most external (and some internal) references of *"Variants"* to *"Revaried"*.
  - This includes the README file, mixin configs and reference maps, mod name and description, config files, data generators, etc.
- Changed the color of the consume behaviors in commands to **#FFC55F**.
- The bookshelf recipe advancements now check for the correct books item tag.
  - Plain birch bookshelves now properly require the `fabricio2010pack_loaded` condition.

## Technical
### Additions
- The config saving and loading error messages are now translatable.
- The ellipsis in JSON error messages is now translatable.
- Added comments/javadocs to some classes, like *ConsumableTeleportEvent* and *DyeableArmorItem*.

### Changes
- Updated the JSON config version to `1809`.
- Updated the item stack loading and savings methods within *Revaried*.
  - The `count` field is no longer saved if it's set to `0`.
  - The `components` field has been renamed to `tags`, and now can be specified both as a compound or string.
- Damage source parsing from JSON has been improved.
  - Parsing is now done inside *JSONDeserializer* and *DamageSourceUtils*, with most fields being checked for the correct tag type.
- The config files are now located inside `melonystudios`, from `jtw-mods`.
- Renamed the fixing command `old_stew_behavior_names` to `old_consume_behavior_names`.
- `/consumebehavior set` now fails if the player isn't holding something.
- Moved the *Revaried* advancement background to `/gui/advancement_backgrounds/`, to be consistent with *Back Math*.
- Moved the "Entities", "Enchantments" and "Consume Behaviors" sections of the TOML config file to the JSON config file.
  - All three of these now have respective categories in the config screen.
  - The *"Quick Charge Max Level"* config is now an integer ranging from 1 to 25 instead of a boolean.
- Moved most methods related to wool armor to the *DyeableArmorItem* interface.
- *DamageManagerSource.EntityDMSource* is now its own separate class: *EntityDamageManagerSource*.

## Removals
- Removed `fromTypesMap()`, `hasType()` and `hasTypeFromLocation()` methods from *BowlType*.

## Tags
### Additions
- Added `#variants:hide_effect_tooltips` item tag.
  - Contains poison cookies from *Mob Taker*.
  - Items in this tag, if a food item with effects, will not show those effects in their tooltip.

### References
[^1]: ["1.8.0.9: Migrated Configs & Dyeable Shulkers"](https://github.com/isabellawoods/Revaried/commit/57b082f3feb865973fae3b80f01fbbd83cdf70f4) (Commit `57b082f`) – GitHub, April 12, 2024.