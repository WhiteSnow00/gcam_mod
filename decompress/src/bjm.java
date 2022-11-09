import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bjm
{
    public final bke a;
    public final iru b;
    public final cxl c;
    private final kjm d;
    
    public bjm(final kjm d, final bke a, final iru b, final cxl c) {
        this.d = d;
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    public final krc a(final klj klj) {
        this.d.execute(new bjl(this, 1));
        return klj.a(new bjk(this), this.d);
    }
    
    public final void b() {
        this.d.execute(new bjl(this));
    }
}
