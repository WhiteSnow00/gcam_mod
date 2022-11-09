import j$.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.atomic.AtomicReference;
import java.util.concurrent.Executor;
import android.content.Context;
import android.app.Application;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mjm extends mjj implements mgx
{
    public final Application a;
    public final ofb b;
    public final mem c;
    public final oui d;
    public final mgu e;
    public final mjo f;
    private final boolean g;
    private final mji h;
    
    public mjm(final mgv mgv, final Context context, final mji h, final ofb b, final oui d, final mjo f, final mem c, final pii pii, final Executor executor, final niz niz) {
        new AtomicReference(mjb.a);
        new ConcurrentHashMap();
        this.h = h;
        this.c = c;
        this.e = mgv.a(executor, d, pii);
        this.a = (Application)context;
        this.b = b;
        this.d = d;
        this.f = f;
        this.g = (boolean)niz.e(Boolean.FALSE);
    }
    
    @Override
    public final void a() {
        this.h.a = new mjk(this);
    }
    
    @Override
    public final void k() {
        if (this.g) {
            this.a();
        }
    }
}
