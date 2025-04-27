<div style="text-align: center;"> <img src=ChangelogPhoto.png width="1500"> </div>

# <div style="text-align: center;">- Back Math - 1.9.0.7 -</div>
### <div style="text-align: center;">A Back Math Update Changelog made on *23/04/2025*</div>

**1.9.0.7** is the seventh version for *Back Math* 1.9.0, released on March 28, 2025.[^1]

## Changes
### Items
- Renamed the *"Vegetably Singularity (Variants)"* to *"Vegetably Singularity (Revaried)"*.
- **[Bra. Portuguese]** Changed the word "alcálitas" in shy alcalyte spawn eggs and archer alcalyte gear to "alcálitos".

### Blocks
- Crate's background texture is now a separate texture instead of pointing to `generic_54.png`.
  - It's found at `backmath:textures/gui/container/crate.png`. It's still 9x6, however.
- Renamed the chiseled aljanstone and sleepingstone blocks:
  - Sophie -> Termian ("Termiano" in Portuguese);
  - Fabricio -> Alcalyte ("Alcálito" in Portuguese).
- Updated the texture chiseled aljanstone and sleepingstone (termian) and (alcalyte).

### Miscellaneous
- Updated the mod's description to update the changelogs location.
  - Changelogs are now found [here (in this repository)](/Back%20Math/Changelogs) instead of within the [mod's assets](https://github.com/isabellawoods/Back-Math/blob/915b840c50eae4a99097ecc70a1d9661d1af2f99/src/main/resources/assets/backmath/changelogs/changelog_1.8.txt) (actual file location in the original description never existed).
- Updated the mod's display URL to point to a valid repository.
- Removed the "Back Math:" prefix from the stack loading error message.
- "Queen Lucy" within the variant loading error message is now uppercase.
- **[Bra. Portuguese]** The word "rainha" within the "set spell" message is now uppercase.

## Technical
### Additions
- The "null effect type" error is now translatable: *"An effect type for item behavior '%s' is null"*.

### Changes
- Renamed the config `aljamicMembersArmorChance` to `alcalyteArmorChance`.
  - Also updated its description to match the renaming of fabricios to alcalytes.
- *BreastLayer* can now be rendered on any living entity, and now checks if `femalegender` is loaded instead of `wildfire_gender`.
  - This is because I ported the 1.18 version to 1.16, and updated the mod id in the process.
- Renamed the following methods and classes:

| Old Name | New Name |
|----------|----------|
| *VSUtils* | *RVUtils* |
| *WandererSophieEntity*`.checkSophieSpawnRules()` | *TermianPatrollerEntity*`.checkTermianSpawnRules()` |
| *AlcalyteEntity*`.populateAljanEquipmentSlots()` | *AlcalyteEntity*`.populateAlcalyteEquipmentSlots()` |
| *AlcalyteEntity*`.getAljanArmorByChance()` | *AlcalyteEntity*`.getAlcalyteArmorByChance()` |

## Tags
### Changes
- Renamed the block tag `#backmath:fabricios_can_harvest` to `#backmath:alcalytes_can_harvest`.
- Renamed the block tag `#backmath:sophies_spawnable_on` to `#backmath:termians_spawnable_on`.

### References
[^1]: ["1.9.0.7 (I): Fruit Bush Textures"](https://github.com/isabellawoods/Back-Math/commit/feea41e0a2090cd2b0462dd575a814d878a77b51) (Commit `feea41e`) – GitHub, March 28, 2024.