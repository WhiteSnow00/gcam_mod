import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Locale;
import java.util.Collections;
import java.util.HashSet;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hwz
{
    private final Set a;
    
    public hwz(final hwy hwy) {
        hwy.getClass();
        this.a = Collections.synchronizedSet(new HashSet<Object>());
    }
    
    public final String a(final long n) {
        return this.c(n, new SimpleDateFormat("'IMG'_yyyyMMdd_HHmmss", Locale.US));
    }
    
    public final String b(final long n) {
        return this.c(n, new SimpleDateFormat("'PANO'_yyyyMMdd_HHmmss", Locale.US));
    }
    
    public final String c(final long n, final DateFormat dateFormat) {
        final String format = dateFormat.format(new Date(n));
        final Set a = this.a;
        monitorenter(a);
        try {
            String string = new String(String.valueOf(format));
            if (this.a.contains(string)) {
                int n2 = 0;
                do {
                    ++n2;
                    final StringBuilder sb = new StringBuilder(String.valueOf(format).length() + 12);
                    sb.append(format);
                    sb.append("_");
                    sb.append(n2);
                    sb.append("");
                    string = sb.toString();
                } while (this.a.contains(string));
                this.a.add(string);
                monitorexit(a);
            }
            else {
                this.a.add(string);
                monitorexit(a);
            }
            return string;
        }
        finally {
            monitorexit(a);
            while (true) {}
        }
    }
}
