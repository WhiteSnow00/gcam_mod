import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

final class aar implements Runnable
{
    final /* synthetic */ abd a;
    final /* synthetic */ Typeface b;
    
    public aar(final abd a, final Typeface b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.a.a.a(this.b);
    }
}
