import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

class lmh extends lme implements llw
{
    public lmh(final lou lou, final llw llw, final krr krr, final byte[] array, final byte[] array2) {
        super(lou, llw, krr, null, null);
    }
    
    @Override
    public final long a() {
        return this.l().a();
    }
    
    @Override
    public final boolean e() {
        return this.l().e();
    }
    
    @Override
    public final boolean f() {
        return this.l().f();
    }
    
    @Override
    public final Uri h() {
        return ((llw)this.l()).h();
    }
    
    @Override
    public final lmf i() {
        return ((llw)this.l()).i();
    }
    
    @Override
    public final void j() {
        super.c.writeLock().lockInterruptibly();
        super.c.writeLock().unlock();
    }
    
    @Override
    public final boolean k() {
        return ((llw)this.l()).k();
    }
    
    @Override
    public final String toString() {
        return this.l().toString();
    }
}
