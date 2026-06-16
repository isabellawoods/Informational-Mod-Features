# Woodland Mansions

- Add loot tables for empty Woodland Mansion chests (storage rooms, etc.)
- **1x1_as2**: Change Spider Spawner to another mob spawner (don't know which mob yet).

### Turn into Loot Tables

- **Default Loot Table**: `melonystudios:chests/woodland_mansion/default_reward`.
- **Default Loot Table**: `melonystudios:chests/woodland_mansion/miscellaneous_reward`.
- **1x2_a4**: `melonystudios:chests/woodland_mansion/dark_oak_saplings_room`.
- **1x2_a6**: `melonystudios:chests/woodland_mansion/tree_chopping_room`.
- **1x2_s2**: `melonystudios:chests/woodland_mansion/fake_end_portal_room`.
- **1x1_b5**: `melonystudios:chests/woodland_mansion/allium_cultivation_room`.

Gives a Mech-Mech with **+1 Zombie Reinforcements**:
```mcfunction
/give @p backmath:mech_mech{AttributeModifiers:[{AttributeName:"minecraft:zombie.spawn_reinforcements",Name:"Mech Mech Reach Distance Modifier",Slot:"mainhand",Operation:0,Amount:1.0D,UUID:[I;131423,15535,424315,13323]}]}
```