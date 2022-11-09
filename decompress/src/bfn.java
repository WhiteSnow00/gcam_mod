import android.graphics.Bitmap;
import android.content.Context;
import java.security.MessageDigest;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bfn implements awk
{
    private final awk b;
    
    public bfn(final awk b) {
        bit.a(b);
        this.b = b;
    }
    
    @Override
    public final void a(final MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
    
    @Override
    public final aza b(final Context context, final aza aza, final int n, final int n2) {
        final bfk bfk = (bfk)aza.c();
        final bdf bdf = new bdf(bfk.a(), auf.b(context).a);
        final aza b = this.b.b(context, bdf, n, n2);
        if (!bdf.equals(b)) {
            bdf.e();
        }
        bfk.a.a.e(this.b, (Bitmap)b.c());
        return aza;
    }
    
    @Override
    public final boolean equals(final Object o) {
        return o instanceof bfn && this.b.equals(((bfn)o).b);
    }
    
    @Override
    public final int hashCode() {
        return this.b.hashCode();
    }
}
