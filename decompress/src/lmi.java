import android.os.ParcelFileDescriptor$AutoCloseOutputStream;
import android.util.Log;
import java.io.FileOutputStream;
import android.os.ParcelFileDescriptor$AutoCloseInputStream;
import java.util.Locale;
import java.io.FileInputStream;
import android.os.ParcelFileDescriptor;
import java.io.IOException;
import android.content.ContentValues;
import android.net.Uri;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

final class lmi implements llw
{
    private final ContentResolver a;
    private final lmf b;
    private Uri c;
    private final ContentValues d;
    private final llu e;
    
    public lmi(final lmf b, final ContentResolver a, final ContentValues d, final llu e) {
        this.b = b;
        this.c = Uri.EMPTY;
        this.a = a;
        this.d = d;
        this.e = e;
    }
    
    @Override
    public final long a() {
        if (!Uri.EMPTY.equals((Object)this.c)) {
            try {
                final ParcelFileDescriptor openFileDescriptor = this.a.openFileDescriptor(this.c, "r");
                if (openFileDescriptor != null) {
                    try {
                        final long statSize = openFileDescriptor.getStatSize();
                        openFileDescriptor.close();
                        return statSize;
                    }
                    finally {
                        try {
                            openFileDescriptor.close();
                        }
                        finally {
                            final Throwable t;
                            final Throwable t2;
                            t.addSuppressed(t2);
                        }
                    }
                }
            }
            catch (final IOException ex) {}
        }
        return -1L;
    }
    
    @Override
    public final FileInputStream b() {
        this.l();
        final ParcelFileDescriptor openFileDescriptor = this.a.openFileDescriptor(this.c, "r");
        openFileDescriptor.getClass();
        String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for reading for %s", openFileDescriptor.getFd(), this);
        return (FileInputStream)new ParcelFileDescriptor$AutoCloseInputStream(openFileDescriptor);
    }
    
    @Override
    public final FileOutputStream c() {
        throw null;
    }
    
    @Override
    public final void d() {
        this.l();
        if (!Uri.EMPTY.equals((Object)this.c)) {
            final ParcelFileDescriptor openFileDescriptor = this.a.openFileDescriptor(this.c, "w");
            if (openFileDescriptor == null) {
                try {
                    final String value = String.valueOf(this.c);
                    final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 49);
                    sb.append("MediaStore URI created but failed to open fd for ");
                    sb.append(value);
                    Log.w("PendingFileObject", sb.toString());
                }
                finally {}
            }
            if (openFileDescriptor != null) {
                openFileDescriptor.close();
            }
        }
    }
    
    @Override
    public final boolean e() {
        return true;
    }
    
    @Override
    public final boolean f() {
        return true;
    }
    
    @Override
    public final FileOutputStream g() {
        this.l();
        final ParcelFileDescriptor openFileDescriptor = this.a.openFileDescriptor(this.c, "w");
        openFileDescriptor.getClass();
        String.format(Locale.ROOT, "Opened ParcelFileDescriptor(fd = %s) for writing for %s", openFileDescriptor.getFd(), this);
        return (FileOutputStream)new ParcelFileDescriptor$AutoCloseOutputStream(openFileDescriptor);
    }
    
    @Override
    public final Uri h() {
        return this.c;
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
        return true;
    }
    
    final void l() {
        if (!Uri.EMPTY.equals((Object)this.c)) {
            return;
        }
        Uri uri;
        if (lou.c(this.b.e)) {
            uri = this.e.c;
        }
        else {
            if (!lou.d(this.b.e)) {
                final String value = String.valueOf(this.b);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 33);
                sb.append("Trying to insert non-media file: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            uri = this.e.d;
        }
        final Uri insert = this.a.insert(uri, this.d);
        insert.getClass();
        this.c = insert;
    }
    
    @Override
    public final String toString() {
        return this.b.toString();
    }
}
