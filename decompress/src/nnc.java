import java.util.Collection;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nnc extends nlb
{
    private static final long serialVersionUID = 0L;
    transient int e;
    
    private nnc() {
        super(nlr.e(12));
        this.e = 2;
        njo.d(true);
        this.e = 2;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = 2;
        final int int1 = objectInputStream.readInt();
        this.k(nlr.e(12));
        nrr.t(this, objectInputStream, int1);
    }
    
    public static nnc v() {
        return new nnc();
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        nrr.v(this, objectOutputStream);
    }
}
