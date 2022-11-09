// 
// Decompiled by Procyon v0.6.0
// 

public final class jda
{
    public float a;
    private final float b;
    private float c;
    
    public jda(final int n) {
        this.c = 0.0f;
        this.a = 0.0f;
        this.b = (float)n;
    }
    
    public final void a(final float n) {
        final float c = this.c;
        float b = this.b;
        if (c != b) {
            b = c + 1.0f;
        }
        this.c = b;
        final float n2 = 1.0f / b;
        this.a = this.a * (1.0f - n2) + n * n2;
    }
    
    public final void b() {
        this.c = 0.0f;
        this.a = 0.0f;
    }
}
