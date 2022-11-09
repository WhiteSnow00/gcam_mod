import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lul
{
    public final ByteBuffer a;
    private final List b;
    
    public lul(final ByteBuffer a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    public final List a(final luj luj) {
        final ArrayList list = new ArrayList();
        int a = luj.a;
        int b = luj.b;
        int n;
        boolean b2;
        while (true) {
            n = luj.a + luj.b;
            b2 = true;
            boolean b3 = true;
            if (a >= n) {
                break;
            }
            final luf luf = new luf(this, new luj(a, b));
            final int n2 = luf.b.b + luf.c;
            a += n2;
            b -= n2;
            if (b < 0) {
                b3 = false;
            }
            njo.o(b3);
            list.add(luf);
        }
        njo.o(a == n);
        njo.o(b == 0 && b2);
        return list;
    }
    
    public final void b(final lug lug, final List list) {
        for (final luf luf : list) {
            lug lug2;
            if (this.b.contains(luf.a)) {
                lug2 = new lug(niz.i(luf));
                this.b(lug2, this.a(luf.b));
            }
            else {
                lug2 = new lug(niz.i(luf));
            }
            niz.i(lug);
            lug.b.add(lug2);
        }
    }
}
