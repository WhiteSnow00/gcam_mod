import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class njz extends nkc
{
    private static final long serialVersionUID = 0L;
    
    public njz(final Map map, final nkc nkc) {
        super(map, nkc);
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        super.b = (nkc)objectInputStream.readObject();
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(super.b);
    }
    
    @Override
    public final Object b(final Object o) {
        return this.b.d(o);
    }
    
    @Override
    public final Object d(final Object o) {
        return this.b.b(o);
    }
    
    Object readResolve() {
        return super.b.e();
    }
}
