import j$.util.Objects;
import java.util.regex.Matcher;
import android.util.Log;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class osw
{
    public static final osw a;
    public static final osw b;
    public final int c;
    public final int d;
    public final int e;
    
    static {
        a = a("1.218.0");
        b = a("1.81.0");
    }
    
    public osw(final int c, final int d, final int e) {
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static osw a(String concat) {
        if (concat == null || concat.isEmpty()) {
            return null;
        }
        final Matcher matcher = Pattern.compile("(\\d+)\\.(\\d+)\\.(\\d+)").matcher(concat);
        if (!matcher.matches()) {
            if (concat.length() != 0) {
                concat = "Failed to parse version from: ".concat(concat);
            }
            else {
                concat = new String("Failed to parse version from: ");
            }
            Log.w("Version", concat);
            return null;
        }
        return new osw(Integer.parseInt(matcher.group(1)), Integer.parseInt(matcher.group(2)), Integer.parseInt(matcher.group(3)));
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof osw)) {
            return false;
        }
        final osw osw = (osw)o;
        return this.c == osw.c && this.d == osw.d && this.e == osw.e;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.c, this.d, this.e });
    }
    
    @Override
    public final String toString() {
        return String.format("%d.%d.%d", this.c, this.d, this.e);
    }
}
