import java.util.concurrent.Future;
import java.net.MalformedURLException;
import java.net.URL;
import java.io.IOException;
import java.util.concurrent.ExecutorService;
import java.util.Iterator;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Executors;
import java.util.concurrent.Callable;
import java.util.Random;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ore implements org
{
    public String a;
    public org b;
    public int c;
    public psn d;
    private String e;
    private String f;
    private oqy g;
    private final oqw h;
    private double i;
    private long j;
    private final Random k;
    private int l;
    private int m;
    
    public ore(final String s, final String f, oqy g, final oqw h, final boolean b) {
        if (!b) {
            this.e = s;
            this.f = f;
            if (g == null) {
                g = new oqy();
            }
            this.g = g;
        }
        else {
            this.a = s;
        }
        this.h = h;
        this.i = 0.0;
        this.j = 1L;
        this.k = new Random();
        this.c = 1;
    }
    
    private final oqz f(oqy ex, final String s, final oqw oqw) {
        this.h();
        final oqy oqy = new oqy();
        oqy.e("X-Goog-Upload-Protocol", "resumable");
        oqy.e("X-Goog-Upload-Command", s);
        for (final String s2 : ((oqy)ex).c()) {
            final Iterator iterator2 = ((oqy)ex).b(s2).iterator();
            while (iterator2.hasNext()) {
                oqy.e(s2, (String)iterator2.next());
            }
        }
        String s3;
        if (s.equals("start")) {
            s3 = this.e;
        }
        else {
            s3 = this.a;
        }
        String f;
        if (s.contains("start")) {
            f = this.f;
        }
        else {
            f = "PUT";
        }
        final org o = pqf.o(s3, f, oqy, oqw);
        if (this.d != null && !s.equals("start")) {
            synchronized (this) {
                o.g(new ord(this, this.d, null, null, null), this.l, this.m);
            }
        }
        monitorenter(this);
        try {
            this.b = o;
            ex = (ExecutionException)oez.a(new ora((orb)o));
            final ofp ofp = new ofp();
            ofp.c("Scotty-Uploader-HttpUrlConnectionHttpClient-%d");
            final ExecutorService singleThreadExecutor = Executors.newSingleThreadExecutor(ofp.b(ofp));
            singleThreadExecutor.execute((Runnable)ex);
            singleThreadExecutor.shutdown();
            monitorexit(this);
            try {
                final orj orj = ((Future<orj>)ex).get();
                ex = (ExecutionException)orj.a;
                if (ex == null) {
                    return orj.b;
                }
                if (((ori)ex).a != orh.b) {
                    throw orj.a;
                }
                this.h();
                throw new ori(orh.d, "");
            }
            catch (final ExecutionException ex) {}
            catch (final InterruptedException ex2) {}
            final String value = String.valueOf(ex.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "Unexpected error occurred: ".concat(value);
            }
            else {
                concat = new String("Unexpected error occurred: ");
            }
            throw new RuntimeException(concat);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private final void h() {
        monitorenter(this);
        try {
            int c;
            while (true) {
                c = this.c;
                if (c != 2) {
                    break;
                }
                try {
                    this.wait();
                }
                catch (final InterruptedException ex) {}
            }
            if (c != 3) {
                boolean b = true;
                if (c != 1) {
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
    
    private final void i(final ori ori) {
        if (this.i < 60.0) {
            final double nextDouble = this.k.nextDouble();
            try {
                final double i = this.i;
                final long j = this.j;
                final double n = (double)j;
                Double.isNaN(n);
                this.i = i + n * nextDouble;
                final double n2 = (double)(j * 1000L);
                Double.isNaN(n2);
                Thread.sleep((long)(n2 * nextDouble));
            }
            catch (final InterruptedException ex) {}
            final long k = this.j;
            this.j = k + k;
            return;
        }
        throw ori;
    }
    
    private final void j() {
        if (this.h.c() > this.h.b()) {
            this.h.e();
            this.k();
        }
    }
    
    private final void k() {
        this.j = 1L;
        this.i = 0.0;
    }
    
    private final boolean l() {
        try {
            return this.h.g();
        }
        catch (final IOException ex) {
            throw new ori(orh.c, "Could not call hasMoreData() on upload stream.", ex);
        }
    }
    
    private static final boolean m(final oqz oqz) {
        return oqz.a / 100 == 4;
    }
    
    private static final boolean n(final oqz oqz) {
        final oqy b = oqz.b;
        if (b != null) {
            final String a = b.a("X-Goog-Upload-Status");
            if (a != null && nov.H("final", a)) {
                return true;
            }
        }
        return false;
    }
    
    private static final boolean o(final oqz oqz) {
        final oqy b = oqz.b;
        if (b != null) {
            final String a = b.a("X-Goog-Upload-Status");
            if (a != null && nov.H("active", a) && oqz.a == 200) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final long a() {
        return this.h.c();
    }
    
    public final oqz b(final boolean b) {
    Label_0011_Outer:
        while (true) {
            if (b) {
                final Object o = this;
                break Label_0245;
            }
            Object o = this;
            while (true) {
                oqw oqw;
                Boolean b2;
                if (!((ore)o).l()) {
                    oqw = ((ore)o).h;
                    b2 = true;
                }
                else {
                    oqw = ((ore)o).h;
                    b2 = true;
                }
                final boolean booleanValue = b2;
                String s;
                if (((ore)o).l()) {
                    if (booleanValue) {
                        s = "upload, finalize";
                    }
                    else {
                        s = "upload";
                    }
                }
                else {
                    s = "finalize";
                }
                final psn d = ((ore)o).d;
                if (d != null) {
                    d.b((org)o);
                }
                final oqy oqy = new oqy();
                oqy.e("X-Goog-Upload-Offset", Long.toString(((ore)o).h.c()));
                try {
                    final oqz f = ((ore)o).f(oqy, s, oqw);
                    if (n(f)) {
                        return f;
                    }
                    if (o(f)) {
                        if (!booleanValue) {
                            ((ore)o).j();
                            continue;
                        }
                        throw new ori(orh.e, "Finalize call returned active state.");
                    }
                    else {
                        if (m(f) && f.a != 400) {
                            return f;
                        }
                        ((ore)o).i(new ori(orh.e, f.a()));
                        break Label_0245;
                    }
                }
                catch (final ori ori) {
                    if (ori.a()) {
                        ((ore)o).i(ori);
                        try {
                            oqz f2;
                            while (true) {
                                final oqz oqz = f2 = ((ore)o).f(new oqy(), "query", new orf(""));
                                if (n(oqz)) {
                                    break;
                                }
                                if (o(oqz)) {
                                    final String a = oqz.b.a("X-Goog-Upload-Chunk-Granularity");
                                    if (a != null) {
                                        try {
                                            Integer.parseInt(a);
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new ori(orh.e, "Server returned an invalid chunk granularity.", ex);
                                        }
                                    }
                                    try {
                                        final long long1 = Long.parseLong(oqz.b.a("X-Goog-Upload-Size-Received"));
                                        if (long1 >= ((ore)o).h.b()) {
                                            if (long1 < ((ore)o).h.c()) {
                                                ((ore)o).h.f();
                                            }
                                            while (((ore)o).h.c() < long1) {
                                                if (((ore)o).l()) {
                                                    try {
                                                        final oqw h = ((ore)o).h;
                                                        h.h(long1 - h.c());
                                                        ((ore)o).h.e();
                                                        continue Label_0011_Outer;
                                                    }
                                                    catch (final IOException ex2) {
                                                        throw new ori(orh.c, "Could not skip in the data stream.", ex2);
                                                    }
                                                }
                                                final orh c = orh.c;
                                                final long c2 = ((ore)o).h.c();
                                                o = new StringBuilder(241);
                                                ((StringBuilder)o).append("Upload stream does not have more data but it should. Maybe the caller passed in a data stream to upload with a mark position that didn't match the transfer handle? Confirmed offset from server: ");
                                                ((StringBuilder)o).append(long1);
                                                ((StringBuilder)o).append(" Size: ");
                                                ((StringBuilder)o).append(c2);
                                                throw new ori(c, ((StringBuilder)o).toString());
                                            }
                                            ((ore)o).j();
                                            f2 = null;
                                            break;
                                        }
                                        final orh e = orh.e;
                                        final long b3 = ((ore)o).h.b();
                                        o = new StringBuilder(123);
                                        ((StringBuilder)o).append("The server lost bytes that were previously committed. Our offset: ");
                                        ((StringBuilder)o).append(b3);
                                        ((StringBuilder)o).append(", server offset: ");
                                        ((StringBuilder)o).append(long1);
                                        throw new ori(e, ((StringBuilder)o).toString());
                                    }
                                    catch (final NumberFormatException ex3) {
                                        throw new ori(orh.e, "Failed to parse X-Goog-Upload-Size-Received header", ex3);
                                    }
                                }
                                f2 = oqz;
                                if (m(oqz)) {
                                    break;
                                }
                                ((ore)o).i(new ori(orh.e, oqz.a()));
                            }
                            if (f2 == null) {
                                continue;
                            }
                            return f2;
                        }
                        catch (final ori ori2) {
                            if (ori2.a()) {
                                ((ore)o).i(ori2);
                                continue Label_0011_Outer;
                            }
                            throw ori2;
                        }
                    }
                    throw ori;
                }
                break;
            }
            break;
        }
    }
    
    @Override
    public final String c() {
        return this.a;
    }
    
    public final oqz d() {
        monitorenter(this);
        try {
            monitorexit(this);
            this.k();
            while (true) {
                try {
                    while (true) {
                        final oqy g = this.g;
                        final piu piu = null;
                        final oqz f = this.f(g, "start", new orf(njb.c(null)));
                        if (n(f)) {
                            return f;
                        }
                        if (o(f)) {
                            final oqy b = f.b;
                            final String a = b.a("X-Goog-Upload-URL");
                            try {
                                new URL(a);
                                this.a = a;
                                synchronized (this) {
                                    final psn d = this.d;
                                    Label_0183: {
                                        if (d != null) {
                                            final String a2 = this.a;
                                            if (a2 != null) {
                                                String s = a2;
                                                if (plr.h(a2)) {
                                                    s = null;
                                                }
                                                if (s != null) {
                                                    final oxd b2 = ((nbn)d).b;
                                                    piu a3;
                                                    if (b2 != null) {
                                                        b2.c(new nca(s));
                                                        a3 = piu.a;
                                                    }
                                                    else {
                                                        a3 = piu;
                                                    }
                                                    if (a3 != null) {
                                                        break Label_0183;
                                                    }
                                                }
                                            }
                                            ((nbn)d).a(this, new ori(orh.a, "Upload transfer handle blank"));
                                        }
                                    }
                                    monitorexit(this);
                                    final String a4 = b.a("X-Goog-Upload-Chunk-Granularity");
                                    if (a4 != null) {
                                        try {
                                            Integer.parseInt(a4);
                                        }
                                        catch (final NumberFormatException ex) {
                                            throw new ori(orh.e, "Server returned an invalid chunk granularity.", ex);
                                        }
                                    }
                                    return this.b(false);
                                }
                            }
                            catch (final MalformedURLException ex2) {
                                throw new ori(orh.e, "Server returned an invalid upload url.", ex2);
                            }
                        }
                        if (m(f)) {
                            return f;
                        }
                        this.i(new ori(orh.e, f.a()));
                    }
                }
                catch (final ori ori) {
                    if (ori.a()) {
                        this.i(ori);
                        continue;
                    }
                    throw ori;
                }
                break;
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void e() {
        synchronized (this) {
            this.d = null;
        }
    }
    
    @Override
    public final void g(final psn d, final int n, final int n2) {
        synchronized (this) {
            njo.e(true, "Progress threshold (bytes) must be greater than 0");
            njo.e(true, "Progress threshold (millis) must be greater or equal to 0");
            this.d = d;
            this.l = 4194304;
            this.m = 250;
        }
    }
}
