import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class niz implements Serializable
{
    private static final long serialVersionUID = 0L;
    
    public static niz h(final Object o) {
        niz a;
        if (o == null) {
            a = nii.a;
        }
        else {
            a = new njd(o);
        }
        return a;
    }
    
    public static niz i(final Object o) {
        o.getClass();
        return new njd(o);
    }
    
    public abstract niz a(final niz p0);
    
    public abstract niz b(final nir p0);
    
    public abstract Object c();
    
    public abstract Object d(final njp p0);
    
    public abstract Object e(final Object p0);
    
    @Override
    public abstract boolean equals(final Object p0);
    
    public abstract Object f();
    
    public abstract boolean g();
    
    @Override
    public abstract int hashCode();
    
    @Override
    public abstract String toString();
}
