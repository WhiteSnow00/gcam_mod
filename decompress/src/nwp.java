import java.io.IOException;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nwp
{
    public static final nwp e;
    
    static {
        final Character value = '=';
        final nwk nwk = new nwk("base64()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789+/".toCharArray());
        new nwo(nwk, value);
        final int length = nwk.b.length;
        final boolean b = true;
        njo.d(length == 64);
        final nwk nwk2 = new nwk("base64Url()", "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789-_".toCharArray());
        new nwo(nwk2, value);
        njo.d(nwk2.b.length == 64 && b);
        new nwo("base32()", "ABCDEFGHIJKLMNOPQRSTUVWXYZ234567", value);
        new nwo("base32Hex()", "0123456789ABCDEFGHIJKLMNOPQRSTUV", value);
        e = new nwl(new nwk("base16()", "0123456789ABCDEF".toCharArray()));
    }
    
    public abstract int a(final byte[] p0, final CharSequence p1);
    
    public abstract void b(final Appendable p0, final byte[] p1, final int p2);
    
    public abstract int c(final int p0);
    
    public abstract int d(final int p0);
    
    public CharSequence e(final CharSequence charSequence) {
        throw null;
    }
    
    public final String f(final byte[] array) {
        final int length = array.length;
        njo.n(0, length, length);
        final StringBuilder sb = new StringBuilder(this.d(length));
        try {
            this.b(sb, array, length);
            return sb.toString();
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public final byte[] g(final CharSequence charSequence) {
        try {
            final CharSequence e = this.e(charSequence);
            final int c = this.c(e.length());
            byte[] array = new byte[c];
            final int a = this.a(array, e);
            if (a != c) {
                final byte[] array2 = new byte[a];
                System.arraycopy(array, 0, array2, 0, a);
                array = array2;
            }
            return array;
        }
        catch (final nwm nwm) {
            throw new IllegalArgumentException(nwm);
        }
    }
}
