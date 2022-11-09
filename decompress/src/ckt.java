// 
// Decompiled by Procyon v0.6.0
// 

public final class ckt
{
    public final ckr a;
    private final cxl b;
    
    public ckt(final ckr a, final cxl b) {
        this.a = a;
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
            if (lfu == lfu.a && !this.b.k(cxr.S)) {
                return kmv.h;
            }
            return (kmv)this.a.aQ();
        }
    }
}
