import java.util.List;
import android.util.Range;

// 
// Decompiled by Procyon v0.6.0
// 

public final class cfo
{
    public final boolean A;
    public final boolean B;
    public final boolean C;
    private final int D;
    public final lfj a;
    public final lfj b;
    public final cfa c;
    public final kmt d;
    public final kmv e;
    public final niz f;
    public final kre g;
    public final knc h;
    public final niz i;
    public final niz j;
    public final niz k;
    public final niz l;
    public final boolean m;
    public final Range n;
    public final Range o;
    public final boolean p;
    public final boolean q;
    public final boolean r;
    public final boolean s;
    public final boolean t;
    public final boolean u;
    public final nns v;
    public final nns w;
    public final nns x;
    public final lfu y;
    public final hio z;
    
    public cfo() {
    }
    
    public cfo(final lfj a, final lfj b, final cfa c, final kmt d, final kmv e, final niz f, final kre g, final knc h, final niz i, final niz j, final niz k, final niz l, final boolean m, final Range n, final Range o, final boolean p30, final boolean q, final boolean r, final boolean s, final boolean t, final boolean u, final nns v, final nns w, final nns x, final lfu y, final hio z, final int d2, final boolean a2, final boolean b2, final boolean c2) {
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
        this.n = n;
        this.o = o;
        this.p = p30;
        this.q = q;
        this.r = r;
        this.s = s;
        this.t = t;
        this.u = u;
        this.v = v;
        this.w = w;
        this.x = x;
        this.y = y;
        this.z = z;
        this.D = d2;
        this.A = a2;
        this.B = b2;
        this.C = c2;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cfo) {
            final cfo cfo = (cfo)o;
            if (this.a.equals(cfo.a) && this.b.equals(cfo.b) && this.c.equals(cfo.c) && this.d.equals(cfo.d) && this.e.equals(cfo.e) && this.f.equals(cfo.f) && this.g.equals(cfo.g) && this.h.equals(cfo.h) && this.i.equals(cfo.i) && this.j.equals(cfo.j) && this.k.equals(cfo.k) && this.l.equals(cfo.l) && this.m == cfo.m && this.n.equals((Object)cfo.n) && this.o.equals((Object)cfo.o) && this.p == cfo.p && this.q == cfo.q && this.r == cfo.r && this.s == cfo.s && this.t == cfo.t && this.u == cfo.u && nqb.t(this.v, cfo.v) && nqb.t(this.w, cfo.w) && nqb.t(this.x, cfo.x) && this.y.equals(cfo.y) && this.z.equals(cfo.z) && this.D == cfo.D && this.A == cfo.A && this.B == cfo.B && this.C == cfo.C) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.a.b;
        final int b2 = this.b.b;
        final int hashCode = this.c.hashCode();
        final int hashCode2 = this.d.hashCode();
        final int hashCode3 = this.e.hashCode();
        final int hashCode4 = this.f.hashCode();
        final int hashCode5 = this.g.hashCode();
        final int hashCode6 = this.h.hashCode();
        final int hashCode7 = this.i.hashCode();
        final int hashCode8 = this.j.hashCode();
        final int hashCode9 = this.k.hashCode();
        final int hashCode10 = this.l.hashCode();
        final boolean m = this.m;
        int n = 1237;
        int n2;
        if (!m) {
            n2 = 1237;
        }
        else {
            n2 = 1231;
        }
        final int hashCode11 = this.n.hashCode();
        final int hashCode12 = this.o.hashCode();
        int n3;
        if (!this.p) {
            n3 = 1237;
        }
        else {
            n3 = 1231;
        }
        int n4;
        if (!this.q) {
            n4 = 1237;
        }
        else {
            n4 = 1231;
        }
        int n5;
        if (!this.r) {
            n5 = 1237;
        }
        else {
            n5 = 1231;
        }
        int n6;
        if (!this.s) {
            n6 = 1237;
        }
        else {
            n6 = 1231;
        }
        int n7;
        if (!this.t) {
            n7 = 1237;
        }
        else {
            n7 = 1231;
        }
        int n8;
        if (!this.u) {
            n8 = 1237;
        }
        else {
            n8 = 1231;
        }
        final int hashCode13 = this.v.hashCode();
        final int hashCode14 = this.w.hashCode();
        final int hashCode15 = this.x.hashCode();
        final int hashCode16 = this.y.hashCode();
        final int hashCode17 = this.z.hashCode();
        final int d = this.D;
        int n9;
        if (!this.A) {
            n9 = 1237;
        }
        else {
            n9 = 1231;
        }
        int n10;
        if (!this.B) {
            n10 = 1237;
        }
        else {
            n10 = 1231;
        }
        if (this.C) {
            n = 1231;
        }
        return (((((((((((((((((((((((((((((b ^ 0xF4243) * 1000003 ^ b2) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ hashCode3) * 1000003 ^ hashCode4) * 1000003 ^ hashCode5) * 1000003 ^ hashCode6) * 1000003 ^ hashCode7) * 1000003 ^ hashCode8) * 1000003 ^ hashCode9) * 1000003 ^ hashCode10) * 1000003 ^ n2) * 1000003 ^ hashCode11) * 1000003 ^ hashCode12) * 1000003 ^ n3) * 1000003 ^ n4) * 1000003 ^ n5) * 1000003 ^ n6) * 1000003 ^ n7) * 1000003 ^ n8) * 1000003 ^ hashCode13) * 1000003 ^ hashCode14) * 1000003 ^ hashCode15) * 1000003 ^ hashCode16) * 1000003 ^ hashCode17) * 1000003 ^ d) * 1000003 ^ n9) * 1000003 ^ n10) * 1000003 ^ n;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.c);
        final String value4 = String.valueOf(this.d);
        final String value5 = String.valueOf(this.e);
        final String value6 = String.valueOf(this.f);
        final String value7 = String.valueOf(this.g);
        final String value8 = String.valueOf(this.h);
        final String value9 = String.valueOf(this.i);
        final String value10 = String.valueOf(this.j);
        final String value11 = String.valueOf(this.k);
        final String value12 = String.valueOf(this.l);
        final boolean m = this.m;
        final String value13 = String.valueOf(this.n);
        final String value14 = String.valueOf(this.o);
        final boolean p = this.p;
        final boolean q = this.q;
        final boolean r = this.r;
        final boolean s = this.s;
        final boolean t = this.t;
        final boolean u = this.u;
        final String value15 = String.valueOf(this.v);
        final String value16 = String.valueOf(this.w);
        final String value17 = String.valueOf(this.x);
        final String value18 = String.valueOf(this.y);
        final String value19 = String.valueOf(this.z);
        final int d = this.D;
        final boolean a = this.A;
        final boolean b = this.B;
        final boolean c = this.C;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 689 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length() + String.valueOf(value14).length() + String.valueOf(value15).length() + String.valueOf(value16).length() + String.valueOf(value17).length() + String.valueOf(value18).length() + String.valueOf(value19).length());
        sb.append("CaptureSessionConfig{cameraId=");
        sb.append(value);
        sb.append(", streamCameraId=");
        sb.append(value2);
        sb.append(", camcorderCharacteristics=");
        sb.append(value3);
        sb.append(", captureRate=");
        sb.append(value4);
        sb.append(", videoResolution=");
        sb.append(value5);
        sb.append(", snapshotSize=");
        sb.append(value6);
        sb.append(", previewSize=");
        sb.append(value7);
        sb.append(", videoEncoderProfile=");
        sb.append(value8);
        sb.append(", audioEncoderProfile=");
        sb.append(value9);
        sb.append(", uri=");
        sb.append(value10);
        sb.append(", maxDuration=");
        sb.append(value11);
        sb.append(", maxFileSize=");
        sb.append(value12);
        sb.append(", shouldRecordLocationIfPermitted=");
        sb.append(m);
        sb.append(", previewFpsRange=");
        sb.append(value13);
        sb.append(", recordFpsRange=");
        sb.append(value14);
        sb.append(", useContinuousAutoFocusOnDuringRecording=");
        sb.append(p);
        sb.append(", shouldUnlockAfAeWithSceneChange=");
        sb.append(q);
        sb.append(", shouldDetectFace=");
        sb.append(r);
        sb.append(", shouldVideoStabilizationOn=");
        sb.append(s);
        sb.append(", useOpticalStabilization=");
        sb.append(t);
        sb.append(", useLlv=");
        sb.append(u);
        sb.append(", allSupportedCaptureRates=");
        sb.append(value15);
        sb.append(", supportedCaptureRates=");
        sb.append(value16);
        sb.append(", supportedVideoResolutions=");
        sb.append(value17);
        sb.append(", cameraFacing=");
        sb.append(value18);
        sb.append(", captureSessionType=");
        sb.append(value19);
        sb.append(", sessionId=");
        sb.append(d);
        sb.append(", useMediaCodec=");
        sb.append(a);
        sb.append(", topShotEnabled=");
        sb.append(b);
        sb.append(", shouldSupportSpeechMode=");
        sb.append(c);
        sb.append("}");
        return sb.toString();
    }
}
