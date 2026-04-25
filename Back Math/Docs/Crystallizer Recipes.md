# Crystallizer Recipes
> [!NOTE]
> **Last Updated**: 25-04-26 (9.0.9)

In [*Back Math* 1.9.0.8](Back%20Math/Changelogs/Changelog%201.9.0.8-beta.md), **crystallizer recipe definitions** were added to the mod's files. As of 9.0.9, these files still aren't used by either crystallizers.

These recipes define how to transform items in-game using either the Crystallizer (tier 1) or the Crystalline Crystallizer (tier 2).

## JSON format
Crystallizer recipes are defined using the following format:

- ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) The root object.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **type**: Either `backmath:crystallizing` or `backmath:crystalline_crystallizing`.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **mold**: The mold used to make this recipe. Can be one of  `empty`, `singularity`, `crystallized`, `ingot`, `mold` or `rod`.
    - If using the crystalline recipe type, `crystalline_empty` and `crystalline_gem` can also be used.
  - ![*(compound or list)*](/Revaried/Docs/Tags/compound_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **main_hand**: The item ingredient on the player's main hand. Can also be defined as a list.
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **item** or **tag**: The item or item tag used on the recipe.
  - ![*(compound or list)*](/Revaried/Docs/Tags/compound_tag.png)![](/Revaried/Docs/Tags/list_tag.png) **off_hand**: *(optional)* The item ingredient on the player's off hand
  - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png) **result**: The item resulted from this recipe. It is played on the player's main hand or inventory. Can also be defined as a list.
    - **Fields common to all item stacks saved by *Revaried*:** 
    - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **id**: The item ID of this stack.
    - ![*(int)*](/Revaried/Docs/Tags/integer_tag.png) **count**: How many items there are in this stack. It must be a number above `0`.
    - ![*(compound)*](/Revaried/Docs/Tags/compound_tag.png)![*(string)*](/Revaried/Docs/Tags/string_tag.png) **tags**: The item tags on this item (NBT). Can also be defined as a string.
  - ![*(string)*](/Revaried/Docs/Tags/string_tag.png) **sound**: *(optional)* The sound event that plays if the recipe is successful.

## History
| Version                                                       | Changes                                                                                              |
| ------------------------------------------------------------- | ---------------------------------------------------------------------------------------------------- |
| [1.9.0.8](Back%20Math/Changelogs/Changelog%201.9.0.8-beta.md) | Added crystallizer recipes to data pack. However, they still aren't used by the crystallizer blocks. |

## Issues
Issues related to "Crystallizer recipes" are maintained on [*Back Math*'s issue tracker](https://github.com/isabellawoods/Back-Math/issues). Issues should be reported and viewed there.

## Navigation
### Data pack definitions
|                   |                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                        |
| ----------------- | ---------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------- |
| **Back Math**     | ![](/Textures/navbox/crystallizer_recipes.png) **Crystallizer Recipes** ▪ ![](/Textures/navbox/outfit_definition_bm.png) [Outfit Definition](/Back%20Math/Docs/Outfit%20Definition.md) ▪ ![](/Textures/navbox/queen_lucy_variant.png) [Queen Lucy Variant](/Back%20Math/Docs/Queen%20Lucy%20Variant.md) ▪ ![](/Textures/navbox/queen_lucy_pet_variant.png) [Queen Lucy Pet Variant](/Back%20Math/Docs/Queen%20Lucy%20Pet%20Variant.md) ▪ ![](/Textures/navbox/wanderer_sophie_variant.png) [Wanderer Sophie Variant](/Back%20Math/Docs/Wanderer%20Sophie%20Variant.md) |
| **Mellotech**     | ![](/Textures/navbox/cluster_material.png) [Cluster Material](Mellotech/Docs/Cluster%20Material.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                    |
| **Melony Lib**    | ![](/Textures/navbox/banner_pattern.png) [Banner Pattern](/Melony%20Lib/Docs/Banner%20Pattern.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                                      |
| **Reutilities**   | ![](/Textures/navbox/outfit_definition_re.png) [Outfit Definition](Reutilities/Docs/Outfit%20Definition.md)                                                                                                                                                                                                                                                                                                                                                                                                                                                            |
| **Revaried**      | ![](/Textures/navbox/bowl_type.png) [Bowl Type](/Revaried/Docs/Bowl%20Type.md) ▪ ![](/Textures/navbox/damage_source.png) [Damage Source](/Revaried/Docs/Damage%20Source.md) ▪ ![](/Textures/navbox/wool_armor_color.png) [Wool Armor Color](/Revaried/Docs/Wool%20Armor%20Color.md)                                                                                                                                                                                                                                                                                    |
| **Stacked Goods** | ![](/Textures/navbox/mossifiables.png) [Mossifiables](Stacked%20Goods/Docs/Mossifiables.md) ▪ ![](/Textures/navbox/mineral_extraction.png) [Mineral Extraction](/Stacked%20Goods/Docs/Mineral%20Extraction.md)  ▪ ![](/Textures/navbox/scrapables.png) [Scrapables](Stacked%20Goods/Docs/Scrapables.md)                                                                                                                                                                                                                                                                |
| **Stancements**   | ![](/Textures/navbox/pot_plantables.png) [Pot Plantables](Stancements/Docs/Pot%20Plantables.md)  ▪ ![](/Textures/navbox/recorded_song_styles.png) [Recorded Song Styles](Stancements/Docs/Recorded%20Song%20Styles.md)                                                                                                                                                                                                                                                                                                                                                 |
