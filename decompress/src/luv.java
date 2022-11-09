import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class luv
{
    public static final String a;
    public final Set b;
    
    static {
        a = luv.class.getSimpleName();
    }
    
    public luv() {
        new luu(this);
        this.b = new HashSet();
    }
    
    public luv(final ThreadFactory threadFactory) {
        if (threadFactory == null) {
            Executors.newSingleThreadScheduledExecutor();
        }
        else {
            Executors.newSingleThreadScheduledExecutor(threadFactory);
        }
        this();
    }
    
    public abstract Object a();
}
