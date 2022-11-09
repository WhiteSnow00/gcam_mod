import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

final class clg implements oen
{
    final /* synthetic */ ofn a;
    final /* synthetic */ clh b;
    
    public clg(final clh b, final ofn a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        a.m(clh.a.b(), "Failed to take snapshot.", '\u0224', t);
        this.a.a(t);
    }
}
