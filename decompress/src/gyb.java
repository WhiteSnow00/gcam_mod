import com.google.android.libraries.camera.exif.ExifInterface;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gyb
{
    public final lju a;
    public final kra b;
    public final oey c;
    public final huz d;
    public final Rect e;
    public final hio f;
    public final lfu g;
    public final ExifInterface h;
    public final hjc i;
    public final long j;
    public final long k;
    public final bqx l;
    
    public gyb(final lju a, final hio f, final lfu g, final kra b, final oey c, final Rect e, final long j, final long k, final huz d, final hjc i) {
        this.a = a;
        this.f = f;
        this.g = g;
        this.b = b;
        this.c = c;
        this.e = e;
        this.j = j;
        this.k = k;
        this.h = null;
        this.d = d;
        this.i = i;
        this.l = null;
    }
    
    public static gya a(final lju lju) {
        return new gya(lju);
    }
    
    public static gya b(final gaa gaa) {
        final gya gya = new gya(gaa);
        gya.d = gaa.k();
        return gya;
    }
    
    public static gyb c(final lju lju, final gyb gyb) {
        final gya gya = new gya(lju);
        gya.a = gyb.g;
        gya.b = gyb.f;
        gya.c = gyb.b;
        gya.d = gyb.c;
        gya.h = gyb.i;
        gya.f = gyb.e;
        final ExifInterface h = gyb.h;
        gya.e = gyb.d;
        gya.b(gyb.k);
        gya.g = gyb.j;
        return gya.a();
    }
}
