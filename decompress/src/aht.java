import java.util.concurrent.Executor;
import android.app.Activity;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aht
{
    public final Activity a;
    public final ho b;
    public aif c;
    private final Executor d;
    
    public aht(final Activity a, final Executor d, final ho b) {
        d.getClass();
        b.getClass();
        this.a = a;
        this.d = d;
        this.b = b;
    }
    
    public final void a(final aif c) {
        this.c = c;
        this.d.execute(new ahs(this, c));
    }
}
