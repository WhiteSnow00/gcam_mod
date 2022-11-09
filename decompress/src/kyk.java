import android.util.Printer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kyk implements kwe
{
    public final kyw a;
    public final kwg b;
    public final lhn c;
    public final ldy d;
    private final lfh e;
    
    public kyk(final kyw a, final kwg b, final lfh e, final ldy d, final lhn c) {
        this.a = a;
        this.b = b;
        this.e = e;
        this.d = d;
        this.c = c;
    }
    
    public static final void e(final Printer printer, final String s, final String s2) {
        printer.println(ksc.c("%-20s %s", s, s2));
    }
    
    @Override
    public final kwz a(final kxb kxb) {
        final kwz b = this.b(kxb);
        b.getClass();
        return b;
    }
    
    @Override
    public final kwz b(final kxb kxb) {
        final nrv bn = this.d.a.bN();
        while (bn.hasNext()) {
            final ldw ldw = bn.next();
            if (ldw.h == kxb) {
                return ldw;
            }
        }
        return null;
    }
    
    @Override
    public final lfg c() {
        return this.e.a(this.d());
    }
    
    public final lfj d() {
        return this.b.a;
    }
}
