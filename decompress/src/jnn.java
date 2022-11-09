// 
// Decompiled by Procyon v0.6.0
// 

public final class jnn
{
    final /* synthetic */ jno a;
    private final String b;
    
    public jnn(final jno a, final long n) {
        this.a = a;
        jvu.h("monitoring");
        jvu.b(n > 0L);
        this.b = "monitoring";
    }
    
    public final String a() {
        return this.b.concat(":count");
    }
    
    public final String b() {
        return this.b.concat(":start");
    }
    
    protected final String c() {
        return this.b.concat(":value");
    }
}
