// 
// Decompiled by Procyon v0.6.0
// 

public final class mxk
{
    public final oni a;
    public final oni b;
    public final oni c;
    public final mus d;
    public final mvt e;
    public final double f;
    
    public mxk() {
        this(null);
    }
    
    public mxk(final oni a, final oni b, final oni c, final mus d, final mvt e, final double f) {
        a.getClass();
        d.getClass();
        e.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof mxk) {
                final mxk mxk = (mxk)o;
                if (plr.b(this.a, mxk.a) && plr.b(this.b, mxk.b) && plr.b(this.c, mxk.c) && plr.b(this.d, mxk.d) && plr.b(this.e, mxk.e) && Double.compare(this.f, mxk.f) == 0) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final oni a = this.a;
        int hashCode = 0;
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
        final oni b = this.b;
        int ay2;
        if (b != null) {
            ay2 = b.ay;
            if (ay2 == 0) {
                ay2 = omr.a.b(b).b(b);
                b.ay = ay2;
            }
        }
        else {
            ay2 = 0;
        }
        final oni c = this.c;
        int ay3;
        if (c != null) {
            ay3 = c.ay;
            if (ay3 == 0) {
                ay3 = omr.a.b(c).b(c);
                c.ay = ay3;
            }
        }
        else {
            ay3 = 0;
        }
        final mus d = this.d;
        int hashCode2;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final mvt e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        final long doubleToLongBits = Double.doubleToLongBits(this.f);
        return ((((ay * 31 + ay2) * 31 + ay3) * 31 + hashCode2) * 31 + hashCode) * 31 + (int)(doubleToLongBits >>> 32 ^ doubleToLongBits);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("EmbeddedStatus(addedToAirlockEpochTimestamp=");
        sb.append(this.a);
        sb.append(", uploadToF250RequestedEpochTimestamp=");
        sb.append(this.b);
        sb.append(", uploadToF250CompletedEpochTimestamp=");
        sb.append(this.c);
        sb.append(", airlockFileState=");
        sb.append(this.d);
        sb.append(", uploadState=");
        sb.append(this.e);
        sb.append(", uploadProgressPercent=");
        sb.append(this.f);
        sb.append(")");
        return sb.toString();
    }
}
