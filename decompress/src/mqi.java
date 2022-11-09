// 
// Decompiled by Procyon v0.6.0
// 

public final class mqi
{
    private final boolean a;
    private final boolean b;
    private final boolean c;
    
    public mqi() {
        this(false, false, false);
    }
    
    private mqi(final boolean a, final boolean b, final boolean c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final mqd a(final String s, final boolean b) {
        return new mqd(s, b, new mox(this.a, this.b, this.c, mqe.a, new mqg(Boolean.class, 1)));
    }
    
    public final mqd b(final String s, final Object o, final mqh mqh) {
        return new mqd(s, o, new mox(this.a, this.b, this.c, new mqf(mqh), new mqf(mqh, 1)));
    }
    
    public final mqi c() {
        return new mqi(true, this.b, this.c);
    }
    
    public final mqi d() {
        return new mqi(this.a, this.b, true);
    }
    
    public final mqi e() {
        return new mqi(this.a, true, this.c);
    }
    
    public final void f(final String s, final long n) {
        final mqd mqd = new mqd(s, n, new mox(this.a, this.b, this.c, mqe.c, new mqg(Long.class)));
    }
    
    public final void g(final String s, final String s2) {
        final mqd mqd = new mqd(s, s2, new mox(this.a, this.b, this.c, mqe.b, new mqg(String.class, 2)));
    }
}
