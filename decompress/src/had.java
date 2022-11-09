import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

public final class had implements Comparable, krc
{
    public final long a;
    public final float b;
    public final float c;
    public final float d;
    public final float e;
    public final float f;
    public final float g;
    public final float h;
    public final float i;
    public final float j;
    public final float k;
    public final float l;
    public final float m;
    public final boolean n;
    public final boolean o;
    public final niz p;
    public final niz q;
    public final niz r;
    
    public had(final long a, final float b, final float c, final float d, final float e, final float f, final float g, final float h, final float i, final float j, final float k, final float l, final float m, final boolean n, final boolean o, final niz p18, final niz q, final niz r) {
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
        this.p = p18;
        this.q = q;
        this.r = r;
    }
    
    @Override
    public final void close() {
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof had)) {
            return false;
        }
        final had had = (had)o;
        return this.a == had.a && Float.compare(had.b, this.b) == 0 && Float.compare(had.c, this.c) == 0 && Float.compare(had.d, this.d) == 0 && Float.compare(had.e, this.e) == 0 && Float.compare(had.f, this.f) == 0 && Float.compare(had.g, this.g) == 0 && Float.compare(had.h, this.h) == 0 && Float.compare(had.i, this.i) == 0 && Float.compare(had.j, this.j) == 0 && Float.compare(had.k, this.k) == 0 && Float.compare(had.l, this.l) == 0 && Float.compare(had.m, this.m) == 0 && hac.a(had.n, this.n) == 0 && hac.a(had.o, this.o) == 0;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, this.j, this.k, this.l, this.m, this.n, this.o });
    }
    
    @Override
    public final String toString() {
        final long a = this.a;
        final float b = this.b;
        final float c = this.c;
        final float d = this.d;
        final float e = this.e;
        final float f = this.f;
        final float g = this.g;
        final float h = this.h;
        final float i = this.i;
        final float j = this.j;
        final float k = this.k;
        final float l = this.l;
        final float m = this.m;
        final boolean n = this.n;
        final boolean o = this.o;
        final boolean g2 = this.p.g();
        String string = "unavailable";
        String string2;
        if (g2) {
            string2 = this.p.toString();
        }
        else {
            string2 = "unavailable";
        }
        String string3;
        if (this.q.g()) {
            string3 = this.q.toString();
        }
        else {
            string3 = "unavailable";
        }
        if (this.r.g()) {
            string = this.r.toString();
        }
        final StringBuilder sb = new StringBuilder(String.valueOf(string2).length() + 583 + String.valueOf(string3).length() + String.valueOf(string).length());
        sb.append("FrameQualityScore{timestampNs=");
        sb.append(a);
        sb.append(", topShotScore=");
        sb.append(b);
        sb.append(", autoExposureStability=");
        sb.append(c);
        sb.append(", autoFocusStability=");
        sb.append(d);
        sb.append(", autoWhiteBalanceStability=");
        sb.append(e);
        sb.append(", faceCount=");
        sb.append(f);
        sb.append(", facePosition=");
        sb.append(g);
        sb.append(", faceQuality=");
        sb.append(h);
        sb.append(", globalMotionSharpness=");
        sb.append(i);
        sb.append(", lensStability=");
        sb.append(j);
        sb.append(", subjectMotion=");
        sb.append(k);
        sb.append(", straightness=");
        sb.append(l);
        sb.append(", aesthetic=");
        sb.append(m);
        sb.append(", shouldSkipUnscoredFaceFrame=");
        sb.append(n);
        sb.append(", shouldSkipUnscoredNonfaceFrame=");
        sb.append(o);
        sb.append(", smartCaptureFrameQualityScore=");
        sb.append(string2);
        sb.append(", cameraPose=");
        sb.append(string3);
        sb.append(", aestheticEmbeddings=");
        sb.append(string);
        sb.append('}');
        return sb.toString();
    }
}
