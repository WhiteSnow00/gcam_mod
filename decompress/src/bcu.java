import android.database.Cursor;
import android.provider.MediaStore;
import java.io.File;
import android.text.TextUtils;
import java.io.FileNotFoundException;
import android.os.Environment;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

final class bcu implements awp
{
    private static final String[] a;
    private final Context b;
    private final bbw c;
    private final bbw d;
    private final Uri e;
    private final int f;
    private final int g;
    private final awg h;
    private final Class i;
    private volatile boolean j;
    private volatile awp k;
    
    static {
        a = new String[] { "_data" };
    }
    
    public bcu(final Context context, final bbw c, final bbw d, final Uri e, final int f, final int g, final awg h, final Class i) {
        this.b = context.getApplicationContext();
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
    }
    
    @Override
    public final Class a() {
        return this.i;
    }
    
    @Override
    public final void aI() {
        this.j = true;
        final awp k = this.k;
        if (k != null) {
            k.aI();
        }
    }
    
    @Override
    public final void d() {
        final awp k = this.k;
        if (k != null) {
            k.d();
        }
    }
    
    @Override
    public final void f(final auo auo, final awo awo) {
        try {
            final boolean externalStorageLegacy = Environment.isExternalStorageLegacy();
            Object o = null;
            Object o2 = null;
            Object a = null;
            Label_0336: {
                if (externalStorageLegacy) {
                    final bbw c = this.c;
                    final Uri e = this.e;
                    try {
                        final Cursor query = this.b.getContentResolver().query(e, bcu.a, (String)null, (String[])null, (String)null);
                        Label_0195: {
                            if (query == null) {
                                break Label_0195;
                            }
                            try {
                                if (!query.moveToFirst()) {
                                    o2 = String.valueOf(e);
                                    o = new StringBuilder(String.valueOf(o2).length() + 33);
                                    ((StringBuilder)o).append("Failed to media store entry for: ");
                                    ((StringBuilder)o).append((String)o2);
                                    throw new FileNotFoundException(((StringBuilder)o).toString());
                                }
                                o2 = query.getString(query.getColumnIndexOrThrow("_data"));
                                if (!TextUtils.isEmpty((CharSequence)o2)) {
                                    final File file = new File((String)o2);
                                    query.close();
                                    c.a(file, this.f, this.g, this.h);
                                    break Label_0336;
                                }
                                o2 = String.valueOf(e);
                                o = new StringBuilder(String.valueOf(o2).length() + 40);
                                ((StringBuilder)o).append("File path was empty in media store for: ");
                                ((StringBuilder)o).append((String)o2);
                                throw new FileNotFoundException(((StringBuilder)o).toString());
                            }
                            finally {}
                        }
                    }
                    finally {
                        a = o2;
                    }
                    if (a != null) {
                        ((Cursor)a).close();
                    }
                }
                else {
                    Uri uri;
                    if (this.b.checkSelfPermission("android.permission.ACCESS_MEDIA_LOCATION") == 0) {
                        uri = MediaStore.setRequireOriginal(this.e);
                    }
                    else {
                        uri = this.e;
                    }
                    a = this.d.a(uri, this.f, this.g, this.h);
                }
            }
            Object c2;
            if (a != null) {
                c2 = ((bbv)a).c;
            }
            else {
                c2 = o;
            }
            if (c2 == null) {
                final String value = String.valueOf(this.e);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 29);
                sb.append("Failed to build fetcher for: ");
                sb.append(value);
                awo.e(new IllegalArgumentException(sb.toString()));
                return;
            }
            this.k = (awp)c2;
            if (this.j) {
                this.aI();
                return;
            }
            ((awp)c2).f(auo, awo);
        }
        catch (final FileNotFoundException ex) {
            awo.e(ex);
        }
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
