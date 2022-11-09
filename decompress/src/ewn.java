import j$.util.function.Consumer;
import j$.lang.Iterable$_EL;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ewn implements exn, exh, exj, exl, exm
{
    final List a;
    final List b;
    public int c;
    public ewx d;
    private int e;
    private ewx f;
    private ewx g;
    
    public ewn() {
        this.a = new ArrayList();
        this.b = new ArrayList();
        this.e = 0;
        this.c = 0;
    }
    
    public final void a(final ewx ewx) {
        this.b.remove(ewx);
    }
    
    @Override
    public final void bi() {
        final int c = this.c - 1;
        this.c = c;
        njo.d(c >= 0);
        if (this.c == 0) {
            this.a(this.g);
            for (final exn exn : this.a) {
                if (exn instanceof ewp) {
                    ((ewp)exn).a();
                }
            }
        }
    }
    
    @Override
    public final void bj() {
        final int c = this.c + 1;
        this.c = c;
        njo.d(c > 0);
        if (this.c == 1) {
            final ewl d = ewl.d;
            this.f(d);
            this.g = d;
        }
    }
    
    @Override
    public final void bk() {
        final int e = this.e + 1;
        this.e = e;
        njo.d(e > 0);
        if (this.e == 1) {
            final ewl e2 = ewl.e;
            this.f(e2);
            this.f = e2;
        }
    }
    
    @Override
    public final void e() {
        final int e = this.e - 1;
        this.e = e;
        njo.d(e >= 0);
        if (this.e == 0) {
            this.a(this.f);
            for (final exn exn : this.a) {
                if (exn instanceof ews) {
                    ((ews)exn).b();
                }
            }
        }
    }
    
    public final void f(final ewx ewx) {
        Iterable$_EL.forEach((Iterable)this.a, (Consumer)new ewm(ewx));
        this.b.add(ewx);
    }
    
    public final void g(final exn exn) {
        this.a.add(exn);
        Iterable$_EL.forEach((Iterable)this.b, (Consumer)new eww(exn, 1));
    }
}
