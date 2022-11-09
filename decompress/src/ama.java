import androidx.work.impl.WorkDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ama implements Runnable
{
    final /* synthetic */ WorkDatabase a;
    final /* synthetic */ String b;
    final /* synthetic */ amc c;
    
    public ama(final amc c, final WorkDatabase a, final String b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final ana a = this.a.s().a(this.b);
        if (a != null && a.b()) {
            synchronized (this.c.c) {
                this.c.f.put(this.b, a);
                this.c.g.add(a);
                final amc c = this.c;
                c.h.a(c.g);
            }
        }
    }
}
