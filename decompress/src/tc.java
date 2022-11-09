import java.util.Arrays;
import android.support.v7.widget.StaggeredGridLayoutManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class tc
{
    public int a;
    public int b;
    public boolean c;
    public boolean d;
    public boolean e;
    public int[] f;
    public final /* synthetic */ StaggeredGridLayoutManager g;
    
    public tc(final StaggeredGridLayoutManager g) {
        this.g = g;
        this.a();
    }
    
    public final void a() {
        this.a = -1;
        this.b = Integer.MIN_VALUE;
        this.c = false;
        this.d = false;
        this.e = false;
        final int[] f = this.f;
        if (f != null) {
            Arrays.fill(f, -1);
        }
    }
}
