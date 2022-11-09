// 
// Decompiled by Procyon v0.6.0
// 

public final class inf
{
    private final niz a;
    private final int b;
    
    public inf() {
    }
    
    public inf(final int b, final niz a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof inf) {
            final inf inf = (inf)o;
            if (this.b == inf.b && this.a.equals(inf.a)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (this.b ^ 0xF4243) * 1000003 ^ this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        String s = null;
        switch (this.b) {
            default: {
                s = "FLAT";
                break;
            }
            case 2: {
                s = "BOOK";
                break;
            }
            case 1: {
                s = "CLOSED";
                break;
            }
        }
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(s.length() + 32 + String.valueOf(value).length());
        sb.append("FoldState{getType=");
        sb.append(s);
        sb.append(", foldBounds=");
        sb.append(value);
        sb.append("}");
        return sb.toString();
    }
}
