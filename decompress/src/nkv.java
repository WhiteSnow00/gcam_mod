import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class nkv implements Entry
{
    public nkv() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof Entry) {
            final Entry entry = (Entry)o;
            if (nqb.E(this.getKey(), entry.getKey()) && nqb.E(this.getValue(), entry.getValue())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public abstract Object getKey();
    
    @Override
    public abstract Object getValue();
    
    @Override
    public final int hashCode() {
        final Object key = this.getKey();
        final Object value = this.getValue();
        int hashCode = 0;
        int hashCode2;
        if (key == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = key.hashCode();
        }
        if (value != null) {
            hashCode = value.hashCode();
        }
        return hashCode2 ^ hashCode;
    }
    
    @Override
    public Object setValue(final Object o) {
        throw new UnsupportedOperationException();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.getKey());
        final String value2 = String.valueOf(this.getValue());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 1 + String.valueOf(value2).length());
        sb.append(value);
        sb.append("=");
        sb.append(value2);
        return sb.toString();
    }
}
