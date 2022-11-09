import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

final class akj implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ akl b;
    final /* synthetic */ aox c;
    
    public akj(final akl b, final aox c, final String a) {
        this.b = b;
        this.c = c;
        this.a = a;
    }
    
    @Override
    public final void run() {
        try {
            try {
                final cwx i = (cwx)this.c.get();
                if (i == null) {
                    aiy.a();
                    aiy.e(akl.a, String.format("%s returned a null result. Treating it as a failure.", this.b.c.b), new Throwable[0]);
                }
                else {
                    final aiy a = aiy.a();
                    final int j = akl.j;
                    String.format("%s returned a %s result.", this.b.c.b, i);
                    a.d(new Throwable[0]);
                    this.b.i = i;
                }
                final akl akl = this.b;
                akl.a();
            }
            finally {
                this.b.a();
                while (true) {}
                aiy.a();
                final Throwable t;
                aiy.e(akl.a, String.format("%s failed because it threw an exception/error", this.a), t);
                final akl akl = this.b;
            }
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        catch (final CancellationException ex3) {}
    }
}
