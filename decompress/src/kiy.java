import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

final class kiy implements krc
{
    final /* synthetic */ kiz a;
    private final AtomicBoolean b;
    
    public kiy(final kiz a) {
        this.a = a;
        this.b = new AtomicBoolean(false);
    }
    
    @Override
    public final void close() {
        final AtomicBoolean b = this.b;
        boolean b2 = true;
        if (!b.getAndSet(true)) {
            synchronized (this.a.d) {
                final kiz a = this.a;
                final int b3 = a.b - 1;
                a.b = b3;
                njo.e(b3 >= 0, "The number of handles should never be negative.");
                monitorexit(this.a.d);
                final kiz a2 = this.a;
                final Object d = a2.d;
                synchronized (this.a.d) {
                    if (a2.f) {
                        return;
                    }
                    if (a2.b == 0) {
                        final kkf c = a2.c;
                        if (c != null) {
                            c.b(a2.e);
                            b2 = false;
                        }
                        else {
                            a2.f = true;
                        }
                    }
                    else {
                        b2 = false;
                    }
                    monitorexit(this.a.d);
                    if (b2) {
                        a2.a.close();
                    }
                }
            }
        }
    }
}
