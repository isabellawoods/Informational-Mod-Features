<div style="text-align: center;"> <img src=ChangelogPhoto.png width="1500"> </div>

# <div style="text-align: center;">- Variants - 1.6.20.3 -</div>
### <div style="text-align: center;">A Variants Release Changelog made on *02/03/2024*</div>

This release doesn't work because of the Chorus Plants generating in Enderwood Forests, since the mixin creates a custom, unregistered feature.

## Additions
- Added `substituteEndWithEnderwoodForest` config.
  - When enabled, it changes the main island's biome (The End) with an Enderwood Forest.
- Chorus Plants can now generate in Enderwood Forests.

## Changes
- Potted Redstone Torches now have a float array in their constructor.
  - This defines what the particle color is (this is in RGB format).
- End Gateways, Chorus Plants and End Spikes (Obsidian Pillars) can now generate in Enderwood Forests.
  - The obsidian pillars are used only when generating the biome on the main island.