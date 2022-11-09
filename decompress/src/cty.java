import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cty implements Executor
{
    private final Executor a;
    private final krr b;
    
    public cty(final krr krr, final cxl cxl, final Executor a) {
        this.a = a;
        this.b = krr.a("SQLiteExpnCatchr");
        final cxo a2 = cxr.a;
        cxl.c();
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        this.a.execute(new ctx(this.b, runnable));
    }
}
