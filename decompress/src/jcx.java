import java.util.Collection;
import java.util.List;
import java.util.Iterator;
import android.hardware.camera2.CameraCharacteristics;
import java.util.HashMap;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jcx
{
    private final lfh a;
    private final Set b;
    private final lfg c;
    private final boolean d;
    private lfj e;
    private lfj f;
    private lfj g;
    
    public jcx(final lfh a, final lfg c, final cxl cxl) {
        this.a = a;
        this.c = c;
        this.b = c.z();
        final boolean k = cxl.k(cxr.R);
        boolean d = false;
        if (k && c.I()) {
            d = true;
        }
        this.d = d;
    }
    
    private final void h() {
        monitorenter(this);
        try {
            if (this.e == null || this.f == null) {
                final HashMap hashMap = new HashMap();
                final Iterator iterator = this.b.iterator();
                float n = Float.MIN_VALUE;
                float n2 = Float.MAX_VALUE;
                while (iterator.hasNext()) {
                    final lfj lfj = (lfj)iterator.next();
                    final float[] array = (float[])this.a.a(lfj).m(CameraCharacteristics.LENS_INFO_AVAILABLE_FOCAL_LENGTHS);
                    float n3 = n;
                    float n4 = n2;
                    if (array != null) {
                        final int length = array.length;
                        n3 = n;
                        n4 = n2;
                        if (length > 0) {
                            int n5 = 0;
                            while (true) {
                                n3 = n;
                                n4 = n2;
                                if (n5 >= length) {
                                    break;
                                }
                                final float n6 = array[n5];
                                hashMap.put(lfj, n6);
                                float n7 = n;
                                if (n6 > n) {
                                    this.e = lfj;
                                    n7 = n6;
                                }
                                float n8 = n2;
                                if (n6 < n2) {
                                    this.f = lfj;
                                    n8 = n6;
                                }
                                ++n5;
                                n = n7;
                                n2 = n8;
                            }
                        }
                    }
                    n = n3;
                    n2 = n4;
                }
                if (hashMap.size() == 3) {
                    for (final lfj g : hashMap.keySet()) {
                        final float floatValue = (float)hashMap.get(g);
                        if (floatValue > n2 && floatValue < n) {
                            this.g = g;
                            break;
                        }
                    }
                }
            }
            monitorexit(this);
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    public final lfg a(final String s) {
        final lfj lfj = null;
        lfj lfj2 = null;
        Label_0061: {
            if (s == null) {
                lfj2 = lfj;
            }
            else {
                for (final lfj lfj3 : this.b) {
                    if (s.equals(lfj3.a)) {
                        lfj2 = lfj3;
                        break Label_0061;
                    }
                }
                lfj2 = lfj;
            }
        }
        if (lfj2 == null) {
            return this.c;
        }
        return this.a.a(lfj2);
    }
    
    public final lfg b() {
        synchronized (this) {
            this.h();
            final lfj g = this.g;
            if (g == null) {
                return null;
            }
            return this.a.a(g);
        }
    }
    
    public final lfg c() {
        synchronized (this) {
            this.h();
            if (this.e != null && this.b.size() != 1) {
                return this.a.a(this.e);
            }
            return this.c;
        }
    }
    
    public final lfg d() {
        synchronized (this) {
            if (!this.d) {
                return this.e();
            }
            final lfg b = this.b();
            if (b != null) {
                return b;
            }
            return this.c();
        }
    }
    
    public final lfg e() {
        synchronized (this) {
            this.h();
            if (this.f != null && this.b.size() != 1) {
                return this.a.a(this.f);
            }
            return this.c;
        }
    }
    
    public final List f() {
        synchronized (this) {
            return nns.j(this.b);
        }
    }
    
    public final boolean g(final String s) {
        synchronized (this) {
            this.h();
            if (this.b.size() > 1) {
                final lfj e = this.e;
                if (e != null && s.equals(e.a)) {
                    return true;
                }
            }
            return false;
        }
    }
}
