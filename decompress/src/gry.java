import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gry
{
    public final kwz a;
    public final kwz b;
    public final kwz c;
    public final kwz d;
    public final kwz e;
    public final kwz f;
    public final kwz g;
    
    public gry(final Map map) {
        this.a = map.get(gti.a);
        this.b = map.get(gti.c);
        this.c = map.get(gti.d);
        this.d = map.get(gti.b);
        this.e = map.get(gti.e);
        this.f = map.get(gti.f);
        this.g = map.get(gti.h);
    }
    
    public final grx a(final kvs kvs) {
        return new grx(this, kvs);
    }
}
