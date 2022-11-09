import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class dns implements dlc
{
    private final dlb a;
    private final int b;
    private final int c;
    private final dnr d;
    private final dli e;
    
    public dns(final dlb a, final int b, final int c, final dnr d, final dli e) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final float a(final long n) {
        final int b = this.b;
        boolean b2 = true;
        if (b != 1) {
            b2 = false;
        }
        njo.o(b2);
        return this.c(n).a();
    }
    
    @Override
    public final long b() {
        final dll a = this.e.a(Long.MAX_VALUE);
        if (a.c()) {
            return a.a();
        }
        return 0L;
    }
    
    @Override
    public final dkz c(long min) {
        min = Math.min(min, 9223372036854775806L);
        final dll a = this.e.a(1L + min);
        final boolean c = a.c();
        final long a2 = a.a();
        final boolean b = a.b();
        a.a();
        if (!b) {
            if (!c) {
                return dkz.c(this.a, min);
            }
        }
        else if (!c) {
            return dkz.c(this.a, min);
        }
        final float[] array = new float[this.c];
        return dkz.d(this.a, min, array, 0, this.d.a(a2, array));
    }
    
    @Override
    public final dkz d() {
        return this.c(this.b());
    }
    
    @Override
    public final boolean e() {
        return this.b() <= 0L;
    }
    
    @Override
    public final List f(final long n, final int n2) {
        final int n3 = 0;
        int n4 = 0;
        njo.d(n > Long.MIN_VALUE);
        njo.d(true);
        final ArrayList list = new ArrayList();
        final float[] array = new float[this.c];
        if (n <= 0L) {
            for (dll a = this.e.a(n - 1L); n4 < n2 && a.b() && a.a() <= 0L; ++n4) {
                list.add(dkz.d(this.a, a.a(), array, 0, this.d.a(a.a(), array)));
            }
        }
        else {
            final dll a2 = this.e.a(n + 1L);
            for (int n5 = n3; n5 < n2 && a2.c() && a2.a() >= 0L; ++n5) {
                list.add(dkz.d(this.a, a2.a(), array, 0, this.d.a(a2.a(), array)));
            }
        }
        return list;
    }
}
