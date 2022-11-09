import java.io.IOException;
import java.util.Iterator;
import android.view.ViewParent;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nfa
{
    static nfa a() {
        return new nfa();
    }
    
    public static void b(final View view, final nfd nfd) {
        final ndx b = nfd.a.b;
        if (b != null && b.a) {
            ViewParent viewParent = view.getParent();
            float n = 0.0f;
            while (viewParent instanceof View) {
                n += ik.a((View)viewParent);
                viewParent = viewParent.getParent();
            }
            final nfc a = nfd.a;
            if (a.n != n) {
                a.n = n;
                nfd.k();
            }
        }
    }
    
    public static niy c(final Object o) {
        return new niy(o.getClass().getSimpleName());
    }
    
    public static niy d(final String s) {
        return new niy(s);
    }
    
    public static Object e(final Object o, final Object o2) {
        if (o != null) {
            return o;
        }
        return o2;
    }
    
    public static CharSequence f(final Object o) {
        o.getClass();
        CharSequence string;
        if (o instanceof CharSequence) {
            string = (CharSequence)o;
        }
        else {
            string = o.toString();
        }
        return string;
    }
    
    public static final String g(final Iterable iterable, final String s) {
        final Iterator iterator = iterable.iterator();
        final StringBuilder sb = new StringBuilder();
        h(sb, iterator, s);
        return sb.toString();
    }
    
    public static final void h(final StringBuilder sb, final Iterator iterator, final String s) {
        try {
            if (iterator.hasNext()) {
                sb.append(f(iterator.next()));
                while (iterator.hasNext()) {
                    sb.append(s);
                    sb.append(f(iterator.next()));
                }
            }
        }
        catch (final IOException ex) {
            throw new AssertionError((Object)ex);
        }
    }
    
    public static final String i(final Object o, final Object[] array, final String s) {
        return g(new niv(array, o), "\n");
    }
    
    static njo j(final int n) {
        switch (n) {
            default: {
                return k();
            }
            case 1: {
                return new nez();
            }
            case 0: {
                return new nfg();
            }
        }
    }
    
    static njo k() {
        return new nfg();
    }
}
