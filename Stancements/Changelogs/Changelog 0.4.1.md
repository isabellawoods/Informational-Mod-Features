<h1 style="text-align: center;">- Stancements 0.4.1 -</h1>

> **Written On:** 17-04-26 - **Last Updated:** 17-04-26

**0.4.1** is a minor version of *Stancements* released on April 11, 2026.[^1] It makes music recording work properly in multiplayer, and adds compatibility for modded songs.

## Additions
### Blocks
- The music recording process now uses packets. This means it works properly in multiplayer now.
- The "Recording song..." text now reads "Recording "\[song name]", by \[Author]...".
  - This text now only shows up if the recorder player is within 16 blocks of the recorder block.

### Miscellaneous
- Added the "Music Discs Copied" statistic, tracking exactly that.
- Added the "Recorder Modded Songs" resource- and data pack.
  - This pack includes jukebox song definitions for many environmental songs added by other mods, including the Chase the Skies soundtrack.
  - The reason for this being a resource pack is so the game doesn't keep logging errors for non-existent sounds.
  - The data pack seems to always be enabled by default.
  - The pack includes music for these mods:
    - *Enderscape*
    - *Galosphere*
    - *The Aether*
    - *TerraFirmaCraft*
    - *Vanilla Backport*
    - *Oh The Biomes We've Gone*
    - *Nature's Spirit*
    - *The Bumblezone*
  - The pack also includes recorded song styles for modded music discs.

## Changes
### Miscellaneous
- Song translation keys no longer include `minecraft` as the default namespace, to match 1.21.9.
- The word "ID" in translation keys is now consistently uppercase.
- **\[Bra. Portuguese]** Command translations are now worded a bit different.

## Technical
### Additions
- Added the `recording_turns_into` data component.
  - **Format**: a ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **when_recorded** field defining what item the base item will become when used for music recording.
  - The music recorder requires that the base item has this component.
  - By default, vinyl discs have it set to `stancements:recorded_disc`.
- Added the `gameplay/convert_disc_to_jukebox_song` Melony subcommand.
  - Attempts to converts discs using the updated `music_id` field (from recording songs with no related jukebox song) into jukebox songs.
- Added the *StartRecordingAttemptEvent*, which fires when the music recorder starts to record a song (ambient or jukebox).

### Changes
- The ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **color** field in the `recorded_song_styles` data map can now be represented as hexadecimal ("#RRGGBB").
  - By default, all entries will be in hexadecimal.
- *Reutilities* `1.5.0` is now used for development. Version `1.4.0` is still the minimum requirement for launching.
- The `gameplay/update_recorded_disc` subcommand:
  - Now properly converts songs from *The Mato*.
  - No longer crashes if ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **label** is set to `0` (converts to `1`).

### Removals
- Songs from the Chase the Skies soundtrack are no longer bundled by default.

## Tags
### Removals
- Removed the `#stancements:recordable_discs` item tag, which contained vinyl discs.

### References
[^1]:  ["0.4.1: Networked Recording & Modded Songs"](https://github.com/isabellawoods/Stancements/commit/e88d8cc9fdd602c3bb104df173e3be55a46eb0a8) (Commit `e88d8cc`) – GitHub, April 11, 2026.