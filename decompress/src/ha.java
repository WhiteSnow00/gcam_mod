import java.util.concurrent.Executor;
import android.graphics.fonts.Font;
import android.graphics.fonts.FontStyle;
import android.graphics.Typeface$CustomFallbackBuilder;
import java.io.IOException;
import android.graphics.fonts.FontFamily$Builder;
import android.graphics.fonts.Font$Builder;
import android.os.Handler;
import android.os.Looper;
import java.util.ArrayList;
import java.util.concurrent.Callable;
import android.content.res.Resources;
import android.graphics.Typeface;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ha
{
    public static final za a;
    
    static {
        new hg(null);
        a = new za(16);
    }
    
    public static Typeface a(final Context context, final Typeface typeface, final int n) {
        if (context != null) {
            return Typeface.create(typeface, n);
        }
        throw new IllegalArgumentException("Context cannot be null");
    }
    
    public static String b(final Resources resources, final int n, final int n2) {
        final StringBuilder sb = new StringBuilder();
        sb.append(resources.getResourcePackageName(n));
        sb.append("-");
        sb.append(n);
        sb.append("-");
        sb.append(n2);
        return sb.toString();
    }
    
    public static Typeface c(Context context, gm gm, final Resources resources, final int n, final int n2, final gs gs, final boolean b) {
        final boolean b2 = gm instanceof gp;
        int n3 = 1;
        boolean b3 = true;
        final Typeface typeface = null;
        final Typeface typeface2 = null;
        Typeface typeface5 = null;
        Label_0748: {
            if (b2) {
                final gp gp = (gp)gm;
                final String d = gp.d;
                Typeface typeface3 = null;
                Label_0087: {
                    if (d != null) {
                        if (d.isEmpty()) {
                            typeface3 = null;
                            break Label_0087;
                        }
                        final Typeface create = Typeface.create(d, 0);
                        final Typeface create2 = Typeface.create(Typeface.DEFAULT, 0);
                        if (create != null) {
                            typeface3 = create;
                            if (!create.equals((Object)create2)) {
                                break Label_0087;
                            }
                        }
                    }
                    typeface3 = null;
                }
                if (typeface3 != null) {
                    gs.b(typeface3);
                    return typeface3;
                }
                if (!b || gp.c != 0) {
                    b3 = false;
                }
                int b4;
                if (b) {
                    b4 = gp.b;
                }
                else {
                    b4 = -1;
                }
                final Handler c = gs.c();
                final abd abd = new abd(gs);
                final aav a = gp.a;
                final aat aat = new aat(abd, c);
                if (b3) {
                    final String b5 = abb.b(a, n2);
                    final Typeface typeface4 = (Typeface)abb.a.a(b5);
                    if (typeface4 != null) {
                        aat.a(new aba(typeface4));
                        typeface5 = typeface4;
                        break Label_0748;
                    }
                    if (b4 == -1) {
                        final aba a2 = abb.a(b5, context, a, n2);
                        aat.a(a2);
                        typeface5 = a2.a;
                        break Label_0748;
                    }
                    final aaw aaw = new aaw(b5, context, a, n2);
                    try {
                        final aba aba = (aba)aai.c(abb.b, aaw, b4);
                        aat.a(aba);
                        typeface5 = aba.a;
                    }
                    catch (final InterruptedException ex) {
                        aat.a(new aba(-3));
                        typeface5 = typeface;
                    }
                    break Label_0748;
                }
                else {
                    final String b6 = abb.b(a, n2);
                    final Typeface typeface6 = (Typeface)abb.a.a(b6);
                    if (typeface6 != null) {
                        aat.a(new aba(typeface6));
                        typeface5 = typeface6;
                        break Label_0748;
                    }
                    final aax aax = new aax(aat);
                    gm = (gm)abb.c;
                    synchronized (gm) {
                        final ArrayList list = (ArrayList)abb.d.get(b6);
                        if (list != null) {
                            list.add(aax);
                            monitorexit(gm);
                            break Label_0748;
                        }
                        final ArrayList<aax> list2 = new ArrayList<aax>();
                        list2.add(aax);
                        abb.d.put(b6, list2);
                        monitorexit(gm);
                        final aay aay = new aay(b6, context, a, n2);
                        gm = (gm)abb.b;
                        final aaz aaz = new aaz(b6);
                        Handler handler;
                        if (Looper.myLooper() == null) {
                            handler = new Handler(Looper.getMainLooper());
                        }
                        else {
                            handler = new Handler();
                        }
                        ((Executor)gm).execute(new abh(handler, aay, aaz));
                        break Label_0748;
                    }
                }
            }
            final gn gn = (gn)gm;
            try {
                final go[] a3 = gn.a;
                final int length = a3.length;
                context = null;
                for (final go go : a3) {
                    try {
                        final Font build = new Font$Builder(resources, go.e).setWeight(go.a).setSlant((int)(go.b ? 1 : 0)).setTtcIndex(go.d).setFontVariationSettings(go.c).build();
                        if (context == null) {
                            context = (Context)new FontFamily$Builder(build);
                        }
                        else {
                            ((FontFamily$Builder)context).addFont(build);
                        }
                    }
                    catch (final IOException ex2) {}
                }
                if (context == null) {
                    typeface5 = typeface2;
                }
                else {
                    int n4;
                    if (0x1 != (n2 & 0x1)) {
                        n4 = 400;
                    }
                    else {
                        n4 = 700;
                    }
                    if ((n2 & 0x2) == 0x0) {
                        n3 = 0;
                    }
                    typeface5 = new Typeface$CustomFallbackBuilder(((FontFamily$Builder)context).build()).setStyle(new FontStyle(n4, n3)).build();
                }
            }
            catch (final Exception ex3) {
                typeface5 = typeface2;
            }
            if (typeface5 != null) {
                gs.b(typeface5);
            }
            else {
                gs.d();
            }
        }
        if (typeface5 != null) {
            ha.a.b(b(resources, n, n2), typeface5);
        }
        return typeface5;
    }
}
