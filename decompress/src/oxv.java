import java.io.PrintWriter;

// 
// Decompiled by Procyon v0.6.0
// 

final class oxv extends oxt
{
    private final PrintWriter a;
    
    public oxv(final PrintWriter a) {
        this.a = a;
    }
    
    @Override
    public final void a(final Object o) {
        this.a.println(o);
    }
}
