// 
// Decompiled by Procyon v0.6.0
// 

final class nah
{
    public final myz a;
    public final myc b;
    public final mxe c;
    public final pml d;
    private final mza e;
    
    public nah(final myz a, final myc b, final mxe c, final pml d, final mza e) {
        a.getClass();
        b.getClass();
        c.getClass();
        e.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public final void a(final int n, final Throwable t) {
        this.e.a(this.a.b(n, t, this.b, this.c));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof nah) {
                final nah nah = (nah)o;
                if (plr.b(this.a, nah.a) && plr.b(this.b, nah.b) && plr.b(this.c, nah.c) && plr.b(this.d, nah.d) && plr.b(this.e, nah.e)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final myz a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final myc b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final mxe c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int hashCode5 = this.d.hashCode();
        final mza e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return (((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode5) * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AttachmentItem(logStarter=");
        sb.append(this.a);
        sb.append(", resource=");
        sb.append(this.b);
        sb.append(", attachment=");
        sb.append(this.c);
        sb.append(", otherAnnotachments=");
        sb.append(this.d);
        sb.append(", f250Logger=");
        sb.append(this.e);
        sb.append(")");
        return sb.toString();
    }
}
