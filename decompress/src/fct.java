import java.util.ArrayDeque;
import android.content.Context;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.Queue;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fct
{
    public final Queue a;
    public final AtomicBoolean b;
    public final irf c;
    public final irf d;
    public final efm e;
    public final fcz f;
    public final fcv g;
    
    public fct(final Context e, final efm e2, final fcz f, final AtomicBoolean b, final fcv g, final cxl cxl) {
        this.a = new ArrayDeque();
        this.e = e2;
        this.b = b;
        this.f = f;
        this.g = g;
        final irg irg = new irg();
        irg.e = e;
        irg.d = e.getResources().getString(2131952712);
        irg.a = true;
        irg.h = 11;
        irg.g = cxl.k(cxr.at);
        this.c = irg.a();
        irg.d = e.getResources().getString(2131952171);
        irg.a = false;
        irg.h = 11;
        irg.g = cxl.k(cxr.at);
        this.d = irg.a();
    }
}
