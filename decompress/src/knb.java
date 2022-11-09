import android.media.MediaCodecInfo$AudioCapabilities;
import android.media.MediaCodecInfo$CodecCapabilities;
import android.media.MediaCodecInfo;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knb implements kna
{
    private static final noi a;
    private final int[] b;
    private final kmw c;
    
    static {
        a = noi.J(kre.h(720, 480), kre.h(704, 480), kre.h(640, 480));
    }
    
    public knb(final kmw c) {
        this.b = new int[] { 8000, 11025, 12000, 16000, 22050, 24000, 44100, 48000, 192000 };
        this.c = c;
    }
    
    @Override
    public final kmz a(final kmt kmt, final kno kno) {
        final int d = kno.d;
        return new kmz(kmr.a(kno.c), kno.a, d, d * kmt.a(), kno.b);
    }
    
    @Override
    public final kmz b(final kmt kmt, final kno kno) {
        final int d = kno.d;
        final kmr a = kmr.a(kno.c);
        final kms h = a.h;
        final MediaCodecInfo mediaCodecInfo = this.c.a.get(h.e);
        nov.z(mediaCodecInfo);
        final MediaCodecInfo$CodecCapabilities capabilitiesForType = mediaCodecInfo.getCapabilitiesForType(h.e);
        nov.z(capabilitiesForType);
        final MediaCodecInfo$AudioCapabilities audioCapabilities = capabilitiesForType.getAudioCapabilities();
        nov.z(audioCapabilities);
        final int[] b = this.b;
        final boolean b2 = false;
        int n = 0;
        int n2 = 0;
        int n3;
        while (true) {
            n3 = n2;
            if (n >= 9) {
                break;
            }
            n3 = b[n];
            if (audioCapabilities.isSampleRateSupported(n3)) {
                if (n3 >= d) {
                    break;
                }
                n2 = n3;
            }
            ++n;
        }
        int n4 = kmt.a() * n3;
        if (n4 > 192000) {
            n3 = 192000 / kmt.a();
            n4 = 192000;
        }
        nov.A(n3 > 0);
        nov.A(n4 > 0 || b2);
        return new kmz(a, kno.a, n3, n4, kno.b);
    }
    
    @Override
    public final knc c(final kno kno, final kmt kmt, final kmv kmv) {
        njo.d(this.d(kno, kmt, kmv));
        final int l = kno.l;
        final int i = kmt.i;
        int g = kno.g;
        if (kmt.f()) {
            if (i < l) {
                g *= (int)(i / (float)l);
            }
        }
        else {
            if (!kmt.g()) {
                final int j = kmt.i;
                final int k = kmt.j;
                final StringBuilder sb = new StringBuilder(79);
                sb.append("unsupported capture frame rate =");
                sb.append(j);
                sb.append(" and encoding frame rate=");
                sb.append(k);
                throw new IllegalArgumentException(sb.toString());
            }
            if (i == 30 && l == 60) {
                final double n = g;
                Double.isNaN(n);
                g = (int)(n / 1.5);
            }
        }
        njo.d(kmu.a(kno));
        final int e = kno.e;
        kmu kmu = null;
        switch (e) {
            default: {
                final StringBuilder sb2 = new StringBuilder(41);
                sb2.append("file format is not supported: ");
                sb2.append(e);
                throw new IllegalArgumentException(sb2.toString());
            }
            case 2: {
                kmu = kmu.a;
                break;
            }
            case 1: {
                kmu = kmu.c;
                break;
            }
        }
        final int h = kno.h;
        final int m = kno.i;
        final int j2 = kno.j;
        int n2;
        if (kmt == kmt.a) {
            n2 = 2;
        }
        else {
            n2 = 1;
        }
        return new knc(kmu, kmv, g, kmt, h, m, j2, n2);
    }
    
    @Override
    public final boolean d(final kno kno, final kmt kmt, final kmv kmv) {
        if (kmt.k <= kno.l) {
            boolean b;
            if (kno.f == 4) {
                b = knb.a.contains(kmv.c());
            }
            else {
                b = new kre(kno.m, kno.k).equals(kmv.c());
            }
            if (b) {
                if (kmu.a(kno)) {
                    return true;
                }
            }
        }
        return false;
    }
}
