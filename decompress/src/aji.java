import androidx.work.Worker;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aji implements Runnable
{
    final /* synthetic */ Worker a;
    
    public aji(final Worker a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            this.a.f.e(this.a.h());
        }
        finally {
            final Throwable t;
            this.a.f.f(t);
        }
    }
}
