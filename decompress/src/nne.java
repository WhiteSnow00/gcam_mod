import java.io.InvalidObjectException;
import java.io.ObjectInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class nne extends nns
{
    final /* synthetic */ nqj a;
    
    public nne() {
    }
    
    public nne(final nqj a) {
        this.a = a;
    }
    
    private void readObject(final ObjectInputStream objectInputStream) {
        throw new InvalidObjectException("Use SerializedForm");
    }
    
    @Override
    public final boolean bO() {
        return false;
    }
    
    @Override
    public final boolean contains(final Object o) {
        return this.a.contains(o);
    }
    
    @Override
    public final boolean isEmpty() {
        return false;
    }
    
    @Override
    public final int size() {
        return this.a.size();
    }
    
    @Override
    Object writeReplace() {
        return new nnd(this.a);
    }
}
