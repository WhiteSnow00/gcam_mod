import android.graphics.drawable.Drawable;
import android.os.Handler;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class bfo extends bhu
{
    final int a;
    public Bitmap b;
    private final Handler c;
    private final long d;
    
    public bfo(final Handler c, final int a, final long d) {
        this.c = c;
        this.a = a;
        this.d = d;
    }
    
    @Override
    public final void a(final Drawable drawable) {
        this.b = null;
    }
}
