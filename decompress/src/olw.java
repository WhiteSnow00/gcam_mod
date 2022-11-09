import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class olw extends olx
{
    public olw() {
    }
    
    static olj a(final Object o, final long n) {
        return (olj)ons.h(o, n);
    }
    
    @Override
    public final List b(final Object o, final long n) {
        final olj a = a(o, n);
        olj olj;
        if (!a.c()) {
            final int size = a.size();
            int n2;
            if (size == 0) {
                n2 = 10;
            }
            else {
                n2 = size + size;
            }
            final olj e = a.e(n2);
            ons.u(o, n, e);
            olj = e;
        }
        else {
            olj = a;
        }
        return olj;
    }
    
    @Override
    public final void c(final Object o, final long n) {
        a(o, n).b();
    }
    
    @Override
    public final void d(final Object o, final Object o2, final long n) {
        final olj a = a(o, n);
        final olj a2 = a(o2, n);
        final int size = a.size();
        final int size2 = a2.size();
        olj e = a;
        if (size > 0) {
            e = a;
            if (size2 > 0) {
                e = a;
                if (!a.c()) {
                    e = a.e(size2 + size);
                }
                e.addAll(a2);
            }
        }
        if (size <= 0) {
            e = a2;
        }
        ons.u(o, n, e);
    }
}
