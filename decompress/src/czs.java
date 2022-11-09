import android.widget.ImageView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class czs
{
    public final ImageView a;
    public final ImageView b;
    public final ImageView c;
    
    public czs() {
    }
    
    public czs(final ImageView a, final ImageView b, final ImageView c) {
        if (a == null) {
            throw new NullPointerException("Null contentView");
        }
        this.a = a;
        if (b == null) {
            throw new NullPointerException("Null playButton");
        }
        this.b = b;
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null photoSphereBadge");
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof czs) {
            final czs czs = (czs)o;
            if (this.a.equals(czs.a) && this.b.equals(czs.b) && this.c.equals(czs.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.c.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 63 + String.valueOf(value2).length() + String.valueOf(value3).length());
        sb.append("ContentViewHolder{contentView=");
        sb.append(value);
        sb.append(", playButton=");
        sb.append(value2);
        sb.append(", photoSphereBadge=");
        sb.append(value3);
        sb.append("}");
        return sb.toString();
    }
}
