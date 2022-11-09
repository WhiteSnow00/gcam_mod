import android.media.CamcorderProfile;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import android.util.Size;

// 
// Decompiled by Procyon v0.6.0
// 

public final class krf
{
    public static Size a(final kre kre) {
        return new Size(kre.a, kre.b);
    }
    
    public static kre b(final String s) {
        if (s == null) {
            return null;
        }
        final String[] split = s.split("x");
        if (split.length != 2) {
            return null;
        }
        try {
            return new kre(Integer.parseInt(split[0]), Integer.parseInt(split[1]));
        }
        catch (final NumberFormatException ex) {
            return null;
        }
    }
    
    public static kre c(final List list) {
        njo.o(list.isEmpty() ^ true);
        return Collections.max((Collection<? extends kre>)list, (Comparator<? super kre>)aab.b);
    }
    
    public static String d(final kre kre) {
        final int a = kre.a;
        final int b = kre.b;
        final StringBuilder sb = new StringBuilder(23);
        sb.append(a);
        sb.append("x");
        sb.append(b);
        return sb.toString();
    }
    
    public static List e(final Size[] array) {
        if (array == null) {
            return nns.l();
        }
        final ArrayList list = new ArrayList(array.length);
        for (int i = 0; i < array.length; ++i) {
            final Size size = array[i];
            if (size != null) {
                list.add(new kre(size.getWidth(), size.getHeight()));
            }
        }
        return list;
    }
    
    public static final boolean g(final lfj lfj, final knj knj) {
        return CamcorderProfile.hasProfile(Integer.parseInt(lfj.a), knj.e);
    }
    
    public static final kno h(final lfj lfj, final knj knj) {
        return kno.a(CamcorderProfile.get(Integer.parseInt(lfj.a), knj.e)).a();
    }
    
    public static final kno i(final lfj lfj, final knl knl) {
        return kno.a(CamcorderProfile.get(Integer.parseInt(lfj.a), knl.i)).a();
    }
    
    public static final int j(int round, final kmv kmv, final boolean b, final niz niz) {
        int n = round;
        if (kmv.equals(kmv.i) && (n = round) < 48000000) {
            n = 48000000;
        }
        round = n;
        if (b) {
            round = Math.round(n * 0.9f);
        }
        int intValue = round;
        if (niz.g()) {
            intValue = round;
            if ((int)niz.c() > 0) {
                intValue = (int)niz.c();
            }
        }
        return intValue;
    }
}
