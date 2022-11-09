import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

final class jlv extends Thread
{
    public jlv(final Runnable runnable, final String s) {
        super(runnable, s);
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        super.run();
    }
}
