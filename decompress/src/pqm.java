// 
// Decompiled by Procyon v0.6.0
// 

public final class pqm extends pqn
{
    public static final pnw b;
    public static final pqm d;
    
    static {
        b = new pqo(d = new pqm(), pqf.a("kotlinx.coroutines.io.parallelism", poe.e(64, pqg.a), 0, 0, 12));
    }
    
    private pqm() {
        super(pqt.b, pqt.c, pqt.d);
    }
    
    @Override
    public final void close() {
        throw new UnsupportedOperationException("Dispatchers.Default cannot be closed");
    }
    
    @Override
    public final String toString() {
        return "Dispatchers.Default";
    }
}
