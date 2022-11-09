import android.database.Cursor;
import android.content.ContentValues;
import java.util.Arrays;
import java.io.FileDescriptor;
import android.net.Uri;
import java.io.PrintWriter;
import android.content.ContentProvider;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class dbe extends ContentProvider
{
    public abstract void a(final PrintWriter p0);
    
    public final int delete(final Uri uri, final String s, final String[] array) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support delete");
    }
    
    public final void dump(final FileDescriptor fileDescriptor, final PrintWriter printWriter, final String[] array) {
        try {
            Arrays.asList(array);
            this.a(printWriter);
        }
        catch (final Exception ex) {
            printWriter.flush();
            ex.printStackTrace(printWriter);
            printWriter.flush();
        }
    }
    
    public final String getType(final Uri uri) {
        return "text/plain";
    }
    
    public final Uri insert(final Uri uri, final ContentValues contentValues) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support insert");
    }
    
    public final boolean onCreate() {
        return true;
    }
    
    public final Cursor query(final Uri uri, final String[] array, final String s, final String[] array2, final String s2) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support query");
    }
    
    public final int update(final Uri uri, final ContentValues contentValues, final String s, final String[] array) {
        throw new UnsupportedOperationException("BasicDebugDumper does not support update");
    }
}
