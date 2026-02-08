# Item Tags
> **Last Updated:** 08-02-26

This file lists all item tags under the `c` (common) namespace added by *Reutilities*.

## List of tags
### dual_wielded
Items in this tag are held using the "crossbow charge" animation. This does have some issues when eating since it plays the charging animation.

The equivalent in 1.16 is `#backmath:dual_wielded`, added by *Back Math*.

**Added in**: [*Back Math* 9.0.1](Changelog%201.9.0.1-beta.md), *Reutilities* 1.1.0

![*(list)*](/Revaried/Docs/Tags/list_tag.png) **#c:dual_wielded** *(2 values)*
- `backmath:mid_term_longsword`
- `backmath:carewni`

### emissive_lighting
Items in this tag glow at light level 15 when displayed in any context where darkness is a possibility. The light level is chosen in the following order:
- If the item has the `reutilities:light_emission` component, the value of it is used;
- If the item is in this tag, light level 15 is used;
- If the **Light Emitting Emissives** option is enabled, and the equivalent block emits light, that light level is used;
- If all the above aren't used, the item renders using the provided light level.

If an item is considered emissive, that applies to the following places:
- Worn armor pieces;
- Items in item frames;
- Items in the player's hands;
- Regular item rendering, but only if a block position is specified.
As of 1.2.0, items are **not** emissive in the following places:
- Placed blocks;
- Worn elytra;
- Worn outfits.

**Added in**: *Reutilities* 1.1.0

![*(list)*](/Revaried/Docs/Tags/list_tag.png) **#c:emissive_lighting** *(8 values)*
- `#c:dusts/glowstone`
- `#c:rods/blaze`
- `minecraft:blaze_powder`
- `minecraft:blaze_spawn_egg`
- `minecraft:glow_ink_sac`
- `minecraft:glow_squid_spawn_egg`
- `minecraft:nether_star`
- `minecraft:end_crystal`

### flint
Currently used for nothing other than a grouping tag. In 1.16, this is used to craft *Back Math*'s mortar and pestles.

The equivalent tag in 1.16 is `#forge:flint`, added by *Back Math*.

**Added in**: *Reutilities* 1.2.0

![*(list)*](/Revaried/Docs/Tags/list_tag.png) **#c:flint** *(1 value)*
- `minecraft:flint`

### logos
Grouping tag that contains items used for tab/mod icons.

The equivalent tag in 1.16 is `#melony:icon_items`.

**Added in**: *Reutilities* 1.3.0

![*(list)*](/Revaried/Docs/Tags/list_tag.png) **#c:logos** *(5 values)*
- `creeperedits:creeper_edits_logo`
- `edits:edits_logo`
- `outfitted:tab_icon`
- `revaried:shulker_spectrum_icon`
- `stancements:stancements_logo`