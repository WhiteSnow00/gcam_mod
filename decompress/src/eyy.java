import com.google.android.libraries.camera.exif.ExifInterface;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eyy
{
    public final okt a;
    
    public eyy(int a, final boolean d) {
        boolean b = true;
        if (a == 1) {
            b = false;
        }
        njo.d(b);
        final okt m = nyd.Q.m();
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyd nyd = (nyd)m.b;
        if (a != 0) {
            nyd.c = a - 1;
            a = (nyd.a | 0x2);
            nyd.a = a;
            nyd.a = (a | 0x4);
            nyd.d = d;
            this.a = m;
            return;
        }
        throw null;
    }
    
    public final void a(final kva kva) {
        if (kva == null) {
            return;
        }
        final okt a = this.a;
        final okt m = nyu.p.m();
        final String tagStringValue = kva.getTagStringValue(ExifInterface.g);
        if (tagStringValue != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu = (nyu)m.b;
            nyu.a |= 0x4;
            nyu.c = tagStringValue;
        }
        final String tagStringValue2 = kva.getTagStringValue(ExifInterface.h);
        if (tagStringValue2 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu2 = (nyu)m.b;
            nyu2.a |= 0x4;
            nyu2.c = tagStringValue2;
        }
        final String tagStringValue3 = kva.getTagStringValue(ExifInterface.TAG_SOFTWARE);
        if (tagStringValue3 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu3 = (nyu)m.b;
            nyu3.a |= 0x1;
            nyu3.b = tagStringValue3;
        }
        final krb a2 = kva.a(ExifInterface.F);
        if (a2 != null) {
            final float d = a2.a / (float)a2.b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu4 = (nyu)m.b;
            nyu4.a |= 0x8;
            nyu4.d = d;
        }
        final Integer b = kva.b(ExifInterface.J);
        if (b != null) {
            final int intValue = b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu5 = (nyu)m.b;
            nyu5.a |= 0x10;
            nyu5.e = intValue;
        }
        final krb a3 = kva.a(ExifInterface.Z);
        if (a3 != null) {
            final float f = a3.a / (float)a3.b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu6 = (nyu)m.b;
            nyu6.a |= 0x20;
            nyu6.f = f;
        }
        final krb a4 = kva.a(ExifInterface.R);
        if (a4 != null) {
            final float g = a4.a / (float)a4.b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu7 = (nyu)m.b;
            nyu7.a |= 0x40;
            nyu7.g = g;
        }
        final krb a5 = kva.a(ExifInterface.aR);
        final krb a6 = kva.a(ExifInterface.aT);
        final boolean h = a5 != null && a6 != null;
        if (m.c) {
            m.m();
            m.c = false;
        }
        final nyu nyu8 = (nyu)m.b;
        nyu8.a |= 0x100;
        nyu8.h = h;
        final Integer b2 = kva.b(ExifInterface.j);
        if (b2 != null) {
            final int intValue2 = b2;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu9 = (nyu)m.b;
            nyu9.a |= 0x200;
            nyu9.i = intValue2;
        }
        final Integer b3 = kva.b(ExifInterface.aj);
        if (b3 != null) {
            final int intValue3 = b3;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu10 = (nyu)m.b;
            nyu10.a |= 0x400;
            nyu10.j = intValue3;
        }
        final Integer b4 = kva.b(ExifInterface.ai);
        if (b4 != null) {
            final int intValue4 = b4;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu11 = (nyu)m.b;
            nyu11.a |= 0x800;
            nyu11.k = intValue4;
        }
        final Integer b5 = kva.b(ExifInterface.Y);
        if (b5 != null) {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu12 = (nyu)m.b;
            nyu12.a |= 0x1000;
            nyu12.l = true;
            final int intValue5 = b5;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu13 = (nyu)m.b;
            nyu13.a |= 0x2000;
            nyu13.m = intValue5;
        }
        else {
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu14 = (nyu)m.b;
            nyu14.a |= 0x1000;
            nyu14.l = false;
        }
        final krb a7 = kva.a(ExifInterface.T);
        if (a7 != null) {
            final float n = a7.a / (float)a7.b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu15 = (nyu)m.b;
            nyu15.a |= 0x4000;
            nyu15.n = n;
        }
        final krb a8 = kva.a(ExifInterface.V);
        if (a8 != null) {
            final float o = a8.a / (float)a8.b;
            if (m.c) {
                m.m();
                m.c = false;
            }
            final nyu nyu16 = (nyu)m.b;
            nyu16.a |= 0x8000;
            nyu16.o = o;
        }
        final nyu g2 = (nyu)m.h();
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        g2.getClass();
        nyd.g = g2;
        nyd.a |= 0x20;
    }
    
    public final void b(final boolean h) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        nyd.a |= 0x40;
        nyd.h = h;
    }
    
    public final void c(final boolean o) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        nyd.b |= 0x20000;
        nyd.O = o;
    }
    
    public final void d(final float f) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        nyd.a |= 0x10;
        nyd.f = f;
    }
    
    public final void e(final obs n) {
        if (n == null) {
            return;
        }
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        nyd.n = n;
        nyd.a |= 0x2000;
    }
    
    public final void f(final float e) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        nyd.a |= 0x8;
        nyd.e = e;
    }
    
    public final void g(final int n) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        if (n != 0) {
            nyd.z = n - 1;
            nyd.b |= 0x2;
            return;
        }
        throw null;
    }
    
    public final void h(final int n) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        nyd.j = n - 1;
        nyd.a |= 0x100;
    }
    
    public final void i(final int n) {
        final okt a = this.a;
        if (a.c) {
            a.m();
            a.c = false;
        }
        final nyd nyd = (nyd)a.b;
        final nyd q = nyd.Q;
        if (n != 0) {
            nyd.K = n - 1;
            nyd.b |= 0x1000;
            return;
        }
        throw null;
    }
}
