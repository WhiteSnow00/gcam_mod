// 
// Decompiled by Procyon v0.6.0
// 

public final class bbo
{
    public final String a;
    
    public bbo(final String a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bbo && this.a.equals(((bbo)o).a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 29);
        sb.append("StringHeaderFactory{value='");
        sb.append(a);
        sb.append("'}");
        return sb.toString();
    }
}
