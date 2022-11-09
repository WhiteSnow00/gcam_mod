import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class eku implements hhz
{
    final /* synthetic */ ekw a;
    
    public eku(final ekw a) {
        this.a = a;
    }
    
    @Override
    public final void j(final him him, final Bitmap bitmap, final int n) {
        this.a.e.post((Runnable)new ekt(this, bitmap, n));
        if (this.a.o.s()) {
            ((jgv)this.a.Q.get()).f(bitmap);
        }
    }
}
