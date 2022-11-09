import android.app.Dialog;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jss
{
    final /* synthetic */ Dialog a;
    final /* synthetic */ jrv b;
    
    public jss() {
    }
    
    public jss(final jrv b, final Dialog a) {
        this.b = b;
        this.a = a;
    }
    
    public final void a() {
        this.b.a.b();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
