// 
// Decompiled by Procyon v0.6.0
// 

final class dig implements diy
{
    private final lju a;
    private final byte[] b;
    private final hjc c;
    
    public dig(final lju a, final byte[] b, final hjc c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final lju a() {
        return this.a;
    }
    
    @Override
    public final void b(final huz huz) {
        if (huz != null && this.b != null) {
            try {
                final okt m = nyx.c.m();
                final byte[] b = this.b;
                m.p(b, b.length, okm.b());
                final int e = this.c.e;
                if (m.c) {
                    m.m();
                    m.c = false;
                }
                final nyx nyx = (nyx)m.b;
                nyx.a |= 0x4;
                nyx.b = e;
                huz.h((nyx)m.h());
            }
            catch (final olm olm) {
                a.m(dii.a.c(), "Invalid log buffer", '\u0318', olm);
            }
        }
    }
    
    @Override
    public final boolean c() {
        return true;
    }
}
