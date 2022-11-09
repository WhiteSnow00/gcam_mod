import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class peu implements oxl
{
    final AtomicReference a;
    final oxl b;
    private final /* synthetic */ int c;
    
    public peu(final AtomicReference a, final oxl b) {
        this.a = a;
        this.b = b;
    }
    
    public peu(final AtomicReference a, final oxl b, final int c) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void b(final Throwable t) {
        switch (this.c) {
            default: {
                this.b.b(t);
                return;
            }
            case 0: {
                this.b.b(t);
            }
        }
    }
    
    @Override
    public final void bV(final oxp oxp) {
        switch (this.c) {
            default: {
                oyj.h(this.a, oxp);
                return;
            }
            case 0: {
                oyj.h(this.a, oxp);
            }
        }
    }
    
    @Override
    public final void d(final Object o) {
        switch (this.c) {
            default: {
                this.b.d(o);
                return;
            }
            case 0: {
                this.b.d(o);
            }
        }
    }
}
