import android.os.Build;
import android.os.Build$VERSION;
import java.util.regex.Pattern;

// 
// Decompiled by Procyon v0.6.0
// 

public final class liy
{
    private static final Pattern j;
    public final boolean a;
    public final boolean b;
    public final boolean c;
    public final boolean d;
    public final boolean e;
    public final boolean f;
    public final boolean g;
    public final boolean h;
    public final boolean i;
    
    static {
        j = Pattern.compile("^[A-Z][A-Z0-9]{3}\\.\\d{6}\\.\\d{3}(\\..*)?$");
    }
    
    private liy(final int n, final String s) {
        final boolean b = true;
        this.a = (n >= 21);
        this.b = (n >= 23);
        this.c = (n >= 24);
        this.d = (n >= 26);
        this.e = (n >= 28);
        this.f = (n >= 29);
        final boolean g = n >= 30;
        this.g = g;
        final boolean h = "MASTER".equals(s) || n > 30 || (n == 30 && liy.j.matcher(s).find() && s.charAt(0) == 'S');
        this.h = h;
        this.i = (g && !h && b);
    }
    
    public static liy a() {
        final Integer value = Build$VERSION.SDK_INT;
        final String id = Build.ID;
        int intValue;
        if (value > 0) {
            intValue = value;
        }
        else {
            intValue = 1;
        }
        String s = id;
        if (id == null) {
            s = "AAA01";
        }
        return new liy(intValue, s);
    }
}
