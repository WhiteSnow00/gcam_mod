import android.hardware.Camera$AutoFocusCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arn implements Runnable
{
    final /* synthetic */ Camera$AutoFocusCallback a;
    final /* synthetic */ arr b;
    
    public arn(final arr b, final Camera$AutoFocusCallback a) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void run() {
        if (this.b.g().d()) {
            return;
        }
        this.b.a.e.e(2);
        this.b.a.d.obtainMessage(301, (Object)this.a).sendToTarget();
    }
}
