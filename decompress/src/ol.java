// 
// Decompiled by Procyon v0.6.0
// 

public final class ol
{
    public int a;
    public int b;
    public Object c;
    public int d;
    
    public ol(final int a, final int b, final int d) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.c = null;
    }
    
    @Override
    public final boolean equals(Object c) {
        if (this == c) {
            return true;
        }
        if (!(c instanceof ol)) {
            return false;
        }
        final ol ol = (ol)c;
        if (this.a != ol.a) {
            return false;
        }
        if (this.d != ol.d) {
            return false;
        }
        if (this.b != ol.b) {
            return false;
        }
        c = ol.c;
        return true;
    }
    
    @Override
    public final int hashCode() {
        return (this.a * 31 + this.b) * 31 + this.d;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        sb.append("[");
        String s = null;
        switch (this.a) {
            default: {
                s = "??";
                break;
            }
            case 4: {
                s = "up";
                break;
            }
            case 2: {
                s = "rm";
                break;
            }
            case 1: {
                s = "add";
                break;
            }
        }
        sb.append(s);
        sb.append(",s:");
        sb.append(this.b);
        sb.append("c:");
        sb.append(this.d);
        sb.append(",p:");
        sb.append((Object)null);
        sb.append("]");
        return sb.toString();
    }
}
