import android.content.res.Configuration;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class bqw implements krc
{
    private static final nsd b;
    public boolean a;
    private boolean c;
    
    static {
        b = nsd.g("com/google/android/apps/camera/app/interfaces/ModuleController");
    }
    
    public niz b() {
        return nii.a;
    }
    
    public niz be() {
        return nii.a;
    }
    
    public void bq(final boolean b) {
    }
    
    public void br() {
    }
    
    protected abstract void bs();
    
    protected abstract void bt();
    
    public void bu(final asx asx) {
    }
    
    public final void bv() {
        kjm.a();
        if (!this.a) {
            a.l(bqw.b.c(), "Module is already stopped; skipping pause.", 'b');
            return;
        }
        if (!this.c) {
            a.l(bqw.b.c(), "Duplicate call to pauseModule; skipping pause.", 'a');
            return;
        }
        this.c = false;
        this.bs();
    }
    
    public String c() {
        return null;
    }
    
    public void e(final Configuration configuration) {
    }
    
    public void f(final int n) {
    }
    
    public final void l() {
        kjm.a();
        njo.p(this.a, "Cannot resume a stopped module");
        if (this.c) {
            a.l(bqw.b.c(), "Duplicate call to resumeModule; skipping resume.", 'c');
            return;
        }
        this.c = true;
        this.bt();
    }
    
    protected abstract void m();
    
    public final void n() {
        kjm.a();
        if (this.c) {
            a.l(bqw.b.c(), "Module is already resumed; skipping start.", 'e');
            return;
        }
        if (this.a) {
            a.l(bqw.b.c(), "Duplicate call to startModule; skipping start.", 'd');
            return;
        }
        this.a = true;
        this.m();
    }
    
    protected abstract void o();
    
    public final void p() {
        kjm.a();
        if (this.c) {
            a.l(bqw.b.c(), "Attempting to stop a resumed module!", 'g');
            this.bv();
        }
        if (!this.a) {
            a.l(bqw.b.c(), "Duplicate call to stopModule; skipping stop.", 'f');
            return;
        }
        this.a = false;
        this.o();
    }
    
    public boolean q() {
        return false;
    }
    
    public boolean r() {
        return false;
    }
    
    public boolean s() {
        return false;
    }
    
    public boolean t() {
        return true;
    }
}
