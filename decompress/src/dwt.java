import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwt
{
    public InterleavedImageU8 a;
    public dxs b;
    public HardwareBuffer c;
    public ShotMetadata d;
    public Long e;
    public dwo f;
    public hbj g;
    public dtx h;
    private kra i;
    private ljm j;
    private oey k;
    private gen l;
    
    public dwt() {
    }
    
    public dwt(final dwu dwu) {
        this.a = dwu.a;
        this.b = dwu.b;
        this.c = dwu.c;
        this.d = dwu.d;
        this.i = dwu.e;
        this.j = dwu.f;
        this.e = dwu.g;
        this.h = dwu.m;
        this.f = dwu.h;
        this.k = dwu.i;
        this.l = dwu.j;
        this.g = dwu.l;
    }
    
    public final dwu a() {
        final ShotMetadata d = this.d;
        if (d != null) {
            final kra i = this.i;
            if (i != null) {
                final ljm j = this.j;
                if (j != null) {
                    final Long e = this.e;
                    if (e != null && this.h != null && this.k != null) {
                        if (this.l != null) {
                            final dwu dwu = new dwu(this.a, this.b, this.c, d, i, j, e, this.h, this.f, this.k, this.l, this.g);
                            int n;
                            if (dwu.a != null) {
                                n = 1;
                            }
                            else {
                                n = 0;
                            }
                            int n2 = n;
                            if (dwu.b != null) {
                                n2 = n + 1;
                            }
                            int n3 = n2;
                            if (dwu.c != null) {
                                n3 = n2 + 1;
                            }
                            if (n3 == 1) {
                                return dwu;
                            }
                            final StringBuilder sb = new StringBuilder(50);
                            sb.append("We need exactly one image set; we have ");
                            sb.append(n3);
                            throw new IllegalArgumentException(sb.toString());
                        }
                    }
                }
            }
        }
        final StringBuilder sb2 = new StringBuilder();
        if (this.d == null) {
            sb2.append(" shotMetadata");
        }
        if (this.i == null) {
            sb2.append(" orientation");
        }
        if (this.j == null) {
            sb2.append(" metadata");
        }
        if (this.e == null) {
            sb2.append(" timestampNs");
        }
        if (this.h == null) {
            sb2.append(" gcaShotSettings");
        }
        if (this.k == null) {
            sb2.append(" mergedPdData");
        }
        if (this.l == null) {
            sb2.append(" pictureTakerParameters");
        }
        final String value = String.valueOf(sb2);
        final StringBuilder sb3 = new StringBuilder(String.valueOf(value).length() + 28);
        sb3.append("Missing required properties:");
        sb3.append(value);
        throw new IllegalStateException(sb3.toString());
    }
    
    public final void b() {
        this.b = null;
        this.a = null;
        this.c = null;
    }
    
    public final void c(final oey k) {
        if (k != null) {
            this.k = k;
            return;
        }
        throw new NullPointerException("Null mergedPdData");
    }
    
    public final void d(final ljm j) {
        if (j != null) {
            this.j = j;
            return;
        }
        throw new NullPointerException("Null metadata");
    }
    
    public final void e(final kra i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null orientation");
    }
    
    public final void f(final gen l) {
        if (l != null) {
            this.l = l;
            return;
        }
        throw new NullPointerException("Null pictureTakerParameters");
    }
    
    public final void g(final long n) {
        this.e = n;
    }
}
