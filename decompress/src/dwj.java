import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

final class dwj implements oen
{
    final /* synthetic */ gyb a;
    final /* synthetic */ ExifInterface b;
    final /* synthetic */ String c;
    final /* synthetic */ gen d;
    final /* synthetic */ dwk e;
    
    public dwj(final dwk e, final gyb a, final ExifInterface b, final String c, final gen d) {
        this.e = e;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    @Override
    public final void a(final Throwable t) {
        this.a.a.close();
        this.d.c.f();
    }
}
