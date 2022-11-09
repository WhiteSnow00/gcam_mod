import java.io.PrintWriter;
import java.io.PrintStream;
import java.util.HashSet;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Collections;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oxw extends RuntimeException
{
    private static final long serialVersionUID = 3026362227162912146L;
    private final List a;
    private final String b;
    private Throwable c;
    
    public oxw(final Iterable iterable) {
        final LinkedHashSet set = new LinkedHashSet();
        final ArrayList list = new ArrayList();
        if (iterable != null) {
            for (final Throwable t : iterable) {
                if (t instanceof oxw) {
                    set.addAll(((oxw)t).a);
                }
                else if (t != null) {
                    set.add(t);
                }
                else {
                    set.add(new NullPointerException("Throwable was null!"));
                }
            }
        }
        else {
            set.add(new NullPointerException("errors was null"));
        }
        if (!set.isEmpty()) {
            list.addAll(set);
            final List<Object> unmodifiableList = Collections.unmodifiableList((List<?>)list);
            this.a = unmodifiableList;
            final int size = unmodifiableList.size();
            final StringBuilder sb = new StringBuilder(33);
            sb.append(size);
            sb.append(" exceptions occurred. ");
            this.b = sb.toString();
            return;
        }
        throw new IllegalArgumentException("errors is empty");
    }
    
    public oxw(final Throwable... array) {
        this(Arrays.asList(array));
    }
    
    private final void a(final StringBuilder sb, final Throwable t, final String s) {
        sb.append(s);
        sb.append(t);
        sb.append('\n');
        for (final StackTraceElement stackTraceElement : t.getStackTrace()) {
            sb.append("\t\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        if (t.getCause() != null) {
            sb.append("\tCaused by: ");
            this.a(sb, t.getCause(), "");
        }
    }
    
    private final void b(final oxt oxt) {
        final StringBuilder sb = new StringBuilder(128);
        sb.append(this);
        sb.append('\n');
        for (final StackTraceElement stackTraceElement : this.getStackTrace()) {
            sb.append("\tat ");
            sb.append(stackTraceElement);
            sb.append('\n');
        }
        final Iterator iterator = this.a.iterator();
        int n = 1;
        while (iterator.hasNext()) {
            final Throwable t = (Throwable)iterator.next();
            sb.append("  ComposedException ");
            sb.append(n);
            sb.append(" :\n");
            this.a(sb, t, "\t");
            ++n;
        }
        oxt.a(sb.toString());
    }
    
    @Override
    public final Throwable getCause() {
        monitorenter(this);
        try {
            if (this.c == null) {
                final oxs c = new oxs();
                final HashSet set = new HashSet();
                final Iterator iterator = this.a.iterator();
                Throwable t = c;
                while (iterator.hasNext()) {
                    final Throwable t2 = (Throwable)iterator.next();
                    if (!set.contains(t2)) {
                        set.add(t2);
                        final ArrayList list = new ArrayList();
                        final Throwable cause = t2.getCause();
                        if (cause != null) {
                            Throwable t3;
                            if ((t3 = cause) != t2) {
                                while (true) {
                                    list.add(t3);
                                    final Throwable cause2 = t3.getCause();
                                    if (cause2 == null || cause2 == t3) {
                                        break;
                                    }
                                    t3 = cause2;
                                }
                            }
                        }
                        final Iterator iterator2 = list.iterator();
                        Throwable t4 = t2;
                        while (iterator2.hasNext()) {
                            final Throwable t5 = (Throwable)iterator2.next();
                            if (set.contains(t5)) {
                                t4 = new RuntimeException("Duplicate found in causal chain so cropping to prevent loop ...");
                            }
                            else {
                                set.add(t5);
                            }
                        }
                        try {
                            t.initCause(t4);
                        }
                        finally {}
                        Throwable cause3 = t.getCause();
                        if (cause3 == null || t == cause3) {
                            continue;
                        }
                        while (true) {
                            final Throwable cause4 = cause3.getCause();
                            t = cause3;
                            if (cause4 == null || cause4 == (t = cause3)) {
                                break;
                            }
                            cause3 = cause4;
                        }
                    }
                }
                this.c = c;
            }
            final Throwable c2 = this.c;
            monitorexit(this);
            return c2;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final String getMessage() {
        return this.b;
    }
    
    @Override
    public final void printStackTrace() {
        this.printStackTrace(System.err);
    }
    
    @Override
    public final void printStackTrace(final PrintStream printStream) {
        this.b(new oxu(printStream));
    }
    
    @Override
    public final void printStackTrace(final PrintWriter printWriter) {
        this.b(new oxv(printWriter));
    }
}
