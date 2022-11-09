import java.io.IOException;
import java.io.File;
import java.io.RandomAccessFile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oqx implements oqw
{
    private final RandomAccessFile a;
    private long b;
    private long c;
    
    public oqx(final File file) {
        this.a = new RandomAccessFile(file, "r");
        this.b = 0L;
        this.c = 0L;
    }
    
    @Override
    public final int a(final byte[] array, int read, final int n) {
        monitorenter(this);
        boolean b;
        if (65536 - read >= n) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            njo.e(b, "Buffer length must be greater than desired number of bytes.");
            if (n == 0) {
                return 0;
            }
            if (this.c != this.a.getFilePointer()) {
                this.a.seek(this.c);
            }
            read = this.a.read(array, read, n);
            if (read != -1) {
                this.c += read;
                return read;
            }
            return 0;
        }
        finally {
            monitorexit(this);
        }
    }
    
    @Override
    public final long b() {
        synchronized (this) {
            return this.b;
        }
    }
    
    @Override
    public final long c() {
        synchronized (this) {
            return this.c;
        }
    }
    
    @Override
    public final void close() {
        synchronized (this) {
            this.a.close();
        }
    }
    
    @Override
    public final long d() {
        synchronized (this) {
            try {
                return this.a.length();
            }
            catch (final IOException ex) {
                return -1L;
            }
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            this.b = this.c;
        }
    }
    
    @Override
    public final void f() {
        synchronized (this) {
            this.c = this.b;
        }
    }
    
    @Override
    public final boolean g() {
        monitorenter(this);
        try {
            final boolean b = this.c < this.a.length();
            monitorexit(this);
            return b;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void h(long min) {
        monitorenter(this);
        boolean b;
        if (min >= 0L) {
            b = true;
        }
        else {
            b = false;
        }
        try {
            njo.e(b, "Can't skip negative bytes.");
            if (min == 0L) {
                return;
            }
            min = Math.min(this.c + min, this.a.length());
            this.a.seek(min);
            this.c = min;
        }
        finally {
            monitorexit(this);
        }
    }
}
