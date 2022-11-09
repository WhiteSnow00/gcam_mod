import android.provider.Settings$SettingNotFoundException;
import android.provider.Settings$Global;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lob implements lns
{
    public final Context a;
    private final lnv b;
    private niz c;
    private final Object d;
    
    public lob(final Context a, final lnv b) {
        this.c = nii.a;
        this.d = new Object();
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean a() {
        synchronized (this.d) {
            boolean b;
            if (this.c.g()) {
                b = (boolean)this.c.c();
            }
            else {
                b = this.b();
            }
            return b;
        }
    }
    
    public final boolean b() {
        final Object d = this.d;
        monitorenter(d);
        try {
            try {
                final int int1 = Settings$Global.getInt(this.b.a.getContentResolver(), "multi_cb");
                boolean b = true;
                if (int1 != 1) {
                    b = false;
                }
                this.c = niz.i(b);
                monitorexit(d);
                return b;
            }
            finally {
                monitorexit(d);
            }
        }
        catch (final Settings$SettingNotFoundException ex) {}
    }
}
