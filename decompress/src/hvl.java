// 
// Decompiled by Procyon v0.6.0
// 

final class hvl implements Runnable
{
    final /* synthetic */ eyy a;
    final /* synthetic */ hvm b;
    
    public hvl(final hvm b, final eyy a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final hvm b = this.b;
        final eyy a = this.a;
        final okt m = nxt.ak.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nxt nxt = (nxt)m.b;
        nxt.d = 3;
        nxt.a |= 0x1;
        final nyd g = (nyd)a.a.h();
        g.getClass();
        nxt.g = g;
        nxt.a |= 0x10;
        final nxt nxt2 = (nxt)m.h();
        final okt okt = (okt)nxt2.H(5);
        okt.o(nxt2);
        b.av(okt);
    }
}
