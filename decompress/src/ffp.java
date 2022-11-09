import java.util.Collection;
import java.util.Locale;
import java.util.concurrent.Future;
import android.media.MediaFormat;
import java.util.Iterator;
import android.media.MediaCodec$BufferInfo;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;
import java.util.HashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ffp implements ffn
{
    public final krr a;
    public final HashMap b;
    public long c;
    public long d;
    public long e;
    public boolean f;
    private final ofn g;
    private final List h;
    private long i;
    
    public ffp(final krr krr, String s) {
        this.g = ofn.f();
        this.b = new HashMap();
        this.h = new ArrayList();
        this.c = 0L;
        this.d = -1L;
        this.i = 0L;
        this.e = 0L;
        this.f = false;
        s = njb.c(s);
        if (s.length() != 0) {
            s = "CCTrack".concat(s);
        }
        else {
            s = new String("CCTrack");
        }
        this.a = krr.a(s);
    }
    
    @Override
    public final void a(final oey oey) {
        this.g.e(oey);
    }
    
    @Override
    public final void b(final ByteBuffer byteBuffer, final MediaCodec$BufferInfo mediaCodec$BufferInfo) {
        final krr a = this.a;
        final long presentationTimeUs = mediaCodec$BufferInfo.presentationTimeUs;
        final StringBuilder sb = new StringBuilder(38);
        sb.append("writesampledata <");
        sb.append(presentationTimeUs);
        sb.append(">");
        a.g(sb.toString());
        final mca a2 = mca.a(byteBuffer, mediaCodec$BufferInfo);
        monitorenter(this);
        try {
            this.c = a2.b.presentationTimeUs;
            final long e = this.e;
            this.e = 1L + e;
            this.b.put(e, a2);
            for (final ffo ffo : this.h) {
                if (mediaCodec$BufferInfo.presentationTimeUs >= ffo.a && mediaCodec$BufferInfo.presentationTimeUs <= ffo.b) {
                    ffo.c(a2, e);
                }
                ffo.b();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void c() {
        monitorenter(this);
        try {
            String string;
            if (this.g.isDone()) {
                if (this.g.isCancelled()) {
                    string = "CANCELLED";
                }
                else {
                    string = ((MediaFormat)ofi.v(this.g)).getString("mime");
                }
            }
            else {
                string = "WAITING";
            }
            final krr a = this.a;
            final Locale us = Locale.US;
            final int size = this.b.size();
            String value;
            if (this.b.isEmpty()) {
                value = "n/a";
            }
            else {
                value = this.b.get(this.d + 1L);
            }
            String value2;
            if (this.b.isEmpty()) {
                value2 = "n/a";
            }
            else {
                value2 = this.b.get(this.e - 1L);
            }
            a.b(String.format(us, "mime %s, %d entries, span: <%s> - <%s> available to %d", string, size, value, value2, this.c));
            for (final ffo ffo : this.h) {
                final krr a2 = this.a;
                final Locale us2 = Locale.US;
                final long c = ffo.c;
                final long b = ffo.b;
                String s;
                if (!ffo.e) {
                    s = "NO";
                }
                else {
                    s = "YES";
                }
                String s2;
                if (!ffo.d) {
                    s2 = "NO";
                }
                else {
                    s2 = "YES";
                }
                a2.b(String.format(us2, "   tr: wrote to index <%d>  can write <%d>  closed %s  willclose %s", c, b, s, s2));
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void close() {
        monitorenter(this);
        try {
            this.f = true;
            final Iterator iterator = this.h.iterator();
            while (iterator.hasNext()) {
                ((ffo)iterator.next()).b();
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final void d(final long n) {
        monitorenter(this);
        try {
            while (true) {
                final long n2 = this.d + 1L;
                if (n2 == this.e) {
                    break;
                }
                final HashMap b = this.b;
                final Long value = n2;
                final mca mca = b.get(value);
                mca.getClass();
                if (mca.b.presentationTimeUs > n) {
                    break;
                }
                this.b.remove(value);
                this.i = mca.b.presentationTimeUs;
                ++this.d;
            }
            final ArrayList list = new ArrayList();
            for (final ffo ffo : this.h) {
                if (ffo.e) {
                    list.add(ffo);
                }
            }
            this.h.removeAll(list);
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    @Override
    public final ffo e(final lup lup, final long n) {
        synchronized (this) {
            njo.p(n >= this.i, "Requesting packets that were dropped already");
            final ffo ffo = new ffo(this, lup, n);
            lup.a(this.g);
            this.h.add(ffo);
            return ffo;
        }
    }
}
