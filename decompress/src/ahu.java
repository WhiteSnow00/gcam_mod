import java.util.concurrent.CopyOnWriteArrayList;
import java.util.concurrent.locks.ReentrantLock;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahu implements aie
{
    public static volatile ahu a;
    public static final ReentrantLock b;
    public final ahp c;
    public final CopyOnWriteArrayList d;
    
    static {
        b = new ReentrantLock();
    }
    
    public ahu(final ahp c) {
        this.c = c;
        if (c != null) {
            c.c(new ahr(this));
        }
        this.d = new CopyOnWriteArrayList();
    }
}
