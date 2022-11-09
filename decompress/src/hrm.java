// 
// Decompiled by Procyon v0.6.0
// 

public final class hrm
{
    public final noi a;
    public final noi b;
    private final String c;
    
    public hrm() {
    }
    
    public hrm(final String c, final noi a, final noi b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public static hrl a() {
        return new hrl();
    }
    
    static String c(String s) {
        s = String.valueOf(s.replace('.', '_'));
        if (s.length() != 0) {
            s = "pref_social_app_".concat(s);
        }
        else {
            s = new String("pref_social_app_");
        }
        return s;
    }
    
    public final String b() {
        final String c = this.c;
        c.getClass();
        return c(c);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof hrm) {
            final hrm hrm = (hrm)o;
            if (this.c.equals(hrm.c) && this.a.equals(hrm.a) && this.b.equals(hrm.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.c.hashCode() ^ 0xF4243) * 1000003 ^ this.a.hashCode()) * 1000003 ^ this.b.hashCode();
    }
    
    @Override
    public final String toString() {
        final String c = this.c;
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 65 + String.valueOf(value).length() + String.valueOf(value2).length());
        sb.append("SocialApp{packageName=");
        sb.append(c);
        sb.append(", photoActivityNames=");
        sb.append(value);
        sb.append(", videoActivityNames=");
        sb.append(value2);
        sb.append("}");
        return sb.toString();
    }
}
