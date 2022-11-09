import android.net.Uri$Builder;
import android.database.MatrixCursor;
import java.util.Arrays;
import android.database.Cursor;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dri implements drc
{
    private static final nsd a;
    private final Context b;
    private final String c;
    
    static {
        a = nsd.g("com/google/android/apps/camera/gallery/query/SpecialTypeMetadataQueryHandler");
    }
    
    public dri(final Context b, final String c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Cursor a(final Uri uri, String[] array) {
        if (array == null) {
            return null;
        }
        array = array;
        final niz b = drk.b(Uri.decode(uri.getLastPathSegment()));
        if (!b.g()) {
            dri.a.c().E(889).x("Illegal type from uri %s including %s", uri, Arrays.toString(array));
            return null;
        }
        final drk drk = (drk)b.c();
        final MatrixCursor matrixCursor = new MatrixCursor(array);
        if (drk == drk.a) {
            return (Cursor)matrixCursor;
        }
        final int length = array.length;
        final Object[] array2 = new Object[length];
        int i = 0;
        int n = 0;
        while (i < length) {
            final String s = array[i];
            int n2 = 0;
            Label_0311: {
                switch (s.hashCode()) {
                    case 1971189053: {
                        if (s.equals("special_type_description")) {
                            n2 = 2;
                            break Label_0311;
                        }
                        break;
                    }
                    case 1932752118: {
                        if (s.equals("configuration")) {
                            n2 = 0;
                            break Label_0311;
                        }
                        break;
                    }
                    case 341019851: {
                        if (s.equals("interact_activity_package_name")) {
                            n2 = 5;
                            break Label_0311;
                        }
                        break;
                    }
                    case 221347946: {
                        if (s.equals("special_type_name")) {
                            n2 = 1;
                            break Label_0311;
                        }
                        break;
                    }
                    case -485675384: {
                        if (s.equals("launch_activity_package_name")) {
                            n2 = 6;
                            break Label_0311;
                        }
                        break;
                    }
                    case -1375007329: {
                        if (s.equals("edit_activity_package_name")) {
                            n2 = 4;
                            break Label_0311;
                        }
                        break;
                    }
                    case -2067576059: {
                        if (s.equals("special_type_icon_uri")) {
                            n2 = 3;
                            break Label_0311;
                        }
                        break;
                    }
                }
                n2 = -1;
            }
            switch (n2) {
                case 4:
                case 5:
                case 6: {
                    array2[n] = this.b.getPackageName();
                    break;
                }
                case 3: {
                    array2[n] = new Uri$Builder().scheme("content").authority(this.c).appendPath("icon").appendPath(String.valueOf(drk.n));
                    break;
                }
                case 2: {
                    array2[n] = this.b.getString(drk.m);
                    break;
                }
                case 1: {
                    array2[n] = this.b.getString(drk.l);
                    break;
                }
                case 0: {
                    array2[n] = drk.k.e;
                    break;
                }
            }
            ++n;
            ++i;
        }
        Arrays.toString(array2);
        matrixCursor.addRow(array2);
        return (Cursor)matrixCursor;
    }
}
