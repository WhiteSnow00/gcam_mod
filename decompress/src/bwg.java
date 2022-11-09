import j$.util.concurrent.ConcurrentHashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bwg
{
    public final bvn a;
    public final njn b;
    public final nju c;
    public final Map d;
    public long e;
    public long f;
    public int g;
    
    public bwg(final bvn a, final nju c) {
        this.d = (Map)new ConcurrentHashMap();
        this.e = 0L;
        this.f = 0L;
        this.g = 0;
        this.a = a;
        this.c = c;
        this.b = njn.b(c);
    }
}
