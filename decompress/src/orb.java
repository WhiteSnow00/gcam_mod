import java.util.Map;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;
import java.util.Iterator;
import java.net.ProtocolException;
import java.net.HttpURLConnection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class orb implements org
{
    public final HttpURLConnection a;
    public final oqw b;
    public final byte[] c;
    public long d;
    public int e;
    public int f;
    public int g;
    public psn h;
    
    public orb(final HttpURLConnection a, final String requestMethod, final oqy oqy, final oqw b) {
        this.e = -1;
        this.f = 0;
        this.a = a;
        try {
            a.setRequestMethod(requestMethod);
            a.setReadTimeout(300000);
            a.setConnectTimeout(300000);
            a.setDoInput(true);
            this.b = b;
            a.setDoOutput(true);
            if (b.d() >= 0L) {
                final long fixedLengthStreamingMode = b.d() - b.c();
                if (fixedLengthStreamingMode < 2147483647L) {
                    a.setFixedLengthStreamingMode((int)fixedLengthStreamingMode);
                }
                else {
                    a.setFixedLengthStreamingMode(fixedLengthStreamingMode);
                }
            }
            else {
                a.setChunkedStreamingMode(0);
            }
            for (final String s : oqy.c()) {
                final Iterator iterator2 = oqy.b(s).iterator();
                while (iterator2.hasNext()) {
                    a.addRequestProperty(s, (String)iterator2.next());
                }
            }
            this.g = 1;
            this.c = new byte[65536];
        }
        catch (final ProtocolException ex) {
            throw new IllegalArgumentException("Invalid http method.", ex);
        }
    }
    
    @Override
    public final long a() {
        throw null;
    }
    
    public final oqz b() {
        this.d();
        try {
            final int responseCode = this.a.getResponseCode();
            InputStream inputStream;
            try {
                inputStream = this.a.getInputStream();
            }
            catch (final IOException ex) {
                inputStream = this.a.getErrorStream();
            }
            final Map<String, List<String>> headerFields = this.a.getHeaderFields();
            oqy oqy;
            if (headerFields != null) {
                oqy = new oqy();
                for (final String s : headerFields.keySet()) {
                    if (s != null) {
                        final Iterator iterator2 = headerFields.get(s).iterator();
                        while (iterator2.hasNext()) {
                            oqy.d(s, (String)iterator2.next());
                        }
                    }
                }
            }
            else {
                oqy = null;
            }
            return new oqz(responseCode, oqy, inputStream);
        }
        catch (final IOException ex2) {
            throw new ori(orh.d, "Error while reading response code.", ex2);
        }
    }
    
    @Override
    public final String c() {
        throw null;
    }
    
    public final void d() {
        monitorenter(this);
        try {
            int g;
            while (true) {
                g = this.g;
                if (g != 2) {
                    break;
                }
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {}
            }
            if (g != 3) {
                boolean b = true;
                if (g != 1) {
                    b = false;
                }
                nov.A(b);
                monitorexit(this);
                return;
            }
            throw new ori(orh.b, "");
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            throw null;
        }
    }
    
    public final boolean f() {
        try {
            return this.b.g();
        }
        catch (final IOException ex) {
            throw new ori(orh.c, ex);
        }
    }
    
    @Override
    public final void g(final psn h, final int e, final int f) {
        synchronized (this) {
            this.h = h;
            if (e > 0) {
                this.e = e;
            }
            this.f = f;
        }
    }
}
