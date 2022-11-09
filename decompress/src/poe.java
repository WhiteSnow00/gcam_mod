import kotlinx.coroutines.CoroutineExceptionHandler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class poe
{
    public static final String a(final Object o) {
        o.getClass();
        return o.getClass().getSimpleName();
    }
    
    public static final String b(final Object o) {
        o.getClass();
        return Integer.toHexString(System.identityHashCode(o));
    }
    
    public static final Throwable c(final Throwable t, final Throwable t2) {
        if (t == t2) {
            return t;
        }
        final RuntimeException ex = new RuntimeException("Exception while trying to handle coroutine exception", t2);
        pip.e(ex, t);
        return ex;
    }
    
    public static final void d(final pjq pjq, final Throwable t) {
        pjq.getClass();
        try {
            final CoroutineExceptionHandler coroutineExceptionHandler = (CoroutineExceptionHandler)pjq.b(CoroutineExceptionHandler.a);
            if (coroutineExceptionHandler != null) {
                coroutineExceptionHandler.f();
                return;
            }
            pny.a(pjq, t);
        }
        finally {
            final Throwable t2;
            pny.a(pjq, c(t, t2));
        }
    }
    
    public static int e(final int n, final int n2) {
        if (n < n2) {
            return n2;
        }
        return n;
    }
    
    public static int f(final int n, final int n2) {
        if (n > n2) {
            return n2;
        }
        return n;
    }
    
    public static int g(final int n, final int n2, final int n3) {
        if (n2 > n3) {
            final StringBuilder sb = new StringBuilder();
            sb.append("Cannot coerce value to an empty range: maximum ");
            sb.append(n3);
            sb.append(" is less than minimum ");
            sb.append(n2);
            sb.append('.');
            throw new IllegalArgumentException(sb.toString());
        }
        if (n < n2) {
            return n2;
        }
        if (n > n3) {
            return n3;
        }
        return n;
    }
    
    public static final String h(final plq plq) {
        String s2;
        final String s = s2 = plq.getClass().getGenericInterfaces()[0].toString();
        if (s.startsWith("kotlin.jvm.functions.")) {
            s2 = s.substring(21);
        }
        return s2;
    }
}
