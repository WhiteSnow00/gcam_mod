import android.os.Bundle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jul extends jue
{
    final /* synthetic */ jum g;
    
    public jul(final jum g, final int n) {
        this.g = g;
        super(g, n, null);
    }
    
    @Override
    protected final void a(final jps jps) {
        this.g.g.a(jps);
        System.currentTimeMillis();
    }
    
    @Override
    protected final boolean c() {
        this.g.g.a(jps.a);
        return true;
    }
}
