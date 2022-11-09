// 
// Decompiled by Procyon v0.6.0
// 

public final class osg
{
    String a;
    String b;
    String c;
    String d;
    Float e;
    Float f;
    Float g;
    
    public osg(final String s, final String s2, final String s3, final String s4, final float n, final float n2) {
        this(s, s2, s3, s4, n, n2, null);
    }
    
    public osg(final String a, final String b, final String c, final String d, final Float e, final Float f, final Float g) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    final boolean a(String s, final String s2, final String s3, final String s4) {
        final String a = this.a;
        boolean b = true;
        if (a == null || a.equals(s)) {
            s = this.b;
            if (s == null || s.equals(s2)) {
                s = this.c;
                if (s == null || s.equals(s3)) {
                    s = this.d;
                    if (s == null) {
                        return b;
                    }
                    if (s.equals(s4)) {
                        return true;
                    }
                }
            }
        }
        b = false;
        return b;
    }
}
