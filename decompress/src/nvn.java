// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nvn
{
    public final int a;
    public final nth b;
    
    protected nvn(final nth b, final int a) {
        if (b == null) {
            throw new IllegalArgumentException("format options cannot be null");
        }
        if (a >= 0) {
            this.a = a;
            this.b = b;
            return;
        }
        final StringBuilder sb = new StringBuilder(26);
        sb.append("invalid index: ");
        sb.append(a);
        throw new IllegalArgumentException(sb.toString());
    }
    
    public abstract void a(final nvo p0, final Object p1);
}
