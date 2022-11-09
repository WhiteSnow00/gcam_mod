import j$.util.function.Consumer;
import j$.util.Optional;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcs
{
    private final Optional a;
    
    public jcs(final Optional a) {
        this.a = a;
    }
    
    public final void a() {
        this.a.ifPresent((Consumer)cbc.i);
    }
    
    public final void b() {
        this.a.ifPresent((Consumer)cbc.j);
    }
}
