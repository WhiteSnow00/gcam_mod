// 
// Decompiled by Procyon v0.6.0
// 

public final class mfa
{
    public static final mfa a;
    public final mfd[] b;
    public final int[] c;
    
    static {
        a = new mfa(new mfd[0]);
    }
    
    public mfa(final mfd[] b) {
        this.b = b;
        this.c = new int[b.length];
        for (int i = 0; i < b.length; ++i) {
            final int[] c = this.c;
            final int b2 = b[i].b;
            c[i] = 0;
        }
    }
}
