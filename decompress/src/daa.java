import java.util.List;
import j$.util.function.Function;
import java.io.Serializable;
import java.util.Arrays;
import android.os.CancellationSignal;
import android.os.Bundle;
import java.io.InputStream;
import java.io.IOException;
import android.graphics.Rect;
import android.graphics.BitmapFactory;
import android.graphics.BitmapFactory$Options;
import j$.time.Instant;
import android.database.Cursor;
import android.provider.MediaStore$Images$Media;
import android.provider.MediaStore$Video$Media;
import android.net.Uri;
import java.nio.file.Paths;
import android.os.Environment;
import java.util.Locale;
import android.content.ContentResolver;

// 
// Decompiled by Procyon v0.6.0
// 

public final class daa
{
    static final String a;
    static final String b;
    static final String[] c;
    static final String[] d;
    private static final nsd f;
    private final ContentResolver g;
    private final String h;
    private final cxl i;
    
    static {
        f = nsd.g("com/google/android/apps/camera/data/MediaStoreDataLoader");
        a = String.format(Locale.US, "CASE WHEN %s IS NULL THEN %s ELSE %s / 1000 END DESC, %s DESC", "datetaken", "date_modified", "datetaken", "_id");
        b = String.format(Locale.US, "%s LIKE ? AND (%s > ? OR (%s > ? AND (%s = ? OR %s / 1000 = ? / 1000)))", "relative_path", "datetaken", "date_modified", "datetaken", "datetaken");
        c = new String[] { "_id", "title", "mime_type", "datetaken", "date_modified", "orientation", "width", "height", "is_pending" };
        d = new String[] { "_id" };
    }
    
    public daa(final ContentResolver g, final llb llb, final cxl i) {
        this.g = g;
        this.h = Paths.get(Environment.DIRECTORY_DCIM, llb.n, "%").toString();
        this.i = i;
    }
    
    static Uri a(final long n, final boolean b) {
        Uri uri;
        if (b) {
            uri = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
        }
        else {
            uri = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
        }
        return uri.buildUpon().appendPath(String.valueOf(n)).build();
    }
    
    public final czw b(final Cursor cursor) {
        final long long1 = cursor.getLong(cursor.getColumnIndexOrThrow("_id"));
        final String string = cursor.getString(cursor.getColumnIndexOrThrow("title"));
        final String string2 = cursor.getString(cursor.getColumnIndexOrThrow("mime_type"));
        final long long2 = cursor.getLong(cursor.getColumnIndexOrThrow("datetaken"));
        final long long3 = cursor.getLong(cursor.getColumnIndexOrThrow("date_modified"));
        final Instant ofEpochMilli = Instant.ofEpochMilli(long2);
        final Instant ofEpochSecond = Instant.ofEpochSecond(long3);
        final int int1 = cursor.getInt(cursor.getColumnIndexOrThrow("orientation"));
        final Uri a = a(long1, lou.d(string2));
        final int int2 = cursor.getInt(cursor.getColumnIndexOrThrow("width"));
        final int int3 = cursor.getInt(cursor.getColumnIndexOrThrow("height"));
        int a2 = int2;
        int b = 0;
        Label_0394: {
            while (true) {
                Label_0183: {
                    if (int3 == 0) {
                        break Label_0183;
                    }
                    if ((a2 = int2) == 0) {
                        a2 = 0;
                        break Label_0183;
                    }
                    b = int3;
                    break Label_0394;
                }
                final cxl i = this.i;
                final cxo a3 = cxr.a;
                i.c();
                if (!"image/jpeg".equals(string2) && !"image/bmp".equals(string2) && !"image/gif".equals(string2) && !"image/png".equals(string2) && !"image/webp".equals(string2)) {
                    continue;
                }
                break;
            }
            final ContentResolver g = this.g;
            kre h = null;
            try {
                final InputStream openInputStream = g.openInputStream(a);
                try {
                    final BitmapFactory$Options bitmapFactory$Options = new BitmapFactory$Options();
                    bitmapFactory$Options.inJustDecodeBounds = true;
                    openInputStream.getClass();
                    BitmapFactory.decodeStream(openInputStream, (Rect)null, bitmapFactory$Options);
                    kre.h(bitmapFactory$Options.outWidth, bitmapFactory$Options.outHeight);
                    if (openInputStream != null) {
                        openInputStream.close();
                    }
                }
                finally {
                    if (openInputStream != null) {
                        try {
                            openInputStream.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)h).addSuppressed(t);
                        }
                    }
                }
            }
            catch (final IOException ex) {
                a.m(daa.f.c(), "Exception in getting dimensions by BitmapFactory.", '\u029b', ex);
                h = kre.h(0, 0);
            }
            a2 = h.a;
            b = h.b;
        }
        final kre h2 = kre.h(a2, b);
        final int int4 = cursor.getInt(cursor.getColumnIndexOrThrow("is_pending"));
        nov.B(int4 == 0, "Item is still pending. Perhaps scan failed, look for MediaProvider logs: %s", a);
        nov.B(njb.d(string) ^ true, "Item has empty title. Perhaps scan failed, look for MediaProvider logs: %s", a);
        nov.B(long3 > 0L, "Item has unset DATE_MODIFIED. Perhaps scan failed, look for MediaProvider logs: %s", a);
        if (long2 > 0L) {
            nov.D(a2 > 0 && b > 0, "Item has invalid dimensions (%s). Perhaps scan failed, look for MediaProvider logs: %s", h2, a);
            final czw k = czx.k();
            k.b(long1);
            k.h(string);
            k.f(string2);
            k.c(ofEpochMilli);
            k.e(ofEpochSecond);
            k.i(a);
            k.d(int4 != 0);
            k.b = h2;
            k.g(int1);
            return k;
        }
        throw new njv(njo.b("Item has unset DATE_TAKEN (%s). Perhaps scan failed, look for MediaProvider logs: %s", long2, a));
    }
    
    final czx c(final Uri uri, final him a) {
        final ContentResolver g = this.g;
        final String[] c = daa.c;
        Cursor cursor = null;
        Cursor query = g.query(uri, c, (Bundle)null, (CancellationSignal)null);
        Label_0183: {
            int count = 0;
            Label_0063: {
                if (query != null) {
                    try {
                        if (query.moveToFirst()) {
                            count = query.getCount();
                            if (count == 1) {
                                count = 1;
                                break Label_0063;
                            }
                        }
                    }
                    finally {
                        break Label_0183;
                    }
                }
                count = 0;
            }
            String string = "null";
            if (query == null) {
                final Serializable value = "null";
            }
            else {
                final Serializable value = query.getCount();
            }
            if (query != null) {
                string = Arrays.toString(query.getColumnNames());
                cursor = query;
            }
            Label_0141: {
                if (count == 0) {
                    break Label_0141;
                }
                try {
                    final czw b = this.b(query);
                    b.a = a;
                    final czx a2 = b.a();
                    query.close();
                    return a2;
                    final Serializable value;
                    throw new IllegalArgumentException(njo.b("Uri %s for shot(%s) not found in MediaStore. ContentResolver returned the cursor with count=%s, columns=%s", uri, a, value, string));
                }
                finally {
                    query = cursor;
                }
            }
        }
        if (query != null) {
            try {
                query.close();
            }
            finally {
                final Throwable t;
                ((Throwable)uri).addSuppressed(t);
            }
        }
        throw uri;
    }
    
    public final List d(Uri query, String[] e, final long n, final long n2, int c, final Function function) {
        njo.e(e == daa.d || e == daa.c, "Invalid projection specified.");
        query = (Uri)this.g.query(query, e, daa.b, new String[] { this.h, Long.toString(n), Long.toString(n2), Long.toString(n), Long.toString(n) }, daa.a);
        try {
            e = (String[])(Object)nns.e();
            if (query != null) {
                while (c > 0 && ((Cursor)query).moveToNext()) {
                    try {
                        ((nnn)(Object)e).g(function.apply((Object)query));
                    }
                    catch (final njv njv) {
                        daa.f.b().h(njv).E(670).o("QueryAfter gets exception in transforming a cursor.");
                        final cxl i = this.i;
                        final cxo a = cxr.a;
                        i.c();
                    }
                    --c;
                }
            }
            final nns f = ((nnn)(Object)e).f();
            c = ((nql)f).c;
            if (query != null) {
                ((Cursor)query).close();
            }
            return f;
        }
        finally {
            Label_0276: {
                if (query != null) {
                    try {
                        ((Cursor)query).close();
                        break Label_0276;
                    }
                    finally {
                        final Throwable t;
                        ((Throwable)(Object)e).addSuppressed(t);
                    }
                    break Label_0276;
                }
                break Label_0276;
            }
            while (true) {}
        }
    }
    
    final List e(final Instant instant, final Instant instant2, final boolean b) {
        Uri uri;
        if (b) {
            uri = MediaStore$Video$Media.EXTERNAL_CONTENT_URI;
        }
        else {
            uri = MediaStore$Images$Media.EXTERNAL_CONTENT_URI;
        }
        return this.d(uri, daa.d, instant.minusMillis(1L).toEpochMilli(), instant2.minusSeconds(1L).getEpochSecond(), Integer.MAX_VALUE, (Function)new czz(b));
    }
}
