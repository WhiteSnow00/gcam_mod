import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kxo
{
    private final List a;
    private final List b;
    private final List c;
    private final List d;
    
    public kxo(final lfg lfg, final noi noi) {
        this.a = lfg.q();
        this.b = lfg.p();
        this.c = lfg.r();
        final boolean g = ((lff)lfg).G();
        final Integer value = 2;
        final Integer value2 = 0;
        nns nns;
        if (!g) {
            nns = nns.m(value2);
        }
        else {
            nns = nns.o(value2, 1, value);
        }
        final ArrayList d = new ArrayList(nns);
        if (noi.contains(kwu.a) && !d.contains(value)) {
            d.add((Object)value);
        }
        this.d = d;
    }
    
    final kvr a(final kvr kvr, final kvr kvr2) {
        final lbf c = lbf.c(kvr);
        Integer b;
        if (this.a.contains(kvr.b())) {
            b = kvr.b();
        }
        else {
            b = kvr2.b();
        }
        c.b = b;
        Integer c2;
        if (this.b.contains(kvr.a())) {
            c2 = kvr.a();
        }
        else {
            c2 = kvr2.a();
        }
        c.c = c2;
        Integer d;
        if (this.c.contains(kvr.c())) {
            d = kvr.c();
        }
        else {
            d = kvr2.c();
        }
        c.d = d;
        Integer e;
        if (this.d.contains(kvr.e())) {
            e = kvr.e();
        }
        else {
            e = kvr2.e();
        }
        c.e = e;
        MeteringRectangle[] i;
        if (Arrays.equals(kvr.g(), kxn.b)) {
            i = ((lbg)kvr2).d;
        }
        else {
            i = kvr.g();
        }
        c.i = i;
        MeteringRectangle[] j;
        if (Arrays.equals(kvr.f(), kxn.b)) {
            j = ((lbg)kvr2).e;
        }
        else {
            j = kvr.f();
        }
        c.j = j;
        MeteringRectangle[] k;
        if (Arrays.equals(kvr.h(), kxn.b)) {
            k = ((lbg)kvr2).f;
        }
        else {
            k = kvr.h();
        }
        c.k = k;
        return c.e();
    }
}
