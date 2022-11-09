import android.view.KeyEvent$DispatcherState;
import android.view.View;
import android.view.Window;
import android.view.KeyEvent;
import android.view.MenuItem;
import android.content.DialogInterface;
import android.content.DialogInterface$OnDismissListener;
import android.content.DialogInterface$OnClickListener;
import android.content.DialogInterface$OnKeyListener;

// 
// Decompiled by Procyon v0.6.0
// 

final class mw implements DialogInterface$OnKeyListener, DialogInterface$OnClickListener, DialogInterface$OnDismissListener, ni
{
    public final mv a;
    public kc b;
    mr c;
    
    public mw(final mv a) {
        this.a = a;
    }
    
    public final void a(final mv mv, final boolean b) {
        if (b || mv == this.a) {
            final kc b2 = this.b;
            if (b2 != null) {
                b2.dismiss();
            }
        }
    }
    
    public final boolean b(final mv mv) {
        return false;
    }
    
    public final void onClick(final DialogInterface dialogInterface, final int n) {
        this.a.z((MenuItem)((mq)this.c.a()).a(n), 0);
    }
    
    public final void onDismiss(final DialogInterface dialogInterface) {
        this.c.c(this.a, true);
    }
    
    public final boolean onKey(final DialogInterface dialogInterface, final int n, final KeyEvent keyEvent) {
        int n2 = n;
        while (true) {
            Label_0030: {
                if (n == 82) {
                    break Label_0030;
                }
                final int n3;
                if ((n3 = n) == 4) {
                    n2 = 4;
                    break Label_0030;
                }
                n2 = n3;
                return this.a.performShortcut(n2, keyEvent, 0);
            }
            if (keyEvent.getAction() == 0 && keyEvent.getRepeatCount() == 0) {
                final Window window = this.b.getWindow();
                if (window != null) {
                    final View decorView = window.getDecorView();
                    if (decorView != null) {
                        final KeyEvent$DispatcherState keyDispatcherState = decorView.getKeyDispatcherState();
                        if (keyDispatcherState != null) {
                            keyDispatcherState.startTracking(keyEvent, (Object)this);
                            return true;
                        }
                    }
                }
            }
            else {
                int n3 = n2;
                if (keyEvent.getAction() != 1) {
                    continue;
                }
                n3 = n2;
                if (keyEvent.isCanceled()) {
                    continue;
                }
                final Window window2 = this.b.getWindow();
                n3 = n2;
                if (window2 == null) {
                    continue;
                }
                final View decorView2 = window2.getDecorView();
                n3 = n2;
                if (decorView2 == null) {
                    continue;
                }
                final KeyEvent$DispatcherState keyDispatcherState2 = decorView2.getKeyDispatcherState();
                n3 = n2;
                if (keyDispatcherState2 == null) {
                    continue;
                }
                if (keyDispatcherState2.isTracking(keyEvent)) {
                    this.a.i(true);
                    dialogInterface.dismiss();
                    return true;
                }
            }
            break;
        }
        return this.a.performShortcut(n2, keyEvent, 0);
    }
}
