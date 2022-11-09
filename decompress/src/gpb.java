import android.hardware.camera2.CaptureResult;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gpb
{
    public final kse a;
    public final krr b;
    public final dvj c;
    public final duq d;
    public final gpl e;
    public final dva f;
    public final lmp g;
    public boolean h;
    public final cxl i;
    public final kwh j;
    public final gen k;
    public final hvd l;
    public final niz m;
    public okt n;
    private final gry o;
    
    public gpb(final kse a, final krq krq, final dvj c, final duq d, final gpl e, final dva f, final gry o, final lmp g, final cxl i, final hvd l, final niz m, final kwh j, final gen k) {
        this.h = false;
        this.a = a;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.o = o;
        this.g = g;
        this.i = i;
        this.l = l;
        this.m = m;
        this.j = j;
        this.k = k;
        this.b = krq.a("PckHdrPBurstTkr");
    }
    
    public final ljm a(final dxh dxh, final int n, final int n2, final kvs kvs) {
        return this.b(dxh, n, n2, kvs, true, nii.a);
    }
    
    public final ljm b(final dxh dxh, int length, final int n, final kvs kvs, final boolean b, final niz niz) {
        final kse a = this.a;
        String string;
        if (b) {
            string = "Frame";
        }
        else {
            final StringBuilder sb = new StringBuilder(38);
            sb.append("SecondaryFrame");
            sb.append(length + 1);
            sb.append("of");
            sb.append(n);
            string = sb.toString();
        }
        a.f(string);
        try {
            final ljm c = kvs.c();
            if (b) {
                while (true) {
                    Label_0272: {
                        if (jlj.q == null) {
                            break Label_0272;
                        }
                        final ljm c2 = kvs.c();
                        if (c2 == null) {
                            break Label_0272;
                        }
                        final Integer n2 = (Integer)c2.d(jlj.q);
                        if (n2 == null || n2 <= 0) {
                            break Label_0272;
                        }
                        this.b.b(ksc.c("Skipped PSAF frame %d for shot %d", length + 1, dxh.a()));
                        if (c != null) {
                            final krr b2 = this.b;
                            final String value = String.valueOf(c.d(CaptureResult.CONTROL_AF_STATE));
                            length = String.valueOf(value).length();
                            final StringBuilder sb2 = new StringBuilder(length + 20);
                            sb2.append("PSAF frame af_state=");
                            sb2.append(value);
                            b2.b(sb2.toString());
                        }
                        kvs.close();
                        this.a.g();
                        return null;
                    }
                    if (this.h) {
                        continue;
                    }
                    break;
                }
                this.d.l(false);
                this.f.e(dxh, kvs);
            }
            final kse a2 = this.a;
            String s;
            if (!b) {
                s = "RetrievingImageSecondary";
            }
            else {
                s = "RetrievingImage";
            }
            a2.f(s);
            final grx a3 = this.o.a(kvs);
            final lju e = a3.e();
            this.a.g();
            if (e != null && c != null) {
                final lju d = a3.d();
                String s2;
                if (d != null) {
                    s2 = "(+PD)";
                }
                else {
                    s2 = "";
                }
                this.c.p(dxh, length, c, e, d, niz);
                this.b.f(ksc.c("Acquired frame %d of %d %s for shot %d at time %d frame %d.", length + 1, n, s2, dxh.a(), e.d(), c.b()));
            }
            else {
                if (e != null) {
                    e.close();
                }
                if (c != null) {
                    this.c(dxh, length, n, c);
                }
            }
            kvs.close();
            this.a.g();
            return c;
        }
        finally {
            kvs.close();
            this.a.g();
            while (true) {}
        }
    }
    
    public final void c(final dxh dxh, final int n, final int n2, final ljm ljm) {
        final krr b = this.b;
        final int a = dxh.a();
        final StringBuilder sb = new StringBuilder(73);
        sb.append("Marking frame ");
        sb.append(n + 1);
        sb.append(" of ");
        sb.append(n2);
        sb.append(" as invalid for shot ");
        sb.append(a);
        sb.append(".");
        b.h(sb.toString());
        this.c.o(dxh, n, ljm, null, null);
    }
    
    public final boolean d(final dxh dxh, final int n, final int n2, final ljm ljm, final huz huz) {
        return this.e(dxh, n, n2, ljm, huz, true);
    }
    
    public final boolean e(final dxh dxh, final int n, final int n2, final ljm ljm, final huz huz, final boolean b) {
        int n3 = n;
        if (ljm != null) {
            int n4 = n;
            if (b) {
                this.k.b.L(ljm);
                huz.l(ljm, true);
                n4 = n;
            }
            while ((n3 = n4) < n2) {
                this.c(dxh, n4, n2, ljm);
                ++n4;
            }
        }
        if (b) {
            huz.c((nxk)this.n.h());
        }
        this.a.h("HdrPlus#endPayload");
        if (!this.c.x(dxh)) {
            this.b.d(ksc.c("EndPayloadFrames failed for shot %d.", dxh.a()));
            return false;
        }
        if (b) {
            this.f.h(dxh);
            this.l.c(huz);
            this.b.f(ksc.c("EndPayloadFrames succeeded for shot %d.", dxh.a()));
            if (this.h) {
                if (n3 == 0) {
                    this.b.f(ksc.c("Shot %d was successfully cancelled by user.", dxh.a()));
                    this.k.b.w(new dgg((byte[])null));
                    this.c.n(dxh);
                    this.f.d(dxh.c.b.h());
                    return true;
                }
            }
        }
        if (this.c.y(dxh)) {
            this.b.f(ksc.c("EndShotCapture succeeded for shot %d.", dxh.a()));
            return true;
        }
        this.b.d(ksc.c("EndShotCapture failed for shot %d.", dxh.a()));
        return false;
    }
}
