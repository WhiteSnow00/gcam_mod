import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsh
{
    public static final nsd a;
    public static Executor b;
    public final lyp c;
    public final Executor d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gl/GLGuardFactory");
    }
    
    public dsh(final lyp c, final Executor d) {
        this.c = c;
        this.d = d;
    }
    
    public final dsg a(final AutoCloseable autoCloseable) {
        return new dsg(this, autoCloseable);
    }
}
