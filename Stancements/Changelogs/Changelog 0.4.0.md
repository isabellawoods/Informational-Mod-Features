<h1 style="text-align: center;">- Stancements 0.4.0 -</h1>

> **Written On:** 23-12-25 - **Last Updated:** 23-12-25

**0.4.0** is a major release for *Stancements*, released on December 16, 2025.[^1]

## Additions
### Blocks
- Added gilded rails.
  - Gilded rails are a new type of rail crafted using gold, replacing the existing powered rail.
  - These rails are 1.5x faster than powered rails. However, minecarts may get stuck going up slopes or turning corners.
  - Coming off of a gilded rail maintains the speed slightly for up to 4 seconds.

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

## Changes
### Blocks
- Changed the texture and recipe of powered rails.
  - They're now crafted using copper ingots, instead of gold, and their texture was updated accordingly.
- Milk cauldrons now have fluid container capabilities, like other cauldrons.

### Items
- Vinyl and recorded discs now appear after the music recorder in *Stancements*' creative tab.

## Technical
### Additions
- Added the `minecart_tags` entity attachment type.
  - **Format**: a ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **colors** field containing 1-16 dye color names (with no duplicates), which may not exist.
- Added the `minecart_tag_color` data component.
 - **Format**: a string representing a dye color.
 - Items with this component can be used on minecarts to tag them.
 - Displays a tooltip showing how to use the tag. It can be disabled using *Reutilities*' "hide components" component.

### Changes
- Renamed `STClientEventBus` to `STClientEvents`.

## Tags
### Additions
- Added the `#stancements:minecart_tags` item tag, containing all minecart tags.

### Changes
- Added gilded rails to the `#minecraft:rails` block tag.
- Added all tags to the `#c:dyed/<color>` item tags.

### References
[^1]: ["0.4.0: Minecart Tagging & Gilded Rails"](https://github.com/isabellawoods/Stancements/commit/d3b63ad6ab641ea88dfdd1adbbce308443c6b910) (Commit `d3b63ad`) – GitHub, December 16, 2025.