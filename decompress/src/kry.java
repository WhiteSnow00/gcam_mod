import android.os.Trace;

// 
// Decompiled by Procyon v0.6.0
// 

final class kry implements ksh
{
    private final int a;
    private final String c;
    
    public kry(final int a, final String c) {
        njo.p(c.isEmpty() ^ true, "Empty msg.");
        this.a = a;
        Trace.beginAsyncSection(this.c = c, a);
    }
    
    @Override
    public final void a() {
        Trace.endAsyncSection(this.c, this.a);
    }
}
