import java.io.ObjectOutputStream;
import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

class nri implements Serializable
{
    private static final long serialVersionUID = 0L;
    final Object g;
    final Object h;
    
    public nri(Object o, final Object o2) {
        o.getClass();
        this.g = o;
        o = o2;
        if (o2 == null) {
            o = this;
        }
        this.h = o;
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        synchronized (this.h) {
            objectOutputStream.defaultWriteObject();
        }
    }
    
    @Override
    public final String toString() {
        synchronized (this.h) {
            return this.g.toString();
        }
    }
}
