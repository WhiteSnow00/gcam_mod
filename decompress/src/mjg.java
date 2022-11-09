import java.util.concurrent.TimeUnit;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class mjg implements mfm
{
    final /* synthetic */ ofb a;
    final /* synthetic */ mji b;
    
    public mjg(final mji b, final ofb a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void b(final Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(4, simpleName);
        this.b.a();
        this.b.b = this.a.d(new mjf(this, simpleName), 10L, TimeUnit.SECONDS);
    }
}
