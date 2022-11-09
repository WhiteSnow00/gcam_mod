import android.content.Intent;

// 
// Decompiled by Procyon v0.6.0
// 

final class aky implements Runnable
{
    private final akz a;
    
    public aky(final akz a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final akz a = this.a;
        aiy.a().d(new Throwable[0]);
        a.b();
        synchronized (a.g) {
            if (a.h != null) {
                final aiy a2 = aiy.a();
                String.format("Removing command %s", a.h);
                a2.d(new Throwable[0]);
                if (!((Intent)a.g.remove(0)).equals(a.h)) {
                    throw new IllegalStateException("Dequeue-d command is not the first.");
                }
                a.h = null;
            }
            final anz a3 = a.j.a;
            final akq f = a.f;
            synchronized (f.d) {
                final boolean empty = f.c.isEmpty();
                monitorexit(f.d);
                if (!(empty ^ true) && a.g.isEmpty()) {
                    final Object b = a3.b;
                    synchronized (f.d) {
                        final boolean empty2 = a3.a.isEmpty();
                        monitorexit(f.d);
                        if (!(empty2 ^ true)) {
                            aiy.a().d(new Throwable[0]);
                            final akx i = a.i;
                            if (i != null) {
                                i.a();
                            }
                            return;
                        }
                    }
                }
                if (!a.g.isEmpty()) {
                    a.e();
                }
            }
        }
    }
}
