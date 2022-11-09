import androidx.work.impl.foreground.SystemForegroundService;
import android.app.Notification;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amd implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ Notification b;
    final /* synthetic */ int c;
    final /* synthetic */ SystemForegroundService d;
    
    public amd(final SystemForegroundService d, final int a, final Notification b, final int c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final void run() {
        this.d.startForeground(this.a, this.b, this.c);
    }
}
