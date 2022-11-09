import android.os.Trace;
import android.os.Message;
import com.google.android.apps.camera.prewarm.ProcessingBoostService;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gwg extends Handler
{
    final /* synthetic */ ProcessingBoostService a;
    
    public gwg(final ProcessingBoostService a) {
        this.a = a;
    }
    
    public final void handleMessage(final Message message) {
        switch (message.what) {
            case 1: {
                final ProcessingBoostService a = this.a;
                if (a.b == null) {
                    Trace.beginSection("PBS#ensureInjection");
                    ((gwh)((egp)a.getApplication()).c(gwh.class)).n(a);
                    Trace.endSection();
                }
                this.a.b.execute(new gwf(this));
                break;
            }
        }
        super.handleMessage(message);
    }
}
