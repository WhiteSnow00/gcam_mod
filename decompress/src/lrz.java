import java.lang.reflect.Method;
import java.lang.reflect.InvocationTargetException;
import android.os.Debug$MemoryInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lrz extends lsb
{
    public final long a;
    public final long b;
    public final long c;
    public final long d;
    public final long e;
    public final long f;
    public final long g;
    public final long h;
    public final long i;
    public final long j;
    public final long k;
    public final long l;
    public final long m;
    
    public lrz(final long b, final long c, final long d, final long e, final long n, final long n2, final long n3, final long a, final long f, final long g, final long h, final long l, final long i, final long j, final long k, final long m) {
        super(n, n2, n3);
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.a = a;
        this.g = g;
        this.h = h;
        this.l = l;
        this.i = i;
        this.j = j;
        this.k = k;
        this.m = m;
    }
    
    public static long a(final Debug$MemoryInfo debug$MemoryInfo, final String s) {
        try {
            final Method declaredMethod = Debug$MemoryInfo.class.getDeclaredMethod(s, (Class<?>[])new Class[0]);
            declaredMethod.setAccessible(true);
            return b(((Number)declaredMethod.invoke(debug$MemoryInfo, new Object[0])).longValue());
        }
        catch (final NoSuchMethodException ex) {}
        catch (final InvocationTargetException ex2) {}
        catch (final IllegalAccessException ex3) {}
        return 0L;
    }
    
    public static long b(final long n) {
        return n * 1024L;
    }
    
    @Override
    public final String toString() {
        final String string = super.toString();
        final long a = this.a;
        final long b = this.b;
        final long c = this.c;
        final long d = this.d;
        final long e = this.e;
        final long f = this.f;
        final long g = this.g;
        final long h = this.h;
        final long i = this.i;
        final long j = this.j;
        final long k = this.k;
        final long l = this.l;
        final long m = this.m;
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 509);
        sb.append(string);
        sb.append(", nativeHeapAllocatedB: ");
        sb.append(a);
        sb.append(", otherPrivateDirtyB: ");
        sb.append(b);
        sb.append(", otherPssB: ");
        sb.append(c);
        sb.append(", dalvikPrivateDirtyB: ");
        sb.append(d);
        sb.append(", dalvikPssB: ");
        sb.append(e);
        sb.append(", totalPssB: ");
        sb.append(f);
        sb.append(", javaPrivateDirtyB: ");
        sb.append(g);
        sb.append(", nativePrivateDirtyB: ");
        sb.append(h);
        sb.append(", otherPrivateCodeB: ");
        sb.append(i);
        sb.append(", otherPrivateGraphicsB: ");
        sb.append(j);
        sb.append(", otherPrivateStackB: ");
        sb.append(k);
        sb.append(", otherPrivateB: ");
        sb.append(l);
        sb.append(", systemB: ");
        sb.append(m);
        return sb.toString();
    }
}
