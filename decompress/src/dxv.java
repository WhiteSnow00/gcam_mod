import com.google.android.libraries.camera.exif.ExifInterface;
import java.util.concurrent.Executor;
import java.io.IOException;
import java.io.InputStream;
import java.io.ByteArrayInputStream;
import java.io.OutputStream;
import java.io.ByteArrayOutputStream;
import java.util.UUID;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dxv implements oen
{
    final /* synthetic */ int a;
    final /* synthetic */ dxx b;
    final /* synthetic */ gwa c;
    final /* synthetic */ hhy d;
    final /* synthetic */ UUID e;
    final /* synthetic */ niz f;
    final /* synthetic */ ofn g;
    final /* synthetic */ dxy h;
    
    public dxv(final dxy h, final int a, final dxx b, final gwa c, final hhy d, final UUID e, final niz f, final ofn g) {
        this.h = h;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
    }
    
    @Override
    public final void a(final Throwable t) {
        a.l(dxy.a.b(), "Error encoding jpeg image", '\u03d6');
        this.g.o(null);
    }
}
