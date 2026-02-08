![Reutilities 1.0.0 changelog photo](Assets/1.0.0.png)

<h1 style="text-align: center;">- Reutilities 1.0.0 -</h1>

> **Written On:** 31-01-26 - **Last Updated:** 01-02-26

**1.0.0** is a first release of *Reutilities*, released on August 16, 2025.[^1] It adds the main API class, various data generator utilities, and a boat variant system.

## Additions
### API
- Added **ReAPI**. It only includes methods for adding boats and signs.

### Blocks
- Added classes for making signs, wall signs, hanging signs and wall hanging signs.
- Added a class for making crafting tables.
- Added the `reutilities:sign` and `reutilities:hanging_sign` block entities.
- Added the following template block models:
  - Cakes;
  - Chains;
  - Grass blocks;
  - Lanterns with different top/bottom textures (the *Back Math* model);
  - Ladders;
  - Pixel-short blocks (dirt paths and farmland);
  - Wild crops.

### Items
- Added boat types.
  - Boat types are the way my mods add new boats, using the main *ReAPI* to add them.
  - By default, only the `minecraft:oak` boat type is registered, and is used as a fallback for the boat entities.
  - Rafts cannot be made using this.
  - The main class for it includes a codec:
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **boat**: A resource location of the boat item's id. Defaults to an oak boat.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **chest_boat**: A resource location of the chest boat item's id. Defaults to an oak chest boat.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **wood_type**: A resource location of this boat type's name. Defaults to `oak`.
  - Added the `wood_type` data component, a resource location of a registered boat type.
- Added the `bar_color` data component, an integer (`0` to `16777215`) that defines an item's bar color (for durability or otherwise).
- Added the `stored_experience` data component, a non-negative integer for storing experience points in an item.
- Added the following template item models:
  - 32x handheld model;
  - Bows;
  - Crossbows;
  - Shields (slightly different from vanilla);
  - Spyglasses.

### Entities
- Added boat and chest boats.
  - These have their ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **Type** tag set to a registered *Reutilities* boat type.
  - Default to `minecraft:oak` when **Type** isn't set.

## Technical
### Data Generators
- Added methods in `Reconstants` for common item model override names.
- Added the block family provider.
  - This is used for easily making models for whole block sets, like wood or stone, by simply proving a texture and the block itself.
  - This was ported from *Back Math*, and ends up being an alternate version of the vanilla block family provider (which I didn't know existed).
- Added the block states and models provider. It includes methods for generating the following blocks:
  - Fluids;
  - Cross model plants + flower pots;
  - Leaves (with the `minecraft:block/leaves` parent);
  - Slabs with a specific side texture (double slabs);
  - Fences, walls and buttons with inventory models;
  - Weighted pressure plates;
  - Ladders;
  - Crafting tables;
  - Chains;
  - Lanterns (using the vanilla or custom top/bottom model);
  - Grass blocks (broken in this version);
  - Pixel-short blocks (dirt paths);
  - Cakes;
  - Crops with 7 age textures (like wheat);
  - Crops with 4 age textures (like potatoes and carrots);
  - Wild crops;
- Added the item models provider. It includes methods for generating the following items:
  - Flat items (using `generated` or `handheld` parents by default);
  - Flat items using block textures (like saplings);
  - Items using block models;
  - Glass panes;
  - Whole armor sets with trims;
  - Single armor pieces with trims;
  - Whole tool sets
  - Dual-wielded swords with an inventory texture (using `reutilities:item/handheld_32x` model);
  - Bows;
  - Crossbows;
  - Shields (using item models instead of entity models);
  - Spyglasses (using *NeoForge*'s "separate transforms" loader).

### References
[^1]: ["Initial Commit for Reutilities (1.0.0)"](https://github.com/isabellawoods/Reutilities/commit/ed774daef7716661612ef55f4b112b0b93604413) (Commit `ed774da`) – GitHub, August 16, 2025.