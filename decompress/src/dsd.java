import java.util.concurrent.Callable;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsd
{
    private final cxl a;
    
    public dsd(final cxl a) {
        this.a = a;
    }
    
    public final lyp a(final String s) {
        final map a = map.a;
        final lyc d = lza.d();
        final lvy b = lvy.b(s, lwt.h());
        b.a();
        final lys b2 = lza.b(b);
        final lwh a2 = lwt.a(b2, new lyz(a, d));
        try {
            lwt.g(a2);
            b2.j(new lyo(b2, a2));
            final cxl a3 = this.a;
            final cxo a4 = cxr.a;
            a3.c();
            final lyp a5 = lza.a(b2);
            this.a.c();
            this.a.e();
            return new lzl(a5);
        }
        catch (final lwi lwi) {
            throw new RuntimeException("Failed to create GLContext!", lwi.getCause());
        }
    }
}
