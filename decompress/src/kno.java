import android.media.CamcorderProfile;

// 
// Decompiled by Procyon v0.6.0
// 

public final class kno
{
    public final int a;
    public final int b;
    public final int c;
    public final int d;
    public final int e;
    public final int f;
    public final int g;
    public final int h;
    public final int i;
    public final int j;
    public final int k;
    public final int l;
    public final int m;
    
    public kno() {
    }
    
    public kno(final int a, final int b, final int c, final int d, final int e, final int f, final int g, final int h, final int i, final int j, final int k, final int l, final int m) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
    }
    
    public static knn a(final CamcorderProfile camcorderProfile) {
        final knn knn = new knn();
        knn.b(camcorderProfile.audioBitRate);
        knn.c(camcorderProfile.audioChannels);
        knn.d(camcorderProfile.audioCodec);
        knn.e(camcorderProfile.audioSampleRate);
        knn.f(camcorderProfile.fileFormat);
        knn.g(camcorderProfile.quality);
        knn.h(camcorderProfile.videoBitRate);
        knn.i(camcorderProfile.videoCodec);
        knn.k(-1);
        knn.j(-1);
        knn.l(camcorderProfile.videoFrameHeight);
        knn.m(camcorderProfile.videoFrameRate);
        knn.n(camcorderProfile.videoFrameWidth);
        return knn;
    }
    
    public static knn b(final kno kno) {
        final knn knn = new knn();
        knn.b(kno.a);
        knn.c(kno.b);
        knn.d(kno.c);
        knn.e(kno.d);
        knn.f(kno.e);
        knn.g(kno.f);
        knn.h(kno.g);
        knn.i(kno.h);
        knn.k(kno.i);
        knn.j(kno.j);
        knn.l(kno.k);
        knn.m(kno.l);
        knn.n(kno.m);
        return knn;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof kno) {
            final kno kno = (kno)o;
            if (this.a == kno.a && this.b == kno.b && this.c == kno.c && this.d == kno.d && this.e == kno.e && this.f == kno.f && this.g == kno.g && this.h == kno.h && this.i == kno.i && this.j == kno.j && this.k == kno.k && this.l == kno.l && this.m == kno.m) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return ((((((((((((this.a ^ 0xF4243) * 1000003 ^ this.b) * 1000003 ^ this.c) * 1000003 ^ this.d) * 1000003 ^ this.e) * 1000003 ^ this.f) * 1000003 ^ this.g) * 1000003 ^ this.h) * 1000003 ^ this.i) * 1000003 ^ this.j) * 1000003 ^ this.k) * 1000003 ^ this.l) * 1000003 ^ this.m;
    }
    
    @Override
    public final String toString() {
        final int a = this.a;
        final int b = this.b;
        final int c = this.c;
        final int d = this.d;
        final int e = this.e;
        final int f = this.f;
        final int g = this.g;
        final int h = this.h;
        final int i = this.i;
        final int j = this.j;
        final int k = this.k;
        final int l = this.l;
        final int m = this.m;
        final StringBuilder sb = new StringBuilder(375);
        sb.append("SimpleCamcorderProfileProxy{audioBitRate=");
        sb.append(a);
        sb.append(", audioChannels=");
        sb.append(b);
        sb.append(", audioCodec=");
        sb.append(c);
        sb.append(", audioSampleRate=");
        sb.append(d);
        sb.append(", fileFormat=");
        sb.append(e);
        sb.append(", quality=");
        sb.append(f);
        sb.append(", videoBitRate=");
        sb.append(g);
        sb.append(", videoCodec=");
        sb.append(h);
        sb.append(", videoCodecProfile=");
        sb.append(i);
        sb.append(", videoCodecLevel=");
        sb.append(j);
        sb.append(", videoFrameHeight=");
        sb.append(k);
        sb.append(", videoFrameRate=");
        sb.append(l);
        sb.append(", videoFrameWidth=");
        sb.append(m);
        sb.append("}");
        return sb.toString();
    }
}
