// 
// Decompiled by Procyon v0.6.0
// 

final class zl
{
    static final zl a;
    volatile zl next;
    volatile Thread thread;
    
    static {
        a = new zl(null);
    }
    
    public zl() {
        zm.b.b(this, Thread.currentThread());
    }
    
    public zl(final byte[] array) {
    }
    
    final void a(final zl zl) {
        zm.b.a(this, zl);
    }
}
