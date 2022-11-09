import java.util.Iterator;
import java.util.ArrayDeque;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pqd
{
    private static final StackTraceElement a;
    private static final String b;
    
    static {
        final Exception ex = new Exception();
        final String simpleName = a.class.getSimpleName();
        final StackTraceElement stackTraceElement = ex.getStackTrace()[0];
        final StringBuilder sb = new StringBuilder();
        sb.append("_COROUTINE.");
        sb.append(simpleName);
        a = new StackTraceElement(sb.toString(), "_", stackTraceElement.getFileName(), stackTraceElement.getLineNumber());
        Object a2 = null;
        try {
            Class.forName("pjw").getCanonicalName();
        }
        finally {
            final Throwable t;
            a2 = pip.a(t);
        }
        String s = (String)a2;
        if (pio.a(a2) != null) {
            s = "kotlin.coroutines.jvm.internal.BaseContinuationImpl";
        }
        b = s;
        Object a3 = null;
        try {
            Class.forName("pqd").getCanonicalName();
        }
        finally {
            final Throwable t2;
            a3 = pip.a(t2);
        }
        String s2 = (String)a3;
        if (pio.a(a3) != null) {
            s2 = "kotlinx.coroutines.internal.StackTraceRecoveryKt";
        }
        final String s3 = s2;
    }
    
    public static final Throwable a(final Throwable t, pjz g) {
        final Throwable cause = t.getCause();
        final int n = 0;
        pim pim = null;
        Label_0094: {
            if (cause != null && plr.b(cause.getClass(), t.getClass())) {
                final StackTraceElement[] stackTrace = t.getStackTrace();
                for (int length = stackTrace.length, i = 0; i < length; ++i) {
                    if (c(stackTrace[i])) {
                        pim = pjf.w(cause, stackTrace);
                        break Label_0094;
                    }
                }
                pim = pjf.w(t, new StackTraceElement[0]);
            }
            else {
                pim = pjf.w(t, new StackTraceElement[0]);
            }
        }
        final Throwable t2 = (Throwable)pim.a;
        final StackTraceElement[] array = (StackTraceElement[])pim.b;
        final Throwable a = ppt.a(t2);
        if (a == null || (plr.b(a.getMessage(), t2.getMessage()) ^ true)) {
            return t;
        }
        final ArrayDeque<StackTraceElement> arrayDeque = new ArrayDeque<StackTraceElement>();
        final StackTraceElement cn = g.cn();
        pjz pjz = g;
        if (cn != null) {
            arrayDeque.add(cn);
            pjz = g;
        }
        while (true) {
            g = pjz;
            if (!(pjz instanceof pjz)) {
                g = null;
            }
            if (g == null) {
                break;
            }
            g = g.g();
            if (g == null) {
                break;
            }
            final StackTraceElement cn2 = g.cn();
            pjz = g;
            if (cn2 == null) {
                continue;
            }
            arrayDeque.add(cn2);
            pjz = g;
        }
        if (arrayDeque.isEmpty()) {
            return t;
        }
        Label_0402: {
            if (t2 != t) {
                while (true) {
                    for (int length2 = array.length, j = 0; j < length2; ++j) {
                        if (c(array[j])) {
                            final int n2 = j + 1;
                            int n3 = array.length - 1;
                            if (n3 < n2) {
                                break Label_0402;
                            }
                            while (true) {
                                final StackTraceElement stackTraceElement = array[n3];
                                final StackTraceElement stackTraceElement2 = arrayDeque.getLast();
                                if (stackTraceElement.getLineNumber() == stackTraceElement2.getLineNumber() && plr.b(stackTraceElement.getMethodName(), stackTraceElement2.getMethodName()) && plr.b(stackTraceElement.getFileName(), stackTraceElement2.getFileName()) && plr.b(stackTraceElement.getClassName(), stackTraceElement2.getClassName())) {
                                    arrayDeque.removeLast();
                                }
                                arrayDeque.addFirst(array[n3]);
                                if (n3 == n2) {
                                    break Label_0402;
                                }
                                --n3;
                            }
                        }
                        else {}
                    }
                    int j = -1;
                    continue;
                }
            }
        }
        arrayDeque.addFirst(pqd.a);
        final StackTraceElement[] stackTrace2 = t2.getStackTrace();
        final String b = pqd.b;
        while (true) {
            for (int length3 = stackTrace2.length, k = 0; k < length3; ++k) {
                final int n4 = k;
                if (plr.b(b, stackTrace2[k].getClassName())) {
                    if (n4 == -1) {
                        final StackTraceElement[] array2 = arrayDeque.toArray(new StackTraceElement[0]);
                        if (array2 == null) {
                            throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                        }
                        a.setStackTrace(array2);
                    }
                    else {
                        final StackTraceElement[] stackTrace3 = new StackTraceElement[arrayDeque.size() + n4];
                        for (int l = 0; l < n4; ++l) {
                            stackTrace3[l] = stackTrace2[l];
                        }
                        final Iterator<Object> iterator = arrayDeque.iterator();
                        int n5 = n;
                        while (iterator.hasNext()) {
                            stackTrace3[n4 + n5] = iterator.next();
                            ++n5;
                        }
                        a.setStackTrace(stackTrace3);
                    }
                    return a;
                }
            }
            final int n4 = -1;
            continue;
        }
    }
    
    public static final Throwable b(final Throwable t) {
        t.getClass();
        final Throwable cause = t.getCause();
        if (cause != null && !(plr.b(cause.getClass(), t.getClass()) ^ true)) {
            final StackTraceElement[] stackTrace = t.getStackTrace();
            for (int length = stackTrace.length, i = 0; i < length; ++i) {
                if (c(stackTrace[i])) {
                    return cause;
                }
            }
            return t;
        }
        return t;
    }
    
    public static final boolean c(final StackTraceElement stackTraceElement) {
        stackTraceElement.getClass();
        return plr.s(stackTraceElement.getClassName(), "_COROUTINE");
    }
}
