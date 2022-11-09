import android.database.Cursor;
import java.io.FileNotFoundException;
import android.text.TextUtils;
import java.io.File;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bbq implements awp
{
    private static final String[] a;
    private final Context b;
    private final Uri c;
    
    static {
        a = new String[] { "_data" };
    }
    
    public bbq(final Context b, final Uri c) {
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final Class a() {
        return File.class;
    }
    
    @Override
    public final void aI() {
    }
    
    @Override
    public final void d() {
    }
    
    @Override
    public final void f(final auo auo, final awo awo) {
        final Cursor query = this.b.getContentResolver().query(this.c, bbq.a, (String)null, (String[])null, (String)null);
        final String s = null;
        final String s2;
        Label_0078: {
            if (query != null) {
                try {
                    if (query.moveToFirst()) {
                        query.getString(query.getColumnIndexOrThrow("_data"));
                    }
                    break Label_0078;
                }
                finally {
                    query.close();
                }
            }
            s2 = s;
        }
        if (TextUtils.isEmpty((CharSequence)s2)) {
            final String value = String.valueOf(this.c);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 30);
            sb.append("Failed to find file path for: ");
            sb.append(value);
            awo.e(new FileNotFoundException(sb.toString()));
            return;
        }
        awo.b(new File(s2));
    }
    
    @Override
    public final int g() {
        return 1;
    }
}
