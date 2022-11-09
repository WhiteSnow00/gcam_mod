// 
// Decompiled by Procyon v0.6.0
// 

final class dyi
{
    final /* synthetic */ dyk a;
    
    public dyi(final dyk a) {
        this.a = a;
    }
    
    public final void a(final long n, int n2) {
        final long currentTimeMillis = System.currentTimeMillis();
        final dyk a = this.a;
        final int b = (int)(currentTimeMillis - a.e);
        final nsd a2 = dyl.a;
        final nsx a3 = ntf.a;
        final okt i = a.i;
        if (i.c) {
            i.m();
            i.c = false;
        }
        final nyy nyy = (nyy)i.b;
        final nyy d = nyy.d;
        nyy.a |= 0x1;
        nyy.b = b;
        switch (n2) {
            default: {
                n2 = 4;
                break;
            }
            case 1: {
                n2 = 3;
                break;
            }
            case 0: {
                n2 = 2;
                break;
            }
        }
        final okt j = this.a.i;
        if (j.c) {
            j.m();
            j.c = false;
        }
        final nyy nyy2 = (nyy)j.b;
        nyy2.c = n2 - 1;
        nyy2.a |= 0x2;
        dyk.f(this.a);
        this.a.e(n);
    }
}
