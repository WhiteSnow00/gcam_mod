import android.os.SystemClock;

// 
// Decompiled by Procyon v0.6.0
// 

final class ads extends ady implements Runnable
{
    boolean a;
    final /* synthetic */ adt b;
    
    public ads(final adt b) {
        this.b = b;
    }
    
    @Override
    protected final Object a() {
        try {
            return this.b.a();
        }
        catch (final aaq aaq) {
            if (this.f()) {
                return null;
            }
            throw aaq;
        }
    }
    
    @Override
    protected final void b(final Object o) {
        final adt b = this.b;
        if (b.a != this) {
            b.e(this);
            return;
        }
        if (b.e) {
            return;
        }
        SystemClock.uptimeMillis();
        b.a = null;
        b.g(o);
    }
    
    @Override
    protected final void c() {
        this.b.e(this);
    }
    
    @Override
    public final void run() {
        this.a = false;
        this.b.c();
    }
}
