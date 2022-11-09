// 
// Decompiled by Procyon v0.6.0
// 

public final class mxe
{
    public final long a;
    public final muu b;
    public final String c;
    public final long d;
    public final String e;
    public final String f;
    public final String g;
    public final mxk h;
    public final long i;
    public final mva j;
    
    public mxe() {
        final muu a = muu.a;
        throw null;
    }
    
    public mxe(final long a, final muu b, final mva j, final String c, final long d, final String e, final String f, final String g, final mxk h, final long i) {
        b.getClass();
        h.getClass();
        this.a = a;
        this.b = b;
        this.j = j;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof mxe) {
                final mxe mxe = (mxe)o;
                if (this.a == mxe.a && plr.b(this.b, mxe.b) && plr.b(this.j, mxe.j) && plr.b(this.c, mxe.c) && this.d == mxe.d && plr.b(this.e, mxe.e) && plr.b(this.f, mxe.f) && plr.b(this.g, mxe.g) && plr.b(this.h, mxe.h) && this.i == mxe.i) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int g = neu.g(this.a);
        final muu b = this.b;
        int hashCode = 0;
        int hashCode2;
        if (b != null) {
            hashCode2 = b.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final mva j = this.j;
        int hashCode3;
        if (j != null) {
            hashCode3 = j.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final String c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final int g2 = neu.g(this.d);
        final String e = this.e;
        int hashCode5;
        if (e != null) {
            hashCode5 = e.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final String f = this.f;
        int hashCode6;
        if (f != null) {
            hashCode6 = f.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final String g3 = this.g;
        int hashCode7;
        if (g3 != null) {
            hashCode7 = g3.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final mxk h = this.h;
        if (h != null) {
            hashCode = h.hashCode();
        }
        return ((((((((g * 31 + hashCode2) * 31 + hashCode3) * 31 + hashCode4) * 31 + g2) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + hashCode) * 31 + neu.g(this.i);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("AnnotachmentEntity(resourceOnDeviceId=");
        sb.append(this.a);
        sb.append(", annotachmentType=");
        sb.append(this.b);
        sb.append(", id=");
        sb.append(this.j);
        sb.append(", contentType=");
        sb.append(this.c);
        sb.append(", onDeviceSize=");
        sb.append(this.d);
        sb.append(", uploadTransferHandle=");
        sb.append(this.e);
        sb.append(", blobstoreId=");
        sb.append(this.f);
        sb.append(", contentHash=");
        sb.append(this.g);
        sb.append(", status=");
        sb.append(this.h);
        sb.append(", onDeviceId=");
        sb.append(this.i);
        sb.append(")");
        return sb.toString();
    }
}
