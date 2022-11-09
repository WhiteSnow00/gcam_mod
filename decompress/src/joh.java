import java.net.URLConnection;
import java.io.IOException;
import java.net.URL;
import java.net.HttpURLConnection;
import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public final class joh implements Runnable
{
    private static final jwk a;
    private final String b;
    private final jtq c;
    
    static {
        a = new jwk("RevokeAccessOperation");
    }
    
    public joh(final String b) {
        jvu.h(b);
        this.b = b;
        this.c = new jtq(null);
    }
    
    public static jqz a(final String s) {
        if (s == null) {
            final Status status = new Status(4);
            jvu.c(status.b() ^ true, "Status code must not be SUCCESS");
            final jra jra = new jra(status);
            jra.j(status);
            return jra;
        }
        final joh joh = new joh(s);
        new Thread(joh).start();
        return joh.c;
    }
    
    @Override
    public final void run() {
        Status status = Status.c;
        Object o = null;
        try {
            o = this.b;
            if (((String)o).length() != 0) {
                o = "https://accounts.google.com/o/oauth2/revoke?token=".concat((String)o);
            }
            else {
                o = new String("https://accounts.google.com/o/oauth2/revoke?token=");
            }
            o = new URL((String)o).openConnection();
            ((URLConnection)o).setRequestProperty("Content-Type", "application/x-www-form-urlencoded");
            final int responseCode = ((HttpURLConnection)o).getResponseCode();
            if (responseCode == 200) {
                o = (status = Status.a);
            }
            else {
                joh.a.c("Unable to revoke access!");
            }
            try {
                final jwk a = joh.a;
                final StringBuilder sb = new StringBuilder(26);
                sb.append("Response Code: ");
                sb.append(responseCode);
                a.b(sb.toString());
            }
            catch (final Exception o) {}
            catch (final IOException o) {}
        }
        catch (final Exception ex) {}
        catch (final IOException ex2) {}
        final jwk a2 = joh.a;
        final String value = String.valueOf(((Throwable)o).toString());
        String concat;
        if (value.length() != 0) {
            concat = "IOException when revoking access: ".concat(value);
        }
        else {
            concat = new String("IOException when revoking access: ");
        }
        a2.c(concat);
        this.c.j(status);
    }
}
