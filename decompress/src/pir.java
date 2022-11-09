import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class pir implements Serializable, pik
{
    private pkn a = a;
    private volatile Object b = pis.a;
    private final Object c = this;
    
    private final Object writeReplace() {
        return new pij(this.a());
    }
    
    @Override
    public final Object a() {
        final Object b = this.b;
        if (b != pis.a) {
            return b;
        }
        synchronized (this.c) {
            Object b2 = this.b;
            if (b2 == pis.a) {
                final pkn a = this.a;
                a.getClass();
                b2 = a.a();
                this.b = b2;
                this.a = null;
            }
            return b2;
        }
    }
    
    @Override
    public final String toString() {
        String value;
        if (this.b != pis.a) {
            value = String.valueOf(this.a());
        }
        else {
            value = "Lazy value not initialized yet.";
        }
        return value;
    }
}
