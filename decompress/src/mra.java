// 
// Decompiled by Procyon v0.6.0
// 

public final class mra
{
    public static final mra a;
    public final boolean b;
    public final boolean c;
    public final nns d;
    
    static {
        final mqz a2 = a();
        a2.b();
        a = a2.a();
        final mqz a3 = a();
        njo.p(a3.b == null, "A SourcePolicy can only set internal() or external() once.");
        a3.b = true;
        a3.a();
    }
    
    public mra(final boolean b, final boolean c, final nns d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static mqz a() {
        return new mqz();
    }
}
