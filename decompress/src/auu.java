import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.ArrayList;
import java.util.Arrays;

// 
// Decompiled by Procyon v0.6.0
// 

public final class auu
{
    public final bca a;
    public final bgx b;
    public final bhc c;
    public final bhe d;
    public final bga e;
    public final bha f;
    public final bgz g;
    public final hp h;
    private final awu i;
    private final bgy j;
    
    public auu() {
        this.f = new bha();
        this.g = new bgz();
        final hp a = bjc.a(new hr(20), new bal(2), new bix());
        this.h = a;
        this.a = new bca(a);
        this.b = new bgx();
        this.c = new bhc();
        this.d = new bhe();
        this.i = new awu();
        this.e = new bga();
        this.j = new bgy();
        final List<String> list = Arrays.asList("Gif", "Bitmap", "BitmapDrawable");
        final ArrayList list2 = new ArrayList(list.size());
        list2.add((Object)"legacy_prepend_all");
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            list2.add((Object)iterator.next());
        }
        list2.add((Object)"legacy_append");
        this.c.d(list2);
    }
    
    public final awr a(final Object o) {
        return this.i.a(o);
    }
    
    public final List b() {
        final List a = this.j.a();
        if (!a.isEmpty()) {
            return a;
        }
        throw new auq();
    }
    
    public final List c(final Object o) {
        final List b = this.a.b(o.getClass());
        if (b.isEmpty()) {
            throw new aur(o);
        }
        final int size = b.size();
        List<Object> emptyList = Collections.emptyList();
        int n = 1;
        for (int i = 0; i < size; ++i) {
            final bbw bbw = b.get(i);
            if (bbw.b(o)) {
                if (n != 0) {
                    emptyList = new ArrayList<Object>(size - i);
                }
                emptyList.add(bbw);
                n = 0;
            }
        }
        if (!emptyList.isEmpty()) {
            return emptyList;
        }
        throw new aur(o, b);
    }
    
    public final void d(final Class clazz, final avr avr) {
        this.b.b(clazz, avr);
    }
    
    public final void e(final Class clazz, final awj awj) {
        this.d.b(clazz, awj);
    }
    
    public final void f(final Class clazz, final Class clazz2, final awi awi) {
        this.h("legacy_append", clazz, clazz2, awi);
    }
    
    public final void g(final Class clazz, final Class clazz2, final bbx bbx) {
        this.a.c(clazz, clazz2, bbx);
    }
    
    public final void h(final String s, final Class clazz, final Class clazz2, final awi awi) {
        this.c.c(s, awi, clazz, clazz2);
    }
    
    public final void i(final avt avt) {
        this.j.b(avt);
    }
    
    public final void j(final awq awq) {
        this.i.b(awq);
    }
    
    public final void k(final Class clazz, final Class clazz2, final bfy bfy) {
        this.e.c(clazz, clazz2, bfy);
    }
}
