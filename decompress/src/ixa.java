import android.media.MediaCodecInfo$VideoCapabilities;
import android.media.MediaCodecInfo;
import java.util.Iterator;
import android.media.MediaCodecList;
import java.util.ArrayList;
import java.util.List;
import android.graphics.Point;
import android.view.WindowManager;

// 
// Decompiled by Procyon v0.6.0
// 

public class ixa implements ixp
{
    private static final nsd a;
    private final kre b;
    private final cxl c;
    private final String d;
    
    static {
        a = nsd.g("com/google/android/apps/camera/ui/viewfinder/DefaultViewfinderSizeSelector");
    }
    
    public ixa(final WindowManager windowManager, final cxl c) {
        final Point point = new Point(0, 0);
        windowManager.getDefaultDisplay().getSize(point);
        this.b = new kre(point.x, point.y);
        this.c = c;
        this.d = "video/avc";
    }
    
    final kre a(final List list, double n) {
        list.getClass();
        final boolean empty = list.isEmpty();
        boolean b = true;
        njo.d(empty ^ true);
        final kre b2 = this.b;
        final int min = Math.min(b2.a, b2.b);
        final int n2 = -1;
        int i = 0;
        int n3 = -1;
        double n4 = Double.MAX_VALUE;
        while (i < list.size()) {
            final kre kre = list.get(i);
            final double n5 = kre.a;
            final double n6 = kre.b;
            Double.isNaN(n5);
            Double.isNaN(n6);
            int n7 = 0;
            double n8 = 0.0;
            Label_0208: {
                if (Math.abs(n5 / n6 - n) > 0.02) {
                    n7 = n3;
                    n8 = n4;
                }
                else {
                    final double n9 = Math.abs(kre.b - min);
                    if (n9 >= n4) {
                        n7 = n3;
                        n8 = n4;
                        if (n9 != n4) {
                            break Label_0208;
                        }
                        n7 = n3;
                        n8 = n4;
                        if (kre.b >= min) {
                            break Label_0208;
                        }
                    }
                    n8 = n9;
                    n7 = i;
                }
            }
            ++i;
            n3 = n7;
            n4 = n8;
        }
        int n10;
        if ((n10 = n3) == -1) {
            a.k(ixa.a.c(), "No preview size match the aspect ratio. available sizes: %s", list, '\u0b9d');
            n = Double.MAX_VALUE;
            int j = 0;
            n10 = n2;
            while (j < list.size()) {
                final kre kre2 = list.get(j);
                if (Math.abs(kre2.b - min) < n) {
                    n = Math.abs(kre2.b - min);
                    n10 = j;
                }
                ++j;
            }
        }
        if (n10 < 0) {
            b = false;
        }
        njo.o(b);
        return (kre)list.get(n10);
    }
    
    @Override
    public kre b(final List list, final double n, final lfu lfu, final jbm jbm, final lfj lfj) {
        list.getClass();
        njo.d(list.isEmpty() ^ true);
        List b = list;
        if (jbm != jbm.c) {
            b = list;
            if (jbm != jbm.i) {
                String s;
                if (lfu == lfu.a) {
                    s = this.c.i(cxr.Q);
                }
                else {
                    s = this.c.i(cxr.P);
                }
                s.getClass();
                b = hny.b(list, s);
            }
        }
        final boolean k = this.c.k(cxs.T);
        int n2 = 1080;
        if (k) {
            final niz a = this.c.a(cxs.o);
            this.c.e();
            if (a.g()) {
                n2 = (int)a.c();
            }
            n2 = Math.max(n2, 0);
        }
        final ArrayList list2 = new ArrayList<Object>();
        for (final kre kre : b) {
            final int b2 = kre.b;
            if (b2 <= n2) {
                list2.add(new kre(kre.a, b2));
            }
        }
        final String d = this.d;
        final MediaCodecInfo[] codecInfos = new MediaCodecList(0).getCodecInfos();
        final int length = codecInfos.length;
        int i = 0;
    Label_0349:
        while (true) {
            while (i < length) {
                final MediaCodecInfo mediaCodecInfo = codecInfos[i];
                final String[] supportedTypes = mediaCodecInfo.getSupportedTypes();
                for (int length2 = supportedTypes.length, j = 0; j < length2; ++j) {
                    if (supportedTypes[j].equals(d) && mediaCodecInfo.isEncoder() && mediaCodecInfo.isHardwareAccelerated()) {
                        break Label_0349;
                    }
                }
                ++i;
                continue;
                ArrayList<kre> list3;
                if (mediaCodecInfo == null) {
                    a.k(ixa.a.c(), "No codec info found for codec '%s'! Will not filter preview sizes!", d, '\u0b9f');
                    list3 = (ArrayList<kre>)list2;
                }
                else {
                    final MediaCodecInfo$VideoCapabilities videoCapabilities = mediaCodecInfo.getCapabilitiesForType(d).getVideoCapabilities();
                    list3 = new ArrayList<kre>();
                    for (final kre kre2 : list2) {
                        if (videoCapabilities.isSizeSupported(kre2.a, kre2.b)) {
                            list3.add(kre2);
                        }
                    }
                }
                return this.a(list3, n);
            }
            final MediaCodecInfo mediaCodecInfo = null;
            continue Label_0349;
        }
    }
}
