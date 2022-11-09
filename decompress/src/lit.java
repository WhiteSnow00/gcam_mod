import java.util.ArrayList;
import android.content.Context;
import java.util.concurrent.Executor;
import android.view.OrientationEventListener;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lit
{
    public final List a;
    public final List b;
    public final Object c;
    public final OrientationEventListener d;
    public final Executor e;
    public final krr f;
    public kra g;
    public int h;
    
    public lit(final Context context, final Executor e, final krr krr) {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.c = new Object();
        this.g = kra.a;
        this.e = e;
        this.d = new lis(this, context);
        this.f = krr.a("DeviceOrientation");
    }
    
    public final kra a() {
        synchronized (this.c) {
            return this.g;
        }
    }
    
    public final void b(final liq liq) {
        synchronized (this) {
            synchronized (this.c) {
                if (this.a.contains(liq)) {
                    return;
                }
                this.a.add(liq);
            }
        }
    }
    
    public final void c(final liq liq) {
        synchronized (this.c) {
            if (!this.a.remove(liq)) {
                this.f.g("Removing non-existing listener.");
            }
        }
    }
}
