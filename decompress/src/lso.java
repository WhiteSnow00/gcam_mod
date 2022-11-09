import java.io.FileOutputStream;
import java.util.Iterator;
import java.io.FileInputStream;
import java.util.Locale;
import java.util.List;
import java.nio.ByteBuffer;
import java.util.Arrays;
import java.nio.channels.FileChannel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lso
{
    private static final luh a;
    private static final luh b;
    private static final luh c;
    private static final luh d;
    private static final luh e;
    private static final luh f;
    
    static {
        a = new luh("tkhd", 12);
        b = new luh("tkhd", 20);
        c = new luh("mvhd", 12);
        d = new luh("mvhd", 16);
        e = new luh("mdhd", 12);
        f = new luh("mdhd", 16);
    }
    
    public static void a(final feg feg, feh e, long n, int n2) {
        final FileInputStream a = feg.a();
        try {
            final lul lul = new lul(a.getChannel().map(FileChannel.MapMode.READ_ONLY, 0L, n), Arrays.asList("moov", "trak", "stbl", "mdia"));
            final luj luj = new luj(lul.a.position(), lul.a.limit());
            final lug lug = new lug(nii.a);
            try {
                lul.b(lug, lul.a(luj));
                final List c = lug.a("moov").c("trak");
                if (c.size() < 2 || c.size() > 10) {
                    throw new luk(String.format(Locale.US, "This file has %d trak boxes", c.size()));
                }
                final int a2 = lug.a("moov").a("mvhd").b(lso.c).a();
                if (a2 == 0) {
                    throw new luk("Video time scale is 0.");
                }
                final Iterator iterator = c.iterator();
                lui lui = null;
                lui b = null;
                int max = 0;
                int a3 = 0;
                while (iterator.hasNext()) {
                    final lug lug2 = (lug)iterator.next();
                    final lug a4 = lug2.a("tkhd");
                    final int a5 = a4.b(lso.a).a();
                    final lui b2 = a4.b(lso.b);
                    final lug a6 = lug2.a("mdia").a("mdhd");
                    if (a5 != n2) {
                        max = Math.max(max, b2.a());
                    }
                    else {
                        b = a6.b(lso.f);
                        a3 = a6.b(lso.e).a();
                        if (a3 == 0) {
                            throw new luk("Media time scale is 0.");
                        }
                        lui = b2;
                    }
                }
                if (lui != null && a3 != 0 && b != null) {
                    final lui b3 = lug.a("moov").a("mvhd").b(lso.d);
                    nns nns;
                    if (b3.a() <= max) {
                        String.format("Not fixing video since entire video length %d is shorter than the high-res track %d (video units)", b3.a(), max);
                        nns = nns.l();
                    }
                    else {
                        final long b4 = b(a2, b3.a());
                        n = b(a2, lui.a());
                        final long b5 = b(a3, b.a());
                        final long b6 = b(a2, max);
                        if (b4 == 0L || n == 0L || b5 == 0L || b6 == 0L) {
                            throw new luk(String.format(Locale.US, "Zero video lengths? %d %d %d %d", b4, n, b5, b6));
                        }
                        if (b4 != n) {
                            throw new luk(String.format(Locale.US, "Video length %d, but longest (high-res) track is %d", b4, n));
                        }
                        if (Math.abs(n - b5) > Math.max(n, b5) / 8L) {
                            throw new luk(String.format(Locale.US, "Track and media lengths of the high-res track substantially different: %d vs %d", n, b5));
                        }
                        final double n3 = (double)b6;
                        final double n4 = (double)b5;
                        Double.isNaN(n4);
                        if (n3 < n4 * 0.25) {
                            throw new luk(String.format(Locale.US, "Target length too short: %d to %d?", b4, b6));
                        }
                        n = b(a2, b3.a());
                        final long b7 = b(a2, max);
                        n2 = (int)(a3 * b7 / 1000000L);
                        String.format(Locale.US, "Fixing video length from %d us to %d us", n, b7);
                        nns = nns.o(new lsn(b3.a, max), new lsn(lui.a, max), new lsn(b.a, n2));
                    }
                    a.close();
                    if (!nns.isEmpty()) {
                        e = (feh)e.a.e();
                        try {
                            final nrw t = nns.t();
                            while (t.hasNext()) {
                                final lsn lsn = t.next();
                                ((FileOutputStream)e).getChannel().position(lsn.a);
                                final ByteBuffer allocate = ByteBuffer.allocate(4);
                                allocate.putInt(lsn.b);
                                allocate.rewind();
                                ((FileOutputStream)e).getChannel().write(allocate);
                            }
                            ((FileOutputStream)e).close();
                        }
                        finally {
                            try {
                                ((FileOutputStream)e).close();
                            }
                            finally {
                                final Throwable t2;
                                ((Throwable)feg).addSuppressed(t2);
                            }
                        }
                    }
                    return;
                }
                final StringBuilder sb = new StringBuilder(28);
                sb.append("Track ");
                sb.append(n2);
                sb.append(" not found.");
                throw new luk(sb.toString());
            }
            catch (final Exception ex) {
                throw new luk(ex);
            }
        }
        finally {
            Label_1077: {
                try {
                    a.close();
                    break Label_1077;
                }
                finally {
                    final Throwable t3;
                    ((Throwable)feg).addSuppressed(t3);
                }
            }
            while (true) {}
        }
    }
    
    private static long b(final int n, final int n2) {
        return n2 * 1000000L / n;
    }
}
