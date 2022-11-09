import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class atd
{
    public static final aub i;
    
    static {
        i = new aub("CamAgnt");
    }
    
    protected abstract Handler a();
    
    public abstract atn b();
    
    public abstract att c();
    
    protected abstract atv d();
    
    public abstract atx e();
    
    public abstract void f(final att p0);
    
    public final void g(final boolean b) {
        Label_0053: {
            if (!b) {
                break Label_0053;
            }
            try {
                if (this.d().d()) {
                    return;
                }
                final atc atc = new atc();
                this.e().b(new ase(this, atc), atc.b, "camera release");
                return;
                this.e().a(new asf(this));
            }
            catch (final RuntimeException ex) {
                this.c().c(ex);
            }
        }
    }
}
