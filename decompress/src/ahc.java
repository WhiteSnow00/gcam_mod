import android.support.v7.widget.RecyclerView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahc implements Runnable
{
    private final int a;
    private final RecyclerView b;
    
    public ahc(final int a, final RecyclerView b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.b.T(this.a);
    }
}
