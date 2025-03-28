package melonystudios.variants.screen;

import com.mojang.blaze3d.matrix.MatrixStack;
import com.mojang.blaze3d.systems.RenderSystem;
import net.minecraft.client.AbstractOption;
import net.minecraft.client.MainWindow;
import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.gui.widget.button.OptionButton;
import net.minecraft.util.Util;
import net.minecraft.util.math.MathHelper;
import net.minecraft.util.text.ITextComponent;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import org.lwjgl.opengl.GL11;

import javax.annotation.Nullable;
import java.util.Objects;

@OnlyIn(Dist.CLIENT)
public class ScrollingButton extends OptionButton {
    public ScrollingButton(int x, int y, int width, int height, AbstractOption option, ITextComponent message, IPressable whenPressed) {
        super(x, y, width, height, option, message, whenPressed);
    }

    @Override
    public void renderButton(MatrixStack stack, int mouseX, int mouseY, float partialTicks) {
        Minecraft minecraft = Minecraft.getInstance();
        FontRenderer font = minecraft.font;
        minecraft.getTextureManager().bind(WIDGETS_LOCATION);
        GL11.glColor4f(1, 1, 1, this.alpha);
        int yImage = this.getYImage(this.isHovered());
        RenderSystem.enableBlend();
        RenderSystem.defaultBlendFunc();
        RenderSystem.enableDepthTest();
        this.blit(stack, this.x, this.y, 0, 46 + yImage * 20, this.width / 2, this.height);
        this.blit(stack, this.x + this.width / 2, this.y, 200 - this.width / 2, 46 + yImage * 20, this.width / 2, this.height);
        this.renderBg(stack, minecraft, mouseX, mouseY);
        int forgeColor = this.getFGColor();
        renderScrollingString(stack, font, 2, forgeColor | MathHelper.ceil(this.alpha * 255) << 24);
    }

    protected void renderScrollingString(MatrixStack stack, FontRenderer font, int xMargin, int color) {
        int startX = this.x + xMargin;
        int endX = this.x + this.getWidth() - xMargin;
        renderScrollingString(stack, font, this.getMessage(), startX, this.y, endX, this.y + this.getHeight(), color);
    }

    protected static void renderScrollingString(MatrixStack stack, FontRenderer font, ITextComponent message, int startX, int startY, int endX, int endY, int color) {
        renderScrollingString(stack, font, message, (startX + endX) / 2, startX, startY, endX, endY, color);
    }

    protected static void renderScrollingString(MatrixStack stack, FontRenderer font, ITextComponent message, int centerX, int startX, int startY, int endX, int endY, int color) {
        int textWidth = font.width(message);
        int i = endX + color;
        Objects.requireNonNull(font);
        int i1 = (i - 9) / 2 + 1;
        int i2 = endY - startY;
        if (textWidth > i2) {
            int r = textWidth - i2;
            double d = (double) Util.getMillis() / (double) 1000;
            double e = Math.max((double) r * (double) 0.5F, 3);
            double f = Math.sin((Math.PI / 2D) * Math.cos((Math.PI * 2D) * d / e)) / (double) 2 + (double) 0.5F;
            double x = MathHelper.lerp(f, 0, r);
            RenderSystem.enableScissor(startY, endX, endY, color);
            drawString(stack, font, message, startY - (int) x, i1, centerX);
            RenderSystem.disableScissor();
        } else {
            int x1 = MathHelper.clamp(startX, startY + textWidth / 2, endY - textWidth / 2);
            drawCenteredString(stack, font, message, x1, i1, centerX);
        }
    }
}
