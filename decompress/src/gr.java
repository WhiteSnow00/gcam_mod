import android.graphics.Typeface;

// 
// Decompiled by Procyon v0.6.0
// 

final class gr implements Runnable
{
    final /* synthetic */ Typeface a;
    final /* synthetic */ gs b;
    
    public gr(final gs b, final Typeface a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.a(this.a);
    }
}
