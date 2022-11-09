import android.view.Window$Callback;
import android.view.Menu;

// 
// Decompiled by Procyon v0.6.0
// 

final class kv implements ni
{
    final /* synthetic */ kw a;
    private final /* synthetic */ int b;
    
    public kv(final kw a) {
        this.a = a;
    }
    
    public kv(final kw a, final int b) {
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void a(final mv mv, final boolean b) {
        switch (this.b) {
            default: {
                this.a.y(mv);
                return;
            }
            case 0: {
                final mv a = mv.a();
                final kw a2 = this.a;
                mv mv2;
                if (a != mv) {
                    mv2 = a;
                }
                else {
                    mv2 = mv;
                }
                final ku u = a2.u((Menu)mv2);
                if (u != null) {
                    if (a != mv) {
                        this.a.x(u.a, u, (Menu)a);
                        this.a.z(u, true);
                        return;
                    }
                    this.a.z(u, b);
                }
            }
        }
    }
    
    @Override
    public final boolean b(final mv mv) {
        switch (this.b) {
            default: {
                final Window$Callback v = this.a.v();
                if (v != null) {
                    v.onMenuOpened(108, (Menu)mv);
                }
                return true;
            }
            case 0: {
                if (mv == mv.a()) {
                    final kw a = this.a;
                    if (a.u) {
                        final Window$Callback v2 = a.v();
                        if (v2 != null && !this.a.C) {
                            v2.onMenuOpened(108, (Menu)mv);
                        }
                    }
                }
                return true;
            }
        }
    }
}
