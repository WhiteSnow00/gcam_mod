import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

final class mkq implements Comparable
{
    final psh a;
    final File b;
    final mkq c;
    final int d;
    final boolean e;
    final String f;
    long g;
    
    public mkq(final mkq c, final boolean e, String string) {
        this.g = 0L;
        this.a = c.a;
        this.b = c.b;
        this.c = c;
        this.d = c.d + 1;
        this.e = e;
        if (c.d != 0) {
            final String f = c.f;
            final StringBuilder sb = new StringBuilder(String.valueOf(f).length() + 1 + String.valueOf(string).length());
            sb.append(f);
            sb.append('/');
            sb.append(string);
            string = sb.toString();
        }
        this.f = string;
    }
    
    public mkq(final psh a, final File b) {
        this.g = 0L;
        this.a = a;
        this.b = b;
        this.c = null;
        this.d = 0;
        this.e = true;
        this.f = "";
    }
}
