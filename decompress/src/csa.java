import android.text.TextPaint;
import android.view.View;
import android.text.style.ClickableSpan;

// 
// Decompiled by Procyon v0.6.0
// 

final class csa extends ClickableSpan
{
    final /* synthetic */ Runnable a;
    
    public csa(final Runnable a) {
        this.a = a;
    }
    
    public final void onClick(final View view) {
        this.a.run();
    }
    
    public final void updateDrawState(final TextPaint textPaint) {
        textPaint.setColor(textPaint.linkColor);
    }
}
