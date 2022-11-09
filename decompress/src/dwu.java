import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwu
{
    public final InterleavedImageU8 a;
    public final dxs b;
    public final HardwareBuffer c;
    public final ShotMetadata d;
    public final kra e;
    public final ljm f;
    public final long g;
    public final dwo h;
    public final oey i;
    public final gen j;
    public final InterleavedImageU8 k;
    public final hbj l;
    public final dtx m;
    public final bqx n;
    
    public dwu() {
    }
    
    public dwu(final InterleavedImageU8 a, final dxs b, final HardwareBuffer c, final ShotMetadata d, final kra e, final ljm f, final long g, final dtx m, final dwo h, final oey i, final gen j, final hbj l) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.m = m;
        this.h = h;
        this.i = i;
        this.j = j;
        this.n = null;
        this.k = null;
        this.l = l;
    }
    
    public static dwt a() {
        return new dwt();
    }
    
    public final kre b() {
        final InterleavedImageU8 a = this.a;
        if (a != null) {
            return kre.h(a.b(), a.a());
        }
        final dxs b = this.b;
        if (b != null) {
            return kre.h(b.c(), b.b());
        }
        final HardwareBuffer c = this.c;
        if (c != null) {
            return kre.h(c.getWidth(), c.getHeight());
        }
        throw new IllegalStateException("Format is none of the known ones.");
    }
    
    public final dwt c() {
        return new dwt(this);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof dwu) {
            final dwu dwu = (dwu)o;
            final InterleavedImageU8 a = this.a;
            if (a == null) {
                if (dwu.a != null) {
                    return false;
                }
            }
            else if (!a.equals(dwu.a)) {
                return false;
            }
            final dxs b = this.b;
            if (b == null) {
                if (dwu.b != null) {
                    return false;
                }
            }
            else if (!b.equals(dwu.b)) {
                return false;
            }
            final HardwareBuffer c = this.c;
            if (c == null) {
                if (dwu.c != null) {
                    return false;
                }
            }
            else if (!c.equals(dwu.c)) {
                return false;
            }
            if (this.d.equals(dwu.d) && this.e.equals(dwu.e) && this.f.equals(dwu.f) && this.g == dwu.g && this.m.equals(dwu.m)) {
                final dwo h = this.h;
                if (h == null) {
                    if (dwu.h != null) {
                        return false;
                    }
                }
                else if (!h.equals(dwu.h)) {
                    return false;
                }
                if (this.i.equals(dwu.i) && this.j.equals(dwu.j)) {
                    final bqx n = dwu.n;
                    final InterleavedImageU8 k = dwu.k;
                    final hbj l = this.l;
                    final hbj i = dwu.l;
                    if (l == null) {
                        if (i != null) {
                            return false;
                        }
                    }
                    else if (!l.equals(i)) {
                        return false;
                    }
                    return true;
                }
            }
            return false;
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final InterleavedImageU8 a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a == null) {
            hashCode2 = 0;
        }
        else {
            hashCode2 = a.hashCode();
        }
        final dxs b = this.b;
        int hashCode3;
        if (b == null) {
            hashCode3 = 0;
        }
        else {
            hashCode3 = b.hashCode();
        }
        final HardwareBuffer c = this.c;
        int hashCode4;
        if (c == null) {
            hashCode4 = 0;
        }
        else {
            hashCode4 = c.hashCode();
        }
        final int hashCode5 = this.d.hashCode();
        final int hashCode6 = this.e.hashCode();
        final int hashCode7 = this.f.hashCode();
        final long g = this.g;
        final int n = (int)(g >>> 32 ^ g);
        final int hashCode8 = this.m.hashCode();
        final dwo h = this.h;
        int hashCode9;
        if (h == null) {
            hashCode9 = 0;
        }
        else {
            hashCode9 = h.hashCode();
        }
        final int hashCode10 = this.i.hashCode();
        final int hashCode11 = this.j.hashCode();
        final hbj l = this.l;
        if (l != null) {
            hashCode = l.hashCode();
        }
        return (((((((((((hashCode2 ^ 0xF4243) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ n) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ hashCode11) * 583896283 ^ hashCode;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final long g = this.g;
        final String value7 = String.valueOf(this.m);
        final String value8 = String.valueOf(this.h);
        final String value9 = String.valueOf(this.i);
        final String value10 = String.valueOf(this.j);
        final String value11 = String.valueOf((Object)null);
        final String value12 = String.valueOf((Object)null);
        final String value13 = String.valueOf(this.l);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 279 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length());
        sb.append("PostprocessingImage{rgbImage=");
        sb.append(value);
        sb.append(", yuvImage=");
        sb.append(value2);
        sb.append(", rgbHwBufferImage=");
        sb.append(value3);
        sb.append(", shotMetadata=");
        sb.append(value4);
        sb.append(", orientation=");
        sb.append(value5);
        sb.append(", metadata=");
        sb.append(value6);
        sb.append(", timestampNs=");
        sb.append(g);
        sb.append(", gcaShotSettings=");
        sb.append(value7);
        sb.append(", portraitShotParams=");
        sb.append(value8);
        sb.append(", mergedPdData=");
        sb.append(value9);
        sb.append(", pictureTakerParameters=");
        sb.append(value10);
        sb.append(", faceMetadata=");
        sb.append(value11);
        sb.append(", warpedSegmentationMaskImage=");
        sb.append(value12);
        sb.append(", rectifaceWarpfield=");
        sb.append(value13);
        sb.append("}");
        return sb.toString();
    }
}
