import java.io.IOException;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class ben implements bdv
{
    private final bel a;
    private final bil b;
    
    public ben(final bel a, final bil b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final azk azk, final Bitmap bitmap) {
        final IOException c = this.b.c;
        if (c != null) {
            if (bitmap != null) {
                azk.d(bitmap);
            }
            throw c;
        }
    }
    
    @Override
    public final void b() {
        this.a.a();
    }
}
