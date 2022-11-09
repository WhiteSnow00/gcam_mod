import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myc implements mvl
{
    public final String a;
    public final String b;
    public final List c;
    public final oni d;
    public final okj e;
    public final long f;
    public final String g;
    public final String h;
    public final okj i;
    public final okj j;
    public final okj k;
    public final boolean l;
    public final List m;
    public final String n;
    public final String o;
    public final opg p;
    public final oih q;
    public final mxk r;
    public final long s;
    public final mva t;
    private final pik u;
    
    public myc() {
        this(null);
    }
    
    public myc(final String a, final String b, final List c, final oni d, final okj e, final long f, final String g, final String h, final mva t, final okj i, final okj j, final okj k, final boolean l, final List m, final String n, final String o, final opg p20, final oih q, final mxk r, final long s) {
        c.getClass();
        m.getClass();
        r.getClass();
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.g = g;
        this.h = h;
        this.t = t;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.o = o;
        this.p = p20;
        this.q = q;
        this.r = r;
        this.s = s;
        this.u = pip.c(new myb(this, 1));
        pip.c(new myb(this));
    }
    
    @Override
    public final void b() {
    }
    
    public final oii c() {
        return (oii)this.u.a();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof myc) {
                final myc myc = (myc)o;
                if (plr.b(this.a, myc.a) && plr.b(this.b, myc.b) && plr.b(this.c, myc.c) && plr.b(this.d, myc.d) && plr.b(this.e, myc.e) && this.f == myc.f && plr.b(this.g, myc.g) && plr.b(this.h, myc.h) && plr.b(this.t, myc.t) && plr.b(this.i, myc.i) && plr.b(this.j, myc.j) && plr.b(this.k, myc.k) && this.l == myc.l && plr.b(this.m, myc.m) && plr.b(this.n, myc.n) && plr.b(this.o, myc.o) && plr.b(this.p, myc.p) && plr.b(this.q, myc.q) && plr.b(this.r, myc.r) && this.s == myc.s) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final String a = this.a;
        int hashCode = 0;
        int hashCode2;
        if (a != null) {
            hashCode2 = a.hashCode();
        }
        else {
            hashCode2 = 0;
        }
        final String b = this.b;
        int hashCode3;
        if (b != null) {
            hashCode3 = b.hashCode();
        }
        else {
            hashCode3 = 0;
        }
        final List c = this.c;
        int hashCode4;
        if (c != null) {
            hashCode4 = c.hashCode();
        }
        else {
            hashCode4 = 0;
        }
        final oni d = this.d;
        int ay;
        if (d != null) {
            ay = d.ay;
            if (ay == 0) {
                ay = omr.a.b(d).b(d);
                d.ay = ay;
            }
        }
        else {
            ay = 0;
        }
        final okj e = this.e;
        int ay2;
        if (e != null) {
            ay2 = e.ay;
            if (ay2 == 0) {
                ay2 = omr.a.b(e).b(e);
                e.ay = ay2;
            }
        }
        else {
            ay2 = 0;
        }
        final int a2 = mya.a(this.f);
        final String g = this.g;
        int hashCode5;
        if (g != null) {
            hashCode5 = g.hashCode();
        }
        else {
            hashCode5 = 0;
        }
        final String h = this.h;
        int hashCode6;
        if (h != null) {
            hashCode6 = h.hashCode();
        }
        else {
            hashCode6 = 0;
        }
        final mva t = this.t;
        int hashCode7;
        if (t != null) {
            hashCode7 = t.hashCode();
        }
        else {
            hashCode7 = 0;
        }
        final okj i = this.i;
        int ay3;
        if (i != null) {
            ay3 = i.ay;
            if (ay3 == 0) {
                ay3 = omr.a.b(i).b(i);
                i.ay = ay3;
            }
        }
        else {
            ay3 = 0;
        }
        final okj j = this.j;
        int ay4;
        if (j != null) {
            ay4 = j.ay;
            if (ay4 == 0) {
                ay4 = omr.a.b(j).b(j);
                j.ay = ay4;
            }
        }
        else {
            ay4 = 0;
        }
        final okj k = this.k;
        int ay5;
        if (k != null) {
            ay5 = k.ay;
            if (ay5 == 0) {
                ay5 = omr.a.b(k).b(k);
                k.ay = ay5;
            }
        }
        else {
            ay5 = 0;
        }
        final int l = this.l ? 1 : 0;
        final List m = this.m;
        int hashCode8;
        if (m != null) {
            hashCode8 = m.hashCode();
        }
        else {
            hashCode8 = 0;
        }
        final String n = this.n;
        int hashCode9;
        if (n != null) {
            hashCode9 = n.hashCode();
        }
        else {
            hashCode9 = 0;
        }
        final String o = this.o;
        int hashCode10;
        if (o != null) {
            hashCode10 = o.hashCode();
        }
        else {
            hashCode10 = 0;
        }
        final opg p = this.p;
        int ay6;
        if (p != null) {
            ay6 = p.ay;
            if (ay6 == 0) {
                ay6 = omr.a.b(p).b(p);
                p.ay = ay6;
            }
        }
        else {
            ay6 = 0;
        }
        final oih q = this.q;
        int ay7;
        if (q != null) {
            ay7 = q.ay;
            if (ay7 == 0) {
                ay7 = omr.a.b(q).b(q);
                q.ay = ay7;
            }
        }
        else {
            ay7 = 0;
        }
        final mxk r = this.r;
        if (r != null) {
            hashCode = r.hashCode();
        }
        return ((((((((((((((((((hashCode2 * 31 + hashCode3) * 31 + hashCode4) * 31 + ay) * 31 + ay2) * 31 + a2) * 31 + hashCode5) * 31 + hashCode6) * 31 + hashCode7) * 31 + ay3) * 31 + ay4) * 31 + ay5) * 31 + l) * 31 + hashCode8) * 31 + hashCode9) * 31 + hashCode10) * 31 + ay6) * 31 + ay7) * 31 + hashCode) * 31 + mya.a(this.s);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ResourceEntity(title=");
        sb.append(this.a);
        sb.append(", experienceId=");
        sb.append(this.b);
        sb.append(", queryableTags=");
        sb.append(this.c);
        sb.append(", queryableEpochTimestamp=");
        sb.append(this.d);
        sb.append(", queryableDuration=");
        sb.append(this.e);
        sb.append(", approximateTotalSize=");
        sb.append(this.f);
        sb.append(", namespaceId=");
        sb.append(this.g);
        sb.append(", partitionId=");
        sb.append(this.h);
        sb.append(", f250ResourceId=");
        sb.append(this.t);
        sb.append(", f250AutoUploadDelay=");
        sb.append(this.i);
        sb.append(", airlockExpiration=");
        sb.append(this.j);
        sb.append(", f250Expiration=");
        sb.append(this.k);
        sb.append(", deleteAirlockFilesOnceUploaded=");
        sb.append(this.l);
        sb.append(", nonSignedInDataOwners=");
        sb.append(this.m);
        sb.append(", overridenObfuscatedGaiaId=");
        sb.append(this.n);
        sb.append(", uploadTransferHandle=");
        sb.append(this.o);
        sb.append(", relations=");
        sb.append(this.p);
        sb.append(", indexTokens=");
        sb.append(this.q);
        sb.append(", status=");
        sb.append(this.r);
        sb.append(", onDeviceId=");
        sb.append(this.s);
        sb.append(")");
        return sb.toString();
    }
}
