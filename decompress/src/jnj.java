import android.content.SharedPreferences$Editor;
import android.os.StrictMode$ThreadPolicy;
import android.content.pm.ApplicationInfo;
import java.io.Serializable;
import java.util.UUID;
import java.io.IOException;
import java.io.Closeable;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.FileReader;
import android.os.StrictMode;
import android.os.Process;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jnj extends jmc
{
    public static jnj a;
    
    public jnj(final jmf jmf) {
        super(jmf);
    }
    
    protected static final String C(final Object o) {
        if (o == null) {
            return null;
        }
        Object value = o;
        if (o instanceof Integer) {
            value = o;
        }
        final boolean b = value instanceof Long;
        String s = "-";
        if (b) {
            final Long n = (Long)value;
            if (Math.abs(n) < 100L) {
                return String.valueOf(value);
            }
            if (String.valueOf(value).charAt(0) != '-') {
                s = "";
            }
            final String value2 = String.valueOf(Math.abs(n));
            final StringBuilder sb = new StringBuilder();
            sb.append(s);
            sb.append(Math.round(Math.pow(10.0, value2.length() - 1)));
            sb.append("...");
            sb.append(s);
            sb.append(Math.round(Math.pow(10.0, value2.length()) - 1.0));
            return sb.toString();
        }
        else {
            if (value instanceof Boolean) {
                return String.valueOf(value);
            }
            if (value instanceof Throwable) {
                return ((Long)value).getClass().getCanonicalName();
            }
            return "-";
        }
    }
    
    @Override
    protected final void a() {
        synchronized (jnj.class) {
            jnj.a = this;
        }
    }
    
    public final void b(final jng jng, String concat) {
        String string;
        if (jng != null) {
            string = jng.toString();
        }
        else {
            string = "no hit data";
        }
        if (((String)concat).length() != 0) {
            concat = "Discarding hit. ".concat((String)concat);
        }
        else {
            concat = new String("Discarding hit. ");
        }
        this.u((String)concat, string);
    }
    
    public final void c(int length, String s, Object o, final Object o2, final Object o3) {
        synchronized (this) {
            jvu.a(s);
            final jmv g = this.g();
            Serializable b = g.b;
            final Object o4 = null;
            final Object o5 = null;
            String s2 = null;
            if (b == null) {
                synchronized (g) {
                    if (g.b == null) {
                        final ApplicationInfo applicationInfo = g.a.a.getApplicationInfo();
                        if (jwq.a == null) {
                            if (jwq.b == 0) {
                                jwq.b = Process.myPid();
                            }
                            final int b2 = jwq.b;
                            if (b2 <= 0) {
                                b = null;
                            }
                            else {
                                try {
                                    b = new StringBuilder(25);
                                    ((StringBuilder)b).append("/proc/");
                                    ((StringBuilder)b).append(b2);
                                    ((StringBuilder)b).append("/cmdline");
                                    final String string = ((StringBuilder)b).toString();
                                    final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
                                    try {
                                        final BufferedReader bufferedReader = new BufferedReader(new FileReader(string));
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                        try {
                                            s2 = bufferedReader.readLine();
                                            jvu.a(s2);
                                            s2 = s2.trim();
                                            jwp.a(bufferedReader);
                                        }
                                        catch (final IOException s2) {}
                                    }
                                    finally {
                                        StrictMode.setThreadPolicy(allowThreadDiskReads);
                                    }
                                }
                                catch (IOException b) {
                                    b = null;
                                }
                                finally {
                                    o = s2;
                                }
                                jwp.a((Closeable)b);
                                b = null;
                            }
                            jwq.a = (String)b;
                        }
                        final String a = jwq.a;
                        if (applicationInfo != null) {
                            final String processName = applicationInfo.processName;
                            g.b = (processName != null && processName.equals(a));
                        }
                        if ((g.b == null || !g.b) && "com.google.android.gms.analytics".equals(a)) {
                            g.b = Boolean.TRUE;
                        }
                        if (g.b == null) {
                            g.b = Boolean.TRUE;
                            g.a.d().n("My process not in the list of running processes");
                        }
                    }
                }
            }
            char c;
            if (!g.b) {
                c = 'c';
            }
            else {
                c = 'C';
            }
            final char char1 = "01VDIWEA?".charAt(length);
            final String a2 = jmd.a;
            final String l = jmb.l(s, C(o), C(o2), C(o3));
            final int length2 = String.valueOf(a2).length();
            length = String.valueOf(l).length();
            final StringBuilder sb = new StringBuilder(length2 + 4 + length);
            sb.append("3");
            sb.append(char1);
            sb.append(c);
            sb.append(a2);
            sb.append(":");
            sb.append(l);
            final String s3 = s = sb.toString();
            if (s3.length() > 1024) {
                s = s3.substring(0, 1024);
            }
            final jmf b3 = super.b;
            final jno f = b3.f;
            o = o4;
            if (f != null) {
                if (!f.B()) {
                    o = o5;
                }
                else {
                    o = b3.f;
                }
            }
            if (o == null) {
                return;
            }
            o = ((jno)o).d;
            if (((jnn)o).a.a.getLong(((jnn)o).b(), 0L) == 0L) {
                final jno a3 = ((jnn)o).a;
                final long currentTimeMillis = System.currentTimeMillis();
                final SharedPreferences$Editor edit = ((jnn)o).a.a.edit();
                edit.remove(((jnn)o).a());
                edit.remove(((jnn)o).c());
                edit.putLong(((jnn)o).b(), currentTimeMillis);
                edit.commit();
            }
            if (s == null) {
                s = "";
            }
            synchronized (o) {
                final long long1 = ((jnn)o).a.a.getLong(((jnn)o).a(), 0L);
                if (long1 <= 0L) {
                    final SharedPreferences$Editor edit2 = ((jnn)o).a.a.edit();
                    edit2.putString(((jnn)o).c(), s);
                    edit2.putLong(((jnn)o).a(), 1L);
                    edit2.apply();
                    return;
                }
                final long leastSignificantBits = UUID.randomUUID().getLeastSignificantBits();
                final long n = long1 + 1L;
                final long n2 = Long.MAX_VALUE / n;
                final SharedPreferences$Editor edit3 = ((jnn)o).a.a.edit();
                if ((leastSignificantBits & Long.MAX_VALUE) < n2) {
                    edit3.putString(((jnn)o).c(), s);
                }
                edit3.putLong(((jnn)o).a(), n);
                edit3.apply();
            }
        }
    }
}
