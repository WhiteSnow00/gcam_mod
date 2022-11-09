import android.hardware.Camera$ShutterCallback;
import android.hardware.Camera$PictureCallback;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

final class arq implements Runnable
{
    final /* synthetic */ Handler a;
    final /* synthetic */ aso b;
    final /* synthetic */ Camera$PictureCallback c;
    final /* synthetic */ arr d;
    final /* synthetic */ esn e;
    
    public arq(final arr d, final Handler a, final esn e, final aso b, final Camera$PictureCallback c) {
        this.d = d;
        this.a = a;
        this.e = e;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        if (this.d.g().d()) {
            return;
        }
        this.d.a.e.e(6);
        final art d = this.d.a.d;
        final Handler a = this.a;
        final esn e = this.e;
        final int b = arz.b;
        Object o;
        if (a != null) {
            if (e == null) {
                o = null;
            }
            else {
                o = new arz(a, e);
            }
        }
        else {
            o = null;
        }
        d.obtainMessage(601, (Object)new ars((Camera$ShutterCallback)o, (Camera$PictureCallback)arv.a(this.a, this.b), (Camera$PictureCallback)arv.a(this.a, null), this.c)).sendToTarget();
    }
}
