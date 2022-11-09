import android.graphics.Bitmap;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class hgf implements hik
{
    final /* synthetic */ File a;
    final /* synthetic */ hhy b;
    final /* synthetic */ hgg c;
    
    public hgf(final hgg c, final File a, final hhy b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a() {
        this.c.c.execute(new hge(this.a));
    }
    
    @Override
    public final void d(final Bitmap bitmap) {
        if (this.c.b.k(cxr.aU)) {
            return;
        }
        this.c.c.execute(new hgd(bitmap, this.a, this.b));
    }
    
    @Override
    public final void f(final int n, final int n2, final Throwable t) {
        this.c.c.execute(new hge(this.a, 1));
    }
}
