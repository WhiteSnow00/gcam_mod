// 
// Decompiled by Procyon v0.6.0
// 

public final class loi implements lok
{
    private final jpg a;
    
    public loi(final jpg a) {
        this.a = a;
    }
    
    @Override
    public final void a(final ooj ooj) {
        if (ooj != null) {
            final jpd a = this.a.a(ooj.g());
            final okv i = a.i;
            if (i.c) {
                i.m();
                i.c = false;
            }
            final ouf ouf = (ouf)i.b;
            final ouf j = ouf.j;
            ouf.a |= 0x10;
            ouf.d = 1;
            a.a();
        }
    }
}
