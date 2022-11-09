import java.util.ArrayList;
import java.util.List;
import java.util.Arrays;
import com.google.android.apps.camera.stats.timing.TimingSession;

// 
// Decompiled by Procyon v0.6.0
// 

public class hwh implements TimingSession
{
    public static final hwg i;
    public static final hwg j;
    private final long[] a;
    private Runnable b;
    public final lmp k;
    public long l;
    public final Enum[] m;
    public final hzu n;
    
    static {
        i = hwg.a().a();
        final hwf a = hwg.a();
        a.c(false);
        a.b(false);
        j = a.a();
    }
    
    protected hwh(final lmp lmp, final long n, final Enum[] array) {
        this(lmp, new hzu(), n, array, null);
    }
    
    protected hwh(final lmp k, final hzu n, final long l, final Enum[] m, final byte[] array) {
        this.k = k;
        this.n = n;
        this.l = l;
        this.m = m;
        Arrays.fill(this.a = new long[m.length], -1L);
    }
    
    protected hwh(final lmp lmp, final Enum[] array) {
        this(lmp, new hzu(), lmp.a(), array, null);
    }
    
    public static List h(final Class clazz) {
        final Enum[] array = (Enum[])nov.z(clazz.getEnumConstants());
        final int length = array.length;
        final ArrayList list = new ArrayList<String>(length + 1);
        list.add("TIMING_CREATION");
        for (int i = 0; i < length; ++i) {
            list.add(array[i].name());
        }
        return list;
    }
    
    protected void a() {
        Arrays.fill(this.a, -1L);
        this.l = this.k.a();
    }
    
    @Override
    public final void b(final Runnable b) {
        this.b = b;
    }
    
    @Override
    public final void close() {
        final Runnable b = this.b;
        if (b != null) {
            b.run();
        }
    }
    
    public final long g(final Enum enum1) {
        return this.a[enum1.ordinal()];
    }
    
    public final void i(final Enum enum1) {
        this.k(enum1, this.k.a(), hwh.i);
    }
    
    public final void j(final Enum enum1, final hwg hwg) {
        this.k(enum1, this.k.a(), hwg);
    }
    
    public final void k(final Enum enum1, long n, final hwg hwg) {
        if (this.l(enum1)) {
            return;
        }
        final int ordinal = enum1.ordinal();
        final Enum[] m = this.m;
        m[ordinal] = enum1;
        final long[] a = this.a;
        a[ordinal] = n;
        if (ordinal > 0) {
            n = a[ordinal - 1];
        }
        else {
            n = -1L;
        }
        Enum enum2;
        if (ordinal > 0) {
            enum2 = m[ordinal - 1];
        }
        else {
            enum2 = null;
        }
        boolean b = false;
        if (n >= 0L && hwg.b) {
            b = true;
        }
        final boolean a2 = hwg.a;
        if (b && a2) {
            if (enum2 != null) {
                enum2.name();
            }
            enum1.name();
            return;
        }
        if (b) {
            if (enum2 != null) {
                enum2.name();
            }
            enum1.name();
            return;
        }
        if (a2) {
            enum1.name();
        }
    }
    
    public final boolean l(final Enum enum1) {
        final int ordinal = enum1.ordinal();
        njo.d(this.m[ordinal] == enum1);
        return this.a[ordinal] >= 0L;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(this.getClass().getSimpleName());
        sb.append("{\n");
        final int n = 0;
        long n2 = Long.MAX_VALUE;
        int n3 = 0;
        while (true) {
            final long[] a = this.a;
            if (n3 >= a.length) {
                break;
            }
            final long n4 = a[n3];
            long n5 = n2;
            if (n4 >= 0L) {
                n5 = n2;
                if (n4 < n2) {
                    n5 = n4;
                }
            }
            ++n3;
            n2 = n5;
        }
        for (int i = n; i < this.a.length; ++i) {
            sb.append("\t");
            sb.append(this.m[i]);
            sb.append(": ");
            sb.append(this.a[i]);
            if (this.a[i] >= 0L) {
                sb.append(" (");
                sb.append(jxc.k(this.a[i] - n2));
                sb.append("ms)");
            }
            sb.append("\n");
        }
        sb.append("}");
        return sb.toString();
    }
}
