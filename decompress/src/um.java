import android.support.wearable.complications.rendering.ComplicationDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class um implements Runnable
{
    final /* synthetic */ ComplicationDrawable a;
    
    public um(final ComplicationDrawable a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.a.setIsHighlighted(false);
        this.a.invalidateSelf();
    }
}
