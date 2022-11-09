import java.util.Iterator;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nue extends nug
{
    public final int[] a;
    public final int b;
    private final ntp d;
    private final ntp e;
    
    public nue(final ntp d, final ntp e) {
        this.d = d;
        this.e = e;
        final int b = e.b();
        oce.h(b <= 28, "metadata size too large");
        final int[] a = new int[b];
        this.a = a;
        long n = 0L;
        int i = 0;
        int b2 = 0;
        while (i < a.length) {
            final nsx d2 = this.d(i);
            final long n2 = d2.c | n;
            Label_0176: {
                Label_0168: {
                    if (n2 == n) {
                        int j = 0;
                        while (true) {
                            while (j < b2) {
                                final int n3 = j;
                                if (!d2.equals(this.d(a[j] & 0x1F))) {
                                    ++j;
                                }
                                else {
                                    if (n3 != -1) {
                                        int n4;
                                        if (d2.b) {
                                            n4 = (a[n3] | 1 << i + 4);
                                        }
                                        else {
                                            n4 = i;
                                        }
                                        a[n3] = n4;
                                        break Label_0176;
                                    }
                                    break Label_0168;
                                }
                            }
                            final int n3 = -1;
                            continue;
                        }
                    }
                }
                a[b2] = i;
                ++b2;
            }
            ++i;
            n = n2;
        }
        this.b = b2;
    }
    
    @Override
    public final int a() {
        return this.b;
    }
    
    @Override
    public final Set b() {
        return new nuc(this);
    }
    
    @Override
    public final void c(final ntw ntw, final Object o) {
        for (int i = 0; i < this.b; ++i) {
            final int n = this.a[i];
            final nsx d = this.d(n & 0x1F);
            if (!d.b) {
                ntw.a(d, d.d(this.e(n)), o);
            }
            else {
                ntw.b(d, new nud(this, d, n), o);
            }
        }
    }
    
    public final nsx d(final int n) {
        ntp ntp;
        if (n >= 0) {
            ntp = this.e;
        }
        else {
            ntp = this.d;
        }
        return ntp.c(n);
    }
    
    public final Object e(final int n) {
        ntp ntp;
        if (n >= 0) {
            ntp = this.e;
        }
        else {
            ntp = this.d;
        }
        return ntp.e(n);
    }
}
