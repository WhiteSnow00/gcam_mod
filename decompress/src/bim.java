import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bim implements Executor
{
    private final /* synthetic */ int a;
    
    public bim() {
    }
    
    public bim(final int a) {
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        switch (this.a) {
            default: {
                runnable.run();
                return;
            }
            case 2: {
                runnable.run();
                return;
            }
            case 1: {
                runnable.run();
                return;
            }
            case 0: {
                biv.j(runnable);
            }
        }
    }
}
