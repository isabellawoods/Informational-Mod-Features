<div style="text-align: center;"> <img src=Assets/1.9.0.7-beta.png width="1500"> </div>

# <div style="text-align: center;">- Back Math - 1.9.0.7 -</div>
### <div style="text-align: center;">A Back Math Update Changelog made on *01/07/2025*</div>

**1.9.0.7** is the seventh version for *Back Math* 1.9.0, released on June 18, 2025.[^1][^2][^3]

## Additions

## Changes
### Items
- Renamed the *"Vegetably Singularity (Variants)"* to *"Vegetably Singularity (Revaried)"*.
- **[Bra. Portuguese]** Changed the word "alcálitas" in shy alcalyte spawn eggs and archer alcalyte gear to "alcálitos".
- Right-clicking a mid-term now properly plays the swinging animation.<sup>*[please check]*</sup>
- Queen Lucy summoner staves now send a movement packet to players when smashing mobs.
  - Some values in the class were also rounded up.
- The item pickup sound when opening bags is now pitched correctly, and plays at your exact location.
- Spawn egg tinting is now controlled by a `tintSpawnEggs` config, although it may not be working correctly.
  - All spawn eggs now have defined colors instead of being pure white.
- Updated the textures of all spawn eggs to match snapshot [25w08a](https://minecraft.wiki/w/Java_Edition_25w08a).
- **[Aljan Tex. Update]** Updated the jantical texture to better resemble a crystal.

### Blocks
- Crate's background texture is now a separate texture instead of pointing to `generic_54.png`.
  - It's found at `backmath:textures/gui/container/crate.png`. It's still 9x6, however.
- Renamed the chiseled aljanstone and sleepingstone blocks:
  - Sophie -> Termian ("Termiano" in Portuguese);
  - Fabricio -> Alcalyte ("Alcálito" in Portuguese).
- Updated the texture chiseled aljanstone and sleepingstone (termian) and (alcalyte).

### Entities
- Added the "Home", "Menace" and "Yearn" capes to the cape pool of termians.

### Effects
- Updated the icons of "Mood" and "Patience".

### Miscellaneous
- Updated the mod's description to update the changelogs location.
  - Changelogs are now found [here (in this repository)](/Back%20Math/Changelogs) instead of within the [mod's assets](https://github.com/isabellawoods/Back-Math/blob/915b840c50eae4a99097ecc70a1d9661d1af2f99/src/main/resources/assets/backmath/changelogs/changelog_1.8.txt) (actual file location in the original description never existed).
- Updated the mod's display URL to point to a valid repository.
- When using **The Mato's Music Pack**, "Broken Clocks" by Amos Roddy can now play in all back fields, and in angelic woods.
- Removed the "Back Math:" prefix from the stack loading error message.
- "Queen Lucy" within the variant loading error message is now uppercase.
- **[Bra. Portuguese]** The word "rainha" within the "set spell" message is now uppercase.

## Technical
### Additions
- The "null effect type" error is now translatable: *"An effect type for item behavior '%s' is null"*.

### Changes
- Renamed the config `aljamicMembersArmorChance` to `alcalyteArmorChance`.
  - Also updated its description to match the renaming of fabricios to alcalytes.
- *BreastLayer* can now be rendered on any living entity, and now also checks if `femalegender` is loaded together with `wildfire_gender`.
  - This is because I ported the 1.18 version of the mod to 1.16, and changed the mod id in the process.
- All data-driven mob variants are now located inside a single folder: `data/<namespace>/mob_variants`.
  - These folders no longer have a `_variant` suffix.
- Updated codecs of various classes in *Back Math* (even though they aren't used), and added some new ones.
- Renamed the following methods and classes:

| Old Name | New Name |
|----------|----------|
| *VSUtils* | *RVUtils* |
| *BMBowItem*`.onPlayerStoppedUsing()` | *BMBowItem*`.shootArrow()` |
| *WandererSophieEntity*`.checkSophieSpawnRules()` | *TermianPatrollerEntity*`.checkTermianSpawnRules()` |
| *AlcalyteEntity*`.populateAljanEquipmentSlots()` | *AlcalyteEntity*`.populateAlcalyteEquipmentSlots()` |
| *AlcalyteEntity*`.getAljanArmorByChance()` | *AlcalyteEntity*`.getAlcalyteArmorByChance()` |

## Tags
### Changes
- Renamed the block tag `#backmath:fabricios_can_harvest` to `#backmath:alcalytes_can_harvest`.
- Renamed the block tag `#backmath:sophies_spawnable_on` to `#backmath:termians_spawnable_on`.

### References
[^1]: ["1.9.0.7 (I): Fruit Bush Textures"](https://github.com/isabellawoods/Back-Math/commit/feea41e0a2090cd2b0462dd575a814d878a77b51) (Commit `feea41e`) – GitHub, March 28, 2025.
[^2]: ["1.9.0.7 (II): Moved Mob Variants Folder & Tweaks from 1.21"](https://github.com/isabellawoods/Back-Math/commit/f7d3aba06ddc3a9a7b0f01cba8f3bc77a2a95923) (Commit `f7d3aba`) – GitHub, April 27, 2025.
[^3]: ["1.9.0.7 (III): Updated Spawn Eggs & Effects"](https://github.com/isabellawoods/Back-Math/commit/395ad5bea0a8cbb1a957db49b9f7c5cbcabc42d2) (Commit `395ad5b`) – GitHub, June 18, 2025.