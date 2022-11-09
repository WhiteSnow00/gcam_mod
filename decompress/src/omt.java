// 
// Decompiled by Procyon v0.6.0
// 

final class omt implements omg
{
    public final omj a;
    public final String b;
    public final Object[] c;
    private final int d;
    
    public omt(final omj a, final String b, final Object[] c) {
        this.a = a;
        this.b = b;
        this.c = c;
        final char char1 = b.charAt(0);
        if (char1 < '\ud800') {
            this.d = char1;
            return;
        }
        int n = char1 & '\u1fff';
        int n2 = 13;
        int n3 = 1;
        char char2;
        while (true) {
            char2 = b.charAt(n3);
            if (char2 < '\ud800') {
                break;
            }
            n |= (char2 & '\u1fff') << n2;
            n2 += 13;
            ++n3;
        }
        this.d = (n | char2 << n2);
    }
    
    @Override
    public final omj a() {
        return this.a;
    }
    
    @Override
    public final boolean b() {
        return (this.d & 0x2) == 0x2;
    }
    
    @Override
    public final int c() {
        if ((this.d & 0x1) == 0x1) {
            return 1;
        }
        return 2;
    }
}
