import java.util.concurrent.TimeUnit;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

final class mje implements mfl
{
    final /* synthetic */ ofb a;
    final /* synthetic */ mji b;
    
    public mje(final mji b, final ofb a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void c(final Activity activity) {
        final String simpleName = activity.getClass().getSimpleName();
        this.b.a.a(3, simpleName);
        this.b.a();
        this.b.c = this.a.d(new mjd(this, simpleName), 10L, TimeUnit.SECONDS);
    }
}
