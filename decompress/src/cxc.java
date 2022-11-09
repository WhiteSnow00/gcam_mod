// 
// Decompiled by Procyon v0.6.0
// 

public final class cxc
{
    public final float a;
    public final float b;
    public final float c;
    
    cxc() {
        this(0.0f, 0.0f, 0.0f);
    }
    
    public cxc(final float a, final float b, final float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String toString() {
        final float a = this.a;
        final float b = this.b;
        final float c = this.c;
        final StringBuilder sb = new StringBuilder(65);
        sb.append("CutoutInfo(x=");
        sb.append(a);
        sb.append(",y=");
        sb.append(b);
        sb.append(",r=");
        sb.append(c);
        sb.append(")");
        return sb.toString();
    }
}
