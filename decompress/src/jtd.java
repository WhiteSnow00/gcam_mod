import android.os.Looper;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jtd
{
    public volatile Object a;
    public volatile jtb b;
    private final Executor c;
    
    public jtd(final Looper looper, final Object a, final String s) {
        this.c = new kek(looper, 1);
        this.a = a;
        jvu.h(s);
        this.b = new jtb(a, s);
    }
    
    public final void a() {
        this.a = null;
        this.b = null;
    }
    
    public final void b(final jtc jtc) {
        jvu.j(jtc, "Notifier must not be null");
        this.c.execute(new jta(this, jtc));
    }
}
