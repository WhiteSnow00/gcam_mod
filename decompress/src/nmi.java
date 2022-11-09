import java.io.ObjectOutputStream;
import java.util.HashMap;
import java.io.ObjectInputStream;
import java.util.Map;
import java.util.EnumMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nmi extends nkc
{
    private static final long serialVersionUID = 0L;
    private transient Class c;
    
    public nmi(final Class c) {
        super(new EnumMap(c), nqb.h(((Enum[])c.getEnumConstants()).length));
        this.c = c;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.c = (Class)objectInputStream.readObject();
        this.i(new EnumMap(this.c), new HashMap(((Enum[])this.c.getEnumConstants()).length * 3 / 2));
        nrr.s(this, objectInputStream, objectInputStream.readInt());
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        objectOutputStream.writeObject(this.c);
        nrr.u(this, objectOutputStream);
    }
}
