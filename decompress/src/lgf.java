import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lgf extends ljs implements ljx
{
    public final Object a;
    public boolean b;
    public int c;
    private boolean d;
    
    public lgf(final ljx ljx) {
        super(ljx);
        this.a = new Object();
        this.d = false;
        this.c = 0;
    }
    
    @Override
    public final void close() {
        synchronized (this.a) {
            if (!this.d && !this.b) {
                this.b = true;
                this.j();
            }
        }
    }
    
    @Override
    public final lju f() {
        synchronized (this.a) {
            if (!this.b && !this.d) {
                final lju f = super.f();
                if (f != null) {
                    ++this.c;
                    return new lge(this, f);
                }
            }
            return null;
        }
    }
    
    @Override
    public final lju g() {
        synchronized (this.a) {
            if (!this.b && !this.d) {
                final lju g = super.g();
                if (g != null) {
                    ++this.c;
                    return new lge(this, g);
                }
            }
            return null;
        }
    }
    
    @Override
    public final void i(final ljw ljw, final Handler handler) {
        super.i(new lgd(this, ljw), handler);
    }
    
    public final void j() {
        if (this.d) {
            return;
        }
        if (this.c == 0) {
            this.d = true;
            super.close();
            return;
        }
        try (final lju f = super.f()) {}
        this.h();
    }
}
