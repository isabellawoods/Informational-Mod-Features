# Block Entity Tags
"*(optional)*" means that this tag can be omitted with no problems.

## Back Math
### Barrel (`bm_barrel`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/list_tag.png) **items**: A list of item stacks stored in this crate, with a maximum of 27 stacks.
    - ![](/Revaried/Docs/Tags/compound_tag.png) A single item stack.
      > **Tags common to all items saved by Revaried:**
      > - ![](/Revaried/Docs/Tags/string_tag.png) **id**: The id of the item.
      > - ![](/Revaried/Docs/Tags/integer_tag.png) **count**: *(optional)* How many items there are in this stack. Effectively capped at 127 due to the default count tag being a ![](/Revaried/Docs/Tags/byte_tag.png) byte.
      > - ![](/Revaried/Docs/Tags/integer_tag.png) **slot**: Which slot this item is in. Ranges from `0` to `26`.
      > - ![](/Revaried/Docs/Tags/compound_tag.png) **tags**: *(optional)* The tags this item stack has.

### Crate (`crate`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/list_tag.png) **items**: A list of item stacks stored in this crate, with a maximum of 18 stacks.
    - ![](/Revaried/Docs/Tags/compound_tag.png) A single item stack.
      > **Tags common to all items saved by Revaried:**
      > - ![](/Revaried/Docs/Tags/string_tag.png) **id**: The id of the item.
      > - ![](/Revaried/Docs/Tags/integer_tag.png) **count**: *(optional)* How many items there are in this stack. Effectively capped at 127 due to the default count tag being a ![](/Revaried/Docs/Tags/byte_tag.png) byte.
      > - ![](/Revaried/Docs/Tags/integer_tag.png) **slot**: Which slot this item is in. Ranges from `0` to `17`.
      > - ![](/Revaried/Docs/Tags/compound_tag.png) **tags**: *(optional)* The tags this item stack has.

### Head (`head`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.

### Sign (`sign`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - > **Tags common to vanilla signs.**

### Queen Lucy Head (`queen_lucy_head`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **variant**: A [queen lucy variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) used to render this head. This is validated by both the item and the block entity.

### Wanderer Sophie Head (`wanderer_sophie_head`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **variant**: A [wanderer sophie variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) used to render this head. This is validated by both the item and the block entity.

## Mellotech
### Endium Cluster (`endium_cluster`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/string_tag.png) **cluster_material**: *(optional)* A [cluster material](/Mellotech/Docs/Cluster%20Material.md) used to spread ores to nearby blocks. None of the spreading logic actually occurs in the block entity.

## Mob Taker
### Enderbreath Campfire (`enderbreath_campfire`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - > **Tags common to vanilla campfires.**

## Others Removed
### Nether Reactor Core (`nether_reactor`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/integer_tag.png) **reactor_progress**: How long this reactor has been running for. This normally ends at `900` ticks (45 seconds).
  - ![](/Revaried/Docs/Tags/integer_tag.png) **reactor_loot_spacing**: A spacing in ticks for when the reactor should pop out loot. Defaults to `200` ticks, ejecting loot 4 times.

## Revaried
### Bell (`vs_bell`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.

### Beacon (`vs_beacon`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - > **Tags common to vanilla beacons.**

### Bed (`vs_bed`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.

### Sign (`vs_sign`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - > **Tags common to vanilla signs.**

### Brewing Stand (`vs_brewing_stand`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - > **Tags common to vanilla brewing stands.**

## Stancements
### Music Recorder (`music_recorder`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/compound_tag.png) **item**: *(optional)* The item stack of the currently stored disc (be it recorded or not). Saved using *Revaried*'s stack handling.
    > **Tags common to all items saved by Revaried:**
    > - ![](/Revaried/Docs/Tags/string_tag.png) **id**: The id of the item.
    > - ![](/Revaried/Docs/Tags/integer_tag.png) **count**: *(optional)* How many items there are in this stack. Effectively capped at 127 due to the default count tag being a ![](/Revaried/Docs/Tags/byte_tag.png) byte.
    > - ![](/Revaried/Docs/Tags/compound_tag.png) **tags**: *(optional)* The tags this item stack has.
  - ![](/Revaried/Docs/Tags/string_tag.png) **music_id**: *(optional)* A resource location of the sound file currently being recorded. Setting this separately of right-clicking the recorder, and inserting a vinyl disc with a hopper, will start recording the song.
  - ![](/Revaried/Docs/Tags/integer_tag.png) **ticks_until_finished_recording**: A countdown, in ticks, of how long until the recording is finished. Set to `600` when recording and `-1` when finished/not recording.
  - ![](/Revaried/Docs/Tags/integer_array_tag.png) **recorder_player**: *(optional)* An UUID of a player who was recording this song. This is used to show the "<d style="color: #FFAA00">Finished recording!</d>" message on your action bar.
  - ![](/Revaried/Docs/Tags/boolean_tag.png) **recording**: *(optional)* Whether this recorder is recording. Some things in the code require either the ![](/Revaried/Docs/Tags/boolean_tag.png) `recording` block state or tag to function, so it's recommended for both to be set.

## The Mato
### Dyed Water Cauldron (`dyed_water_cauldron`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![](/Revaried/Docs/Tags/compound_tag.png) **ForgeData**: A tag added by *Forge* made to store arbitrary data on block entities.
    - ![](/Revaried/Docs/Tags/integer_tag.png) **dyed_water_color**: An integer defining what color to use on this cauldron, and the color to save on dyed water buckets when picking this water up.

### Sign (`mato_sign`)
- ![](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - > **Tags common to vanilla signs.**