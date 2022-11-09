import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dro
{
    public static final String[] a;
    public final ofn b;
    public final ofn c;
    public final Executor d;
    
    static {
        a = new String[] { "special_type_id" };
    }
    
    public dro(final drq drq, final Executor d) {
        this.b = ofn.f();
        this.c = ofn.f();
        (this.d = d).execute(new drl(this, drq));
    }
}
