import java.util.Arrays;
import com.google.android.libraries.camera.exif.ExifInterface;
import android.util.SparseArray;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kvk
{
    public static final int[] a;
    public final int b;
    public int c;
    private final SparseArray d;
    
    static {
        a = new int[] { 0, 1, 2, 3, 4 };
    }
    
    public kvk(final int b) {
        this.d = new SparseArray();
        this.c = 0;
        this.b = b;
    }
    
    private static int f(final short n) {
        return (char)n;
    }
    
    protected final int a() {
        return this.d.size();
    }
    
    public final kvh b(final short n) {
        return (kvh)this.d.get(f(n));
    }
    
    protected final void c(final short n) {
        this.d.remove(f(n));
    }
    
    protected final kvh[] d() {
        final int size = this.d.size();
        final kvh[] array = new kvh[size];
        for (int i = 0; i < size; ++i) {
            array[i] = (kvh)this.d.valueAt(i);
        }
        return array;
    }
    
    public final void e(final kvh kvh) {
        kvh.e = this.b;
        final int f = f(kvh.a);
        final kvh kvh2 = (kvh)this.d.get(f);
        this.d.put(f, (Object)kvh);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o == null) {
            return false;
        }
        if (o instanceof kvk) {
            final kvk kvk = (kvk)o;
            if (kvk.b == this.b && kvk.a() == this.a()) {
                for (final kvh kvh : kvk.d()) {
                    if (kvh != null) {
                        if (!ExifInterface.t(kvh.a) && !kvh.equals(this.d.get(f(kvh.a)))) {
                            return false;
                        }
                    }
                }
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.b, this.c, this.d });
    }
}
