import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mof
{
    final String a;
    public final Uri b;
    public final String c;
    public final String d;
    public final boolean e;
    final boolean f;
    final boolean g;
    public final boolean h;
    final nir i;
    
    public mof(final Uri uri) {
        this(uri, "", "", false, false);
    }
    
    public mof(final Uri b, final String c, final String d, final boolean e, final boolean h) {
        this.a = null;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = false;
        this.g = false;
        this.h = h;
        this.i = null;
    }
    
    public final mof a() {
        final Uri b = this.b;
        if (b != null) {
            return new mof(b, this.c, this.d, this.e, true);
        }
        throw new IllegalStateException("Cannot set enableAutoSubpackage on SharedPrefs-backed flags");
    }
    
    public final mof b() {
        if (this.c.isEmpty()) {
            return new mof(this.b, this.c, this.d, true, this.h);
        }
        throw new IllegalStateException("Cannot set GServices prefix and skip GServices");
    }
    
    @Deprecated
    public final moh c(final String s, final boolean b) {
        return moh.b(this, s, b, false);
    }
    
    public final moh d(final String s, final long n) {
        return moh.c(this, s, n, true);
    }
    
    public final moh e(final String s, final String s2) {
        return moh.d(this, s, s2, true);
    }
    
    public final moh f(final String s, final boolean b) {
        return moh.b(this, s, b, true);
    }
}
