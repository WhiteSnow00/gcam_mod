import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gkn
{
    public static int a(final WindowManager windowManager) {
        kra kra = null;
        switch (windowManager.getDefaultDisplay().getRotation()) {
            default: {
                kra = kra.a;
                break;
            }
            case 3: {
                kra = kra.d(270);
                break;
            }
            case 2: {
                kra = kra.d(180);
                break;
            }
            case 1: {
                kra = kra.d(90);
                break;
            }
            case 0: {
                kra = kra.d(0);
                break;
            }
        }
        return kra.a();
    }
    
    public final void b() {
        monitorenter(this);
        monitorexit(this);
    }
    
    public final void c() {
        monitorenter(this);
        monitorexit(this);
    }
}
