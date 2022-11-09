// 
// Decompiled by Procyon v0.6.0
// 

public final class apm
{
    public int a;
    private final String b;
    
    public apm(final String b) {
        this.a = 0;
        this.b = b;
    }
    
    public final char a() {
        if (this.a < this.b.length()) {
            return this.b.charAt(this.a);
        }
        return '\0';
    }
    
    public final char b(final int n) {
        if (n < this.b.length()) {
            return this.b.charAt(n);
        }
        return '\0';
    }
    
    public final int c(final String s, final int n) {
        char c = this.b(this.a);
        int n2 = 0;
        boolean b = false;
        while (c >= '0' && c <= '9') {
            n2 = n2 * 10 + (c - '0');
            final int a = this.a + 1;
            this.a = a;
            c = this.b(a);
            b = true;
        }
        if (!b) {
            throw new ape(s, 5);
        }
        if (n2 > n) {
            return n;
        }
        if (n2 < 0) {
            return 0;
        }
        return n2;
    }
    
    public final int d() {
        return this.b.length();
    }
    
    public final void e() {
        ++this.a;
    }
    
    public final boolean f() {
        return this.a < this.b.length();
    }
}
