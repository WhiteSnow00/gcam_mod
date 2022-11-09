import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class yb extends Thread
{
    public yb(final Runnable runnable) {
        super(runnable);
        this.setName("CXCP-Camera2-E");
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(-3);
        super.run();
    }
}
