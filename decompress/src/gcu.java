import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class gcu
{
    public final String a;
    public final List b;
    
    public gcu(final String a, final List b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("ValidationResult");
        d.b("strategy", this.a);
        d.c("valid", "false");
        d.b("failed constraints", this.b);
        return d.toString();
    }
}
