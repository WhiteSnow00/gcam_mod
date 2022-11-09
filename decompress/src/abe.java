import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

final class abe extends Thread
{
    private final int a;
    
    public abe(final Runnable runnable) {
        super(runnable, "fonts-androidx");
        this.a = 10;
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
