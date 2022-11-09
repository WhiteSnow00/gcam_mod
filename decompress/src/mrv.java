import java.io.InputStream;
import java.util.Collection;
import java.util.ArrayList;
import java.io.IOException;
import java.io.File;
import java.util.List;
import android.net.Uri$Builder;
import android.text.TextUtils;
import android.net.Uri;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrv extends msp
{
    private final Context a;
    private final mso b;
    private final Object c;
    private String d;
    
    public mrv(final mru mru) {
        this.c = new Object();
        this.b = new mrz(null);
        this.a = mru.a;
    }
    
    private final boolean h(final Uri uri) {
        return !TextUtils.isEmpty((CharSequence)uri.getAuthority()) && !this.a.getPackageName().equals(uri.getAuthority());
    }
    
    private static final void i() {
        throw new msc("Android backend cannot perform remote operations without a remote backend");
    }
    
    @Override
    protected final Uri a(final Uri uri) {
        if (!this.h(uri)) {
            final File c = this.c(uri);
            final Uri$Builder path = new Uri$Builder().scheme("file").authority("").path("/");
            final nnn e = nns.e();
            path.path(c.getAbsolutePath());
            return path.encodedFragment(msk.b(e.f())).build();
        }
        throw new msd("Operation across authorities is not allowed.");
    }
    
    @Override
    protected final mso b() {
        return this.b;
    }
    
    @Override
    public final File c(Uri uri) {
        if (this.h(uri)) {
            throw new IOException("operation is not permitted in other authorities.");
        }
        final Context a = this.a;
        if (!uri.getScheme().equals("android")) {
            throw new msd("Scheme must be 'android'");
        }
        if (!uri.getPathSegments().isEmpty()) {
            if (TextUtils.isEmpty((CharSequence)uri.getQuery())) {
                final ArrayList list = new ArrayList(uri.getPathSegments());
                final String s = list.get(0);
                int n = 0;
                Label_0234: {
                    switch (s.hashCode()) {
                        case 991565957: {
                            if (s.equals("directboot-files")) {
                                n = 0;
                                break Label_0234;
                            }
                            break;
                        }
                        case 988548496: {
                            if (s.equals("directboot-cache")) {
                                n = 1;
                                break Label_0234;
                            }
                            break;
                        }
                        case 835260319: {
                            if (s.equals("managed")) {
                                n = 4;
                                break Label_0234;
                            }
                            break;
                        }
                        case 97434231: {
                            if (s.equals("files")) {
                                n = 2;
                                break Label_0234;
                            }
                            break;
                        }
                        case 94416770: {
                            if (s.equals("cache")) {
                                n = 3;
                                break Label_0234;
                            }
                            break;
                        }
                        case -1820761141: {
                            if (s.equals("external")) {
                                n = 5;
                                break Label_0234;
                            }
                            break;
                        }
                    }
                    n = -1;
                }
                switch (n) {
                    default: {
                        throw new msd(String.format("Path must start with a valid logical location: %s", uri));
                    }
                    case 5: {
                        uri = (Uri)a.getExternalFilesDir((String)null);
                        break;
                    }
                    case 4: {
                        uri = (Uri)new File(mry.b(a), "managed");
                        if (list.size() >= 3) {
                            try {
                                if (!mrt.c(mrt.a((String)list.get(2)))) {
                                    throw new msd("AccountManager cannot be null");
                                }
                            }
                            catch (final IllegalArgumentException ex) {
                                throw new msd(ex);
                            }
                        }
                        break;
                    }
                    case 3: {
                        uri = (Uri)a.getCacheDir();
                        break;
                    }
                    case 2: {
                        uri = (Uri)mry.b(a);
                        break;
                    }
                    case 1: {
                        uri = (Uri)a.createDeviceProtectedStorageContext().getCacheDir();
                        break;
                    }
                    case 0: {
                        uri = (Uri)a.createDeviceProtectedStorageContext().getFilesDir();
                        break;
                    }
                }
                final File file = new File((File)uri, TextUtils.join((CharSequence)File.separator, (Iterable)list.subList(1, list.size())));
                if (loq.c(this.a)) {
                    return file;
                }
                synchronized (this.c) {
                    if (this.d == null) {
                        this.d = mry.b(this.a.createDeviceProtectedStorageContext()).getParentFile().getAbsolutePath();
                    }
                    final String d = this.d;
                    monitorexit(this.c);
                    if (file.getAbsolutePath().startsWith(d)) {
                        return file;
                    }
                    throw new msc("Cannot access credential-protected data from direct boot");
                }
            }
            throw new msd("Did not expect uri to have query");
        }
        throw new msd(String.format("Path must start with a valid logical location: %s", uri));
    }
    
    @Override
    public final InputStream d(final Uri uri) {
        if (!this.h(uri)) {
            return this.b.d(this.a(uri));
        }
        i();
        throw null;
    }
    
    @Override
    public final String e() {
        return "android";
    }
    
    @Override
    public final boolean f(final Uri uri) {
        if (!this.h(uri)) {
            return this.b.f(this.a(uri));
        }
        i();
        throw null;
    }
}
