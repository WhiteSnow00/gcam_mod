import java.util.Iterator;
import java.io.UnsupportedEncodingException;
import java.util.Map;
import java.io.OutputStream;
import android.net.NetworkInfo;
import android.net.ConnectivityManager;
import java.io.InputStream;
import java.net.MalformedURLException;
import java.net.URLConnection;
import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.net.URLEncoder;
import android.os.Build;
import android.text.TextUtils;
import java.util.Locale;
import android.os.Build$VERSION;

// 
// Decompiled by Procyon v0.6.0
// 

final class jnm extends jmc
{
    public static final byte[] a;
    public final jnv c;
    private final String d;
    
    static {
        a = "\n".getBytes();
    }
    
    public jnm(final jmf jmf) {
        super(jmf);
        final String a = jmd.a;
        final String release = Build$VERSION.RELEASE;
        final Locale default1 = Locale.getDefault();
        Object string = null;
        if (default1 != null) {
            final String language = default1.getLanguage();
            if (!TextUtils.isEmpty((CharSequence)language)) {
                final StringBuilder sb = new StringBuilder();
                sb.append(language.toLowerCase(default1));
                if (!TextUtils.isEmpty((CharSequence)default1.getCountry())) {
                    sb.append("-");
                    sb.append(default1.getCountry().toLowerCase(default1));
                }
                string = sb.toString();
            }
        }
        this.d = String.format("%s/%s (Linux; U; Android %s; %s; %s Build/%s)", "GoogleAnalytics", a, release, string, Build.MODEL, Build.ID);
        this.c = new jnv();
    }
    
    private static final void I(final StringBuilder sb, final String s, final String s2) {
        if (sb.length() != 0) {
            sb.append('&');
        }
        sb.append(URLEncoder.encode(s, "UTF-8"));
        sb.append('=');
        sb.append(URLEncoder.encode(s2, "UTF-8"));
    }
    
    final HttpURLConnection C(final URL url) {
        final URLConnection openConnection = url.openConnection();
        if (openConnection instanceof HttpURLConnection) {
            final HttpURLConnection httpURLConnection = (HttpURLConnection)openConnection;
            httpURLConnection.setDefaultUseCaches(false);
            httpURLConnection.setConnectTimeout((int)jnd.u.a());
            httpURLConnection.setReadTimeout((int)jnd.v.a());
            httpURLConnection.setInstanceFollowRedirects(false);
            httpURLConnection.setRequestProperty("User-Agent", this.d);
            httpURLConnection.setDoInput(true);
            return httpURLConnection;
        }
        throw new IOException("Failed to obtain http connection");
    }
    
    public final URL D() {
        final String f = jmv.f();
        final String s = (String)jnd.l.a();
        String concat;
        if (s.length() != 0) {
            concat = f.concat(s);
        }
        else {
            concat = new String(f);
        }
        try {
            return new URL(concat);
        }
        catch (final MalformedURLException ex) {
            this.o("Error trying to parse the hardcoded host url", ex);
            return null;
        }
    }
    
    public final URL E(final jng jng) {
        String s;
        if (jng.d) {
            final String f = jmv.f();
            final String g = jmv.g();
            if (g.length() != 0) {
                s = f.concat(g);
            }
            else {
                s = new String(f);
            }
        }
        else {
            final String h = jmv.h();
            final String g2 = jmv.g();
            if (g2.length() != 0) {
                s = h.concat(g2);
            }
            else {
                s = new String(h);
            }
        }
        try {
            return new URL(s);
        }
        catch (final MalformedURLException ex) {
            this.o("Error trying to parse the hardcoded host url", ex);
            return null;
        }
    }
    
    public final URL F(final jng jng, final String s) {
        String s2;
        if (jng.d) {
            final String f = jmv.f();
            final String g = jmv.g();
            final StringBuilder sb = new StringBuilder(f.length() + 1 + g.length() + s.length());
            sb.append(f);
            sb.append(g);
            sb.append("?");
            sb.append(s);
            s2 = sb.toString();
        }
        else {
            final String h = jmv.h();
            final String g2 = jmv.g();
            final StringBuilder sb2 = new StringBuilder(h.length() + 1 + g2.length() + s.length());
            sb2.append(h);
            sb2.append(g2);
            sb2.append("?");
            sb2.append(s);
            s2 = sb2.toString();
        }
        try {
            return new URL(s2);
        }
        catch (final MalformedURLException ex) {
            this.o("Error trying to parse the hardcoded host url", ex);
            return null;
        }
    }
    
    public final void G(final HttpURLConnection httpURLConnection) {
        InputStream inputStream2;
        try {
            final InputStream inputStream = httpURLConnection.getInputStream();
            try {
                while (inputStream.read(new byte[1024]) > 0) {}
                if (inputStream != null) {
                    try {
                        inputStream.close();
                    }
                    catch (final IOException ex) {
                        this.o("Error closing http connection input stream", ex);
                    }
                }
                return;
            }
            finally {}
        }
        finally {
            inputStream2 = null;
        }
        if (inputStream2 != null) {
            try {
                inputStream2.close();
            }
            catch (final IOException ex2) {
                this.o("Error closing http connection input stream", ex2);
            }
        }
        throw httpURLConnection;
    }
    
    public final boolean H() {
        jlw.a();
        this.z();
        final ConnectivityManager connectivityManager = (ConnectivityManager)this.d().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo;
        try {
            activeNetworkInfo = connectivityManager.getActiveNetworkInfo();
        }
        catch (final SecurityException ex) {
            activeNetworkInfo = null;
        }
        if (activeNetworkInfo != null && activeNetworkInfo.isConnected()) {
            return true;
        }
        this.q("No network connectivity");
        return false;
    }
    
    @Override
    protected final void a() {
        this.r("Network initialized. User agent", this.d);
    }
    
    public final int b(URL ex, byte[] ex2) {
        jvu.a(ex2);
        final int length = ex2.length;
        super.w(3, "POST bytes, url", length, ex, null);
        x();
        final IOException ex3 = null;
        Object o = null;
        Object outputStream = null;
        final OutputStream outputStream2 = null;
        Label_0302: {
            try {
                this.d().getPackageName();
                final HttpURLConnection c = this.C((URL)ex);
                outputStream = outputStream2;
                ex = ex3;
                try {
                    c.setDoOutput(true);
                    outputStream = outputStream2;
                    ex = ex3;
                    c.setFixedLengthStreamingMode(length);
                    outputStream = outputStream2;
                    ex = ex3;
                    c.connect();
                    outputStream = outputStream2;
                    ex = ex3;
                    o = (ex = (IOException)(outputStream = c.getOutputStream()));
                    ((OutputStream)o).write((byte[])(Object)ex2);
                    outputStream = o;
                    ex = (IOException)o;
                    this.G(c);
                    outputStream = o;
                    ex = (IOException)o;
                    int responseCode;
                    if ((responseCode = c.getResponseCode()) == 200) {
                        outputStream = o;
                        ex = (IOException)o;
                        this.f().c();
                        responseCode = 200;
                    }
                    outputStream = o;
                    ex = (IOException)o;
                    this.m("POST status", responseCode);
                    if (o != null) {
                        try {
                            ((OutputStream)o).close();
                        }
                        catch (final IOException ex) {
                            this.o("Error closing http post connection output stream", ex);
                        }
                    }
                    if (c != null) {
                        c.disconnect();
                    }
                    return responseCode;
                }
                catch (final IOException outputStream) {}
            }
            catch (final IOException outputStream) {
                ex2 = null;
                ex = (IOException)o;
            }
            finally {
                ex = null;
                break Label_0302;
            }
            try {
                this.u("Network POST connection error", outputStream);
                if (ex2 != null) {
                    try {
                        ((OutputStream)ex2).close();
                    }
                    catch (final IOException ex2) {
                        this.o("Error closing http post connection output stream", ex2);
                    }
                }
                if (ex != null) {
                    ((HttpURLConnection)ex).disconnect();
                }
                return 0;
            }
            finally {
                outputStream = ex2;
                final IOException ex4;
                ex2 = ex4;
            }
        }
        if (outputStream != null) {
            try {
                ((OutputStream)outputStream).close();
            }
            catch (final IOException ex5) {
                this.o("Error closing http post connection output stream", ex5);
            }
        }
        if (ex != null) {
            ((HttpURLConnection)ex).disconnect();
        }
        throw ex2;
    }
    
    final String c(final jng jng, final boolean b) {
        jvu.a(jng);
        final StringBuilder sb = new StringBuilder();
        try {
            for (final Map.Entry<String, V> entry : jng.a.entrySet()) {
                final String s = entry.getKey();
                if (!"ht".equals(s) && !"qt".equals(s) && !"AppUID".equals(s) && !"z".equals(s) && !"_gmsv".equals(s)) {
                    I(sb, s, (String)entry.getValue());
                }
            }
            I(sb, "ht", String.valueOf(jng.c));
            I(sb, "qt", String.valueOf(System.currentTimeMillis() - jng.c));
            if (b) {
                String s2 = "0";
                jvu.h("_s");
                jvu.c(true, "Short param name required");
                final String s3 = jng.a.get("_s");
                if (s3 != null) {
                    s2 = s3;
                }
                long long1;
                try {
                    long1 = Long.parseLong(s2);
                }
                catch (final NumberFormatException ex) {
                    long1 = 0L;
                }
                String s4;
                if (long1 != 0L) {
                    s4 = String.valueOf(long1);
                }
                else {
                    s4 = String.valueOf(jng.b);
                }
                I(sb, "z", s4);
            }
            return sb.toString();
        }
        catch (final UnsupportedEncodingException ex2) {
            this.o("Failed to encode name or value", ex2);
            return null;
        }
    }
}
