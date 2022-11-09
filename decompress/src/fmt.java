import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class fmt implements hik
{
    final /* synthetic */ Runnable a;
    
    public fmt(final Runnable a) {
        this.a = a;
    }
    
    @Override
    public final void i(final int n, final int n2) {
        this.a.run();
    }
}
