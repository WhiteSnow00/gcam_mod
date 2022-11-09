import com.google.android.libraries.lens.lenslite.api.LinkConfig;
import java.util.Map;
import java.util.List;
import java.nio.ByteBuffer;
import com.google.android.libraries.lens.lenslite.api.LinkConfig$Builder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lqa extends LinkConfig$Builder
{
    public ByteBuffer A;
    public Boolean B;
    public ByteBuffer C;
    public Boolean D;
    public Boolean E;
    public Boolean F;
    public lro G;
    public Boolean H;
    private lri I;
    public Boolean a;
    public Boolean b;
    public Boolean c;
    public Boolean d;
    public Boolean e;
    public List f;
    public Integer g;
    public Integer h;
    public Boolean i;
    public Boolean j;
    public Boolean k;
    public Integer l;
    public Boolean m;
    public Map n;
    public Boolean o;
    public Boolean p;
    public Boolean q;
    public Boolean r;
    public Integer s;
    public Boolean t;
    public Long u;
    public Boolean v;
    public Boolean w;
    public lrj x;
    public Long y;
    public Boolean z;
    
    @Override
    public final void a(final lri i) {
        if (i != null) {
            this.I = i;
            return;
        }
        throw new NullPointerException("Null dynamicLoadingMode");
    }
    
    @Override
    public final LinkConfig build() {
        final Boolean j = this.j;
        if (j != null && this.k != null && this.I != null) {
            return new lqb(this.a, this.b, this.c, this.d, this.e, this.f, this.g, this.h, this.i, j, this.k, this.l, this.m, this.n, this.o, this.p, this.q, this.I, this.r, this.s, this.t, this.u, this.v, this.w, this.x, this.y, this.z, this.A, this.B, this.C, this.D, this.E, this.F, this.G, this.H);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.j == null) {
            sb.append(" aiAiShoppingDetectionEnabled");
        }
        if (this.k == null) {
            sb.append(" aiAiTranslateDetectionEnabled");
        }
        if (this.I == null) {
            sb.append(" dynamicLoadingMode");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
}
