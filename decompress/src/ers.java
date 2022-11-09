import java.util.Iterator;
import android.graphics.ImageFormat;
import java.util.Collection;
import java.util.ArrayList;
import android.view.WindowManager;
import android.graphics.SurfaceTexture;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ers
{
    public final Handler a;
    public final asx b;
    public boolean c;
    public boolean d;
    public esl e;
    private aua f;
    private final SurfaceTexture g;
    
    public ers(final asx b, final Handler a) {
        this.g = new SurfaceTexture(100);
        this.d = false;
        this.b = b;
        this.a = a;
    }
    
    public final aua a(WindowManager b, final cxl cxl, esl e, final boolean b2) {
        monitorenter(this);
        try {
            this.e = e;
            this.c = true;
            final asx b3 = this.b;
            if (b3 == null) {
                monitorexit(this);
                return null;
            }
            if (b3.g().a() == 1) {
                monitorexit(this);
                return null;
            }
            e = (esl)this.b.e();
            final asx b4 = this.b;
            final int n = 0;
            b4.k(false);
            if (b2) {
                final atu f = this.b.f();
                if (erv.a(cxl, (atl)e) == ath.a) {
                    this.d = true;
                }
                f.s = erv.a(cxl, (atl)e);
                atg r;
                if (((atl)e).e(atg.c)) {
                    r = atg.c;
                }
                else if (((atl)e).e(atg.b)) {
                    r = atg.b;
                }
                else {
                    if (!((atl)e).e(atg.a)) {
                        a.l(erv.a.b(), "no supported flash mode found, need OFF, AUTO or NO_FLASH!", '\u0569');
                        throw new IllegalStateException("no supported flash mode found!");
                    }
                    r = atg.a;
                }
                f.r = r;
                final ati b5 = ati.b;
                ati t;
                if (b5 != null && ((atl)e).h.contains(b5)) {
                    t = ati.b;
                }
                else {
                    t = ati.a;
                }
                f.t = t;
                f.d();
                final ert a = eru.a((atl)e);
                f.l(this.f = a.a);
                final ArrayList list = new ArrayList(((atl)e).b);
                int[] array;
                if (list.isEmpty()) {
                    a.l(erv.a.b(), "No suppoted frame rates returned!", '\u056e');
                    array = null;
                }
                else {
                    final Iterator iterator = list.iterator();
                    int n2 = 400000;
                    while (iterator.hasNext()) {
                        final int[] array2 = (int[])iterator.next();
                        final int n3 = array2[0];
                        if (array2[1] >= 30000 && n3 <= 30000 && n3 < n2) {
                            n2 = n3;
                        }
                    }
                    int n4 = -1;
                    int i = 0;
                    int n5 = 0;
                    while (i < list.size()) {
                        final int[] array3 = (int[])list.get(i);
                        final int n6 = array3[0];
                        final int n7 = array3[1];
                        int n8 = n4;
                        int n9 = n5;
                        if (n6 == n2) {
                            n8 = n4;
                            if ((n9 = n5) < n7) {
                                n8 = i;
                                n9 = n7;
                            }
                        }
                        ++i;
                        n4 = n8;
                        n5 = n9;
                    }
                    if (n4 >= 0) {
                        array = (int[])list.get(n4);
                    }
                    else {
                        a.l(erv.a.b(), "Can't find an appropriate frame rate range!", '\u056d');
                        array = null;
                    }
                }
                if (array != null && array.length > 0) {
                    f.j(array[0], array[1]);
                }
                else {
                    a.l(erv.a.b(), "No supported frame rates returned!", '\u056c');
                }
                f.z = new aua(0, 0);
                f.i(100);
                f.k(a.b);
                final int a2 = gkn.a(b);
                b = (WindowManager)this.b;
                try {
                    ((asx)b).h().a(new asq((asx)b, a2));
                }
                catch (final RuntimeException ex) {
                    ((asx)b).d().c().c(ex);
                }
                this.b.o(f);
                final float u = ((atl)e).u;
                final StringBuilder sb = new StringBuilder(40);
                sb.append("Field of view reported = ");
                sb.append(u);
                sb.toString();
            }
            this.b.l(this.g);
            if (this.c) {
                final asx b6 = this.b;
                final aua f2 = this.f;
                final Handler a3 = this.a;
                final esl e2 = this.e;
                b6.n(a3, null);
                final int l = b6.f().l;
                final int bitsPerPixel = ImageFormat.getBitsPerPixel(l);
                if (bitsPerPixel <= 0) {
                    final StringBuilder sb2 = new StringBuilder(33);
                    sb2.append("Unknown image format: ");
                    sb2.append(l);
                    throw new IllegalArgumentException(sb2.toString());
                }
                final int n10 = (int)Math.ceil(f2.b() * f2.a() * (bitsPerPixel / 8.0f));
                for (int j = n; j < 3; ++j) {
                    b6.i(new byte[n10]);
                }
                b6.n(a3, e2);
            }
            else {
                this.b.m(this.a, this.e);
            }
            final aua f3 = this.f;
            monitorexit(this);
            return f3;
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
