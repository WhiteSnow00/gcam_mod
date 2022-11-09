import java.util.List;
import java.util.Collection;
import java.util.ArrayList;
import java.util.LinkedHashSet;
import java.util.Set;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class alu
{
    protected final Context a;
    public final Object b;
    public final Set c;
    public Object d;
    protected final apa e;
    
    static {
        aiy.b("ConstraintTracker");
    }
    
    public alu(final Context context, final apa e) {
        this.b = new Object();
        this.c = new LinkedHashSet();
        this.a = context.getApplicationContext();
        this.e = e;
    }
    
    public abstract Object b();
    
    public abstract void d();
    
    public abstract void e();
    
    public final void f(final alc alc) {
        synchronized (this.b) {
            if (this.c.remove(alc) && this.c.isEmpty()) {
                this.e();
            }
        }
    }
    
    public final void g(final Object d) {
        synchronized (this.b) {
            final Object d2 = this.d;
            if (d2 != d && (d2 == null || !d2.equals(d))) {
                this.d = d;
                this.e.c.execute(new alt(this, new ArrayList(this.c)));
            }
        }
    }
}
