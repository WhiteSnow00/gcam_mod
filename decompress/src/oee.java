import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class oee extends AtomicReference implements Executor, Runnable
{
    oeg a;
    Executor b;
    Runnable c;
    Thread d;
    
    public oee(final Executor b, final oeg a) {
        super(oed.a);
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final void execute(final Runnable runnable) {
        if (this.get() == oed.b) {
            this.b = null;
            this.a = null;
            return;
        }
        this.d = Thread.currentThread();
        try {
            final oeg a = this.a;
            a.getClass();
            final oef a2 = a.a;
            if (a2.a == this.d) {
                this.a = null;
                njo.o(a2.b == null);
                a2.b = runnable;
                final Executor b = this.b;
                b.getClass();
                a2.c = b;
                this.b = null;
            }
            else {
                final Executor b2 = this.b;
                b2.getClass();
                this.b = null;
                this.c = runnable;
                b2.execute(this);
            }
        }
        finally {
            this.d = null;
        }
    }
    
    @Override
    public final void run() {
        final Thread currentThread = Thread.currentThread();
        if (currentThread != this.d) {
            final Runnable c = this.c;
            c.getClass();
            this.c = null;
            c.run();
            return;
        }
        final oef a = new oef();
        a.a = currentThread;
        final oeg a2 = this.a;
        a2.getClass();
        a2.a = a;
        this.a = null;
        try {
            final Runnable c2 = this.c;
            c2.getClass();
            this.c = null;
            c2.run();
            while (true) {
                final Runnable b = a.b;
                boolean b2 = true;
                final boolean b3 = b != null;
                final Executor c3 = a.c;
                if (c3 == null) {
                    b2 = false;
                }
                if (!(b2 & b3)) {
                    break;
                }
                a.b = null;
                a.c = null;
                c3.execute(b);
            }
            a.a = null;
        }
        finally {
            a.a = null;
            while (true) {}
        }
    }
}
