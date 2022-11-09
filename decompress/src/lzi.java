import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lzi
{
    public final int a;
    public final maq b;
    public final lzr c;
    public final lzu d;
    public final Map e;
    public final Map f;
    public final List g;
    public boolean h;
    
    public lzi(final int a, final maq b, final lzr c, final lzu d) {
        this.e = new HashMap();
        this.f = new HashMap();
        this.g = new ArrayList();
        final boolean b2 = true;
        this.h = true;
        njo.d(b.a.a == d.a);
        boolean b3;
        if (c != null) {
            b3 = (c.a.a == d.a && b2);
        }
        else {
            b3 = b2;
        }
        njo.d(b3);
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static lzf a(final maq maq) {
        njo.d(maq.c % 3 == 0);
        return new lzf(4, maq, null);
    }
    
    public final void b(final lyo lyo) {
        njo.d(lyo.a == this.d.a);
        lyo.i(ftm.g, new lzc(this)).h(lvm.a);
    }
    
    public final void c(final String s, final int n) {
        njo.d(n < this.b.b.length);
        this.f.put(s, n);
    }
    
    public final void d(final lzn lzn) {
        njo.d(lzn.a == this.d.a);
        this.g.add(new lzg(this, lzn, "uImgTex"));
    }
    
    public final void e(final String s, final float n) {
        this.e.put(s, new lzd(s, n));
    }
    
    public final void f(final man man) {
        njo.d(man.a == this.d.a);
        this.g.add(new lzg(this, man, "imgTex"));
    }
}
