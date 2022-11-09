// 
// Decompiled by Procyon v0.6.0
// 

public final class mdi implements mde
{
    private final Object a;
    
    public mdi(final Object a) {
        this.a = a;
    }
    
    @Override
    public final lwk a() {
        return lwj.a;
    }
    
    @Override
    public final Object bF() {
        throw null;
    }
    
    @Override
    public final Object c() {
        return this.a;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 12);
        sb.append("non-owning[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
