import java.io.Closeable;
import java.io.File;
import java.lang.reflect.Method;
import java.lang.reflect.Field;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pkh
{
    public static final StackTraceElement a(final pjw pjw) {
        final pka pka = pjw.getClass().getAnnotation(pka.class);
        final String s = null;
        final String s2 = null;
        if (pka == null) {
            return null;
        }
        final int a = pka.a();
        if (a <= 1) {
            final int n = -1;
            int intValue;
            try {
                final Field declaredField = pjw.getClass().getDeclaredField("label");
                declaredField.getClass();
                declaredField.setAccessible(true);
                Object value;
                if (!((value = declaredField.get(pjw)) instanceof Integer)) {
                    value = null;
                }
                final Integer n2 = (Integer)value;
                if (n2 != null) {
                    intValue = n2;
                }
                else {
                    intValue = 0;
                }
                --intValue;
            }
            catch (final Exception ex) {
                intValue = -1;
            }
            int n3;
            if (intValue < 0) {
                n3 = n;
            }
            else {
                n3 = pka.e()[intValue];
            }
            pkb b;
            if ((b = pkc.b) == null) {
                try {
                    b = (pkc.b = new pkb(Class.class.getDeclaredMethod("getModule", (Class<?>[])new Class[0]), pjw.getClass().getClassLoader().loadClass("java.lang.Module").getDeclaredMethod("getDescriptor", (Class<?>[])new Class[0]), pjw.getClass().getClassLoader().loadClass("java.lang.module.ModuleDescriptor").getDeclaredMethod("name", (Class<?>[])new Class[0])));
                }
                catch (final Exception ex2) {
                    b = (pkc.b = pkc.a);
                }
            }
            String s3 = null;
            Label_0374: {
                if (b == pkc.a) {
                    s3 = s;
                }
                else {
                    final Method a2 = b.a;
                    if (a2 != null) {
                        final Object invoke = a2.invoke(pjw.getClass(), new Object[0]);
                        if (invoke != null) {
                            final Method b2 = b.b;
                            if (b2 != null) {
                                final Object invoke2 = b2.invoke(invoke, new Object[0]);
                                if (invoke2 != null) {
                                    final Method c = b.c;
                                    Object invoke3;
                                    if (c != null) {
                                        invoke3 = c.invoke(invoke2, new Object[0]);
                                    }
                                    else {
                                        invoke3 = null;
                                    }
                                    if (!(invoke3 instanceof String)) {
                                        invoke3 = s2;
                                    }
                                    s3 = (String)invoke3;
                                    break Label_0374;
                                }
                            }
                        }
                    }
                    s3 = s;
                }
            }
            String s4;
            if (s3 == null) {
                s4 = pka.b();
            }
            else {
                final StringBuilder sb = new StringBuilder();
                sb.append(s3);
                sb.append('/');
                sb.append(pka.b());
                s4 = sb.toString();
            }
            return new StackTraceElement(s4, pka.d(), pka.c(), n3);
        }
        final StringBuilder sb2 = new StringBuilder();
        sb2.append("Debug metadata version mismatch. Expected: 1, got ");
        sb2.append(a);
        sb2.append(". Please update the Kotlin standard library.");
        throw new IllegalStateException(sb2.toString().toString());
    }
    
    public static File b(File o, final String s) {
        o.getClass();
        s.getClass();
        final File file = new File(s);
        o.getClass();
        final String path = file.getPath();
        path.getClass();
        int n = plr.m(path, File.separatorChar, 0, 4);
        Label_0166: {
            Label_0157: {
                if (n == 0) {
                    if (path.length() > 1 && path.charAt(1) == File.separatorChar) {
                        final int m = plr.m(path, File.separatorChar, 2, 4);
                        if (m >= 0) {
                            n = plr.m(path, File.separatorChar, m + 1, 4);
                            if (n >= 0) {
                                ++n;
                                break Label_0157;
                            }
                            n = path.length();
                            break Label_0157;
                        }
                    }
                    o = file;
                    return (File)o;
                }
                if (n > 0 && path.charAt(n - 1) == ':') {
                    ++n;
                }
                else {
                    if (n != -1 || !plr.j(path, ':')) {
                        break Label_0166;
                    }
                    n = path.length();
                }
            }
            if (n > 0) {
                o = file;
                return (File)o;
            }
        }
        final String string = ((File)o).toString();
        string.getClass();
        if (string.length() != 0 && !plr.j(string, File.separatorChar)) {
            final StringBuilder sb = new StringBuilder();
            sb.append(string);
            sb.append(File.separatorChar);
            sb.append(file);
            o = new File(sb.toString());
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(string);
            sb2.append(file);
            o = new File(sb2.toString());
        }
        return (File)o;
    }
    
    public static final void c(final Closeable closeable, final Throwable t) {
        if (t == null) {
            closeable.close();
            return;
        }
        try {
            closeable.close();
        }
        finally {
            final Throwable t2;
            pip.e(t, t2);
        }
    }
}
