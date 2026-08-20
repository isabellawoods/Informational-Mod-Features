# Vinyl Modifier
> [!NOTE]
> **Written On**: 17-08-26 (5.0.0-beta.1 - 1.21.1) - **Last Updated**: 19-08-26

A **vinyl modifier** is a set of *modifier components* that are applied to recordable discs when starting and finishing a recording in the **music recorder**.

Vinyl modifiers can be defined using JSON files in a data pack at the path `data/<namespace>/stancements/vinyl_modifier/`, and can have tags defined at the path `data/<namespace>/tags/stancements/vinyl_modifier/`.

## Existing modifiers
| Modifier                                                                          | Effects                                                                                                                                                                                                                                                                           | Recording text                                  | Applies on | Modifies copies? |
| --------------------------------------------------------------------------------- | --------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- | ----------------------------------------------- | ---------- | ---------------- |
| `music_disc_11`                                                                   | Ejects the disc after 10-15 seconds, and plays a disc shattering sound when inserted.                                                                                                                                                                                             | Something broke in the recorder...              | Start      | Yes              |
| `music_disc_13`                                                                   | Ejects the disc after 10-15 seconds, and plays a cave sound when inserted.                                                                                                                                                                                                        | A strange sound fills the recorder...           | Start      | Yes              |
| `music_disc_5`                                                                    | Ejects the disc after 10-15 seconds, and replaces the vinyl disc with a sculk-infested version.                                                                                                                                                                                   | A mysterious darkness surrounds the recorder... | Start      | Yes              |
| `enderscape:music_disc_decay`<sup>*[upcoming 5.0.0-beta.2]* *[only in RMS]*</sup> | Ejects the disc after 10-15 seconds.                                                                                                                                                                                                                                              | Something is interfering with the recorder...   | Start      | Yes              |
| `pipeline/finish_recording`                                                       | Converts the vinyl disc into a recorded disc (based on its `recording_turns_into` component), and applies the disc style from the [*recorded disc styles*](Recorded%20Disc%20Style.md) registry. If that's not available, it falls back to randomizing the label style and color. | Finished recording!                             | Finish     | Yes              |
| `pipeline/sculk_ejection_chance`                                                  | Has a 15% chance to eject the disc after 20 seconds.                                                                                                                                                                                                                              |                                                 | Start      | Yes              |

## JSON format
Vinyl modifiers are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png): The root object.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **recording_text**: A [text component](https://minecraft.wiki/w/Text_component) that is displayed to the recordee when this modifier is applied. Setting this to an empty string (`""`) disables the text message for this modifier.
    - The first modifier that provides this is the one that will be kept, since other modifiers that may run after it cannot override the text.
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **strategies**: Whether this modifier runs when starting or finishing a recording (or both). Can be a combination of any of these, but cannot be empty:
    - `before`;
    - `after`.
  - ![*(string, list or compound)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **targets**: Any number of [tracks](Stancements/Docs/Track.md) — A list of which music discs this modifier acts on. If this is an empty list, this modifier will run for any track being recorded or copied.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effects**: Vinyl modifier components — Controls the effects of this modifier.
    - ![*(list or compound)*](/Revaried/Docs/Tags/list_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **\<component ID>**: A [vinyl modifier component](#Vinyl%20modifier%20components).
      - Fields depending on the component.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **modifies_copies**: *(optional, defaults to `false`)* Whether this modifier applies when copying a music track, instead of only when recording.

## Vinyl modifier components
> [!NOTE]
> Part of these descriptions were copied from the [Enchantment definition](https://minecraft.wiki/w/Enchantment_definition) article on the *Minecraft Wiki*.

These components use a *conditional effect* to check for a condition beforehand. The general format for them is:

- ![*(list)*](/Revaried/Docs/Tags/list_tag.png): **\<component ID>**
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png)
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**: The original component's fields.
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **requirements**: *(optional)* A [predicate](https://minecraft.wiki/w/Predicate) determining whether this effect is active. The parameters for its context, `vinyl_modifier`, are the following:
       - **Origin:** The position of the music recorder
       - **Block state:** The music recorder
       - **Block entity:** *(optional)* The music recorder block entity
       - **`this` entity**: *(optional)* The entity recording/copying the song

| Component IDs                       |
| ----------------------------------- |
| `stancements:eject_after_ticks`     |
| `stancements:explode`               |
| `stancements:play_sound`            |
| `stancements:replace_block`         |
| `stancements:replace_disk`          |
| `stancements:replace_recorded_disc` |
| `stancements:run_function`          |

Some components don't check for a predicate and always apply their effects. Their format is the following:
- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **\<component ID>**: The modifier component to apply.

| Component IDs                        | [**Loot context**](https://minecraft.wiki/w/Loot_context) for predicate                                                                                                                                                                                                      |
| ------------------------------------ | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| `stancements:modify_recordable_disc` | `vinyl_modifier`:<li>**Origin:** The position of the music recorder</li> <li>**Block state:** The music recorder</li> <li>**Block entity:** *(optional)* The music recorder block entity</li> <li>**`this` entity**: *(optional)* The entity recording/copying the song</li> |

#### eject_after_ticks
Sets the ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **ticks_until_ejection** field of music recorders, which eject the recordable disc out of the recorder after this counter reaches `0`.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(float or compound)*](/Revaried/Docs/Tags/float_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **ejection_chance**: Float between `0.0` and `1.0` (*float provider*) — The chance that the music recorder will eject the disc.
  - ![*(int or compound)*](/Revaried/Docs/Tags/integer_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **ticks_until_ejection**: Integer between `1` (0.05 seconds) and `72000` (1 hour) — How many ticks until the ejection occurs.

#### explode
Causes an explosion at the music recorder's block position.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **attribute_to_recordee**: Should the explosion be attributed to the entity recording the track?
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **damage_type**: *(optional)* One [damage type](https://minecraft.wiki/w/Damage_type) (an ![*(string)*](/Revaried/Docs/Tags/string_tag.png) ID) — the explosion deals no damage if this field is omitted.
  - ![*(string or list)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **immune_blocks**: *(optional)* Any number of [block types](https://minecraft.wiki/w/Block) (![](/Revaried/Docs/Tags/string_tag.png) ID, or a ![](/Revaried/Docs/Tags/string_tag.png) tag with `#`, or an ![](/Revaried/Docs/Tags/list_tag.png) array containing ![](/Revaried/Docs/Tags/string_tag.png) IDs) — blocks that fully block the explosion and can't be destroyed.
  - ![*(float or compound)*](/Revaried/Docs/Tags/float_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **knockback_multiplier**: *(optional, defaults to `1.0`)* Multiplier of the explosion knockback.
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **offset**: *(optional, defaults to `[0, 0, 0]`)* List of 3 ![*(floats)*](/Revaried/Docs/Tags/float_tag.png) — X, Y, Z position offset to spawn the explosion.
  - ![*(float or compound)*](/Revaried/Docs/Tags/float_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **radius**: A *float provider* — The radius of the explosion.
  - ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **creates_fire**: *(optional, defaults to `false`)* Should fire be places by the explosion?
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **block_interaction**: One of `none` (no effect), `block` (like a bed explosion), `mob` (like a creeper explosion), `tnt` (like tnt explosion), `trigger` (like a wind charge explosion) — How the explosion should interact with blocks.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **small_particle**: The small particle the explosion emits.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **type**: The ID of the particle type. See [Particles (Java Edition)](https://minecraft.wiki/w/Particles_(Java_Edition)) for valid options.
    - **Additional field depending on ![*(string)*](/Revaried/Docs/Tags/string_tag.png) type, see [Particle format § Configurations of particle types](https://minecraft.wiki/w/Particle_format#Configurations_of_particle_types).**
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **large_particle**: The large particle the explosion emits. Same format as ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **small_particle**.
  - ![*(string or compound)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **sound**: One [server-side sound event](https://minecraft.wiki/w/Sounds.json#Server-side_sound_events) (an ![](/Revaried/Docs/Tags/string_tag.png) ID, or a new ![](/Revaried/Docs/Tags/compound_tag.png) server-side sound event definition) — The sound to play.

#### modify_recordable_disc
Applies a series of [loot functions](https://minecraft.wiki/w/Item_modifier) to the recordable disc. If the loot condition implements *ModificationContextAware*, they can access the context used for the vinyl modifier.
- ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **functions**: List of loot fuctions — Each function runs sequentially, and their output is stored within the modifier context's `transientModifierStack`.

#### play_sound
Plays a sound.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(string or compound)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **sound**: One [server-side sound event](https://minecraft.wiki/w/Sounds.json#Server-side_sound_events) (an ![](/Revaried/Docs/Tags/string_tag.png) ID, or a new ![](/Revaried/Docs/Tags/compound_tag.png) server-side sound event definition) — The sound to play.
  - ![*(float or compound)*](/Revaried/Docs/Tags/float_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **volume**: Float between `0.00001` and `10.0` (*float provider*) — Volume of the sound.
  - ![*(float or compound)*](/Revaried/Docs/Tags/float_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **pitch**: Float between `0.00001` and `2.0` (*float provider*) — Pitch of the sound.

#### replace_block
Places a block.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **block_state**: The block to place. See [block state providers](https://minecraft.wiki/w/Block_state_provider#Types).
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **offset**: *(optional, defaults to `[0, 0, 0]`)* List of 3 ![*(integers)*](/Revaried/Docs/Tags/integer_tag.png) — X, Y, Z position offset to place the block.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **trigger_game_event**: *(optional)* One [game event](https://minecraft.wiki/w/Game_event) (an ![](/Revaried/Docs/Tags/string_tag.png) ID) — The game event to trigger on placing the block.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **predicate**: *(optional)* A [block predicate](https://minecraft.wiki/w/Block_predicate) used to test if the block should be placed.
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **type**: The type of the block predicate. See [Block predicate § Types](https://minecraft.wiki/w/Block_predicate#Types) for options.
    - **Additional field depending on ![](/Revaried/Docs/Tags/compound_tag.png) type.**

#### replace_disk
Places a half-sphere.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **block_state**: The block to place. See [block state providers](https://minecraft.wiki/w/Block_state_provider#Types).
  - ![*(list)*](/Revaried/Docs/Tags/list_tag.png) **offset**: *(optional, defaults to `[0, 0, 0]`)* List of 3 ![*(integers)*](/Revaried/Docs/Tags/integer_tag.png) — X, Y, Z position offset to place the center of the disk.
  - ![*(int or compound)*](/Revaried/Docs/Tags/integer_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **radius**: An *integer provider* — The radius of the disk.
  - ![*(int or compound)*](/Revaried/Docs/Tags/integer_tag.png)![](/Revaried/Docs/Tags/compound_tag.png) **height**: An *integer provider* — The height of the disk.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **trigger_game_event**: *(optional)* One [game event](https://minecraft.wiki/w/Game_event) (an ![](/Revaried/Docs/Tags/string_tag.png) ID) — The game event to trigger on placing each block.
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **predicate**: *(optional)* A [block predicate](https://minecraft.wiki/w/Block_predicate) used to test each position in the disk to determine if a block should be placed.
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **type**: The type of the block predicate. See [Block predicate § Types](https://minecraft.wiki/w/Block_predicate#Types) for options.
    - **Additional field depending on ![](/Revaried/Docs/Tags/compound_tag.png) type.**

#### replace_recordable_disc
Replaces the recordable disc with another item, keeping every data component from the old item.

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **replacement**: An item stack without the ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **count** field — All components from the old item get transferred to the replacement item.

#### run_function
Runs a [function](https://minecraft.wiki/w/Function_(Java_Edition)).

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **effect**
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **function**: One [function](https://minecraft.wiki/w/Function_\(Java_Edition\) "Function (Java Edition)") (an ![*(string)*](Revaried/Docs/Tags/string_tag.png) [ID](https://minecraft.wiki/w/Resource_location "Resource location")) — The function to run.

## History
| Version                                                             | Changes                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         |
| :------------------------------------------------------------------ | ------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| [0.4.4](/Stancements/Changelogs/Changelog%200.4.4.md)               | <li>Added vinyl modifiers to data packs.</li> <li>Currently, it includes the following modifier components: `eject_after_ticks`, `explode`, `modify_recordable_disc`, `play_sound`, `replace_block`, `replace_disk`, `replace_recordable_disc`, `run_function`.</li> <li>There are currently **4** modifiers bundled with the mod: `pipeline/finish_recording`, `music_disc_11`, `music_disc_13` and `music_disc_5`.</li>                                                                                                                                                                                                                                                                                                                                                       |
| [5.0.0-beta.1](/Stancements/Changelogs/Changelog%205.0.0-beta.1.md) | <li>The ![*(string or list)*](/Revaried/Docs/Tags/string_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **targets** field now uses [tracks](Track.md) instead of a *HolderSet* of jukebox songs. This means modifiers can now target any song, and not just existing jukebox songs.</li> <li>Renamed the ![*(boolean)*](/Revaried/Docs/Tags/boolean_tag.png) **modifies_when_copying** field to **modifies_copies**.</li> <li>Added the `stancements:pipeline/sculk_ejection_chance` modifier.</li> <li>**\[`eject_after_ticks`]** The ![*(float)*](/Revaried/Docs/Tags/float_tag.png) **ejection_chance** field is now a *float provider* (was previously a `Codec.FLOAT` with a range).</li> <li>**\[`run_function`]** Updated the wording slightly of the error message.</li> |
| 5.0.0-beta.2 **under RMS**                                          | Added the `enderscape:music_disc_decay` modifier.                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               |

## Issues
Issues relating to "Vinyl modifier" are maintained on [*Stancements*' issue tracker](https://github.com/isabellawoods/Stancements/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                   |
| ----------------- | ----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) [Crystallizer Recipes](/Back%20Math/Docs/Crystallizer%20Recipes.md) ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                              |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                 |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) [Outfit Definition](/Reutilities/Docs/Outfit%20Definition.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md)                                                                                                                                                                                                                                                                                                                               |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) [Mossifiables](/Stacked%20Goods/Docs/Mossifiables.md) ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](/Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                                                         |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](/Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](/Stancements/Docs/Recorded%20Song%20Styles.md) ▪ ![](/Textures/navbox/recorded_disc_style.png) [Recorded Disc Style](/Stancements/Docs/Recorded%20Disc%20Style.md) ▪ ![](/Textures/navbox/track.png) [Track](/Stancements/Docs/Track.md) ▪ ![](/Textures/navbox/vinyl_modifier.png) **Vinyl Modifier**                                                                                                                                  |
