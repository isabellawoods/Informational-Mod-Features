# Item Tags
This file lists all item tags under the `melony` namespace, used across my mods in 1.16.

In 1.21.1, my mods instead use the `c` (common) namespace.

## List of Tags

### allowed_in_mainhand
Used to determine which items go into the mainhand when equipping an entity from an `equipment` loot table.

**Added in**: [*June 12th, 2024* (*Back Math* 8.0)](Changelog%2012-06-24.md)

![list_tag](list_tag.png) **#melony:allowed_in_mainhand** *(4 values)*
- [`#melony:bows`](#bows)
- [`#melony:crossbows`](#crossbows)
- `backmath:aljameed_shovel`
- `backmath:queen_sophie_summoner_staff`

### allowed_in_offhand
Used to determine which items go into the offhand when equipping an entity from an `equipment` loot table.

**Added in**: [*June 12th, 2024* (*Back Math* 8.0)](Changelog%2012-06-24.md)

![list_tag](list_tag.png) **#melony:allowed_in_offhand** *(1 value)*
- `#backmath:squids`

### books
Used to craft enderwood, plain birch and styled bookshelves.

Replaced with `#minecraft:bookshelf_books` in 1.21.

**Added in**: *Revaried* 1.6.1, *Edits* 1.4.3.7

![list_tag](list_tag.png) **#melony:books** *(8 values)*
- `#minecraft:lectern_books`
- `minecraft:book`
- `minecraft:enchanted_book`
- `minecraft:knowledge_book`
- `backmath:regular_molds_book`
- `backmath:advanced_molds_book`
- `ftbquests:book`
- `variants:enchanted_knowledge_book`

### bookshelves
Replaced with `#c:bookshelves` in 1.21.

**Added in**: *Revaried* 1.6.1

![list_tag](list_tag.png) **#melony:bookshelves** *(4 values)*
- `minecraft:bookshelf`
- `edits:styled_bookshelf`
- `variants:enderwood_bookshelf`
- `variants:plain_birch_bookshelf`

### bowls
Grouping tag.

**Added in**: [*Revaried* 1.6.14](Changelog%201.6.14.md)

![list_tag](list_tag.png) **#melony:bowls** *(2 values)*
- [`#melony:bowls/wooden`](#bowls/wooden)
- [`#melony:bowls/obtainable_through_fishing`](#bowls/obtainable_through_fishing)

### bowls/obtainable_through_fishing
Can be obtained from the junk fishing loot table.

**Added in**: [*Revaried* 1.6.14](Changelog%201.6.14.md)

![list_tag](list_tag.png) **#melony:bowls/obtainable_through_finishing** *(8 values)*
- `minecraft:bowl`
- `variants:oak_bowl`
- `variants:spruce_bowl`
- `variants:birch_bowl`
- `variants:jungle_bowl`
- `variants:acacia_bowl`
- `variants:dark_oak_bowl`
- `variants:painting_bowl`

### bowls/wooden
Can be used to craft (end) fungi and exponential suspicious stew and melting beet soups.

**Added in**: [*Revaried* 1.6.14](Changelog%201.6.14.md)

![list_tag](list_tag.png) **#melony:bowls/wooden** *(11 values)*
- `minecraft:bowl`
- `variants:oak_bowl`
- `variants:spruce_bowl`
- `variants:birch_bowl`
- `variants:jungle_bowl`
- `variants:acacia_bowl`
- `variants:dark_oak_bowl`
- `variants:painting_bowl`
- `variants:crimson_bowl`
- `variants:warped_bowl`
- `variants:enderwood_bowl`

### bows
Used by archer insomniac termians for what bow they can use.
Used in the `#project_alcook:tnt_holder_skeleton_weapons` item tag.

Replaced with `#c:tools/bow` in 1.21.

**Added in**:
- *February 12th, 2024* (*Back Math* 8.0)
- [*Revaried* 7.0 Release Candidate 3](Changelog%201.7.0%20Release%20Candidate%203.md)
- *Project Alcook* 1.3
- *Mob Taker* 1.3

![list_tag](list_tag.png) **#melony:bows** *(9 values)*
- `minecraft:bow`
- `backmath:devil_bow`
- `backmath:angelic_bow`
- `backmath:mid_term_bow`
- `mobarmor:charred_bow`
- `mobarmor:stray_bow`
- `mobarmor:mason_iron_bow`
- `mobarmor:no_releasing_bow`
- `variants:debug_bow`

### cakes
Used in the `#create:upright_on_belt` item tag.

**Added in**: *Edits* 1.4.3.7

![list_tag](list_tag.png) **#melony:cakes** *(5 values)*
- `minecraft:cake`
- `backmath:hillary_cake`
- `backmath:milkllary_cake`
- `backmath:chocolate_naked_cake`
- `edits:sweet_berry_cake`

### catlike_tame_items
Can be used to tame cats and ocelots. Does not include tempting.

Replaced with `#minecraft:cat_food` in 1.21.

**Added in**: [*Revaried* 1.6.14](Changelog%201.6.14.md)

![list_tag](list_tag.png) **#melony:catlike_tame_items** *(4 values)*
- `minecraft:cod`
- `minecraft:salmon`
- `minecraft:tropical_fish`
- `variants:fish`

### chicken_jockey_cannot_pickup
Items which cannot be picked up by *Back Math* chicken jockeys.

**Added in**: [*May 25th, 2024* (*Back Math* 8.0)](Changelog%2025-05-24.md)

![list_tag](list_tag.png) **#melony:chicken_jockey_cannot_pickup** *(1 value)*
- `minecraft:egg`

### clears_mob_effects
Items that can be used to clear the effects of a queen lucy pet.

**Added in**: [*Back Math* 1.9.0.4](Changelog%201.9.0.4-beta.md)

![list_tag](list_tag.png) **#melony:clears_mob_effects** *(1 value)*
- `#forge:milk`

### completes_find_tree_tutorial
Items which can complete the "Find a Tree" tutorial step.

Replaced with `#minecraft:completes_find_tree_tutorial` in 1.21.

**Added in**: [*Revaried* 1.7.0 Pre-Release 2](Changelog%201.7.0%20Pre-Release%202.md), [Snapshot 22w15a](https://minecraft.wiki/w/Java_Edition_22w15a)

![list_tag](list_tag.png) **#melony:completes_find_tree_tutorial** *(3 values)*
- `#minecraft:logs`,
- `#minecraft:leaves`,
- `#minecraft:wart_blocks`

### crossbows
Used by archer lucias for what crossbow they can pick up and use.
*Back Math* entities use the "crossbow hold" animation when holding this.
Used in the `#project_alcook:tnt_holder_skeleton_weapons` item tag.

Replaced with `#c:tools/crossbow` in 1.21.

**Added in**: *January 2nd, 2024* (*Back Math* 8.0), *Mob Taker* 1.3, *Project Alcook* 1.3

![list_tag](list_tag.png) **#melony:crossbows** *(5 values)*
- `minecraft:crossbow`
- `#backmath:railguns`
- `backmath:devil_crossbow`
- `backmath:angelic_crossbow`
- `mobarmor:no_releasing_crossbow`

### deepslate_smeltables
Can be smelted into *Rimcraft* slate bricks.

**Added in**: *Rimcraft* 1.1.2

![list_tag](list_tag.png) **#melony:deepslate_smeltables** *(4 values)*
- `minecraft:cobbled_deepslate`
- `cavesandcliffs:cobbled_deepslate`
- `quark:cobbled_deepslate`
- `stackports:cobbled_deepslate`

### icon_items
Replaced with `#c:logos` in 1.21, added by *Reutilities*.

**Added in**: [*Revaried* 1.6.19.1](Changelog%201.6.19.1.md)

![list_tag](list_tag.png) **#melony:icon_items** *(2 values)*
- `variants:infinity_sweaters_tab_icon`
- `variants:shulker_spectrum_icon`

### nether_stars
Can be used to craft beacons.

**Added in**: [*Revaried* 1.6.19.1](Changelog%201.6.19.1.md), *Edits* 1.4.3.7, *F10 Elements* 1.4.3

![list_tag](list_tag.png) **#melony:nether_stars** *(2 values)*
- `minecraft:nether_star`
- `edits:lucium_star`

### piglin_currency
Piglins can use these items to barter.

**Added in**: *Edits* 1.4.3.8

![list_tag](list_tag.png) **#melony:piglin_currency** *(2 values)*
- `#forge:ingots/gold`
- `#forge:ingots/shadegold`

### provides_effect
Grouping tag.

**Added in**: *February 12th, 2024* (*Back Math* 8.0)

![list_tag](list_tag.png) **#melony:provides_effect** *(2 values)*
- [`#melony:provides_effect/resistance`](#provides_effect/resistance)
- [`#melony:provides_effect/water_breathing`](#provides_effect/water_breathing)

### provides_effect/resistance
When worn by *Back Math* mobs, they get Resistance for 10 seconds when not underwater.

**Added in**: *February 12th, 2024* (*Back Math* 8.0), *Creeper Edits* 1.3

![list_tag](list_tag.png) **#melony:provides_effect/resistance** *(1 value)*
- `#creeperedits:creeper_lord_helmet`

### provides_effect/water_breathing
When worn by *Back Math* mobs or players, they get Water Breathing for 10 seconds when not underwater.

**Added in**: *February 12th, 2024* (*Back Math* 8.0)

![list_tag](list_tag.png) **#melony:provides_effect/water_breathing** *(3 values)*
- `minecraft:turtle_helmet`
- `backmath:candy_pink_turtle_helmet`
- `backmath:candy_yellow_turtle_helmet`

### shields
When *Revaried* is loaded, items go automatically to the offhand.
Used to determine whether a *Back Math* or *Revaried* shield is actually a shield.

Replaced with `#c:tools/shield` in 1.21.

**Added in**: *February 12th, 2024* (*Back Math* 8.0), [*Revaried* 1.6.8](Changelog%201.6.8.md)

![list_tag](list_tag.png) **#melony:shields** *(7 values)*
- `minecraft:shield`
- `backmath:devil_shield`
- `backmath:angelic_shield`
- `backmath:mid_term_shield`
- `backmath:aljameed_shield`
- `backmath:moonering_shield`
- `variants:empty_armor_slot_shield`

### villager_plantable_seeds
Items in this tag can (maybe) be planted by villagers.

Replaced with `#minecraft:villager_plantable_seeds` in 1.21.

**Added in**: *May 18th, 2024* (*Back Math* 8.0), [Snapshot 23w16a](https://minecraft.wiki/w/Java_Edition_23w16a)

![list_tag](list_tag.png) **#melony:villager_plantable_seeds** *(7 values)*
- `minecraft:wheat_seeds`
- `minecraft:carrot`
- `minecraft:potato`
- `minecraft:beetroot_seeds`
- `backmath:carameled_wheat_seeds`
- `backmath:aljamic_onion`
- `variants:golden_carrots`

### villager_wanted_items
Items in this tag can be picked up by villagers.

**Added in**: [*Revaried* 1.7.0 Pre-Release 2](Changelog%201.7.0%20Pre-Release%202.md)

![list_tag](list_tag.png) **#melony:villager_wanted_items** *(5 values)*
- [`#melony:villager_plantable_seeds`](#villager_plantable_seeds)
- `minecraft:wheat`
- `minecraft:bread`
- `minecraft:golden_carrot`
- `minecraft:beetroot`

### with_rarity/common
Items in this tag have their rarity switched to "common".

**Added in**: *Stancements* 0.1

![list_tag](list_tag.png) **#melony:with_rarity/common** *(2 values)*
- `minecraft:end_crystal`
- `minecraft:golden_apple`

### with_rarity/uncommon
Items in this tag have their rarity switched to "uncommon".

**Added in**: *Stancements* 0.1

![list_tag](list_tag.png) **#melony:with_rarity/uncommon** *(19 values)*
- `minecraft:piglin_banner_pattern`
- `minecraft:chainmail_helmet`
- `minecraft:chainmail_chestplate`
- `minecraft:chainmail_leggings`
- `minecraft:chainmail_boots`
- `minecraft:nautilus_shell`
- `minecraft:conduit`
- `minecraft:music_disc_13`
- `minecraft:music_disc_cat`
- `minecraft:music_disc_blocks`
- `minecraft:music_disc_chirp`
- `minecraft:music_disc_far`
- `minecraft:music_disc_mall`
- `minecraft:music_disc_mellohi`
- `minecraft:music_disc_stal`
- `minecraft:music_disc_strad`
- `minecraft:music_disc_ward`
- `minecraft:music_disc_11`
- `minecraft:music_disc_wait`

### with_rarity/rare
Items in this tag have their rarity switched to "rare".

**Added in**: *Stancements* 0.1

![list_tag](list_tag.png) **#melony:with_rarity/rare** *(6 values)*
- `minecraft:enchanted_golden_apple`
- `minecraft:trident`
- `minecraft:nether_star`
- `minecraft:wither_skeleton_skull`
- `minecraft:skull_banner_pattern`
- `minecraft:mojang_banner_pattern`

### with_rarity/epic
Items in this tag have their rarity switched to "epic".

**Added in**: *Stancements* 0.1

![list_tag](list_tag.png) **#melony:with_rarity/epic** *(10 values)*
- `minecraft:elytra`
- `minecraft:dragon_head`
- `minecraft:barrier`
- `minecraft:structure_void`
- `minecraft:command_block_minecart`
- `minecraft:debug_stick`
- `minecraft:knowledge_book`
- `variants:enchanted_knowledge_book`
- `variants:debug_bow`
- `variants:debug_arrow`

### with_rarity/potato
Items in this tag have their rarity switched to "potato", from [snapshot 24w14potato](https://minecraft.wiki/w/Java_Edition_24w14potato).

**Added in**: *Stancements* 0.1

![list_tag](list_tag.png) **#melony:with_rarity/potato** *(0 values)*
- *Empty.*