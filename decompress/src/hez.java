// 
// Decompiled by Procyon v0.6.0
// 

public final class hez
{
    public final float a;
    public final float b;
    public final float c;
    
    public hez(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final niy c = nfa.c(this);
        c.d("azimuth", this.a);
        c.d("pitch", this.b);
        c.d("roll", this.c);
        return c.toString();
    }
}
