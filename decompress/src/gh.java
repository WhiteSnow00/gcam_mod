import android.os.Bundle;
import android.view.KeyEvent;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public class gh extends Activity implements k, hy
{
    private final i a;
    
    public gh() {
        new zb();
        this.a = new i(this);
    }
    
    public i aD() {
        return this.a;
    }
    
    public boolean dispatchKeyEvent(final KeyEvent keyEvent) {
        if (this.getWindow().getDecorView() != null) {
            final int[] a = ik.a;
        }
        return hg.x(this, keyEvent);
    }
    
    public final boolean dispatchKeyShortcutEvent(final KeyEvent keyEvent) {
        if (this.getWindow().getDecorView() != null) {
            final int[] a = ik.a;
        }
        return super.dispatchKeyShortcutEvent(keyEvent);
    }
    
    public final boolean g(final KeyEvent keyEvent) {
        return super.dispatchKeyEvent(keyEvent);
    }
    
    protected void onCreate(final Bundle bundle) {
        super.onCreate(bundle);
        adl.b(this);
    }
    
    protected void onSaveInstanceState(final Bundle bundle) {
        final i a = this.a;
        final h c = h.c;
        i.f("markState");
        a.e(c);
        super.onSaveInstanceState(bundle);
    }
}
