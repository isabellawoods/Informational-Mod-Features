package melonystudios.variants.crafting.custom;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.item.crafting.IRecipe;
import net.minecraft.item.crafting.Ingredient;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class DataDrivenBrewingRecipe implements IRecipe<IInventory> {
    private final Ingredient input;
    private final Ingredient ingredient;
    private final ItemStack result;
    private final ResourceLocation id;

    public DataDrivenBrewingRecipe(ResourceLocation id, Ingredient inputIngredient, Ingredient potionIngredient, ItemStack potionStack) {
        this.id = id;
        this.input = inputIngredient;
        this.ingredient = potionIngredient;
        this.result = potionStack;
    }

    @Override
    public boolean matches(IInventory inventory, World world) {
        return this.ingredient.test(inventory.getItem(3));
    }

    @Override
    public ItemStack assemble(IInventory inventory) {
        return null;
    }
}
