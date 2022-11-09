import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class irb
{
    public final jbm a;
    public View b;
    public boolean c;
    
    public irb(final jbm a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        String s;
        if (!this.c) {
            s = "";
        }
        else {
            s = "\u2299";
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + s.length());
        sb.append(value);
        sb.append(s);
        return sb.toString();
    }
}
