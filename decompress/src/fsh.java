import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsh implements fut
{
    private static final AtomicInteger g;
    public final dvj a;
    public final lfg b;
    public final cxl c;
    public final fsj d;
    public final dxk e;
    public final gry f;
    private final krr h;
    private final Executor i;
    
    static {
        g = new AtomicInteger(0);
    }
    
    public fsh(final dvj a, final lfg b, final krr krr, final cxl c, final fsj d, final Executor i, final dxk e, final gry f) {
        this.a = a;
        this.b = b;
        this.h = krr.a("MomentsHdrPLaunch");
        this.c = c;
        this.d = d;
        this.i = i;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final int a() {
        return 1;
    }
    
    @Override
    public final void b(final kvs kvs, final fvn fvn, final fvd fvd, final fus fus) {
        final int andIncrement = fsh.g.getAndIncrement();
        final StringBuilder sb = new StringBuilder(26);
        sb.append("launcher shot ");
        sb.append(andIncrement);
        sb.append(" ");
        final krv j = krv.j(sb.toString(), this.h);
        j.b("launcher got a HDR+ burst");
        final kvx b = kvs.b();
        b.getClass();
        final long a = b.a;
        final StringBuilder sb2 = new StringBuilder(36);
        sb2.append("    with frame: ");
        sb2.append(a);
        j.b(sb2.toString());
        this.i.execute(new fsd(this, kvs, j, fus, fvn, fvd));
    }
    
    @Override
    public final boolean c(final kvs kvs, final gry gry) {
        return true;
    }
}
