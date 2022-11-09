// 
// Decompiled by Procyon v0.6.0
// 

public final class grx
{
    public final kvs a;
    public final /* synthetic */ gry b;
    
    public grx(final gry b, final kvs a) {
        this.b = b;
        this.a = a;
    }
    
    public final kwz a() {
        final noi c = this.a.i().c;
        kwz kwz;
        if (c.contains(this.b.a)) {
            kwz = this.b.a;
        }
        else if (c.contains(this.b.b)) {
            kwz = this.b.b;
        }
        else if (c.contains(this.b.c)) {
            kwz = this.b.c;
        }
        else if (c.contains(this.b.d)) {
            kwz = this.b.d;
        }
        else {
            kwz = null;
        }
        kwz.getClass();
        return kwz;
    }
    
    public final kwz b() {
        final gry b = this.b;
        if (b.b != null && (b.c != null || b.d != null)) {
            final noi c = this.a.i().c;
            if (c.contains(this.b.b)) {
                if (c.contains(this.b.c)) {
                    return this.b.c;
                }
                if (c.contains(this.b.d)) {
                    return this.b.d;
                }
            }
        }
        return null;
    }
    
    public final lju c(final kwz kwz) {
        if (kwz == null) {
            return null;
        }
        try {
            return this.a.d(kwz);
        }
        catch (final IllegalArgumentException ex) {
            return null;
        }
    }
    
    public final lju d() {
        return this.c(this.b.e);
    }
    
    public final lju e() {
        return this.c(this.a());
    }
    
    public final lju f() {
        return this.c(this.b());
    }
    
    public final lju g() {
        return this.c(this.b.g);
    }
    
    public final boolean h() {
        return this.b() != null;
    }
}
