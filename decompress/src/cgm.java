import java.util.concurrent.ExecutionException;
import java.io.FileDescriptor;
import java.util.UUID;
import java.util.concurrent.Executor;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cgm implements cgr
{
    public static final nsd a;
    public final hie b;
    public FileOutputStream c;
    public final ofn d;
    private final hia e;
    private final Executor f;
    private final kse g;
    private int h;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/file/MediaFileOutputVideo");
    }
    
    public cgm(final hie b, final hia e, final Executor f, final kse g) {
        this.d = ofn.f();
        this.b = b;
        this.e = e;
        this.f = f;
        this.g = g;
        f.execute(g.c("MFOV#Init", new cgl(this, e)));
        this.h = 1;
        UUID.randomUUID().toString();
    }
    
    @Override
    public final long a() {
        return this.e.a.a();
    }
    
    @Override
    public final niz c() {
        return niz.i(this.e);
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            final int h = this.h;
            if (h == 0) {
                throw null;
            }
            if (h != 1) {
                return;
            }
            this.h = 3;
            this.f.execute(new cgk(this));
        }
    }
    
    @Override
    public final niz d() {
        return niz.i(this.b);
    }
    
    @Override
    public final oey e() {
        return this.d;
    }
    
    @Override
    public final FileDescriptor f() {
        try {
            try {
                this.g.f("MFOV#getFileDescriptor");
                final FileDescriptor fileDescriptor = (FileDescriptor)this.d.get();
                this.g.g();
                return fileDescriptor;
            }
            finally {}
        }
        catch (final ExecutionException ex) {}
        catch (final InterruptedException ex2) {}
        final ExecutionException ex;
        cgm.a.b().h(ex).E(421).o("Can't get file descriptor.");
        throw new RuntimeException(ex);
        this.g.g();
    }
    
    @Override
    public final void g() {
        synchronized (this) {
            final int h = this.h;
            if (h == 0) {
                throw null;
            }
            if (h != 1) {
                return;
            }
            this.h = 2;
            this.f.execute(new cgk(this, 1));
        }
    }
    
    @Override
    public final void i() {
    }
}
