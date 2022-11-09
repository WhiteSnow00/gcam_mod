// 
// Decompiled by Procyon v0.6.0
// 

final class odb
{
    static final odb a;
    volatile odb next;
    volatile Thread thread;
    
    static {
        a = new odb(null);
    }
    
    public odb() {
        odc.e.b(this, Thread.currentThread());
    }
    
    public odb(final byte[] array) {
    }
    
    final void a(final odb odb) {
        odc.e.a(this, odb);
    }
}
