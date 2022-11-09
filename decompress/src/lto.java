// 
// Decompiled by Procyon v0.6.0
// 

public final class lto
{
    public final boolean a;
    public final boolean b;
    public final int c;
    public final int d;
    
    public lto() {
    }
    
    public lto(final int c, final boolean a, final boolean b, final int d) {
        this.c = c;
        this.a = a;
        this.b = b;
        this.d = d;
    }
    
    public static ltn a() {
        final ltn ltn = new ltn();
        ltn.c = 2;
        final Boolean value = false;
        ltn.a = value;
        ltn.b = value;
        ltn.d = 1;
        return ltn;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof lto)) {
            return false;
        }
        final lto lto = (lto)o;
        final int c = this.c;
        final int c2 = lto.c;
        if (c != 0) {
            if (c == c2 && this.a == lto.a && this.b == lto.b) {
                final int d = this.d;
                final int d2 = lto.d;
                if (d == 0) {
                    throw null;
                }
                if (d2 == 1) {
                    return true;
                }
            }
            return false;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int c = this.c;
        if (c == 0) {
            throw null;
        }
        final boolean a = this.a;
        int n = 1237;
        int n2;
        if (!a) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        if (this.b) {
            n = 1231;
        }
        if (this.d != 0) {
            return (((c ^ 0xF4243) * 1000003 ^ n2) * 1000003 ^ n) * 1000003 ^ 0x1;
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        final int c = this.c;
        String s = "null";
        String s2 = null;
        switch (c) {
            default: {
                s2 = "null";
                break;
            }
            case 2: {
                s2 = "INSERT_SHORT_FRAME";
                break;
            }
            case 1: {
                s2 = "DUPLICATE_PREV_DURATION";
                break;
            }
        }
        final boolean a = this.a;
        final boolean b = this.b;
        switch (this.d) {
            case 1: {
                s = "MP4";
                break;
            }
        }
        final StringBuilder sb = new StringBuilder(s2.length() + 111 + s.length());
        sb.append("CameraMp4MuxerOptions{lastFrameDurationBehavior=");
        sb.append(s2);
        sb.append(", editsEnabled=");
        sb.append(a);
        sb.append(", dynamicFtypEnabled=");
        sb.append(b);
        sb.append(", mainFileBrand=");
        sb.append(s);
        sb.append("}");
        return sb.toString();
    }
}
