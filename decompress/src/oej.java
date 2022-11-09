import java.util.concurrent.Future;

// 
// Decompiled by Procyon v0.6.0
// 

public class oej extends oek
{
    private final Future a;
    
    protected oej(final Future a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    protected final Future b() {
        return this.a;
    }
}
