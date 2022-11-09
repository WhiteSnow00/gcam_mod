// 
// Decompiled by Procyon v0.6.0
// 

public final class jri extends UnsupportedOperationException
{
    private final jpu a;
    
    public jri(final jpu a) {
        this.a = a;
    }
    
    @Override
    public final String getMessage() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 8);
        sb.append("Missing ");
        sb.append(value);
        return sb.toString();
    }
}
