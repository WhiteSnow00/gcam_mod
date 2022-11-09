import java.io.PrintStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class oxu extends oxt
{
    private final PrintStream a;
    
    public oxu(final PrintStream a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        this.a.println(o);
    }
}
