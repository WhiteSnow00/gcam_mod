import android.os.Looper;
import android.util.Log;
import java.util.Iterator;
import java.util.ArrayList;
import java.util.List;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lsp
{
    public static ByteBuffer a(final ByteBuffer byteBuffer) {
        final ByteBuffer allocate = ByteBuffer.allocate(byteBuffer.limit());
        int i = 0;
        int n = 0;
        while (i < byteBuffer.limit()) {
            if (byteBuffer.get(i) != 3 || n < 2) {
                allocate.put(byteBuffer.get(i));
            }
            if (byteBuffer.get(i) == 0) {
                ++n;
            }
            else {
                n = 0;
            }
            ++i;
        }
        allocate.flip();
        return allocate;
    }
    
    public static List b(final ByteBuffer byteBuffer) {
        if (byteBuffer.limit() == 0) {
            return nqb.m();
        }
        final ArrayList list = new ArrayList();
        njo.d(byteBuffer.getInt(0) == 1);
        int i = 4;
        int n = 4;
        int n2 = 0;
        while (i < byteBuffer.limit()) {
            int n3 = n;
            if (byteBuffer.get(i) == 1) {
                n3 = n;
                if (n2 >= 3) {
                    list.add(j(byteBuffer, n, i - 3 - n));
                    n3 = i + 1;
                }
            }
            if (i == byteBuffer.limit() - 1) {
                list.add(j(byteBuffer, n3, byteBuffer.limit() - n3));
            }
            if (byteBuffer.get(i) == 0) {
                ++n2;
            }
            else {
                n2 = 0;
            }
            ++i;
            n = n3;
        }
        return list;
    }
    
    public static int c(final apf apf) {
        return (int)k(new lsk(apf, 1), new lsk(apf), lsl.a);
    }
    
    public static int d(final apf apf) {
        final int c = c(apf);
        final int n = 1;
        if (c == 1) {
            return (int)k(new lsk(apf, 2), lsl.b);
        }
        if (c(apf) != 1) {
            aaf.g("http://ns.google.com/photos/1.0/container/");
            aaf.d("Directory");
            final apx f = acv.f(((apu)apf).a, acw.b("http://ns.google.com/photos/1.0/container/", "Directory"), false, null);
            int a;
            if (f == null) {
                a = 0;
            }
            else {
                if (!f.g().d()) {
                    throw new ape("The named property is not an array", 102);
                }
                a = f.a();
            }
            final lur lur = new lur();
            for (int i = 1; i <= a; ++i) {
                final String c2 = cxb.c("Directory", i);
                final String d = lut.d(apf, c2, "Mime");
                lut.e(d, "Mime");
                final String d2 = lut.d(apf, c2, "Semantic");
                lut.e(d2, "Semantic");
                final String d3 = lut.d(apf, c2, "Length");
                final String d4 = lut.d(apf, c2, "Padding");
                final lus a2 = lut.a();
                a2.a = d;
                a2.b = d2;
                a2.b(Integer.parseInt((String)lut.c(d3)));
                a2.c(Integer.parseInt((String)lut.c(d4)));
                lur.b(a2.a());
            }
            final Iterator iterator = lur.a().iterator();
            int n2 = 0;
            int n3 = n;
            while (iterator.hasNext()) {
                final lut lut = (lut)iterator.next();
                if (n3 != 0) {
                    f(lut);
                    n2 += lut.d;
                    n3 = 0;
                }
                else {
                    g(lut);
                    n2 += lut.c + lut.d;
                }
            }
            return n2;
        }
        throw new ape("V1 format does not have a container", 5);
    }
    
    public static Object e(String concat) {
        if (concat.length() != 0) {
            concat = "Property value missing for ".concat(concat);
        }
        else {
            concat = new String("Property value missing for ");
        }
        throw new ape(concat, 5);
    }
    
    public static String f(final lut lut) {
        String s;
        if (!lut.b.contentEquals("Primary")) {
            Log.w("MVXmpMetadata", "Badly formatted file. First container item is not primary");
            s = "First container item must be primary.\n";
        }
        else {
            s = "";
        }
        String concat = s;
        if (lut.c > 0) {
            concat = s.concat("First container item must have length of 0.\n");
            final int c = lut.c;
            final StringBuilder sb = new StringBuilder(59);
            sb.append("First container length expected to be 0. Found: ");
            sb.append(c);
            Log.w("MVXmpMetadata", sb.toString());
        }
        return concat;
    }
    
    public static String g(final lut lut) {
        String s;
        if (lut.b.contentEquals("Primary")) {
            Log.w("MVXmpMetadata", "Badly formatted file. Only first container item should be primary");
            s = "Secondary container items must not be primary.\n";
        }
        else {
            s = "";
        }
        if (lut.d > 0) {
            final String concat = s.concat("Secondary container items must have 0 padding.\n");
            Log.w("MVXmpMetadata", "Badly formatted file. Only primary container items may have padding.");
            return concat;
        }
        return s;
    }
    
    public static boolean h(final String s) {
        return s.startsWith("video/");
    }
    
    public static jtd i(final Object o, final Looper looper, final String s) {
        jvu.j(looper, "Looper must not be null");
        jvu.j(s, "Listener type must not be null");
        return new jtd(looper, o, s);
    }
    
    private static ByteBuffer j(ByteBuffer duplicate, final int n, final int n2) {
        duplicate = duplicate.duplicate();
        duplicate.position(n);
        duplicate.limit(n + n2);
        return duplicate.slice();
    }
    
    private static Object k(final lsm... array) {
        for (int length = array.length, i = 0; i < length; ++i) {
            final Object a = array[i].a();
            if (a != null) {
                return a;
            }
        }
        return null;
    }
}
