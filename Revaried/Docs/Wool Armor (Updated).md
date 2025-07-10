# <center>- Wool Armor -</center>
### <center>A Guide & Documentation for Wool Armor</center>

***Last updated**: 8-7-25 (1.8.0.10)*

## NBT Structure
- <img src=Tags/compound_tag.png> Root tag for this item.
  - <img src=Tags/string_tag.png> **color_name**: The translatable "prefix" to use for this wool armor piece.
    - Setting this tag to `color.minecraft.green` would show up as *"Green Wool Sweater"*.
  - <img src=Tags/integer_tag.png> **armor_design**: An integer defining what armor design this armor piece has. **Cannot be 0 or below**.
    - The armor designs are defined the [wool armor color](Wool%20Armor%20Color.md) data-driven registry.
    - Design **1** is called *"glitch"*.
  - <img src=Tags/compound_tag.png> **display**: A vanilla tag that defines various visual properties of this item.
    - <img src=Tags/integer_tag.png> **color**: An integer defining the color of this item. Stored as a decimal value. Defaults to `16777215` when not defined.

## Wool Armor: Making your own
Since [*Revaried* 1.8.0.3](/Revaried/Changelogs/1.16.5%20-%201.8.0.3/Changelog%201.8.0.3.md), wool armor colors and designs have been data-driven. This makes the process of creating new ones *much* easier than before.

### Setting up
First, you'll need to set up a data pack to make this. You can use [this tutorial](https://minecraft.wiki/w/Tutorial:Creating_a_data_pack) to make one, making sure the <img src=Tags/integer_tag.png> **pack_format** is set to **6**.