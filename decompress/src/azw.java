import android.graphics.Bitmap$Config;

// 
// Decompiled by Procyon v0.6.0
// 

final class azw implements azu
{
    int a;
    public Bitmap$Config b;
    private final azx c;
    
    public azw(final azx c) {
        this.c = c;
    }
    
    @Override
    public final void a() {
        this.c.c(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof azw) {
            final azw azw = (azw)o;
            if (this.a == azw.a && biv.l(this.b, azw.b)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int a = this.a;
        final Bitmap$Config b = this.b;
        int hashCode;
        if (b != null) {
            hashCode = b.hashCode();
        }
        else {
            hashCode = 0;
        }
        return a * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        return azy.a(this.a, this.b);
    }
}
