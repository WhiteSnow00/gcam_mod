import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yd extends Thread
{
    final /* synthetic */ pnd a;
    
    public yd(final pnd a, final Runnable runnable) {
        this.a = a;
        super(runnable);
        this.setName(plr.a("CXCP-", plr.n(String.valueOf(a.b()))));
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(-3);
        super.run();
    }
}
