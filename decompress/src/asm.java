// 
// Decompiled by Procyon v0.6.0
// 

final class asm implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ asn b;
    
    public asm(final asn b, final String a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final asi b = this.b.b;
        final String a = this.a;
        final bqi bqi = (bqi)b;
        final asi c = bqi.c;
        if (c != null) {
            a.k(ekw.a.c(), "Camera reconnection failure:%s", a, '\u0508');
            ((ekw)c).d.d();
        }
        bqi.k();
    }
}
