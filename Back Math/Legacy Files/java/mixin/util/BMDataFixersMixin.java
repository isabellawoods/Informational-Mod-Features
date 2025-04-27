package melonystudios.backmath.mixin.util;

import com.google.common.collect.ImmutableMap;
import com.mojang.datafixers.DataFixerBuilder;
import com.mojang.datafixers.schemas.Schema;
import net.minecraft.util.datafix.DataFixers;
import net.minecraft.util.datafix.fixes.ItemRenameFix;
import org.spongepowered.asm.mixin.Final;
import org.spongepowered.asm.mixin.Mixin;
import org.spongepowered.asm.mixin.Shadow;
import org.spongepowered.asm.mixin.injection.At;
import org.spongepowered.asm.mixin.injection.Inject;
import org.spongepowered.asm.mixin.injection.callback.CallbackInfo;

import java.util.Map;
import java.util.function.BiFunction;
import java.util.function.UnaryOperator;

@Mixin(DataFixers.class)
public abstract class BMDataFixersMixin {
    @Shadow
    @Final
    private static BiFunction<Integer, Schema, Schema> SAME_NAMESPACED;
    @Shadow
    private static UnaryOperator<String> createRenamer(Map<String, String> renameMap) {
        return null;
    }

    @Inject(method = "addFixers", at = @At("TAIL"))
    private static void addFixers(DataFixerBuilder builder, CallbackInfo callback) {
        Schema schema = builder.addSchema(3955, SAME_NAMESPACED);
        ImmutableMap<String, String> idsMap = ImmutableMap.<String, String>builder()
                // Back Layer:
                .put("backmath:frutifery_singularity_minecraft", "backmath:frutifery_singularity_vanilla")
                .put("backmath:meaty_singularity_minecraft", "backmath:meaty_singularity_vanilla")
                .put("backmath:vegetably_singularity_variants", "backmath:vegetably_singularity_revaried")
                .put("backmath:diamond_nugget", "backmath:diamond_shard")
                .put("backmath:mid_hillary_nugget", "backmath:two_thirds_hillary_nugget")
                .put("backmath:mid_hillary_ingot", "backmath:two_thirds_hillary_ingot")
                .put("backmath:hilary_bucket", "backmath:hillary_bucket")
                .put("backmath:milklary_bucket", "backmath:milkllary_bucket")
                .put("backmath:devil_dye", "backmath:red_yellow_dye")
                .put("backmath:queen_sophie_battle_info", "backmath:queen_lucy_battle_info")
                .put("backmath:gel_alcohol", "backmath:alcohol_gel")
                .put("backmath:hilary_disinfectant", "backmath:hillary_disinfectant")
                .put("backmath:hilary_deodorant", "backmath:hillary_deodorant")
                .put("backmath:mid_hillary_key", "backmath:two_thirds_hillary_key")
                .put("backmath:spath_simos_drack", "backmath:spath_sirius_black")
                .put("backmath:friend_sophie_spawn_egg", "backmath:wanderer_termian_spawn_egg")
                .put("backmath:angry_sophie_spawn_egg", "backmath:angry_termian_spawn_egg")
                .put("backmath:insomnia_sophie_spawn_egg", "backmath:insomniac_termian_spawn_egg")
                .put("backmath:archer_insomnia_sophie_spawn_egg", "backmath:archer_insomniac_termian_spawn_egg")
                .put("backmath:warrior_sophie_spawn_egg", "backmath:warrior_termian_spawn_egg")
                .put("backmath:queen_sophie_spawn_egg", "backmath:queen_lucy_spawn_egg")
                .put("backmath:queen_sophie_pet_spawn_egg", "backmath:queen_lucy_pet_spawn_egg")
                .put("backmath:shy_fabricio_spawn_egg", "backmath:shy_alcalyte_spawn_egg")
                .put("backmath:collector_fabricio_spawn_egg", "backmath:collector_alcalyte_spawn_egg")
                .put("backmath:insomnia_zombie_spawn_egg", "backmath:insomniac_zombie_spawn_egg")
                .put("backmath:zombie_fabricio_spawn_egg", "backmath:zombie_alcalyte_spawn_egg")
                .put("backmath:wellerman_disc", "backmath:music_disc_wellerman")
                .put("backmath:snowman_disc", "backmath:music_disc_snowman")
                .put("backmath:ericwho_disc", "backmath:music_disc_duet_challenge")
                .put("backmath:arcade_disc", "backmath:music_disc_arcade")
                .put("backmath:sugar_crash_disc", "backmath:music_disc_sugar_crash")
                .put("backmath:zonibus_disc", "backmath:music_disc_bus")
                .put("backmath:levan_polkka_disc", "backmath:music_disc_ievan_polkka")
                .put("backmath:ievan_polkka_disc", "backmath:music_disc_ievan_polkka")
                .put("backmath:rick_roll_disc", "backmath:music_disc_rick_roll")
                .put("backmath:beggin_disc", "backmath:music_disc_beggin")
                .put("backmath:stay_disc", "backmath:music_disc_stay")
                .put("backmath:the_flying_arm_disc", "backmath:music_disc_flying_arm")
                .put("backmath:sophies_dramatic_entrance_1_disc", "backmath:music_disc_dramatic_intro_1")
                .put("backmath:sophies_dramatic_entrance_2_disc", "backmath:music_disc_dramatic_intro_2")
                .put("backmath:sophies_dramatic_entrance_3_disc", "backmath:music_disc_dramatic_intro_3")
                // Back Math Weaponry:
                .put("backmath:insomnia_sophie_sleepwear_blouse", "backmath:insomniac_termian_sleepwear_blouse")
                .put("backmath:insomnia_sophie_sleepwear_pants", "backmath:insomniac_termian_sleepwear_pants")
                .put("backmath:archer_fabricio_hood", "backmath:archer_alcalyte_hood")
                .put("backmath:archer_fabricio_vest", "backmath:archer_alcalyte_vest")
                .put("backmath:peitoraldeouro", "backmath:golden_plated")
                .put("backmath:tiara_de_gato", "backmath:cat_tiara")
                .put("backmath:yellow_karate_band", "backmath:karate_headband")
                .put("backmath:mid_term_greatsword", "backmath:mid_term_longsword")
                .put("backmath:milked_empada_de_ouro", "backmath:milked_golden_patty")
                .put("backmath:milked_espada_de_manteiga", "backmath:milked_butter_sword")
                .put("backmath:spoon", "backmath:angelic_spoon")
                .put("backmath:empada_de_ouro", "backmath:golden_patty")
                .put("backmath:espada_de_manteiga", "backmath:butter_sword")
                .put("backmath:lapis_rainbow", "backmath:rainbow_pencil")
                .put("backmath:queen_sophie_summoner_staff", "backmath:queen_lucy_summoner_staff")
                .put("backmath:talco_de_agua", "backmath:water_talc_powder")
                .put("backmath:aljamic_flint_and_aljansteel", "backmath:insoflint_and_aljansteel")
                // Back Math Foods:
                .put("backmath:water_jam", "backmath:water_pot")
                .put("backmath:hilary_jam", "backmath:hillary_jam")
                .put("backmath:milklary_jam", "backmath:milkllary_jam")
                .put("backmath:hilary_jam_bread", "backmath:hillary_jam_bread")
                .put("backmath:milklary_jam_bread", "backmath:milkllary_jam_bread")
                .put("backmath:cooked_egg_bag", "backmath:fried_egg_bag")
                .put("backmath:empty_cooked_egg_bag", "backmath:empty_fried_egg_bag")
                .put("backmath:queen_sophie_battle_pack", "backmath:queen_lucy_battle_pack")
                .put("backmath:cooked_egg", "backmath:fried_egg")
                .build();
        builder.addFixer(ItemRenameFix.create(schema, "(BM) Updated ids for many Back Math Items", createRenamer(idsMap)));
    }
}
