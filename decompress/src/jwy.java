import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

final class jwy extends Thread
{
    public jwy(final ThreadGroup threadGroup) {
        super(threadGroup, "GmsDynamite");
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(19);
        monitorenter(this);
        try {
            try {
                while (true) {
                    this.wait();
                }
            }
            finally {
                monitorexit(this);
                while (true) {}
            }
        }
        catch (final InterruptedException ex) {}
    }
}
