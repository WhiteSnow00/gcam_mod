import android.database.MatrixCursor;
import android.database.Cursor;
import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drg implements drc
{
    private final drs a;
    
    public drg(final drs a) {
        this.a = a;
    }
    
    @Override
    public final Cursor a(final Uri uri, final String[] array) {
        final long a = dqv.a(uri);
        final MatrixCursor matrixCursor = new MatrixCursor(new String[] { "special_type_id" });
        final niz a2 = this.a.a(a);
        if (a2.g() && !((drk)a2.c()).equals(drk.a)) {
            matrixCursor.addRow(new Object[] { ((drk)a2.c()).c() });
        }
        if (a2.g()) {
            a2.c();
        }
        return (Cursor)matrixCursor;
    }
}
