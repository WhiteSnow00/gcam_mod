import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mvb
{
    public final oni a;
    public final Collection b;
    public final Collection c;
    public final Throwable d;
    public final int e;
    public final mvc f;
    
    public mvb(final mvc f, final oni a, final Collection b, final Collection c, final int e, final Throwable d, final byte[] array) {
        a.getClass();
        b.getClass();
        c.getClass();
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.e = e;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof mvb) {
                final mvb mvb = (mvb)o;
                if (plr.b(this.f, mvb.f) && plr.b(this.a, mvb.a) && plr.b(this.b, mvb.b) && plr.b(this.c, mvb.c) && this.e == mvb.e && plr.b(this.d, mvb.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.f.hashCode();
        final oni a = this.a;
        int hashCode2 = 0;
        int ay;
        if (a != null) {
            ay = a.ay;
            if (ay == 0) {
                ay = omr.a.b(a).b(a);
                a.ay = ay;
            }
        }
        else {
            ay = 0;
        }
        final Collection b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final Collection c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int e = this.e;
        final Throwable d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((((hashCode * 31 + ay) * 31 + hashCode3) * 31 + hashCode4) * 31 + e) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("F250LogEvent(f250LogAction=");
        sb.append(this.f);
        sb.append(", logEpochTimestamp=");
        sb.append(this.a);
        sb.append(", resources=");
        sb.append(this.b);
        sb.append(", annotachments=");
        sb.append(this.c);
        sb.append(", f250LogReason=");
        sb.append((Object)mvc.a(this.e));
        sb.append(", errorThrowable=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
