import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class muo
{
    public final String a;
    private final String b;
    private final String c;
    private final Uri d;
    
    public muo(final String a, final String b, final String c, final Uri d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof muo) {
                final muo muo = (muo)o;
                if (plr.b(this.a, muo.a) && plr.b(this.b, muo.b) && plr.b(this.c, muo.c) && plr.b(this.d, muo.d)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final String b = this.b;
        int hashCode2 = 0;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
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
        final Uri d = this.d;
        if (d != null) {
            hashCode2 = d.hashCode();
        }
        return ((hashCode * 31 + hashCode3) * 31 + hashCode4) * 31 + hashCode2;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Account(obfuscatedGaiaId=");
        sb.append(this.a);
        sb.append(", email=");
        sb.append(this.b);
        sb.append(", displayName=");
        sb.append(this.c);
        sb.append(", photoUrl=");
        sb.append(this.d);
        sb.append(")");
        return sb.toString();
    }
}
