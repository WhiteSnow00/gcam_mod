import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

final class apr extends apq
{
    final /* synthetic */ aps c;
    private final String d;
    private final Iterator e;
    private int f;
    
    public apr(final aps c, final apx apx) {
        this.c = c;
        super(c);
        this.f = 0;
        if (apx.g().n()) {
            c.b = apx.a;
        }
        this.d = this.a(apx, null, 1);
        this.e = apx.h();
    }
    
    @Override
    public final boolean hasNext() {
        if (super.b != null) {
            return true;
        }
        if (!this.e.hasNext()) {
            return false;
        }
        final apx apx = this.e.next();
        ++this.f;
        final boolean n = apx.g().n();
        String a = null;
        if (n) {
            this.c.b = apx.a;
        }
        else if (apx.c != null) {
            a = this.a(apx, this.d, this.f);
        }
        if (this.c.a.b() && apx.s()) {
            return this.hasNext();
        }
        super.b = apq.b(apx, this.c.b, a);
        return true;
    }
}
