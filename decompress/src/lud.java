import java.nio.ByteBuffer;
import java.io.IOException;
import java.io.InputStream;
import java.io.DataInputStream;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lud
{
    static {
        nte.g("Mp4BoxFileSlices");
    }
    
    public static lub a(final luc luc) {
        final long a = luc.a();
        final boolean b = false;
        njo.h(a >= 8L, "Box too small: remaining=%s", luc.a());
        luc.a.getChannel().position(luc.b + luc.d);
        long a2 = new DataInputStream(luc.a).readInt();
        if (a2 == 1L) {
            njo.h(luc.a() >= 16L || b, "64-bit box too small just %s bytes remaining", luc.a());
            luc.a.getChannel().position(luc.b + (luc.d + 8L));
            return new lub((int)new DataInputStream(luc.a).readLong(), true);
        }
        if (a2 == 0L) {
            a2 = luc.a();
        }
        return new lub(a2, false);
    }
    
    public static luc b(final luc luc) {
        if (luc.a() != 0L) {
            final long a = a(luc).a;
            if (a > luc.a()) {
                return null;
            }
            final luc b = luc.b();
            final long d = b.d;
            final long n = d + a;
            if (n >= d && b.b + n <= b.c) {
                b.d(n);
                final long n2 = luc.d + a;
                if (!c(n2, b)) {
                    return null;
                }
                luc.e(n2);
                return b.c();
            }
        }
        return null;
    }
    
    public static boolean c(final long n, final luc luc) {
        return n <= luc.e;
    }
    
    public static byte[] d(final luc luc) {
        final long a = luc.a();
        final boolean b = true;
        njo.d(a >= 8L);
        njo.d(luc.a() >= 8L && b);
        final luc b2 = luc.b();
        b2.e(luc.d + 4L);
        b2.d(b2.d + 4L);
        final luc c = b2.c();
        c.a.getChannel().position(c.b + c.d);
        if (c.a() >= 2147483647L) {
            throw new IOException("Can't read contents of a >2GB span");
        }
        final ByteBuffer allocate = ByteBuffer.allocate((int)c.a());
        final int read = c.a.getChannel().read(allocate);
        if (read == c.a()) {
            allocate.rewind();
            final byte[] array = new byte[4];
            allocate.get(array);
            return array;
        }
        final long a2 = c.a();
        final StringBuilder sb = new StringBuilder(83);
        sb.append("Was supposed to have ");
        sb.append(a2);
        sb.append(" bytes remaining but only read ");
        sb.append(read);
        throw new IOException(sb.toString());
    }
}
