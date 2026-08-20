![Stancements 0.4.4 changelog photo](Assets/0.4.4.png)

<h1 style="text-align: center;">- Stancements 0.4.4 -</h1>

> **Written On:** 08-07-26 - **Last Updated:** 19-08-26 - **Download**: [`1.21.1`](https://github.com/isabellawoods/Stancements/releases/download/0.4.4/stancements-neoforge-0.4.4+1.21.1.jar)

**0.4.4** is a major update of *Stancements* released on July 7, 2026.[^1] It makes the music recording process fully data-driven using **vinyl modifiers**, and adds some easter eggs for "creepy" music discs.

> [!WARNING] Known issues
> - **\[Fixed in `5.0.0-beta.1`]** Jukebox songs in the `minecraft` namespace will search for disc styles in the `stancements` namespace (disc styles for vanilla discs don't work).
> - **\[Fixed in `5.0.0-beta.1`]** The ![*(string or list)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **targets** field on vinyl modifiers can now target non-existent jukebox songs.

## Additions
### Items
- Added shattered discs, which cannot be used for anything.
  - Obtained by trying to copy disc "11" with the recorder.
- Added sculk-infested vinyl, recorded and shattered discs, which work exactly like their non-infested counterparts.
  - The vinyl discs are obtained when trying to copy disc "5" with the recorder.
  - Vinyl discs can also be obtained by clearing recorded discs in the crafting table.
- Recorded discs with an unrecognized song (`music_data.id` but no `jukebox_playable`) will now have a tooltip showing how to re-record it, and to report it as a bug to *Stancements*.

### Miscellaneous
- Added **2** new client-side options, both of which have been split from the **Music Discs Block Ambient Music** option:
  - **On Jukeboxes** (`block.musicDiscsBlockAmbientMusic.jukebox`): Controls whether music discs on *vanilla jukeboxes* block ambient music.
  - **On Sophisticated Core-Based Containers** (`block.musicDiscsBlockAmbientMusic.sophisticated`): Controls whether music discs in a Jukebox Upgrade from *Sophisticated Backpacks/Storage* block ambient music.
- Added a new common option:
  - **Recorder Free Will** (`block.recorderFreeWill`): Whether the recorder can eject discs after a certain amount of time. This stops the ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **ticks_until_ejection** tag from counting down.
- Added **2** new sound events:
  - `block.music_recorder.eject` ("Music Recorder ejects disc");
  - `item.vinyl_disc.shatter` ("Vinyl Disc shatters").

## Changes
### Blocks
- Using pick-block on a non-hopping crop pot now gives a pot that stacks with other pots.

#### Music Recorder
-  Music discs playing in containers from *Sophisticated Storage* can once again be copied.
- If it has multiple jukeboxes besides itself, it will now pick the one playing a song instead of stopping at the first jukebox.
  - If the music disc is a copy or it disallows copies, it still stops at the first. This will be fixed at a later date.
- Taking discs out now plays a sound and shows particles (taken from the crafter).
  - The disc is now always centered on the block, instead of being ejected at random positions and speeds.
- If a song has 2 or more authors, it now shows an "and" at the end instead of always using a comma.

### Items
- Updated the recorded disc style of music disc "11" to actually look like 11 instead of "stal".

### Miscellaneous
- Renamed the sound event `item.cauldron.dye` to `block.cauldron.dye`.

### [Recorder Modded Songs](/Melony%20Studios%20Wiki/Resource%20Packs/Recorder%20Modded%20Songs.md) Pack
- "Bounce" by fingerspit (from *Vanilla Backport*) now uses the label `14.0`, added in the last version.

## Removals
### Miscellaneous
- Removed the **Music Discs Block Ambient Music** option, as it has been split into two.

## Technical
### Additions
- Added the ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **ticks_until_ejection** tag to the `music_recorder` block entity.
  - When set to a value above `-1`, it counts down to zero and then ejects the inserted disc out of the recorder.
  - This can be disabled by the **Recorder Free Will** option.
- Added the `-Dstdebug.logging` debugging flag, which enables some debug logs for vinyl modifiers.

#### Vinyl modifiers
- Added [**vinyl modifiers**](/Stancements/Docs/Vinyl%20Modifier.md) to data packs.
  - Vinyl modifiers allow modifying the inserted disc when the recording starts and ends. This makes part of the music recording process data-driven.
  - New modifier *components* can be added using the `stancements:vinyl_modifier_component_type` built-in registry. These components are what actually makes the modifier do things.
  - By default, the "creepy" music discs in vanilla (13, 11 and 5) apply modifications to the inserted disc and eject it after 10-15 seconds.
  - The only parts that are still hardcoded are writing the music ID onto the inserted disc (the `music_data` and `jukebox_playable` components), and the initial "Recording \<song>, by \<artist>..." message.
  - **Attributes of the current modifiers:**

| Modifier                    | Effects                                                                                                                                                                                                                                             | Recording text                                  | Applies on | Modifies copies? |
| --------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- | ---------- | ---------------- |
| `music_disc_11`             | Ejects the disc after 10-15 seconds, and plays a disc shattering sound when inserted.                                                                                                                                                               | Something broke in the recorder...              | Start      | Yes              |
| `music_disc_13`             | Ejects the disc after 10-15 seconds, and plays a cave sound when inserted.                                                                                                                                                                          | A strange sound fills the recorder...           | Start      | Yes              |
| `music_disc_5`              | Ejects the disc after 10-15 seconds, and replaces the vinyl disc with a sculk-infested version.                                                                                                                                                     | A mysterious darkness surrounds the recorder... | Start      | Yes              |
| `pipeline/finish_recording` | Converts the vinyl disc into a recorded disc (based on its `recording_turns_into` component), and applies the disc style from the *recorded disc styles* registry. If that's not available, it falls back to randomizing the label style and color. | Finished recording!                             | Finish     | Yes              |

#### Vinyl modifier component types
Vinyl modifiers include **8** components that can be used in modifiers, with most of them allowing a *loot condition* to be used as well. All components listed below are under *Stancements*' namespace.
- **`eject_after_ticks`**: Ejects the inserted disc after a certain amount of ticks, with a set chance of whether the ejection will occurs.
- **`modify_recordable_disc`**: Applies a list of loot functions on the inserted disc.
- **`replace_recordable_disc`**: Replaces the inserted disc with another item, copying the components of the old item to the new one.

The components below were taken from the components used for enchantments:
- **`explode`**: Creates an explosion at the recorder's position.
- **`play_sound`**: Plays any sound at the recorder's position.
- **`replace_block`**: Places a block relative to the recorder's position.
- **`replace_disk`**: Places a disk with a set diameter and height relative to the recorder's position.
- **`run_function`**: Runs a command function.

#### Loot table-related additions
- Added the `stancements:vinyl_modifier` loot parameter set. This set includes:
  - Origin;
  - Block state;
  - Block entity (optional);
  - This entity (the recordee, optional).
- Added the `stancements:recorder_state/item` loot condition.
  - Compares the item inside the music recorder (if possible) with the provided ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **targets**, which can be an item ID, a list of item IDs, or a hash-prefixed item tag.
  - If the recorder cannot be obtained from the provided parameter set, the condition simply returns `false`.
- Added **4** new loot functions:
  - `stancements:set_random_dyes` **(Copied from 26.1)**: Dyes the target item with a set amount of random dyes (defined by the ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **number_of_dyes** number provider), but only if the item is in the `#minecraft:dyeable` item tag.
  - `stancements:set_random_label`: Picks a random label from the provided ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **range** (number provider) and puts it on the item. There's also an option to ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **round_to_nearest** integer.
  - `stancements:style_disc_from_registry`: Applies the color and label from the *recorded disc style* registry if possible, and falls back to a ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **fallback_dyes_setter** and a ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **fallback_label_setter** if not.
  - `stancements:apply_recording_turns_into`: Converts an item into another based on its `stancements:recording_turns_into` component. Has no extra fields.
- Added **2** new number providers:
  - `stancements:sum`: Sums all number provider results in ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **summands** into one.
  - `stancement:clamped_number`: Clamps a ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **source** number provider between ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **min_inclusive** and ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **max_inclusive**.

### Changes
- Renamed *STOptions* to *STCommonOptions*.
- Unified the *StartRecordingAttemptEvent* into a single class that runs before either recording methods in *MusicRecorderBlock*.
  - `clientMusicID` is now provided for copying songs as well.
- Renamed the following methods and fields:

| Class                         | Old Name          | New Name                   |
| ----------------------------- | ----------------- | -------------------------- |
| MusicRecorderBlock            | `stopRecording()` | `interruptAndEject()`      |
| STShearsDispenseBehaviorMixin | `execute()`       | `executeOrShearsOffTags()` |
| STShearsItemMixin             | `mineBlock()`     | `mineBlockWithShears()`    |
| STSounds                      | `ITEM_DYE`        | `DYE_ITEM`                 |

## Tags
### Additions
- Added the `#stancements:priority_modification` vinyl modifier tag.
  - Contains `stancements:pipeline/finish_recording`.
  - Modifiers in this tag run before other modifiers. This is to ensure the recording pipeline runs fully before other modifications are made to the disc.
- Added the `#stancements:jade_considers_as_recording` item tag.
  - Contains all vinyl and shattered discs.
  - Items in this tag show "Recording: \<song> (\<duration>)" on *Jade* instead of "Finished recording!".

### Changes
- Added sculk-infested recorded discs to the `#minecraft:dyeable` item tag.
- Added sculk-infested vinyl and recorded discs to the `#c:music_discs` item tag.

### References
[^1]: ["0.4.4: Vinyl Modifiers & Haunted Discs"](https://github.com/isabellawoods/Stancements/commit/445ac0099fe03a0d57ded6b71dfaee22541faf99) (Commit `445ac00`) — GitHub, July 7, 2026.