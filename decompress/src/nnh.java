import java.util.Collection;
import java.util.Set;
import j$.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class nnh extends nnx implements j$.util.Map, nlf
{
    public static nnh b(final Object o, final Object o2, final Object o3, final Object o4) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        return new nqk(new Object[] { o, o2, o3, o4 }, 2);
    }
    
    public static nnh c(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        nqb.A(o5, o6);
        return new nqk(new Object[] { o, o2, o3, o4, o5, o6 }, 3);
    }
    
    public static nnh d(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        nqb.A(o5, o6);
        nqb.A(o7, o8);
        return new nqk(new Object[] { o, o2, o3, o4, o5, o6, o7, o8 }, 4);
    }
    
    public static nnh f(final Object o, final Object o2, final Object o3, final Object o4, final Object o5, final Object o6, final Object o7, final Object o8, final Object o9, final Object o10) {
        nqb.A(o, o2);
        nqb.A(o3, o4);
        nqb.A(o5, o6);
        nqb.A(o7, o8);
        nqb.A(o9, o10);
        return new nqk(new Object[] { o, o2, o3, o4, o5, o6, o7, o8, o9, o10 }, 5);
    }
    
    public abstract nnh a();
    
    public final noi j() {
        return this.a().t();
    }
    
    @Deprecated
    public final void k(final Object o, final Object o2) {
        throw null;
    }
    
    @Override
    Object writeReplace() {
        return new nng(this);
    }
}
