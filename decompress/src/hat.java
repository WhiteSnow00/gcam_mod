// 
// Decompiled by Procyon v0.6.0
// 

public final class hat
{
    public final has[] a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final long f;
    
    public hat(final opw opw) {
        this.b = opw.j;
        opv opv;
        if ((opv = opw.i) == null) {
            opv = opv.i;
        }
        final float e = opv.e;
        opv opv2;
        if ((opv2 = opw.i) == null) {
            opv2 = opv.i;
        }
        this.c = opv2.g;
        opv opv3;
        if ((opv3 = opw.i) == null) {
            opv3 = opv.i;
        }
        this.d = opv3.f;
        opv opv4;
        if ((opv4 = opw.i) == null) {
            opv4 = opv.i;
        }
        this.e = opv4.h;
        this.f = opw.c;
        opd opd;
        if ((opd = opw.e) == null) {
            opd = opd.b;
        }
        this.a = new has[opd.a.size()];
        int n = 0;
        while (true) {
            final has[] a = this.a;
            if (n >= a.length) {
                break;
            }
            a[n] = new has(opd.a.get(n), opw.g);
            ++n;
        }
    }
}
