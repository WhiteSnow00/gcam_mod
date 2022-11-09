// 
// Decompiled by Procyon v0.6.0
// 

final class fqb
{
    final had a;
    float b;
    float c;
    
    public fqb(final had a) {
        this.a = a;
        final float b = a.b;
        final float f = a.f;
        final float n = -1000.0f;
        float n2 = 0.0f;
        Label_0063: {
            if (f > 0.0f) {
                n2 = n;
                if (a.n) {
                    break Label_0063;
                }
            }
            if (f < 1.0f && a.o) {
                n2 = n;
            }
            else {
                n2 = 0.0f;
            }
        }
        final float n3 = b + n2;
        this.b = n3;
        this.c = n3;
    }
}
