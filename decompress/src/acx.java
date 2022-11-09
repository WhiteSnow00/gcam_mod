// 
// Decompiled by Procyon v0.6.0
// 

public final class acx extends ade
{
    private final String b;
    
    public acx(final ei ei, final String b) {
        super(ei);
        this.b = b;
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Attempting to reuse fragment ");
        sb.append(this.a);
        sb.append(" with previous ID ");
        sb.append(this.b);
        return sb.toString();
    }
}
