// 
// Decompiled by Procyon v0.6.0
// 

public final class csd
{
    public final fxu a;
    
    public csd() {
    }
    
    public csd(final fxu a) {
        this.a = a;
    }
    
    public final lfu a() {
        return this.a.l();
    }
    
    public final boolean b() {
        return this.a() == lfu.a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o == this || (o instanceof csd && this.a.equals(((csd)o).a));
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() ^ 0xF4243;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 36);
        sb.append("CameraFacingChange{characteristics=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
