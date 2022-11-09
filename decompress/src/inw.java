// 
// Decompiled by Procyon v0.6.0
// 

public final class inw
{
    public final inv a;
    public final ins b;
    public final iod c;
    
    public inw() {
    }
    
    public inw(final inv a, final ins b, final iod c) {
        if (a == null) {
            throw new NullPointerException("Null constraints");
        }
        this.a = a;
        if (b != null) {
            this.b = b;
            this.c = c;
            return;
        }
        throw new NullPointerException("Null boxes");
    }
    
    public static inw a(final inv inv, final ins ins, final iod iod) {
        return new inw(inv, ins, iod);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof inw) {
            final inw inw = (inw)o;
            if (this.a.equals(inw.a) && this.b.equals(inw.b)) {
                final iod c = this.c;
                final iod c2 = inw.c;
                if (c == null) {
                    if (c2 != null) {
                        return false;
                    }
                }
                else if (!c.equals(c2)) {
                    return false;
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.a.hashCode();
        final int hashCode2 = this.b.hashCode();
        final iod c = this.c;
        int hashCode3;
        if (c == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = c.hashCode();
        }
        return ((hashCode ^ 0xF4243) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 57 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("CameraLayoutHolder{constraints=");
        sb.append(value);
        sb.append(", boxes=");
        sb.append(value2);
        sb.append(", viewfinderSpec=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
