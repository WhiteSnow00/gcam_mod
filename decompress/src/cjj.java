import java.io.FileOutputStream;
import java.util.Iterator;
import java.io.FileInputStream;
import java.io.OutputStream;
import java.io.DataOutputStream;
import java.util.concurrent.TimeUnit;
import java.io.InputStream;
import java.io.DataInputStream;
import java.util.Arrays;
import java.util.ArrayList;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cjj implements ceh
{
    public static final nsd a;
    public final hhu b;
    public final Executor c;
    public final hkc d;
    private final cek e;
    private final cgo f;
    
    static {
        a = nsd.g("com/google/android/apps/camera/camcorder/mediastore/CamcorderMediaStorePublisher");
    }
    
    public cjj(final hhu b, final cek e, final cgo f, final Executor c, final hkc d) {
        this.b = b;
        this.e = e;
        this.f = f;
        this.c = c;
        this.d = d;
    }
    
    public final lki a(final him him, final hia hia, final hio hio, final hip hip, final boolean b) {
        return new cji(this, hio, hia, him, b, hip);
    }
    
    public final void b(final cgh cgh) {
        this.c.execute(new cjf(this, cgh));
    }
    
    public final void c(final cgi cgi) {
        this.c.execute(new cjg(this, cgi));
    }
    
    @Override
    public final void d() {
    }
    
    public final void e(final hio hio, final niz niz, final niz niz2, long longValue, String e, final niz niz3, final boolean b) {
        final him a = him.a();
        if (niz.g() && niz2.g()) {
            final cgo f = this.f;
            final lkb a2 = ((hia)niz2.c()).a;
            final lkb a3 = ((hia)niz2.c()).a;
            if (!f.a.k(cwv.O)) {
                f.b.b("Not fixing creation time; disabled by flag.");
            }
            else {
                final ArrayList list = new ArrayList();
                final int a4 = cgo.a(longValue);
                try {
                    final FileInputStream d = a2.d();
                    try {
                        final lua f2 = lua.c(d).f("moov");
                        final lua b2 = f2.e("mvhd").b();
                        list.add(b2.g().b + 4L);
                        list.add(b2.g().b + 8L);
                        final lua b3 = f2.b();
                        final byte[] a5 = lue.a("trak");
                        ArrayList m;
                        if (!b3.a.g()) {
                            m = nqb.m();
                        }
                        else {
                            final luc b4 = ((luc)b3.a.c()).b();
                            m = new ArrayList();
                            while (true) {
                                final luc b5 = lud.b(b4);
                                if (b5 == null) {
                                    break;
                                }
                                if (!Arrays.equals(lud.d(b5), a5)) {
                                    continue;
                                }
                                m.add(b5);
                            }
                        }
                        for (final luc luc : m) {
                            final lua b6 = lua.d(luc).e("tkhd").b();
                            list.add(b6.g().b + 4L);
                            list.add(b6.g().b + 8L);
                            final lua b7 = lua.d(luc).e("mdia").e("mdhd").b();
                            list.add(b7.g().b + 4L);
                            list.add(b7.g().b + 8L);
                        }
                        final Iterator iterator2 = list.iterator();
                        while (iterator2.hasNext()) {
                            d.getChannel().position((long)iterator2.next());
                            final int int1 = new DataInputStream(d).readInt();
                            final int n = int1 ^ Integer.MIN_VALUE;
                            if (cgq.b(n, a4 ^ Integer.MIN_VALUE) > 0) {
                                final StringBuilder sb = new StringBuilder(48);
                                sb.append("Modification time already too large: ");
                                sb.append(int1);
                                throw new cgn(sb.toString());
                            }
                            if (cgq.b(Integer.MIN_VALUE ^ cgo.a(longValue - TimeUnit.MILLISECONDS.convert(10L, TimeUnit.HOURS)), n) <= 0) {
                                continue;
                            }
                            final StringBuilder sb2 = new StringBuilder(59);
                            sb2.append("Existing modification time too early, won' fix: ");
                            sb2.append(int1);
                            throw new cgn(sb2.toString());
                        }
                        d.close();
                        e = (String)a3.e();
                        try {
                            final Iterator iterator3 = list.iterator();
                            while (iterator3.hasNext()) {
                                longValue = (long)iterator3.next();
                                ((FileOutputStream)e).getChannel().position(longValue);
                                new DataOutputStream((OutputStream)e).writeInt(a4);
                            }
                            ((FileOutputStream)e).close();
                        }
                        finally {
                            try {
                                ((FileOutputStream)e).close();
                            }
                            finally {
                                final Throwable t;
                                ((Throwable)d).addSuppressed(t);
                            }
                        }
                    }
                    finally {
                        try {
                            d.close();
                        }
                        finally {
                            final Throwable t2;
                            ((Throwable)e).addSuppressed(t2);
                        }
                    }
                }
                catch (final Exception ex) {
                    f.b.i("Couldn't fix video duration", ex);
                }
                f.b.b("Successfully fixed creation time.");
            }
            hip hip;
            if (this.d.c(hjq.R)) {
                hip = hip.b;
            }
            else {
                hip = hip.a;
            }
            ((hie)niz.c()).e(this.a(a, (hia)niz2.c(), hio, hip, b));
            if (niz3.g() && !((String)niz3.c()).isEmpty()) {
                ((hia)niz2.c()).a.h((String)niz3.c());
            }
            ((hia)niz2.c()).c();
            ((hie)niz.c()).g();
            return;
        }
        a.k(cjj.a.b(), "No MediaGroup or MediaFile. Could not insert %s video into MediaStore failed", e, '\u0217');
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
    }
    
    @Override
    public final void i() {
    }
    
    @Override
    public final void j(final cgs cgs) {
        if (this.e.k()) {
            final Iterator iterator = cgs.a.iterator();
            while (iterator.hasNext()) {
                this.c((cgi)iterator.next());
            }
            final Iterator iterator2 = cgs.b.iterator();
            while (iterator2.hasNext()) {
                this.b((cgh)iterator2.next());
            }
        }
    }
    
    @Override
    public final void k(final boolean b) {
    }
}
