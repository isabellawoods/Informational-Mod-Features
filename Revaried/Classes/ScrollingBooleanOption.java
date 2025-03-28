package melonystudios.variants.screen;

import net.minecraft.client.GameSettings;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.widget.Widget;
import net.minecraft.client.settings.BooleanOption;
import net.minecraft.util.text.ITextComponent;

import javax.annotation.Nonnull;
import javax.annotation.Nullable;
import java.util.function.BiConsumer;
import java.util.function.Predicate;

public class ScrollingBooleanOption extends BooleanOption {
    @Nullable
    private final ITextComponent tooltipComponent;

    public ScrollingBooleanOption(String message, Predicate<GameSettings> getter, BiConsumer<GameSettings, Boolean> setter) {
        super(message, getter, setter);
        this.tooltipComponent = null;
    }

    public ScrollingBooleanOption(String message, @Nullable ITextComponent tooltipComponent, Predicate<GameSettings> getter, BiConsumer<GameSettings, Boolean> setter) {
        super(message, tooltipComponent, getter, setter);
        this.tooltipComponent = tooltipComponent;
    }

    @Override
    @Nonnull
    public Widget createButton(GameSettings options, int x, int y, int width) {
        if (this.tooltipComponent != null) this.setTooltip(Minecraft.getInstance().font.split(this.tooltipComponent, 200));

        return new ScrollingButton(x, y, width, 20, this, this.getMessage(options), button -> {
            this.toggle(options);
            button.setMessage(this.getMessage(options));
        });
    }
}
