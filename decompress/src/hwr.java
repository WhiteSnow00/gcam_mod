import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwr
{
    public final llk a;
    public niz b;
    public niz c;
    public niz d;
    public boolean e;
    public ggz f;
    
    public hwr(final llk a) {
        this.b = nii.a;
        this.c = nii.a;
        this.d = nii.a;
        this.e = false;
        this.f = ggz.c;
        this.a = a;
    }
    
    public final void a(final ExifInterface exifInterface) {
        this.c = niz.h(exifInterface);
    }
    
    public final void b(final kra kra) {
        this.b = niz.h(kra);
    }
}
