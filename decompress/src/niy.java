import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class niy
{
    public boolean a;
    private final String b;
    private final nix c;
    private nix d;
    
    public niy(final String b) {
        final nix nix = new nix();
        this.c = nix;
        this.d = nix;
        this.a = false;
        b.getClass();
        this.b = b;
    }
    
    private final nix g() {
        final nix nix = new nix();
        this.d.c = nix;
        return this.d = nix;
    }
    
    public final void a(final Object b) {
        this.g().b = b;
    }
    
    public final void b(final String a, final Object b) {
        final nix g = this.g();
        g.b = b;
        g.a = a;
    }
    
    public final void c(final String a, final Object b) {
        final niw niw = new niw();
        this.d.c = niw;
        this.d = niw;
        niw.b = b;
        niw.a = a;
    }
    
    public final void d(final String s, final float n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void e(final String s, final int n) {
        this.c(s, String.valueOf(n));
    }
    
    public final void f(final String s, final long n) {
        this.c(s, String.valueOf(n));
    }
    
    @Override
    public final String toString() {
        final boolean a = this.a;
        final StringBuilder sb = new StringBuilder(32);
        sb.append(this.b);
        sb.append('{');
        nix nix = this.c.c;
        String s = "";
        while (nix != null) {
            final Object b = nix.b;
            String s2 = null;
            Label_0164: {
                if (!(nix instanceof niw) && b == null) {
                    s2 = s;
                    if (a) {
                        break Label_0164;
                    }
                }
                sb.append(s);
                final String a2 = nix.a;
                if (a2 != null) {
                    sb.append(a2);
                    sb.append('=');
                }
                if (b != null && b.getClass().isArray()) {
                    final String deepToString = Arrays.deepToString(new Object[] { b });
                    sb.append(deepToString, 1, deepToString.length() - 1);
                }
                else {
                    sb.append(b);
                }
                s2 = ", ";
            }
            nix = nix.c;
            s = s2;
        }
        sb.append('}');
        return sb.toString();
    }
}
