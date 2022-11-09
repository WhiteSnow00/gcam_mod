import android.hardware.Camera$PictureCallback;
import android.hardware.Camera$ShutterCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class ars
{
    public final Camera$ShutterCallback a;
    public final Camera$PictureCallback b;
    public final Camera$PictureCallback c;
    public final Camera$PictureCallback d;
    
    public ars(final Camera$ShutterCallback a, final Camera$PictureCallback b, final Camera$PictureCallback c, final Camera$PictureCallback d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
}
