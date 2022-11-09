import java.io.ByteArrayOutputStream;
import java.security.NoSuchAlgorithmException;
import java.util.Formatter;
import java.security.MessageDigest;
import java.util.Iterator;
import java.io.Closeable;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileInputStream;
import java.io.UnsupportedEncodingException;
import java.io.InputStream;
import java.util.List;
import java.io.IOException;
import java.util.Collection;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.io.OutputStream;
import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lmx
{
    static {
        try {
            aph.a.c("http://ns.google.com/photos/1.0/panorama/", "GPano");
        }
        catch (final ape ape) {
            Log.e("XmpUtil", "Could not register pano namespace!");
            ape.printStackTrace();
        }
    }
    
    private static apf A(final lmw lmw) {
        final apf s = s(w(lmw, true, true));
        if (s != null) {
            if (s.e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
                try {
                    final String s2 = (String)((apt)s.a("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")).a;
                    return s;
                }
                catch (final ape ape) {
                    ape.printStackTrace();
                    return null;
                }
            }
        }
        return s;
    }
    
    private static void B(final lmw lmw, final OutputStream outputStream, final apf apf, final apf apf2) {
        if (apf == null) {
            return;
        }
        byte[] y = null;
        Label_0048: {
            if (apf2 != null) {
                y = y(apf2);
                if (y == null) {
                    return;
                }
                final String v = v(y);
                try {
                    apf.c("http://ns.adobe.com/xmp/note/", "HasExtendedXMP", v);
                    break Label_0048;
                }
                catch (final ape ape) {
                    return;
                }
            }
            y = null;
        }
        final byte[] y2 = y(apf);
        if (y2 == null) {
            return;
        }
        if (apf2 != null) {
            apf.h();
        }
        final List w = w(lmw, false, false);
        final int r = r(w, y2);
        if (r < 0) {
            return;
        }
        if (y != null) {
            nov.i(w, lms.a);
            final String value = String.valueOf(v(y));
            String concat;
            if (value.length() != 0) {
                concat = "http://ns.adobe.com/xmp/extension/\u0000".concat(value);
            }
            else {
                concat = new String("http://ns.adobe.com/xmp/extension/\u0000");
            }
            final int n = concat.length() + 8;
            final ArrayList list = new ArrayList();
            final int n2 = y.length / (65458 - n);
            int i = 0;
            int n3 = 0;
            while (i < n2 + 1) {
                final int length = y.length;
                final byte[] array = new byte[Math.min(length - n3 + n, 65458)];
                final int q = q(concat.getBytes(StandardCharsets.UTF_8), 0, array, 0);
                final int n4 = q + q(z(length), 0, array, q);
                n3 += q(y, n3, array, n4 + q(z(n3), 0, array, n4));
                list.add(t(array));
                ++i;
            }
            w.addAll(r + 1, list);
        }
        try {
            x(outputStream, w);
        }
        catch (final IOException ex) {}
    }
    
    public static apf a() {
        return aph.a();
    }
    
    public static apf b(final apf apf, final apf apf2) {
        if (apf == null) {
            return apf2;
        }
        if (apf2 != null) {
            try {
                final aps f = apf2.f();
                while (true) {
                    final Object next = f.next();
                    next.getClass();
                    final app app = (app)next;
                    final String b = app.b;
                    if (b != null) {
                        apf.d(app.a, b, app.c, app.a());
                    }
                }
            }
            catch (final Exception ex) {}
        }
        return apf;
    }
    
    public static niz c(final String s) {
        if (njb.d(s)) {
            return nii.a;
        }
        try {
            return niz.i(aph.c(s));
        }
        catch (final ape ape) {
            Log.e("XmpUtil", "String was not a serialized XMPMeta.");
            return nii.a;
        }
    }
    
    public static nja d(final byte[] array, final apf apf) {
        final nja u = u(new lmt(array));
        apf a2 = null;
        Label_0037: {
            if (u != null) {
                final Object a = u.a;
                if (a != null) {
                    a2 = (apf)a;
                    break Label_0037;
                }
            }
            a2 = aph.a();
        }
        apf apf2 = null;
        if (u != null) {
            final Object b = u.b;
            if (b != null) {
                apf2 = (apf)b;
            }
        }
        return nja.a(a2, b(apf2, apf));
    }
    
    public static nja e(final InputStream inputStream) {
        return u(new lmu(inputStream));
    }
    
    public static String f(final apf apf) {
        try {
            aaf.g("http://ns.google.com/photos/1.0/camera/");
            aaf.d("SpecialTypeID");
            final aql a = ((apu)apf).a("http://ns.google.com/photos/1.0/camera/", cxb.c("SpecialTypeID", 1));
            if (a != null) {
                return (String)((apt)a).a;
            }
            return null;
        }
        catch (final ape ape) {
            return null;
        }
    }
    
    public static boolean g(final lmv lmv, final String s) {
        if (lmv != null) {
            if (lmv.c >= s.length()) {
                try {
                    final byte[] array = new byte[s.length()];
                    System.arraycopy(lmv.a, lmv.b, array, 0, s.length());
                    return new String(array, "UTF-8").equals(s);
                }
                catch (final UnsupportedEncodingException ex) {
                    return false;
                }
            }
        }
        return false;
    }
    
    public static boolean h(String s, final apf apf) {
        if (!s.toLowerCase().endsWith(".jpg")) {
            if (!s.toLowerCase().endsWith(".jpeg")) {
                return false;
            }
        }
        try {
            Closeable closeable = new FileInputStream(s);
            try {
                final List w = w(new lmu((InputStream)closeable), false, false);
                final byte[] y = y(apf);
                if (y == null) {
                    ((FileInputStream)closeable).close();
                    return false;
                }
                r(w, y);
                ((FileInputStream)closeable).close();
                try {
                    closeable = new FileOutputStream(s);
                    try {
                        x((OutputStream)closeable, w);
                        ((FileOutputStream)closeable).close();
                        return true;
                    }
                    finally {
                        try {
                            ((FileOutputStream)closeable).close();
                        }
                        finally {
                            ((Throwable)apf).addSuppressed((Throwable)closeable);
                        }
                    }
                }
                catch (final IOException ex) {
                    if (s.length() != 0) {
                        "Write file failed:".concat(s);
                    }
                    else {
                        new String("Write file failed:");
                    }
                    return false;
                }
            }
            finally {
                try {
                    ((FileInputStream)closeable).close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)apf).addSuppressed(t);
                }
            }
        }
        catch (final IOException ex2) {
            if (s.length() != 0) {
                s = "Could not read file: ".concat(s);
            }
            else {
                s = new String("Could not read file: ");
            }
            Log.e("XmpUtil", s, (Throwable)ex2);
            return false;
        }
        catch (final FileNotFoundException ex3) {
            if (s.length() != 0) {
                s = "Could not find file: ".concat(s);
            }
            else {
                s = new String("Could not find file: ");
            }
            Log.e("XmpUtil", s, (Throwable)ex3);
            return false;
        }
    }
    
    public static void i(final apf apf, final String[] array) {
        try {
            aph.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            for (int i = 0; i < 2; ++i) {
                apf.g("DisableSuggestedAction", new aqj(512), array[i], new aqj());
            }
        }
        catch (final ape ape) {
            final String value = String.valueOf(ape.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "exception while appending disable suggested actions ".concat(value);
            }
            else {
                concat = new String("exception while appending disable suggested actions ");
            }
            Log.e("XmpUtil", concat);
        }
    }
    
    public static void j(final apf apf, final String s) {
        try {
            aph.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            apf.g("SlowRawPath", new aqj(512), s, new aqj());
        }
        catch (final ape ape) {
            final String value = String.valueOf(ape.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "exception while appending disable suggested actions ".concat(value);
            }
            else {
                concat = new String("exception while appending disable suggested actions ");
            }
            Log.e("XmpUtil", concat);
        }
    }
    
    public static void k(final apf apf, final String s) {
        try {
            aph.a.c("http://ns.google.com/photos/1.0/camera/", "GCamera");
            apf.g("SpecialTypeID", new aqj(512), s, new aqj());
        }
        catch (final ape ape) {
            final String value = String.valueOf(ape.getMessage());
            String concat;
            if (value.length() != 0) {
                concat = "exception while appending special type id ".concat(value);
            }
            else {
                concat = new String("exception while appending special type id ");
            }
            Log.e("XmpUtil", concat);
        }
    }
    
    public static apf l(String s) {
        final boolean endsWith = s.toLowerCase().endsWith(".jpg");
        final String s2 = null;
        if (!endsWith && !s.toLowerCase().endsWith(".jpeg") && !s.toLowerCase().endsWith(".rgbz")) {
            s = s2;
        }
        else {
            try {
                final FileInputStream fileInputStream = new FileInputStream(s);
                try {
                    final Object m = m(fileInputStream);
                    fileInputStream.close();
                    s = (String)m;
                }
                finally {
                    try {
                        fileInputStream.close();
                    }
                    finally {
                        final Throwable t;
                        final Throwable t2;
                        t.addSuppressed(t2);
                    }
                }
            }
            catch (final IOException ex) {
                if (s.length() != 0) {
                    s = "Could not read file: ".concat(s);
                }
                else {
                    s = new String("Could not read file: ");
                }
                Log.e("XmpUtil", s, (Throwable)ex);
                s = s2;
            }
            catch (final FileNotFoundException ex2) {
                if (s.length() != 0) {
                    s = "Could not find file: ".concat(s);
                }
                else {
                    s = new String("Could not find file: ");
                }
                Log.e("XmpUtil", s, (Throwable)ex2);
                s = s2;
            }
        }
        if (s == null) {
            return aph.a();
        }
        return (apf)s;
    }
    
    public static apf m(final InputStream inputStream) {
        return A(new lmu(inputStream));
    }
    
    public static apf n(final byte[] array) {
        return A(new lmt(array));
    }
    
    public static void o(final InputStream inputStream, final OutputStream outputStream, final apf apf, final apf apf2) {
        B(new lmu(inputStream), outputStream, apf, apf2);
    }
    
    public static void p(final byte[] array, final OutputStream outputStream, final apf apf, final apf apf2) {
        B(new lmt(array), outputStream, apf, apf2);
    }
    
    private static int q(final byte[] array, final int n, final byte[] array2, final int n2) {
        final int min = Math.min(array.length - n, array2.length - n2);
        System.arraycopy(array, n, array2, n2, min);
        return min;
    }
    
    private static int r(final List list, final byte[] array) {
        final int length = array.length;
        if (length <= 65502) {
            final byte[] array2 = new byte[length + 29];
            final byte[] bytes = "http://ns.adobe.com/xap/1.0/\u0000".getBytes(StandardCharsets.UTF_8);
            final int n = 0;
            q(array, 0, array2, q(bytes, 0, array2, 0));
            final lmv t = t(array2);
            for (int i = 0; i < list.size(); ++i) {
                if (((lmv)list.get(i)).d == 225 && g((lmv)list.get(i), "http://ns.adobe.com/xap/1.0/\u0000")) {
                    list.set(i, t);
                    return i;
                }
            }
            int n2;
            if (!list.isEmpty() && list.get(0).d == 225) {
                n2 = 1;
            }
            else {
                n2 = n;
            }
            list.add(n2, t);
            return n2;
        }
        Log.e("XmpUtil", "The standard XMP section cannot have a size larger than 65502 bytes.");
        return -1;
    }
    
    private static apf s(final List list) {
    Label_0128:
        for (final lmv lmv : list) {
            if (g(lmv, "http://ns.adobe.com/xap/1.0/\u0000")) {
                while (true) {
                    for (int i = lmv.c - 1; i > 0; --i) {
                        final int n = lmv.b + i;
                        final byte[] a = lmv.a;
                        if (a[n] == 62 && a[n - 1] != 63) {
                            ++i;
                            i -= 29;
                            final byte[] array = new byte[i];
                            System.arraycopy(lmv.a, lmv.b + 29, array, 0, i);
                            try {
                                return aph.b(array);
                            }
                            catch (final ape ape) {}
                            break Label_0128;
                        }
                    }
                    int i = lmv.c;
                    continue;
                }
            }
        }
        return null;
    }
    
    private static lmv t(final byte[] array) {
        return new lmv(array, 225, 0, array.length);
    }
    
    private static nja u(final lmw lmw) {
        final int n = 0;
        final List w = w(lmw, true, false);
        final apf s = s(w);
        if (s == null) {
            return null;
        }
        if (!s.e("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")) {
            return nja.a(s, null);
        }
        try {
            final String s2 = (String)((apt)s.a("http://ns.adobe.com/xmp/note/", "HasExtendedXMP")).a;
            final StringBuilder sb = new StringBuilder(String.valueOf(s2).length() + 36);
            sb.append("http://ns.adobe.com/xmp/extension/\u0000");
            sb.append(s2);
            sb.append("\u0000");
            final String string = sb.toString();
            final ArrayList list = new ArrayList();
            final ArrayList list2 = new ArrayList();
            final ArrayList list3 = new ArrayList();
            final Iterator iterator = w.iterator();
            int n2 = 0;
            while (iterator.hasNext()) {
                final lmv lmv = (lmv)iterator.next();
                if (g(lmv, string)) {
                    final int n3 = lmv.b + string.length() + 7;
                    final int n4 = lmv.b + lmv.c;
                    n2 += Math.max(0, n4 - n3);
                    list.add(lmv);
                    list2.add(n3);
                    list3.add(n4);
                }
            }
            Object b;
            if (n2 == 0) {
                b = null;
            }
            else {
                final byte[] array = new byte[n2];
                int n5 = 0;
                for (int i = n; i < list.size(); ++i) {
                    final lmv lmv2 = (lmv)list.get(i);
                    final int intValue = (int)list2.get(i);
                    final int n6 = (int)list3.get(i) - intValue;
                    System.arraycopy(lmv2.a, intValue, array, n5, n6);
                    n5 += n6;
                }
                try {
                    b = aph.b(array);
                }
                catch (final ape ape) {
                    b = null;
                }
            }
            if (b == null) {
                return null;
            }
            return nja.a(s, b);
        }
        catch (final ape ape2) {
            ape2.printStackTrace();
            return null;
        }
    }
    
    private static String v(final byte[] array) {
        try {
            final MessageDigest instance = MessageDigest.getInstance("MD5");
            instance.update(array);
            final byte[] digest = instance.digest();
            final int length = digest.length;
            final StringBuilder sb = new StringBuilder(length + length);
            final Formatter formatter = new Formatter(sb);
            final int n = 0;
            for (int i = 0; i < length; ++i) {
                formatter.format("%02x", digest[i]);
            }
            formatter.close();
            String s = sb.toString();
            for (int length2 = s.length(), j = n; j < length2; ++j) {
                if (nov.I(s.charAt(j))) {
                    final char[] charArray = s.toCharArray();
                    while (j < length2) {
                        final char c = charArray[j];
                        if (nov.I(c)) {
                            charArray[j] = (char)(c ^ ' ');
                        }
                        ++j;
                    }
                    s = String.valueOf(charArray);
                    break;
                }
            }
            return s;
        }
        catch (final NoSuchAlgorithmException ex) {
            return "";
        }
    }
    
    private static List w(final lmw lmw, final boolean b, final boolean b2) {
        final ArrayList list = new ArrayList();
        try {
            if (lmw.a() == 255 && lmw.a() == 216) {
                while (true) {
                    final int a = lmw.a();
                    if (a == -1 || a != 255) {
                        break;
                    }
                    int i;
                    do {
                        i = lmw.a();
                    } while (i == 255);
                    if (i == -1) {
                        return list;
                    }
                    if (i == 218) {
                        if (!b) {
                            list.add(lmw.d());
                        }
                        return list;
                    }
                    final int a2 = lmw.a();
                    final int a3 = lmw.a();
                    if (a2 == -1 || a3 == -1) {
                        return list;
                    }
                    final int n = a2 << 8 | a3;
                    if (b && i != 225) {
                        lmw.c(n - 2);
                    }
                    else {
                        final lmv b3 = lmw.b(n - 2, i);
                        if (g(b3, "http://ns.adobe.com/xmp/extension/\u0000") && b2) {
                            continue;
                        }
                        list.add(b3);
                    }
                }
            }
            return list;
        }
        catch (final IOException ex) {
            return list;
        }
    }
    
    private static void x(final OutputStream outputStream, final List list) {
        outputStream.write(255);
        outputStream.write(216);
        for (final lmv lmv : list) {
            outputStream.write(255);
            outputStream.write(lmv.d);
            if (lmv.d != 218) {
                final int a = lmv.a();
                final int a2 = lmv.a();
                outputStream.write(a >> 8);
                outputStream.write(a2 & 0xFF);
            }
            outputStream.write(lmv.a, lmv.b, lmv.c);
        }
    }
    
    private static byte[] y(final apf apf) {
        try {
            final aqk aqk = new aqk();
            aqk.f(64, true);
            aqk.f(16, true);
            aph.d(apf);
            final apu apu = (apu)apf;
            final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(2048);
            acw.c(apu, byteArrayOutputStream, aqk);
            return byteArrayOutputStream.toByteArray();
        }
        catch (final ape ape) {
            return null;
        }
    }
    
    private static byte[] z(final int n) {
        return new byte[] { (byte)(n >> 24), (byte)(n >> 16), (byte)(n >> 8), (byte)n };
    }
}
