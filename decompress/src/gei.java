import java.util.concurrent.atomic.AtomicBoolean;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gei implements gem
{
    public final fvn a;
    public final kjm b;
    public final AtomicBoolean c;
    public final hhy d;
    private final AtomicBoolean e;
    private gel f;
    
    public gei(final fvn a, final kjm b, final hhy d) {
        this.a = a;
        this.b = b;
        this.d = d;
        this.e = new AtomicBoolean(false);
        this.c = new AtomicBoolean(true);
    }
    
    @Override
    public final gel a() {
        njo.o(this.e.getAndSet(true) ^ true);
        return this.f = new ged(this);
    }
    
    @Override
    public final gel b() {
        njo.o(this.e.getAndSet(true) ^ true);
        return this.f = new gef(this);
    }
    
    @Override
    public final gel c() {
        njo.o(this.e.getAndSet(true) ^ true);
        return this.f = new geh(this);
    }
    
    @Override
    public final gel d() {
        return this.f;
    }
    
    @Override
    public final gel e() {
        final gel f = this.f;
        if (f != null) {
            return f;
        }
        return this.c();
    }
    
    @Override
    public final void f() {
        this.b.execute(new geb(this));
    }
    
    @Override
    public final void g() {
        this.e.set(false);
    }
}
