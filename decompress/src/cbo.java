import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cbo implements cei
{
    private final cek a;
    private final oui b;
    private final oui c;
    
    public cbo(final oui b, final oui c, final cek a) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    private final cei c() {
        if (this.a.a() == jbm.i) {
            return (cei)this.b.get();
        }
        return (cei)this.c.get();
    }
    
    @Override
    public final void a() {
        this.c().a();
    }
    
    @Override
    public final void b(final Bitmap bitmap) {
        this.c().b(bitmap);
    }
}
