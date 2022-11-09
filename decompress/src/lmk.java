import android.net.Uri;
import java.io.RandomAccessFile;
import java.util.Locale;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmk implements llw
{
    private final File a;
    private final lmf b;
    private final krr c;
    
    public lmk(final File a, final lmf b, final krr krr) {
        this.a = a;
        this.b = b;
        this.c = krr.a("SimpleFileObject");
    }
    
    public static lmk l(final lmf lmf, final llu llu, final krr krr) {
        return new lmk(lmf.b(llu), lmf, krr);
    }
    
    private final void m() {
        final File parentFile = this.a.getParentFile();
        parentFile.getClass();
        if (!parentFile.exists() && !parentFile.mkdirs()) {
            throw new IOException("Unable to create or find media storage directory");
        }
    }
    
    @Override
    public final long a() {
        if (this.a.exists()) {
            return this.a.length();
        }
        return -1L;
    }
    
    @Override
    public final FileInputStream b() {
        return new FileInputStream(this.a);
    }
    
    @Override
    public final FileOutputStream c() {
        throw null;
    }
    
    @Override
    public final void d() {
        this.m();
        try {
            if (!this.a.exists()) {
                this.a.createNewFile();
            }
        }
        finally {
            final String value = String.valueOf(this.a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
            sb.append("Unable to create ");
            sb.append(value);
            sb.append("!");
            final Throwable t;
            throw new IOException(sb.toString(), t);
        }
    }
    
    @Override
    public final boolean e() {
        return this.a.canRead();
    }
    
    @Override
    public final boolean f() {
        if (this.a.exists()) {
            return this.a.canWrite();
        }
        File file;
        for (file = this.a.getParentFile(); file != null && !file.exists(); file = file.getParentFile()) {}
        final boolean b = file != null && file.canExecute() && file.canWrite();
        if (!b) {
            this.c.f(String.format(Locale.ROOT, "Cannot write to %s, with earliestExistingParentFolder=%s()", this.a.getAbsoluteFile(), file));
        }
        return b;
    }
    
    @Override
    public final FileOutputStream g() {
        this.m();
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(this.a, "rw");
            return new lmj(randomAccessFile.getFD(), randomAccessFile);
        }
        finally {
            final String value = String.valueOf(this.a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
            sb.append("Unable to create ");
            sb.append(value);
            sb.append("!");
            final Throwable t;
            throw new IOException(sb.toString(), t);
        }
    }
    
    @Override
    public final Uri h() {
        return Uri.EMPTY;
    }
    
    @Override
    public final lmf i() {
        return this.b;
    }
    
    @Override
    public final void j() {
    }
    
    @Override
    public final boolean k() {
        return this.a.canWrite();
    }
    
    @Override
    public final String toString() {
        final String string = this.b.toString();
        final String absolutePath = this.a.getAbsolutePath();
        final StringBuilder sb = new StringBuilder(String.valueOf(string).length() + 2 + String.valueOf(absolutePath).length());
        sb.append(string);
        sb.append(": ");
        sb.append(absolutePath);
        return sb.toString();
    }
}
