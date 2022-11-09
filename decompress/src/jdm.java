// 
// Decompiled by Procyon v0.6.0
// 

public final class jdm
{
    public float a;
    public float b;
    public float c;
    
    static {
        new jdm(0.0f, 0.0f, 0.0f);
    }
    
    public jdm() {
    }
    
    public jdm(final float n, final float n2, final float n3) {
        this.a(n, n2, n3);
    }
    
    public final void a(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final StringBuilder sb = new StringBuilder(49);
        sb.append(a);
        sb.append(", ");
        sb.append(b);
        sb.append(", ");
        sb.append(c);
        return sb.toString();
    }
}
