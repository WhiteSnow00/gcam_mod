import androidx.work.impl.foreground.SystemForegroundService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class amf implements Runnable
{
    final /* synthetic */ int a;
    final /* synthetic */ SystemForegroundService b;
    
    public amf(final SystemForegroundService b, final int a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        this.b.b.cancel(this.a);
    }
}
