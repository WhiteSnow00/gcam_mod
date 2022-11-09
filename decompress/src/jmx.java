import android.os.Looper;

// 
// Decompiled by Procyon v0.6.0
// 

final class jmx implements Runnable
{
    final /* synthetic */ jmy a;
    
    public jmx(final jmy a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (Looper.myLooper() == Looper.getMainLooper()) {
            this.a.b.a().b(this);
            return;
        }
        final boolean e = this.a.e();
        this.a.d = 0L;
        if (e) {
            this.a.a();
        }
    }
}
