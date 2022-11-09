import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.io.IOException;
import java.util.Iterator;
import java.util.Collections;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ayv extends Exception
{
    private static final StackTraceElement[] a;
    private static final long serialVersionUID = 1L;
    private final List b;
    private awc c;
    private Class d;
    private String e;
    private int f;
    
    static {
        a = new StackTraceElement[0];
    }
    
    public ayv(final String s) {
        this(s, Collections.emptyList());
    }
    
    public ayv(final String e, final List b) {
        this.e = e;
        this.setStackTrace(ayv.a);
        this.b = b;
    }
    
    private final void c(final Throwable t, final List list) {
        if (t instanceof ayv) {
            final Iterator iterator = ((ayv)t).b.iterator();
            while (iterator.hasNext()) {
                this.c((Throwable)iterator.next(), list);
            }
            return;
        }
        list.add(t);
    }
    
    private static void d(final Throwable t, final Appendable appendable) {
        try {
            appendable.append(t.getClass().toString()).append(": ").append(t.getMessage()).append('\n');
        }
        catch (final IOException ex) {
            throw new RuntimeException(t);
        }
    }
    
    private final void e(final Appendable appendable) {
        d(this, appendable);
        final List b = this.b;
        final ayu ayu = new ayu(appendable);
        try {
            int n;
            for (int size = b.size(), i = 0; i < size; i = n) {
                ayu.append("Cause (");
                n = i + 1;
                ayu.append(String.valueOf(n));
                ayu.append(" of ");
                ayu.append(String.valueOf(size));
                ayu.append("): ");
                final Throwable t = b.get(i);
                if (t instanceof ayv) {
                    ((ayv)t).e(ayu);
                }
                else {
                    d(t, ayu);
                }
            }
        }
        catch (final IOException ex) {
            throw new RuntimeException(ex);
        }
    }
    
    public final List a() {
        final ArrayList list = new ArrayList();
        this.c(this, list);
        return list;
    }
    
    final void b(final awc c, final int f, final Class d) {
        this.c = c;
        this.f = f;
        this.d = d;
    }
    
    @Override
    public final Throwable fillInStackTrace() {
        return this;
    }
    
    @Override
    public final String getMessage() {
        final StringBuilder sb = new StringBuilder(71);
        sb.append(this.e);
        final Class d = this.d;
        final String s = "";
        String string;
        if (d != null) {
            final String value = String.valueOf(d);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 2);
            sb2.append(", ");
            sb2.append(value);
            string = sb2.toString();
        }
        else {
            string = "";
        }
        sb.append(string);
        final int f = this.f;
        String string2;
        if (f != 0) {
            final String a = avp.a(f);
            final StringBuilder sb3 = new StringBuilder(a.length() + 2);
            sb3.append(", ");
            sb3.append(a);
            string2 = sb3.toString();
        }
        else {
            string2 = "";
        }
        sb.append(string2);
        final awc c = this.c;
        String string3;
        if (c != null) {
            final String value2 = String.valueOf(c);
            final StringBuilder sb4 = new StringBuilder(String.valueOf(value2).length() + 2);
            sb4.append(", ");
            sb4.append(value2);
            string3 = sb4.toString();
        }
        else {
            string3 = s;
        }
        sb.append(string3);
        final List a2 = this.a();
        if (a2.isEmpty()) {
            return sb.toString();
        }
        if (a2.size() == 1) {
            sb.append("\nThere was 1 root cause:");
        }
        else {
            sb.append("\nThere were ");
            sb.append(a2.size());
            sb.append(" root causes:");
        }
        for (final Throwable t : a2) {
            sb.append('\n');
            sb.append(t.getClass().getName());
            sb.append('(');
            sb.append(t.getMessage());
            sb.append(')');
        }
        sb.append("\n call GlideException#logRootCauses(String) for more detail");
        return sb.toString();
    }
    
    @Override
    public final void printStackTrace() {
        this.e(System.err);
    }
    
    @Override
    public final void printStackTrace(final PrintStream printStream) {
        this.e(printStream);
    }
    
    @Override
    public final void printStackTrace(final PrintWriter printWriter) {
        this.e(printWriter);
    }
}
