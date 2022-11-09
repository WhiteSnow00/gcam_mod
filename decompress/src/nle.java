import java.util.ArrayList;
import java.io.ObjectOutputStream;
import java.io.ObjectInputStream;
import java.util.Iterator;
import java.util.Collection;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nle extends nke
{
    private static final long serialVersionUID = 0L;
    transient int e;
    
    private nle() {
        this(12, 3);
    }
    
    private nle(final int n, final int e) {
        super(nlr.e(n));
        nqb.C(e, "expectedValuesPerKey");
        this.e = e;
    }
    
    private nle(final npq npq) {
        this(npq.r().size(), ((nle)npq).e);
        final nkx nkx = (nkx)npq;
        Collection c = nkx.c;
        if (c == null) {
            c = new npr(nkx);
            nkx.c = c;
        }
        for (final Map.Entry<Object, V> entry : c) {
            this.p(entry.getKey(), entry.getValue());
        }
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        objectInputStream.defaultReadObject();
        this.e = 3;
        final int int1 = objectInputStream.readInt();
        this.k(new nlr());
        nrr.t(this, objectInputStream, int1);
    }
    
    public static nle v() {
        return new nle(12, 3);
    }
    
    public static nle w(final npq npq) {
        return new nle(npq);
    }
    
    private void writeObject(final ObjectOutputStream objectOutputStream) {
        objectOutputStream.defaultWriteObject();
        nrr.v(this, objectOutputStream);
    }
}
