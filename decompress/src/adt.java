import android.os.SystemClock;
import android.os.AsyncTask;
import java.io.PrintWriter;
import java.io.FileDescriptor;
import android.content.Context;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class adt extends adu
{
    public volatile ads a;
    private Executor i;
    private volatile ads j;
    
    public adt(final Context context) {
        super(context);
    }
    
    public abstract Object a();
    
    @Deprecated
    @Override
    public final void b(final String s, final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        super.b(s, fileDescriptor, printWriter, array);
        if (this.a != null) {
            printWriter.print(s);
            printWriter.print("mTask=");
            printWriter.print(this.a);
            printWriter.print(" waiting=");
            final boolean a = this.a.a;
            printWriter.println(false);
        }
        if (this.j != null) {
            printWriter.print(s);
            printWriter.print("mCancellingTask=");
            printWriter.print(this.j);
            printWriter.print(" waiting=");
            final boolean a2 = this.j.a;
            printWriter.println(false);
        }
    }
    
    final void c() {
        if (this.j != null || this.a == null) {
            return;
        }
        final boolean a = this.a.a;
        if (this.i == null) {
            this.i = AsyncTask.THREAD_POOL_EXECUTOR;
        }
        final ads a2 = this.a;
        final Executor i = this.i;
        if (a2.f == 1) {
            a2.f = 2;
            i.execute(a2.c);
            return;
        }
        final int f = a2.f;
        if (f == 0) {
            throw null;
        }
        switch (f - 1) {
            default: {
                throw new IllegalStateException("We should never reach this state");
            }
            case 2: {
                throw new IllegalStateException("Cannot execute task: the task has already been executed (a task can be executed only once)");
            }
            case 1: {
                throw new IllegalStateException("Cannot execute task: the task is already running.");
            }
        }
    }
    
    @Override
    protected final void d() {
        this.f();
        this.a = new ads(this);
        this.c();
    }
    
    final void e(final ads ads) {
        if (this.j == ads) {
            SystemClock.uptimeMillis();
            this.j = null;
            this.c();
        }
    }
    
    @Override
    public final void f() {
        if (this.a != null) {
            if (!super.d) {
                super.g = true;
            }
            if (this.j != null) {
                final boolean a = this.a.a;
                this.a = null;
                return;
            }
            final boolean a2 = this.a.a;
            final ads a3 = this.a;
            a3.d.set(true);
            if (a3.c.cancel(false)) {
                this.j = this.a;
            }
            this.a = null;
        }
    }
}
