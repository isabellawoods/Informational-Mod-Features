# Damage Source
> [!NOTE]
> This feature is exclusive to *Revaried*, and was ported over from *Minecraft Unofficial Documentation - MUD*.
>
> **Last Updated**: 8.0.9 (4-11-25)

> [!WARNING]
> In my current implementation of data-driven "registries", it **doesn't work in multiplayer** due to the server not sending them to the client. Loading them beforehand may be a possible workaround.

**Damage sources** are the way *Minecraft* defines different kinds of damage that entities can take. Damage sources can be defined using JSON files in a data pack at the path `data/<namespace>/damage_source/`.

Alternatively, new sources can be temporarily added by creating a new inline damage source in a "damage entity" consume behavior.

Damage sources added by the vanilla game and my own mods can be applied using the `/damage` command, backported by *Revaried*, as long as it is added via a data pack.

## JSON format
Damage sources are defined using the following format:

- ![(compound)](compound_tag.png) The root object.
  - ![(string)](string_tag.png) **message_id**: The message identifier for this damage source. Used for the death message translation.
  - ![(float)](float_tag.png) **food_exhaustion**: How much exhaustion this damage source should cause when applied.
  - ![(string)](string_tag.png) **scaling**: How this damage source should [scale](#Scaling) when in different difficulties.
  - ![(string)](string_tag.png) **death_message_type**: Which type of [death message builder](#Death%20Message%20Types) this damage source should use.
  - ![(boolean)](boolean_tag.png) **is_explosion**: *(optional)* Marks this damage source as coming from an explosion. Makes blast protection protect against this.
  - ![(boolean)](boolean_tag.png) **is_projectile**: *(optional)* Marks this damage source as being from a projectile. Makes projectile protection protect against this.
  - ![(boolean)](boolean_tag.png) **is_magic**: *(optional)* Marks this damage source as being from a magic source. Makes magic protection protect against this.
  - ![(boolean)](boolean_tag.png) **is_fire**: *(optional)* Marks this damage source as being from fire or lava. Makes fire protection protect against this.
  - ![(boolean)](boolean_tag.png) **is_thorns**: *(optional)* Marks this damage source as being from thorns. Produces the thorns hit sound when an entity takes damage from this source.
    - **This is only available when `death_message_type` is `direct_entity` or `indirect_entity`.** 
  - ![(boolean)](boolean_tag.png) **bypasses_armor**: Makes this damage source bypass any armor the target may be wearing.
  - ![(boolean)](boolean_tag.png) **bypasses_invulnerability**: Makes this damage source bypass any kind of invulnerability, like the ![(boolean)](boolean_tag.png) **Invulnerable** tag or a creative mode player.
  - ![(boolean)](boolean_tag.png) **bypasses_magic**: Makes this damage source bypass any enchantments (like protection) the target may have.

## Usage
Here's an example implementation for the `minecraft:out_of_world` damage source within a data pack.
```json
// Contents of "data/minecraft/damage_source/out_of_world.json".
{
  "message_id": "outOfWorld",
  "food_exhaustion": 0.0,
  "scaling": "never",
  "death_message_type": "default",
  "bypasses_armor": true,
  "bypasses_invulnerability": true
}
```

### In consume behaviors
Damage sources can be used in consume behaviors via the "damage entity" behavior:

- <img src=Tags/compound_tag.png> The behavior tag.
  - <img src=Tags/float_tag.png> **amount**: How much damage should be applied to the entity. Defaults to `0`.
  - <img src=Tags/string_tag.png><img src=Tags/compound_tag.png> **source**: The damage source to hurt the entity with.
    > **If defined as a string:** A resource location of a damage source to be used.
    > **If defined as a compound:** same as the [JSON format](#JSON%20format).

When defining the `source` field as a compound, the resulting source will be temporarily added to *Revaried*'s list of damage sources, using the `damage_behavior` namespace if none is present. Since it uses a static field, these sources will exist as long as the game is running.

## Scaling
Damage sources control how damage scales with difficulty.<sup>*[more information needed]*</sup>

On consumables, this is defined by the "damage entity" consume behavior.

- When `always`, the damage always scales with difficulty;
- When `when_caused_by_living_non_player`, the damage will scale if the entity causing it is a living entity but not a player;
- When `never`, the damage is always the same.

## Death message types
Damage sources mostly control what their death message will be. The only exception is `fall` damage, which is hardcoded.

On consumables, this is defined by the "damage entity" consume behavior.

- When `default`, the default method of making death messages is used;
- When `direct_entity` or `indirect_entity`, the message will include the entity which killed the player;
- When `intentional_game_design`, the message will be *"Player was killed by \[[Intentional Game Design](https://bugs.mojang.com/browse/MCPE-28723)]"*.

## List of damage sources
### Back Math
| Damage source                | Sources                                                                       |
| ---------------------------- | ----------------------------------------------------------------------------- |
| `chocoglued`                 | A chocoglue projectile hitting something                                      |
| `hot_and_cold_meal`          | Finishing to eat a hot sophie and cold fabricio meal                          |
| `mid_term_armor_instability` | Any mid-term armor piece reaching `0` or `1` durability                       |
| `patience_tea`               | Ticking damage from a patience tea effect                                     |
| `poison_rose`                | A poison rose checking if it can poison its bystander, but technically unused |
| `water_talc_powder`          | Finishing to eat a water talc powder                                          |

### Revaried
| Damage source               | Sources                                                  |
| --------------------------- | -------------------------------------------------------- |
| `bluestone_poisoning`       | Ticking damage from the Bluestone Poisoning effect       |
| `explosive_blend_poisoning` | Ticking damage from the Explosive Blend Poisoning effect |
| `glowstone_poisoning`       | Ticking damage from the Glowstone Poisoning effect       |
| `gunpowder_poisoning`       | Ticking damage from the Gunpowder Poisoning effect       |
| `redstone_poisoning`        | Ticking damage from the Redstone Poisoning effect        |

### Mob Taker
| Damage source | Sources                                    |
| ------------- | ------------------------------------------ |
| `enderbreath` | Ticking damage from the Enderbreath effect |
| `voided`      | Ticking damage from the Voided effect      |
| `watery`      | Ticking damage from the Watery effect      |

### The Mato
| Damage source | Sources                                 |
| ------------- | --------------------------------------- |
| `freeze`      | Ticking damage from the Freezing effect |

## History
### Back Math
| Release Date                                                                                                | Changes                                                                                                 |
| ----------------------------------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------- |
| *December 20th, 2022*                                                                                       | Added `hotAndColdMeal`, `waterTalcPowder`, `midTermArmorInstability` and `poisonRose`.                  |
| *April 4th, 2023*                                                                                           | Added `patienceTea` and `chocoglued`.                                                                   |
| [*August 5th, 2024*](/Back%20Math/Changelogs/1.8%20Beta%20Dev%20-%2005-08-24/Changelog%2005-08-24.md) (8.0) | <li>Renamed all sources to snakecase.</li> <li>Added `went_americanas` and `went_food_and_drinks`.</li> |

### Revaried
| Version                                                                             | Changes                                                                                                                                                            |
| ----------------------------------------------------------------------------------- | ------------------------------------------------------------------------------------------------------------------------------------------------------------------ |
| 6.2.0                                                                               | Added `poisoning.redstone`, `poisoning.bluestone`, `poisoning.glowstone`, `poisoning.gunpowder` and `poisoning.creeper_powder`.                                    |
| [6.15.1](/Revaried/Changelogs/1.16.5%20-%201.6.15.1/Changelog%201.6.15.1.md)        | Renamed `poisoning.creeper_powder` to `poisoning.explosive_blend`.                                                                                                 |
| [7.0 Pre-Release 5](Changelog%201.7.0%20Pre-Release%205%20(Part%20I%20and%20II).md) | Renamed all sources from `poisoning.<powder>` to `<powder>_poisoning`.                                                                                             |
| [7.0 Release Candidate 3](Changelog%201.7.0%20Release%20Candidate%203.md)           | <li> Added damage sources to data packs. </li> <li> Backported the `/damage` command, which utilizes data-driven damage sources. </li>                             |
| [8.0.3](/Revaried/Changelogs/1.16.5%20-%201.8.0.3/Changelog%201.8.0.3.md)           | Added `3dshareware:nightmare`, `vote_update:on_moon`, `vote_update:midas_touch`, `poisonous_potato_update:potato_heat` and `poisonous_potato_update:potato_magic`. |

### The Mato
| Version | Changes         |
| ------- | --------------- |
| 3.4.0   | Added `freeze`. |

### Mob Taker
| Version | Changes                                     |
| ------- | ------------------------------------------- |
| 1.5.0   | Added `enderbreath`, `voided` and `watery`. |

## Issues
Issues relating to "Damage source" are maintained on [*Revaried*'s bug tracker](https://github.com/isabellawoods/Revaried/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
| | |
|-|-|
| **Back Math** | ![](/Textures/navbox/outfit_definition.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Revaried** | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) **Damage Source** ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md) |
| **Stacked Goods** | ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md) |
| **Melony Lib** | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md) |
| **Mellotech** | ![](/Textures/navbox/cluster_material.png) [Cluster Material](/Mellotech/Docs/Cluster%20Material.md) |