import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kiw extends Thread
{
    private final int a;
    
    public kiw(final int a, final Runnable runnable, final String name) {
        super(runnable);
        this.a = a;
        this.setName(name);
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(this.a);
        super.run();
    }
}
