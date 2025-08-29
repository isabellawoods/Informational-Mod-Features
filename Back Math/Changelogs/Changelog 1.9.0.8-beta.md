<div style="text-align: center;"> <img src=Assets/1.9.0.8-beta.png width="1500"> </div>

# <div style="text-align: center;">- Back Math - 1.9.0.8 -</div>
### <div style="text-align: center;">A Back Math Update Changelog made on *26/07/2025*</div>

**1.9.0.8** is the eighth version for *Back Math* 1.9.0, released on June 20, 2025.[^1][^2]

## Additions
### Blocks
- Added signs for all of *Back Math*'s wood types.
- Crystallizer recipes are now data-driven.
  > *Documentation: **[Crystallizer Recipes](/Back%20Math/Docs/Crystallizer%20Recipes.md)***.
  - Currently, data-driven recipes aren't craftable yet, and item counts also aren't available.
  - JEI support is still ***very work in progress***.
  - Some JSON-related code was copied from *Revaried*, without the related translations.
  - In the future, meal cooker recipes will also be data-driven.

### Items
- Added crystalline birch, goldenwood, guava, jabuticaba, cork oak and avondalic willow boats.

## Changes
### Blocks
- The inside of crates is now hollow. This means entities can stand inside it like cauldrons.
- Crates no longer go into the entity's back.
- Updated the textures of all jabuticaba wood blocks.

### Items
- Carewni swords now actually have a trans flag texture on June.
- Updated the textures of the following items:
  - Trans flag carewnis;
  - All dye items;
  - All music discs;
  - Guava and jabuticaba tools, knife, mortar and pestle and stick;
  - Jabuticaba doors, juice, popsicle, jam, bread with jam and wine;

#### Outfits
- Outfit definitions can now be applied to or changed on any item.
  - This uses the same format as the ![](/Revaried/Docs/Tags/string_tag.png) **outfit** tag on entities.
  - This uses an *OutfitProvider* interface to get the definition and slots.
  - However, items still need to be added to the `#backmath:outfits` item tag in order to render.
- Outfit textures are no longer cached. This fixes issues with classic/slim textures rendering on the wrong entities.
- Outfits now render the proper texture on entities.
  - Previously, it would try caching the textures, so chest textures would only render slim/wide depending on which was cached first.
- Updated the crate outfit textures.
- Plateforced mid-term helmets no longer render the emissive chest texture.

### Entities
- Archer lucias are now classified as monsters.
- Queen Lucy can now drop shirts once again.
- Tamed queen lucy pets now have a poncho.
  - It can be dyed using any vanilla dyes, but the ![](/Revaried/Docs/Tags/integer_tag.png) **poncho_color** tag supports any RGB color.
  - Set to light blue by default, or pure black (0) when loading from an old world.

#### Breasts
- Physics now work properly on mobs that have breasts.
- The breathing animation is now faster when below 4 health.
- Fixes various bugs related to breast rendering:
  - Changed breast outfit rendering (full-body outfits now render).
  - Breathing animation now plays properly (broken due to wrong chest item check).
  - Breast armor is no longer tinted when taking damage.
- Bounce intensity is now scaled based on the bust size.

#### Termians
- Can no longer go into swimming, crawling or sleeping poses.
  - This was way too buggy, so I decided to remove it.
- Crates now turn when sneaking.
- Added the *"Common"*, *"Founder's"* and *"Progress Pride"* capes to the cape pool.

#### Collector Alcalytes
- Now spawn in the Aljan. This is controlled by a new config called `collectorAlcalyteSpawning`.
- Now have a 30% chance of spawning wearing a crate.
  - When picking up items, it prioritizes going to the crate instead of their inventory.
  - Like wanderer termians, they have a 50% chance of dropping it.
- Now only have 50% chance of having their bust size set.

#### Shy Alcalytes
- No longer pick up items by default.
- Can now have breasts, but don't by default.

### Miscellaneous
- Changed the order of wood items in the creative tabs.
  - Barrels now come after planks; trapdoors, doors and signs (in order) now come after buttons.
- "Broken Clocks" by Amos Roddy can once again play in all back fields and in angelic woods (updated the id).
- Changed the descriptions of some music discs (both languages):
  - *"Nathan Evans - Wellerman"* to *"Nathan Evans - Wellerman (Sea Shanty)"*;
  - *"ElyOtto - Sugar Crash!"* to *"ElyOtto - SugarCrash!"*;
  - *"The Kid LAROI, Justin Bieber - Stay"* to *"The Kid LAROI, Justin Bieber - STAY"*.
- **[Bra. Portuguese]** Changed the word "Aljân" to "Aljan" in the *Traveler's Titles* dimension translation.

## Technical
### Additions
- Added a ![](/Revaried/Docs/Tags/boolean_tag.png) **hides_skin_layers** tag to outfit slot definitions.
  - This tag defines whether this outfit slot hides the entity's skin layers depending on the slot.
  - Defaults to `true` when not defined.
- Added recipe advancements for aljanwood, aljancap and insomnian boats.
- Added an update checker to *Back Math*.
  - Currently, it only goes back to [1.9.0.1](Changelog%201.9.0.1-beta.md), and descriptions were not yet added.
- The name and description of the Aljan Texture Update pack are now translatable.
- The description of *Back Math*'s default data pack is now translatable.

### Changes
- Updated the Mixin library to **0.8.4**.
- Updated JEI to **7.8.0.1013**.
- Added names to various loggers in *Back Math*.
- Added JavaDocs to various classes and methods in *Back Math*.
- *OutfitDefinition*`.byEquipmentSlot()` now throws an exception if the slot isn't an armor slot.
- Changed the mod's description from:
  > <d style="color: #A0A0A0">Back Math just received a new update called \"Bountifully Expansive\", this update includes a bunch of new items, blocks and a few mobs.</d>
  - to
  > <d style="color: #A0A0A0">Back Math is a content mod made by me and my sister. While most of the content in it is fluff, recently I've been adding more fleshed out features (kind of).</d>
- Renamed the following classes:

| Old Name | New Name |
|----------|----------|
| *BMColorManager* | **Removed**, merged with *BMEventBusEvents* |
| *BMCrossbowUser* | *ChargeableWeaponUser* |
| *BMFoodStats* | *AlcalyteFoodData* |
| *BMKeys* | *BMKeyBindings* |
| *BMLootTableUtils* | *LootTableUtils* |
| *BMStats* | *BMStatistics* |
| *BMTagFixes* | *TagFixes* |
| *HasBust* | *HasBreasts* |
| *SophieFriendlies* | *TermianFriendlies* |
| *WornOutfit* | *OutfitWearer* |

- Renamed the following methods:

| Old Name | New Name |
|----------|----------|
| *BMItemMixin*`.addItemTagsTooltip` | *RVUtils*`.addItemTagsTooltip` |
| *BMPlayerRendererMixin*`.setModelProperties` | *BMPlayerRendererMixin*`.hideLayersForOutfit` |
| *BreastLayer*`.pushMatrix` | *BreastLayer*`.pushStack` |
| *SophieFriendlies*`.updateHelmetEffect` | *TermianFriendlies*`.applyArmorEffect` |
| *WornOutfit*`.getOutfitTexture` | *OutfitWearer*`.getOutfitDefinition` |
| *WornOutfit*`.setOutfitTexture` | *OutfitWearer*`.setOutfitDefinition` |

## Tags
### Additions
- Added all new standing signs to `#minecraft:standing_signs` block tag.
- Added all new wall signs to `#minecraft:wall_signs` block tag.
- Added all new signs to `#minecraft:signs` item tag.
- Added all new boats to `#minecraft:boats` item tag.

### References
[^1]: ["1.9.0.8 (I): Signs, Boats & A Lot of Bug Fixes"](https://github.com/isabellawoods/Back-Math/commit/a3d4eda253057a4c2e2dc88b24715975f14ae5d0) (Commit `a3d4eda`) – GitHub, June 20, 2025.
[^2]: ["1.9.0.8 (II): Crystallizer Recipes - Part I"](https://github.com/isabellawoods/Back-Math/commit/6783f6f6aac0b84cfe6d9e0aac29e1b204db8a1b) (Commit `6783f6f`) – GitHub, June 20, 2025.