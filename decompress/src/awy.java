import java.net.URLConnection;
import java.util.Collections;
import java.util.List;
import java.util.HashMap;
import android.net.Uri;
import java.util.Iterator;
import java.net.MalformedURLException;
import android.text.TextUtils;
import java.net.URISyntaxException;
import java.util.Map;
import java.net.URL;
import java.io.IOException;
import java.io.InputStream;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class awy implements awp
{
    private final bbl a;
    private final int b;
    private HttpURLConnection c;
    private InputStream d;
    private volatile boolean e;
    
    public awy(final bbl a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    private static int b(final HttpURLConnection httpURLConnection) {
        try {
            return httpURLConnection.getResponseCode();
        }
        catch (final IOException ex) {
            return -1;
        }
    }
    
    private final InputStream e(URL c, int contentLength, URL url, final Map map) {
        if (contentLength < 5) {
            if (url != null) {
                try {
                    if (c.toURI().equals(url.toURI())) {
                        throw new avs("In re-direct loop", -1);
                    }
                }
                catch (final URISyntaxException ex) {}
            }
            try {
                final HttpURLConnection c2 = (HttpURLConnection)c.openConnection();
                for (final Map.Entry<String, V> entry : map.entrySet()) {
                    c2.addRequestProperty(entry.getKey(), (String)entry.getValue());
                }
                c2.setConnectTimeout(this.b);
                c2.setReadTimeout(this.b);
                c2.setUseCaches(false);
                c2.setDoInput(true);
                c2.setInstanceFollowRedirects(false);
                this.c = c2;
                try {
                    c2.connect();
                    this.d = this.c.getInputStream();
                    if (this.e) {
                        return null;
                    }
                    final int b = b(this.c);
                    final int n = b / 100;
                    if (n == 2) {
                        c = (URL)this.c;
                        try {
                            if (TextUtils.isEmpty((CharSequence)((URLConnection)c).getContentEncoding())) {
                                contentLength = ((URLConnection)c).getContentLength();
                                this.d = new bik(((URLConnection)c).getInputStream(), contentLength);
                            }
                            else {
                                this.d = ((URLConnection)c).getInputStream();
                            }
                            return this.d;
                        }
                        catch (final IOException ex2) {
                            throw new avs("Failed to obtain InputStream", b((HttpURLConnection)c), ex2);
                        }
                    }
                    if (n == 3) {
                        final String headerField = this.c.getHeaderField("Location");
                        if (!TextUtils.isEmpty((CharSequence)headerField)) {
                            try {
                                url = new URL(c, headerField);
                                this.d();
                                return this.e(url, contentLength + 1, c, map);
                            }
                            catch (final MalformedURLException ex3) {
                                final String value = String.valueOf(headerField);
                                String concat;
                                if (value.length() != 0) {
                                    concat = "Bad redirect url: ".concat(value);
                                }
                                else {
                                    concat = new String("Bad redirect url: ");
                                }
                                throw new avs(concat, b, ex3);
                            }
                        }
                        throw new avs("Received empty or null redirect url", b);
                    }
                    if (b == -1) {
                        throw new avs("Http request failed", -1);
                    }
                    try {
                        throw new avs(this.c.getResponseMessage(), b);
                    }
                    catch (final IOException ex4) {
                        throw new avs("Failed to get a response message", b, ex4);
                    }
                }
                catch (final IOException ex5) {
                    throw new avs("Failed to connect or obtain data", b(this.c), ex5);
                }
            }
            catch (final IOException ex6) {
                throw new avs("URL.openConnection threw", 0, ex6);
            }
        }
        throw new avs("Too many (> 5) redirects!", -1);
    }
    
    @Override
    public final Class a() {
        return InputStream.class;
    }
    
    @Override
    public final void aI() {
        this.e = true;
    }
    
    @Override
    public final void d() {
        final InputStream d = this.d;
        if (d != null) {
            try {
                d.close();
            }
            catch (final IOException ex) {}
        }
        final HttpURLConnection c = this.c;
        if (c != null) {
            c.disconnect();
        }
        this.c = null;
    }
    
    @Override
    public final void f(auo b, final awo awo) {
        bio.b();
        try {
            try {
                final bbl a = this.a;
                if (a.f == null) {
                    if (TextUtils.isEmpty((CharSequence)a.e)) {
                        String s;
                        if (TextUtils.isEmpty((CharSequence)(s = a.d))) {
                            final URL c = a.c;
                            bit.a(c);
                            s = c.toString();
                        }
                        a.e = Uri.encode(s, "@#&=*+-_.,:!?()/~'%;$");
                    }
                    a.f = new URL(a.e);
                }
                final URL f = a.f;
                b = (auo)this.a.b;
                if (((bbp)b).c == null) {
                    synchronized (b) {
                        if (((bbp)b).c == null) {
                            final HashMap hashMap = new HashMap();
                            for (final Map.Entry<K, List> entry : ((bbp)b).b.entrySet()) {
                                final List list = entry.getValue();
                                final StringBuilder sb = new StringBuilder();
                                for (int size = list.size(), i = 0; i < size; ++i) {
                                    final String a2 = ((bbo)list.get(i)).a;
                                    if (!TextUtils.isEmpty((CharSequence)a2)) {
                                        sb.append(a2);
                                        if (i != list.size() - 1) {
                                            sb.append(',');
                                        }
                                    }
                                }
                                final String string = sb.toString();
                                if (!TextUtils.isEmpty((CharSequence)string)) {
                                    hashMap.put(entry.getKey(), string);
                                }
                            }
                            ((bbp)b).c = Collections.unmodifiableMap((Map<?, ?>)hashMap);
                        }
                    }
                }
                awo.b(this.e(f, 0, null, ((bbp)b).c));
            }
            finally {
                while (true) {}
            }
        }
        catch (final IOException ex) {}
    }
    
    @Override
    public final int g() {
        return 2;
    }
}
