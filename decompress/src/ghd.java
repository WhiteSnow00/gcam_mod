// 
// Decompiled by Procyon v0.6.0
// 

public final class ghd
{
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final int e;
    public final int f;
    
    public ghd(final boolean b, final boolean b2, final int e, final int f, final boolean b3, final boolean d) {
        final boolean b4 = false;
        boolean c = b3;
        if (!b) {
            c = b3;
            if (!b2) {
                c = false;
            }
        }
        boolean a = false;
        Label_0039: {
            if (!b) {
                a = b4;
                if (!b2) {
                    break Label_0039;
                }
            }
            a = true;
        }
        this.a = a;
        this.b = b2;
        this.e = e;
        this.f = f;
        this.c = c;
        this.d = d;
    }
}
