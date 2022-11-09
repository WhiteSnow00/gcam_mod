import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dbj
{
    public static final Executor a;
    
    static {
        a = mcn.h("JankMonitorMode");
    }
    
    public static hub a(final klv klv, final bmz bmz, final dbk dbk, final ivj ivj) {
        return new dbg(bmz, klv, dbk, ivj);
    }
}
