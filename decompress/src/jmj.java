import android.content.ComponentName;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmj implements Runnable
{
    final /* synthetic */ ComponentName a;
    final /* synthetic */ jmk b;
    
    public jmj(final jmk b, final ComponentName a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        final jml b = this.b.b;
        final ComponentName a = this.a;
        jlw.a();
        if (b.c != null) {
            b.c = null;
            b.r("Disconnected from device AnalyticsService", a);
            b.c();
        }
    }
}
