import android.content.res.Resources$Theme;
import android.graphics.drawable.Drawable;
import android.content.res.Resources;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jbk
{
    private static final Map a;
    private final int b;
    private final int c;
    private final int d;
    
    static {
        final nnt l = nnx.l();
        l.d(jbm.a, new jbk(0, 0, 0));
        l.d(jbm.b, new jbk(2131952266, 2131952267, 2131231453));
        l.d(jbm.c, new jbk(2131952290, 2131952291, 2131231555));
        l.d(jbm.d, new jbk(2131952278, 2131952279, 2131231558));
        l.d(jbm.e, new jbk(2131952282, 2131952283, 2131231590));
        l.d(jbm.f, new jbk(2131952292, 2131952293, 2131231533));
        l.d(jbm.l, new jbk(2131952155, 2131952155, 2131231453));
        l.d(jbm.g, new jbk(2131952284, 2131952285, 2131231516));
        l.d(jbm.h, new jbk(2131952266, 2131952267, 2131231453));
        l.d(jbm.i, new jbk(2131952290, 2131952291, 2131231555));
        l.d(jbm.j, new jbk(2131952275, 2131952276, 2131231306));
        l.d(jbm.q, new jbk(2131952273, 2131952274, 2131231270));
        l.d(jbm.k, new jbk(2131952271, 2131952272, 2131231575));
        l.d(jbm.s, new jbk(2131952280, 2131952281, 2131231301));
        l.d(jbm.m, new jbk(2131952269, 2131952270, 2131231227));
        l.d(jbm.n, new jbk(2131952289, 2131952268, 2131231469));
        l.d(jbm.o, new jbk(2131952288, 2131952625, 2131231528));
        l.d(jbm.p, new jbk(2131952296, 2131952299, 2131231386));
        l.d(jbm.r, new jbk(2131952286, 2131952287, 2131231573));
        a = l.b();
    }
    
    public jbk(final int b, final int c, final int d) {
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public static jbk b(final jbm jbm) {
        final jbk jbk = jbk.a.get(jbm);
        jbk.getClass();
        return jbk;
    }
    
    public static boolean e(final jbm jbm) {
        return noi.I(jbm.g, jbm.b).contains(jbm);
    }
    
    public static int f(final jbm jbm) {
        final jbm a = jbm.a;
        switch (jbm.ordinal()) {
            default: {
                return 1;
            }
            case 18: {
                return 27;
            }
            case 16: {
                return 31;
            }
            case 15: {
                return 28;
            }
            case 14: {
                return 13;
            }
            case 13: {
                return 11;
            }
            case 12: {
                return 29;
            }
            case 10: {
                return 26;
            }
            case 9: {
                return 25;
            }
            case 8: {
                return 21;
            }
            case 7: {
                return 20;
            }
            case 6: {
                return 22;
            }
            case 5: {
                return 24;
            }
            case 4: {
                return 6;
            }
            case 3: {
                return 23;
            }
            case 2: {
                return 9;
            }
            case 1: {
                return 2;
            }
        }
    }
    
    public final Drawable a(final Resources resources) {
        return resources.getDrawable(this.d, (Resources$Theme)null);
    }
    
    public final String c(final Resources resources) {
        return resources.getString(this.c);
    }
    
    public final String d(final Resources resources) {
        return resources.getString(this.b);
    }
}
