import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ame implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ Notification b;
    final /* synthetic */ SystemForegroundService c;
    
    public ame(final SystemForegroundService c, final int a, final Notification b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        this.c.b.notify(this.a, this.b);
    }
}
