import android.os.SystemClock;
import android.content.Context;
import android.graphics.Point;
import java.util.ArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class etc
{
    public ArrayList a;
    public final etp b;
    public long c;
    public etq d;
    public final Point e;
    public int f;
    public boolean g;
    public boolean h;
    public boolean i;
    
    public etc(final Context context, final etp b, final int n, final int n2) {
        this.f = 0;
        this.g = false;
        this.h = false;
        this.i = false;
        try {
            this.d = new etq();
        }
        catch (final erz erz) {
            erz.printStackTrace();
        }
        if (this.a == null) {
            this.a = new ArrayList();
        }
        this.a.clear();
        for (int i = 0; i < 5; ++i) {
            this.a.add(i, new esc());
            ((esc)this.a.get(i)).g(context, (new int[] { 2131231153, 2131231150, 2131231151, 2131231152, 2131231153 })[i], 4.0f);
            ((esc)this.a.get(i)).e = this.d;
        }
        this.b = b;
        this.e = new Point(n / 2 - this.a.get(0).g.x / 2, n2 / 2 - this.a.get(0).g.y / 2);
        this.h = false;
        this.g = false;
        this.i = true;
    }
    
    public final void a() {
        this.f = 0;
        if (!this.g) {
            return;
        }
        final etp b = this.b;
        final int i = b.i;
        final float[] e = b.e();
        final double n = (double)(SystemClock.elapsedRealtimeNanos() - this.c);
        Double.isNaN(n);
        esh.w(e, i, (int)(n / 1000000.0));
        this.g = false;
    }
}
