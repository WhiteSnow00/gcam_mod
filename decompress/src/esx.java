// 
// Decompiled by Procyon v0.6.0
// 

public final class esx
{
    public float a;
    public double b;
    public boolean c;
    
    public esx() {
        this.a = 0.0f;
        this.b = -1.0;
        this.c = false;
    }
    
    public final void a() {
        final double b = this.b;
        boolean b2 = true;
        float n = 0.16000001f;
        if (b > 0.0) {
            if (b > 0.025) {
                n = 0.0025000002f;
            }
            else if (b < 0.01) {
                if (!this.c) {
                    n = 1.0f;
                }
                else {
                    n = 0.010000001f;
                }
            }
        }
        if (this.a <= n) {
            b2 = false;
        }
        esh.o(b2);
    }
}
