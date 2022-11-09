// 
// Decompiled by Procyon v0.6.0
// 

public final class lut
{
    public final String a;
    public final String b;
    public final int c;
    public final int d;
    
    public lut() {
    }
    
    public lut(final String a, final String b, final int c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static lus a() {
        return new lus();
    }
    
    public static void b(final apf apf, final String s) {
        final aqj aqj = new aqj();
        aqj.x(true);
        apf.d("http://ns.google.com/photos/1.0/container/", s, null, aqj);
    }
    
    public static Object c(final Object o) {
        Object o2 = o;
        if (o == null) {
            o2 = "0";
        }
        return o2;
    }
    
    public static String d(final apf apf, final String s, String d) {
        final String d2 = cxb.d("http://ns.google.com/photos/1.0/container/", "Item");
        d = cxb.d("http://ns.google.com/photos/1.0/container/item/", d);
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + String.valueOf(d2).length() + String.valueOf(d).length());
        sb.append(s);
        sb.append(d2);
        sb.append(d);
        final aql a = apf.a("http://ns.google.com/photos/1.0/container/", sb.toString());
        if (a == null) {
            return null;
        }
        return ((apt)a).a.toString();
    }
    
    public static void e(final Object o, final String s) {
        if (o == null) {
            String concat;
            if (s.length() != 0) {
                concat = "Missing value for ".concat(s);
            }
            else {
                concat = new String("Missing value for ");
            }
            throw new ape(concat, 5);
        }
    }
    
    public static void f(final apf apf, String s, String value, final String s2) {
        s = String.valueOf(s);
        value = String.valueOf(cxb.d("http://ns.google.com/photos/1.0/container/item/", value));
        if (value.length() != 0) {
            s = s.concat(value);
        }
        else {
            s = new String(s);
        }
        apf.c("http://ns.google.com/photos/1.0/container/", s, s2);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof lut) {
            final lut lut = (lut)o;
            if (this.a.equals(lut.a) && this.b.equals(lut.b) && this.c == lut.c && this.d == lut.d) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c) * 1000003 ^ this.d;
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final String b = this.b;
        final int c = this.c;
        final int d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 85 + String.valueOf(b).length());
        sb.append("MicroVideoXmpContainerItem{mime=");
        sb.append(a);
        sb.append(", semantic=");
        sb.append(b);
        sb.append(", length=");
        sb.append(c);
        sb.append(", padding=");
        sb.append(d);
        sb.append("}");
        return sb.toString();
    }
}
