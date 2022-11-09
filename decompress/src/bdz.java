import android.graphics.drawable.Drawable;
import android.content.Context;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bdz implements awk
{
    private final awk b;
    private final boolean c;
    
    public bdz(final awk b, final boolean c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
    
    @Override
    public final aza b(final Context context, final aza aza, final int n, final int n2) {
        final azk a = auf.b(context).a;
        final Drawable drawable = (Drawable)aza.c();
        final aza a2 = bdy.a(a, drawable, n, n2);
        if (a2 == null) {
            if (!this.c) {
                return aza;
            }
            final String value = String.valueOf(drawable);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
            sb.append("Unable to convert ");
            sb.append(value);
            sb.append(" to a Bitmap");
            throw new IllegalArgumentException(sb.toString());
        }
        else {
            final aza b = this.b.b(context, a2, n, n2);
            if (b.equals(a2)) {
                b.e();
                return aza;
            }
            return bei.f(context.getResources(), b);
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bdz && this.b.equals(((bdz)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}
