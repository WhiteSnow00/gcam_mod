import android.hardware.Camera;
import android.os.Handler;
import android.hardware.Camera$PictureCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arp implements Camera$PictureCallback
{
    final /* synthetic */ Handler a;
    final /* synthetic */ aso b;
    final /* synthetic */ arr c;
    
    public arp(final arr c, final Handler a, final aso b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onPictureTaken(final byte[] array, final Camera camera) {
        if (this.c.a.e.a() != 8) {
            auc.c(asa.a, "picture callback returning when not capturing");
        }
        else {
            this.c.a.e.c(2);
        }
        this.a.post((Runnable)new aro(this, array));
    }
}
