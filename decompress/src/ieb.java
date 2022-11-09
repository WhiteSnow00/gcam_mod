import java.util.TimerTask;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ieb extends TimerTask
{
    final /* synthetic */ iec a;
    
    public ieb(final iec a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final long value = this.a.c.get();
        long n = 0L;
        if (value > 0L) {
            n = System.currentTimeMillis() - this.a.c.get();
        }
        this.a.b(System.currentTimeMillis() - this.a.e.get() - this.a.d.get() - n);
    }
}
