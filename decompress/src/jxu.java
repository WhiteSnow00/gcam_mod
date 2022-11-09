import android.os.Parcelable;
import java.io.FileNotFoundException;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import android.os.Parcel;
import java.io.IOException;
import android.util.Log;
import java.io.Closeable;
import java.io.File;
import android.os.ParcelFileDescriptor;
import android.os.Parcelable$Creator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jxu extends jwc
{
    public static final Parcelable$Creator CREATOR;
    ParcelFileDescriptor a;
    final String b;
    final String c;
    public File d;
    
    static {
        CREATOR = (Parcelable$Creator)new ul(11);
    }
    
    public jxu(final ParcelFileDescriptor a, final String b, final String c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    static final void a(final Closeable closeable) {
        try {
            closeable.close();
        }
        catch (final IOException ex) {
            Log.w("FileTeleporter", "Could not close stream", (Throwable)ex);
        }
    }
    
    public final void writeToParcel(final Parcel parcel, final int n) {
        if (this.a == null) {
            final File d = this.d;
            if (d != null) {
                try {
                    final File tempFile = File.createTempFile("teleporter", ".tmp", d);
                    try {
                        final FileOutputStream fileOutputStream = new FileOutputStream(tempFile);
                        this.a = ParcelFileDescriptor.open(tempFile, 268435456);
                        tempFile.delete();
                        final DataOutputStream dataOutputStream = new DataOutputStream(fileOutputStream);
                        try {
                            try {
                                dataOutputStream.writeInt(null.length);
                                dataOutputStream.writeUTF(this.b);
                                dataOutputStream.writeUTF(this.c);
                                dataOutputStream.write(null);
                                a(dataOutputStream);
                            }
                            finally {}
                        }
                        catch (final IOException ex) {
                            throw new IllegalStateException("Could not write into unlinked file", ex);
                        }
                        a(dataOutputStream);
                    }
                    catch (final FileNotFoundException ex2) {
                        throw new IllegalStateException("Temporary file is somehow already deleted.");
                    }
                }
                catch (final IOException ex3) {
                    throw new IllegalStateException("Could not create temporary file:", ex3);
                }
            }
            throw new IllegalStateException("setTempDir() must be called before writing this object to a parcel.");
        }
        final int g = jwn.g(parcel);
        jwn.u(parcel, 2, (Parcelable)this.a, n);
        jwn.v(parcel, 3, this.b);
        jwn.v(parcel, 4, this.c);
        jwn.i(parcel, g);
    }
}
