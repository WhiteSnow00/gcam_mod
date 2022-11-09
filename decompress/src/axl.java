import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

final class axl implements Runnable
{
    final /* synthetic */ Runnable a;
    
    public axl(final Runnable a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        Process.setThreadPriority(10);
        this.a.run();
    }
}
