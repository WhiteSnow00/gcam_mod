import android.support.wearable.complications.rendering.ComplicationDrawable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class un implements up
{
    final /* synthetic */ ComplicationDrawable a;
    
    public un(final ComplicationDrawable a) {
        this.a = a;
    }
    
    @Override
    public final void a() {
        this.a.invalidateSelf();
    }
}
