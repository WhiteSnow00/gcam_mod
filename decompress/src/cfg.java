// 
// Decompiled by Procyon v0.6.0
// 

public final class cfg
{
    private final klv A;
    private final klj B;
    private final klj C;
    public final klv a;
    public final klj b;
    public final klv c;
    public final klv d;
    public final klv e;
    public final klv f;
    public final klv g;
    public final klv h;
    public final klv i;
    public final niz j;
    public final klj k;
    public final klj l;
    public final klj m;
    public final klj n;
    public final klj o;
    public final klj p;
    public final klj q;
    public final gir r;
    private final Object s;
    private final klv t;
    private final klv u;
    private final klv v;
    private final klv w;
    private final klv x;
    private final klj y;
    private final klv z;
    
    public cfg() {
        this.s = new Object();
    }
    
    public cfg(final klv a, final klj b, final klv t, final klv u, final klv c, final klv d, final klv v, final klv w, final klv e, final klv x, final klv f, final klj y, final klv z, final klv a2, final klv g, final klv h, final klv i, final niz j, final klj k, final klj l, final klj m, final klj n, final klj b2, final klj c2, final klj o, final klj p28, final klj q, final gir r) {
        this.s = new Object();
        this.a = a;
        this.b = b;
        this.t = t;
        this.u = u;
        this.c = c;
        this.d = d;
        this.v = v;
        this.w = w;
        this.e = e;
        this.x = x;
        this.f = f;
        this.y = y;
        this.z = z;
        this.A = a2;
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.l = l;
        this.m = m;
        this.n = n;
        this.B = b2;
        this.C = c2;
        this.o = o;
        this.p = p28;
        this.q = q;
        this.r = r;
    }
    
    public final void a(final cfd cfd) {
        synchronized (this.s) {
            if (cfd != ((kkz)this.f).d) {
                final Object d = ((kkz)this.f).d;
                this.f.aR(cfd);
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (o instanceof cfg) {
            final cfg cfg = (cfg)o;
            if (this.a.equals(cfg.a) && this.b.equals(cfg.b) && this.t.equals(cfg.t) && this.u.equals(cfg.u) && this.c.equals(cfg.c) && this.d.equals(cfg.d) && this.v.equals(cfg.v) && this.w.equals(cfg.w) && this.e.equals(cfg.e) && this.x.equals(cfg.x) && this.f.equals(cfg.f) && this.y.equals(cfg.y) && this.z.equals(cfg.z) && this.A.equals(cfg.A) && this.g.equals(cfg.g) && this.h.equals(cfg.h) && this.i.equals(cfg.i) && this.j.equals(cfg.j) && this.k.equals(cfg.k) && this.l.equals(cfg.l) && this.m.equals(cfg.m) && this.n.equals(cfg.n) && this.B.equals(cfg.B) && this.C.equals(cfg.C) && this.o.equals(cfg.o) && this.p.equals(cfg.p) && this.q.equals(cfg.q) && this.r.equals(cfg.r)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return (((((((((((((((((((((((((((this.a.hashCode() ^ 0xF4243) * 1000003 ^ this.b.hashCode()) * 1000003 ^ this.t.hashCode()) * 1000003 ^ this.u.hashCode()) * 1000003 ^ this.c.hashCode()) * 1000003 ^ this.d.hashCode()) * 1000003 ^ this.v.hashCode()) * 1000003 ^ this.w.hashCode()) * 1000003 ^ this.e.hashCode()) * 1000003 ^ this.x.hashCode()) * 1000003 ^ this.f.hashCode()) * 1000003 ^ this.y.hashCode()) * 1000003 ^ this.z.hashCode()) * 1000003 ^ this.A.hashCode()) * 1000003 ^ this.g.hashCode()) * 1000003 ^ this.h.hashCode()) * 1000003 ^ this.i.hashCode()) * 1000003 ^ this.j.hashCode()) * 1000003 ^ this.k.hashCode()) * 1000003 ^ this.l.hashCode()) * 1000003 ^ this.m.hashCode()) * 1000003 ^ this.n.hashCode()) * 1000003 ^ this.B.hashCode()) * 1000003 ^ this.C.hashCode()) * 1000003 ^ this.o.hashCode()) * 1000003 ^ this.p.hashCode()) * 1000003 ^ this.q.hashCode()) * 1000003 ^ this.r.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final String value3 = String.valueOf(this.t);
        final String value4 = String.valueOf(this.u);
        final String value5 = String.valueOf(this.c);
        final String value6 = String.valueOf(this.d);
        final String value7 = String.valueOf(this.v);
        final String value8 = String.valueOf(this.w);
        final String value9 = String.valueOf(this.e);
        final String value10 = String.valueOf(this.x);
        final String value11 = String.valueOf(this.f);
        final String value12 = String.valueOf(this.y);
        final String value13 = String.valueOf(this.z);
        final String value14 = String.valueOf(this.A);
        final String value15 = String.valueOf(this.g);
        final String value16 = String.valueOf(this.h);
        final String value17 = String.valueOf(this.i);
        final String value18 = String.valueOf(this.j);
        final String value19 = String.valueOf(this.k);
        final String value20 = String.valueOf(this.l);
        final String value21 = String.valueOf(this.m);
        final String value22 = String.valueOf(this.n);
        final String value23 = String.valueOf(this.B);
        final String value24 = String.valueOf(this.C);
        final String value25 = String.valueOf(this.o);
        final String value26 = String.valueOf(this.p);
        final String value27 = String.valueOf(this.q);
        final String value28 = String.valueOf(this.r);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 536 + String.valueOf(value2).length() + String.valueOf(value3).length() + String.valueOf(value4).length() + String.valueOf(value5).length() + String.valueOf(value6).length() + String.valueOf(value7).length() + String.valueOf(value8).length() + String.valueOf(value9).length() + String.valueOf(value10).length() + String.valueOf(value11).length() + String.valueOf(value12).length() + String.valueOf(value13).length() + String.valueOf(value14).length() + String.valueOf(value15).length() + String.valueOf(value16).length() + String.valueOf(value17).length() + String.valueOf(value18).length() + String.valueOf(value19).length() + String.valueOf(value20).length() + String.valueOf(value21).length() + String.valueOf(value22).length() + String.valueOf(value23).length() + String.valueOf(value24).length() + String.valueOf(value25).length() + String.valueOf(value26).length() + String.valueOf(value27).length() + String.valueOf(value28).length());
        sb.append("CamcorderSessionState{aeComp=");
        sb.append(value);
        sb.append(", zoomRatio=");
        sb.append(value2);
        sb.append(", aeMeteringParameters=");
        sb.append(value3);
        sb.append(", afMeteringParameters=");
        sb.append(value4);
        sb.append(", scalerRegion=");
        sb.append(value5);
        sb.append(", aeLock=");
        sb.append(value6);
        sb.append(", afLock=");
        sb.append(value7);
        sb.append(", caf=");
        sb.append(value8);
        sb.append(", torchOn=");
        sb.append(value9);
        sb.append(", recordingState=");
        sb.append(value10);
        sb.append(", moduleState=");
        sb.append(value11);
        sb.append(", backFlashThermallyDisabled=");
        sb.append(value12);
        sb.append(", shouldUpdatePreviewRequest=");
        sb.append(value13);
        sb.append(", shouldUpdateRecordingRequest=");
        sb.append(value14);
        sb.append(", shouldUpdateAfMode=");
        sb.append(value15);
        sb.append(", isStorageLow=");
        sb.append(value16);
        sb.append(", stabilizationMode=");
        sb.append(value17);
        sb.append(", manualWhiteBalanceSettings=");
        sb.append(value18);
        sb.append(", awbSetting=");
        sb.append(value19);
        sb.append(", portraitIdle=");
        sb.append(value20);
        sb.append(", videoOrientation=");
        sb.append(value21);
        sb.append(", deviceOrientation=");
        sb.append(value22);
        sb.append(", aeMeteringRegion=");
        sb.append(value23);
        sb.append(", afMeteringRegion=");
        sb.append(value24);
        sb.append(", isExtMicWiredConnected=");
        sb.append(value25);
        sb.append(", isExtMicBluetoothConnected=");
        sb.append(value26);
        sb.append(", micInputOption=");
        sb.append(value27);
        sb.append(", multiCropRegion=");
        sb.append(value28);
        sb.append("}");
        return sb.toString();
    }
}
