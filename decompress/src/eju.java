import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eju implements bsk
{
    private final kkf a;
    private final pii b;
    private final pii c;
    private final pii d;
    private final pii e;
    private final pii f;
    private final Executor g;
    private final AtomicBoolean h;
    private final kkg i;
    private final kse j;
    private final krr k;
    private oey l;
    
    public eju(final kkf a, final pii b, final pii c, final pii d, final pii e, final pii f, final Executor g, final krq krq, final kkg i, final kse j) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.i = i;
        this.j = j;
        this.h = new AtomicBoolean(false);
        this.k = krq.a("ActivityStartup");
    }
    
    @Override
    public final oey aP() {
        if (this.h.getAndSet(true)) {
            return this.l;
        }
        this.j.f("ActivityStartup");
        this.a.a();
        this.d.get();
        final bsj a = bsj.a(this.g);
        a.d = this.i;
        a.b = this.j;
        a.c = this.k;
        a.d(this.b, "ErrorHandlerStartup");
        a.d(this.d, "PermissionsStartup");
        a.d(this.c, "WaitForCameraDevices");
        a.d(this.e, "CriticalPath");
        a.e(this.f, "ActivityBehaviors");
        this.l = a.c();
        this.j.g();
        return this.l;
    }
}
