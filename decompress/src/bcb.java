import java.util.Iterator;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcb implements awp, awo
{
    private final List a;
    private final hp b;
    private int c;
    private auo d;
    private awo e;
    private List f;
    private boolean g;
    
    public bcb(final List a, final hp b) {
        this.b = b;
        bit.d(a);
        this.a = a;
        this.c = 0;
    }
    
    private final void h() {
        if (this.g) {
            return;
        }
        if (this.c < this.a.size() - 1) {
            ++this.c;
            this.f(this.d, this.e);
            return;
        }
        bit.a(this.f);
        this.e.e(new ayv("Fetch failed", new ArrayList(this.f)));
    }
    
    @Override
    public final Class a() {
        return this.a.get(0).a();
    }
    
    @Override
    public final void aI() {
        this.g = true;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((awp)iterator.next()).aI();
        }
    }
    
    @Override
    public final void b(final Object o) {
        if (o != null) {
            this.e.b(o);
            return;
        }
        this.h();
    }
    
    @Override
    public final void d() {
        final List f = this.f;
        if (f != null) {
            this.b.b(f);
        }
        this.f = null;
        final Iterator iterator = this.a.iterator();
        while (iterator.hasNext()) {
            ((awp)iterator.next()).d();
        }
    }
    
    @Override
    public final void e(final Exception ex) {
        final List f = this.f;
        bit.a(f);
        f.add(ex);
        this.h();
    }
    
    @Override
    public final void f(final auo d, final awo e) {
        this.d = d;
        this.e = e;
        this.f = (List)this.b.a();
        this.a.get(this.c).f(d, this);
        if (this.g) {
            this.aI();
        }
    }
    
    @Override
    public final int g() {
        return this.a.get(0).g();
    }
}
