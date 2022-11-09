import java.util.concurrent.Executor;
import com.google.android.apps.camera.ui.gridlines.GridLinesUi;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izw implements jap
{
    private final pii a;
    private final klj b;
    private final kjm c;
    private final bmz d;
    
    public izw(final pii a, final bmz d, final hkc hkc, final kjm c) {
        this.a = a;
        this.d = d;
        this.b = hkc.a(hjq.c);
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.d.i().c(this.b.a(new izv((GridLinesUi)((ixw)this.a.get()).c.c(2131427633)), this.c));
    }
}
