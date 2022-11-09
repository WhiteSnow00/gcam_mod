import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class jzi implements oen
{
    final /* synthetic */ jzj a;
    final /* synthetic */ jzt b;
    
    public jzi(final jzj a, final jzt b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final Throwable t) {
        Log.e("ExampleIterator", "Failed to get results", t);
        this.b.a(njt.b(t));
    }
    
    @Override
    public final void b(final Object o) {
        synchronized (this.a.a) {
            if (this.a.a.isEmpty()) {
                this.b.b(null, null);
                return;
            }
            final nja nja = this.a.a.removeFirst();
            monitorexit(this.a.a);
            this.b.b((byte[])nja.b, ((oie)nja.a).g());
        }
    }
}
