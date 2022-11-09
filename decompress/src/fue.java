// 
// Decompiled by Procyon v0.6.0
// 

public final class fue implements fut
{
    private final krr a;
    private final cxl b;
    private final fut c;
    private final fut d;
    private final fut e;
    private final gry f;
    
    public fue(final krr krr, final cxl b, final fsh c, final fqu d, final fqo e, final gry f) {
        this.a = krr.a("SwitcherHdrPlus");
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final int a() {
        this.b.k(cxx.m);
        return 1;
    }
    
    @Override
    public final void b(final kvs kvs, final fvn fvn, final fvd fvd, final fus fus) {
        fut fut;
        if (fvn.i && this.b.k(cxx.P) && this.b.k(cxw.l)) {
            fut = this.e;
        }
        else if (this.b.k(cxx.m)) {
            fut = this.d;
        }
        else {
            fut = this.c;
        }
        fut c = fut;
        if (!fut.c(kvs, this.f)) {
            c = this.c;
        }
        if (this.b.k(cxx.m) && this.b.k(cxx.M) && c == this.c) {
            fus.a();
            return;
        }
        if (c.c(kvs, this.f)) {
            final krr a = this.a;
            final String value = String.valueOf(c.getClass().getSimpleName());
            String concat;
            if (value.length() != 0) {
                concat = "Processing frames with ".concat(value);
            }
            else {
                concat = new String("Processing frames with ");
            }
            a.b(concat);
            c.b(kvs, fvn, fvd, fus);
            return;
        }
        final String value2 = String.valueOf(kvs);
        final StringBuilder sb = new StringBuilder(String.valueOf(value2).length() + 49);
        sb.append("Cannot find an HdrPlusLauncher to process frame ");
        sb.append(value2);
        sb.append("!");
        throw new IllegalStateException(sb.toString());
    }
    
    @Override
    public final boolean c(final kvs kvs, final gry gry) {
        return true;
    }
}
