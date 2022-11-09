import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

abstract class jqd extends jvl
{
    private static final WeakReference a;
    private WeakReference b;
    
    static {
        a = new WeakReference(null);
    }
    
    public jqd(final byte[] array) {
        super(array);
        this.b = jqd.a;
    }
    
    protected abstract byte[] b();
    
    @Override
    public final byte[] w() {
        synchronized (this) {
            byte[] b;
            if ((b = (byte[])this.b.get()) == null) {
                b = this.b();
                this.b = new WeakReference(b);
            }
            return b;
        }
    }
}
