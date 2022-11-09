import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amz
{
    public String a;
    public aiq b;
    public int c;
    public List d;
    public List e;
    public int f;
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final boolean b = o instanceof amz;
        boolean equals = false;
        if (!b) {
            return false;
        }
        final amz amz = (amz)o;
        if (this.c != amz.c) {
            return false;
        }
        final String a = this.a;
        Label_0073: {
            if (a != null) {
                if (a.equals(amz.a)) {
                    break Label_0073;
                }
            }
            else if (amz.a == null) {
                break Label_0073;
            }
            return false;
        }
        if (this.f != amz.f) {
            return false;
        }
        final aiq b2 = this.b;
        Label_0121: {
            if (b2 != null) {
                if (b2.equals(amz.b)) {
                    break Label_0121;
                }
            }
            else if (amz.b == null) {
                break Label_0121;
            }
            return false;
        }
        final List d = this.d;
        Label_0158: {
            if (d != null) {
                if (d.equals(amz.d)) {
                    break Label_0158;
                }
            }
            else if (amz.d == null) {
                break Label_0158;
            }
            return false;
        }
        final List e = this.e;
        if (e != null) {
            equals = e.equals(amz.e);
        }
        else if (amz.e == null) {
            return true;
        }
        return equals;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        int f = this.f;
        if (f != 0) {
            cwz.g(f);
        }
        else {
            f = 0;
        }
        final aiq b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final int c = this.c;
        final List d = this.d;
        int hashCode4;
        if (d != null) {
            hashCode4 = d.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final List e = this.e;
        if (e != null) {
            hashCode = e.hashCode();
        }
        return ((((hashCode2 * 31 + f) * 31 + hashCode3) * 31 + c) * 31 + hashCode4) * 31 + hashCode;
    }
}
