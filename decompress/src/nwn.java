import java.math.RoundingMode;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nwn extends nwp
{
    private final nwp a;
    private final String b;
    
    public nwn(final nwp a) {
        this.a = a;
        this.b = ":";
        njo.g(true, "Cannot add a separator after every %s chars", 2);
    }
    
    @Override
    public final int a(final byte[] array, final CharSequence charSequence) {
        final StringBuilder sb = new StringBuilder(charSequence.length());
        for (int i = 0; i < charSequence.length(); ++i) {
            final char char1 = charSequence.charAt(i);
            if (this.b.indexOf(char1) < 0) {
                sb.append(char1);
            }
        }
        return this.a.a(array, sb);
    }
    
    @Override
    public final void b(final Appendable appendable, final byte[] array, final int n) {
        final nwp a = this.a;
        appendable.getClass();
        njo.d(true);
        a.b(new nwj(appendable), array, n);
    }
    
    @Override
    public final int c(final int n) {
        return this.a.c(n);
    }
    
    @Override
    public final int d(int d) {
        d = this.a.d(d);
        return d + this.b.length() * och.n(Math.max(0, d - 1), 2, RoundingMode.FLOOR);
    }
    
    @Override
    public final CharSequence e(final CharSequence charSequence) {
        return this.a.e(charSequence);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String b = this.b;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31 + b.length());
        sb.append(value);
        sb.append(".withSeparator(\"");
        sb.append(b);
        sb.append("\", 2)");
        return sb.toString();
    }
}
