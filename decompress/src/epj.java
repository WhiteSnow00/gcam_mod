import android.content.Intent;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

final class epj implements oen
{
    final /* synthetic */ Uri a;
    final /* synthetic */ epk b;
    
    public epj(final epk b, final Uri a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final Throwable t) {
        epk.a.b().h(t).E(1353).r("Failure while saving JPEG image to %s", this.a);
        this.b.e.m();
    }
}
