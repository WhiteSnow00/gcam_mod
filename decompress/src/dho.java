import android.view.View;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dho
{
    public final Context a;
    public final View b;
    public final int[][] c;
    public long d;
    public int e;
    public boolean f;
    
    public dho(final Context a, final View b) {
        this.c = new int[][] { { 2131952754, 2131952753, 2131952755 }, { 2131952160, 2131951842, 2131952587 }, { 2131951763, 2131951762, 2131951764 } };
        this.d = -1L;
        this.e = -1;
        this.f = true;
        this.a = a;
        b.getClass();
        this.b = b;
    }
    
    public static final int c(int n, int n2, final int n3) {
        if (n2 == 0) {
            return 0;
        }
        n2 = n * n3 / n2;
        if ((n = n2) == n3) {
            n = n2 - 1;
        }
        return n;
    }
    
    public final void a() {
        this.f = false;
    }
    
    public final void b() {
        this.f = true;
    }
}
