// 
// Decompiled by Procyon v0.6.0
// 

public final class ckn
{
    public final hkc a;
    public final cxl b;
    private final kmw c;
    
    public ckn(final hkc a, final kmw c, final cxl b) {
        this.a = a;
        this.c = c;
        this.b = b;
    }
    
    public final kmv a(final lfu lfu) {
        cxo cxo;
        if (lfu == lfu.a) {
            cxo = cwv.f;
        }
        else {
            cxo = cwv.g;
        }
        final niz a = this.b.a(cxo);
        if (a.g()) {
            switch ((int)a.c()) {
                default: {
                    final String value = String.valueOf(a.c());
                    final String a2 = cxo.a;
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 35 + String.valueOf(a2).length());
                    sb.append("Value ");
                    sb.append(value);
                    sb.append(" for ADB flag ");
                    sb.append(a2);
                    sb.append(" not supported.");
                    throw new IllegalArgumentException(sb.toString());
                }
                case 2160: {
                    return kmv.i;
                }
                case 1080: {
                    return kmv.h;
                }
                case 720: {
                    return kmv.g;
                }
                case 480: {
                    return kmv.f;
                }
                case 288: {
                    return kmv.d;
                }
                case 240: {
                    return kmv.c;
                }
                case 144: {
                    return kmv.b;
                }
            }
        }
        else {
            if (lfu == lfu.a) {
                return kmv.h;
            }
            kmv kmv;
            if (this.a.c(hjq.s)) {
                kmv = kmv.i;
            }
            else {
                kmv = kmv.h;
            }
            return kmv;
        }
    }
    
    public final boolean b() {
        final cxl b = this.b;
        final cxo a = cwv.a;
        b.b();
        final boolean booleanValue = (boolean)this.a.c(hjq.r);
        boolean b2 = false;
        if (booleanValue && this.b.k(cwv.o)) {
            if (!this.c.a()) {
                return false;
            }
            b2 = true;
        }
        return b2;
    }
    
    public final boolean c() {
        return (boolean)this.a.c(hjq.q);
    }
    
    public final boolean d() {
        return this.b.j(cwv.r);
    }
}
