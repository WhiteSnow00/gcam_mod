// 
// Decompiled by Procyon v0.6.0
// 

final class ayu implements Appendable
{
    private final Appendable a;
    private boolean b;
    
    public ayu(final Appendable a) {
        this.b = true;
        this.a = a;
    }
    
    private static final CharSequence a(final CharSequence charSequence) {
        CharSequence charSequence2 = charSequence;
        if (charSequence == null) {
            charSequence2 = "";
        }
        return charSequence2;
    }
    
    @Override
    public final Appendable append(final char c) {
        final boolean b = this.b;
        boolean b2 = false;
        if (b) {
            this.b = false;
            this.a.append("  ");
        }
        if (c == '\n') {
            b2 = true;
        }
        this.b = b2;
        this.a.append(c);
        return this;
    }
    
    @Override
    public final Appendable append(CharSequence a) {
        a = a(a);
        this.append(a, 0, a.length());
        return this;
    }
    
    @Override
    public final Appendable append(CharSequence a, final int n, final int n2) {
        a = a(a);
        final boolean b = this.b;
        boolean b2 = false;
        if (b) {
            this.b = false;
            this.a.append("  ");
        }
        if (a.length() > 0 && a.charAt(n2 - 1) == '\n') {
            b2 = true;
        }
        this.b = b2;
        this.a.append(a, n, n2);
        return this;
    }
}
