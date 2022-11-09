import java.util.concurrent.Executor;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class klq
{
    public static final krc a;
    
    static {
        a = new kqz();
    }
    
    public static klj a(final Collection collection) {
        return new kli(collection);
    }
    
    @SafeVarargs
    public static klj b(final klj... array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(array[i]);
        }
        return a(list);
    }
    
    public static klj c(final Collection collection) {
        return j(a(collection), fzt.p);
    }
    
    @SafeVarargs
    public static klj d(final klj... array) {
        return c(Arrays.asList(array));
    }
    
    public static klj e(final klj klj, final Comparable comparable) {
        return j(klj, new kll(comparable));
    }
    
    public static klj f(final Collection collection) {
        njo.d(collection.isEmpty() ^ true);
        return j(a(collection), fzt.q);
    }
    
    public static klj g(final Object o) {
        return new klo(o);
    }
    
    public static klj h(final Collection collection) {
        njo.d(collection.isEmpty() ^ true);
        return j(a(collection), fzt.o);
    }
    
    @SafeVarargs
    public static klj i(final klj... array) {
        return h(Arrays.asList(array));
    }
    
    public static klj j(final klj klj, final nir nir) {
        return kld.c(new klm(klj, nir, klj));
    }
    
    public static krc k(final klj klj, final Runnable runnable, final Executor executor) {
        klj.getClass();
        runnable.getClass();
        executor.getClass();
        return klj.a(new klk(runnable), executor);
    }
    
    public static krc l(final klj klj, final kri kri) {
        return klj.a(kri, ofi.c());
    }
}
