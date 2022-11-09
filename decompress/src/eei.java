// 
// Decompiled by Procyon v0.6.0
// 

final class eei extends Thread
{
    final /* synthetic */ eel a;
    
    public eei(final eel a) {
        this.a = a;
        super("EncoderDrainerWriteThread");
    }
    
    @Override
    public final void run() {
        final eel a = this.a;
        while (a.j) {
            synchronized (a.e) {
                while (a.d.size() > 100) {
                    eel.a.b().E(1148).o("Dropping frames in drainer!");
                    a.d.poll();
                    ++a.k;
                }
                final eek eek = a.d.poll();
                monitorexit(a.e);
                if (eek != null) {
                    a.c.c(a.f, eek.a, eek.b);
                }
                final Object e = a.e;
                synchronized (a.e) {
                    if (a.d.isEmpty()) {
                        if (a.h) {
                            return;
                        }
                    }
                    while (a.d.isEmpty() && !a.h) {
                        try {
                            a.e.wait();
                        }
                        catch (final InterruptedException ex) {
                            eel.a.b().h(ex).E(1147).o("Interrupted during wait");
                        }
                    }
                }
            }
            break;
        }
    }
}
