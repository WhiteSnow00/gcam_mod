import android.hardware.Camera;
import android.os.Handler;
import android.hardware.Camera$AutoFocusCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class arm implements Camera$AutoFocusCallback
{
    final /* synthetic */ Handler a;
    final /* synthetic */ asg b;
    final /* synthetic */ arr c;
    
    public arm(final arr c, final Handler a, final asg b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onAutoFocus(final boolean b, final Camera camera) {
        if (this.c.a.e.a() != 16) {
            auc.c(asa.a, "onAutoFocus callback returning when not focusing");
        }
        else {
            this.c.a.e.c(2);
        }
        this.a.post((Runnable)new arl(this, b));
    }
}
