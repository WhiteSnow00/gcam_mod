import java.util.Iterator;
import java.util.List;
import android.database.MatrixCursor;
import java.util.ArrayList;
import android.database.Cursor;
import android.net.Uri;
import android.content.UriMatcher;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dra implements drc
{
    private final UriMatcher a;
    private final drs b;
    private final dqx c;
    
    public dra(final dqx c, final UriMatcher a, final drs b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final Cursor a(final Uri uri, final String[] array) {
        array.getClass();
        final String[] array2 = array;
        List c = null;
        switch (this.a.match(uri)) {
            default: {
                final String value = String.valueOf(uri);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 18);
                sb.append("Unrecognized uri: ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 8: {
                final long a = dqv.a(uri);
                final ArrayList list = new ArrayList();
                final niz a2 = this.c.a(a);
                c = list;
                if (a2.g()) {
                    list.add(a2.c());
                    c = list;
                    break;
                }
                break;
            }
            case 7: {
                c = this.c.c();
                break;
            }
        }
        final MatrixCursor matrixCursor = new MatrixCursor(array2);
        for (final dqu dqu : c) {
            final Object[] array3 = new Object[array2.length];
            final StringBuilder sb2 = new StringBuilder("{");
            int n = 0;
            while (true) {
                final int length = array2.length;
                if (n >= length) {
                    sb2.append("}");
                    matrixCursor.addRow(array3);
                    break;
                }
                final String s = array2[n];
                int n2 = 0;
                Label_0346: {
                    switch (s.hashCode()) {
                        case 1407525684: {
                            if (s.equals("media_store_id")) {
                                n2 = 0;
                                break Label_0346;
                            }
                            break;
                        }
                        case 44324844: {
                            if (s.equals("progress_percentage")) {
                                n2 = 2;
                                break Label_0346;
                            }
                            break;
                        }
                        case -902562118: {
                            if (s.equals("special_type_id")) {
                                n2 = 3;
                                break Label_0346;
                            }
                            break;
                        }
                        case -939545020: {
                            if (s.equals("progress_status")) {
                                n2 = 1;
                                break Label_0346;
                            }
                            break;
                        }
                    }
                    n2 = -1;
                }
                switch (n2) {
                    default: {
                        final String value2 = String.valueOf(s);
                        String concat;
                        if (value2.length() != 0) {
                            concat = "invalid projection: ".concat(value2);
                        }
                        else {
                            concat = new String("invalid projection: ");
                        }
                        throw new IllegalArgumentException(concat);
                    }
                    case 3: {
                        final niz a3 = this.b.a(dqu.a.a);
                        njo.e(a3.g(), "media store id is not found in locating its special type.");
                        array3[n] = ((drk)a3.c()).c();
                        break;
                    }
                    case 2: {
                        array3[n] = dqu.b();
                        break;
                    }
                    case 1: {
                        array3[n] = dqu.f();
                        break;
                    }
                    case 0: {
                        array3[n] = dqu.a.a;
                        break;
                    }
                }
                sb2.append(s);
                sb2.append(": ");
                sb2.append(array3[n]);
                if (n < length - 1) {
                    sb2.append(", ");
                }
                ++n;
            }
        }
        return (Cursor)matrixCursor;
    }
}
