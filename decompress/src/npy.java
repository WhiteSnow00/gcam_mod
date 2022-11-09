import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class npy extends npv implements Serializable
{
    private static final long serialVersionUID = 0L;
    private final Object a;
    private final int b;
    
    public npy(final Object a, final int b) {
        this.a = a;
        nqb.C(this.b = b, "count");
    }
    
    @Override
    public final int a() {
        return this.b;
    }
    
    @Override
    public final Object b() {
        return this.a;
    }
}
