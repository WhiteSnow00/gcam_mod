import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class crz implements exn, exe
{
    private kc a;
    private final Activity b;
    
    public crz(final kjm kjm, final ewy ewy, final Activity b) {
        kjm.execute(new cry(this, ewy));
        this.b = b;
    }
    
    public final boolean b(final kc a) {
        monitorenter(this);
        try {
            kjm.a();
            final kc a2 = this.a;
            if (a2 != null) {
                a2.dismiss();
            }
            this.a = a;
            boolean b;
            if (!this.b.isFinishing()) {
                a.show();
                b = true;
            }
            else {
                b = false;
            }
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void bh() {
        final kc a = this.a;
        if (a != null) {
            a.dismiss();
        }
    }
}
