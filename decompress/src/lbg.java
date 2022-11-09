import java.util.Arrays;
import j$.util.Objects;
import android.hardware.camera2.params.MeteringRectangle;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lbg implements kvr
{
    public final Boolean a;
    public final Boolean b;
    public final Boolean c;
    public final MeteringRectangle[] d;
    public final MeteringRectangle[] e;
    public final MeteringRectangle[] f;
    private final int g;
    private final int h;
    private final int i;
    private final int j;
    private final int k;
    
    public lbg(final int g, final int h, final int i, final int j, final int k, final boolean b, final boolean b2, final boolean b3, final MeteringRectangle[] d, final MeteringRectangle[] e, final MeteringRectangle[] f) {
        this.g = g;
        this.h = h;
        this.i = i;
        this.j = j;
        this.k = k;
        this.a = b;
        this.b = b2;
        this.c = b3;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final Integer a() {
        return this.i;
    }
    
    @Override
    public final Integer b() {
        return this.h;
    }
    
    @Override
    public final Integer c() {
        return this.j;
    }
    
    @Override
    public final Integer d() {
        return this.g;
    }
    
    @Override
    public final Integer e() {
        return this.k;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof lbg) {
            final lbg lbg = (lbg)o;
            if (Objects.equals((Object)this.g, (Object)lbg.d()) && Objects.equals((Object)this.b(), (Object)lbg.b()) && Objects.equals((Object)this.a(), (Object)lbg.a()) && Objects.equals((Object)this.c(), (Object)lbg.c()) && Objects.equals((Object)this.e(), (Object)lbg.e()) && Arrays.equals(this.d, lbg.d) && Arrays.equals(this.e, lbg.e) && Arrays.equals(this.f, lbg.f) && Objects.equals((Object)this.a, (Object)lbg.a) && Objects.equals((Object)this.b, (Object)lbg.b) && Objects.equals((Object)this.c, (Object)lbg.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final MeteringRectangle[] f() {
        return this.e;
    }
    
    @Override
    public final MeteringRectangle[] g() {
        return this.d;
    }
    
    @Override
    public final MeteringRectangle[] h() {
        return this.f;
    }
    
    @Override
    public final int hashCode() {
        return Objects.hash(new Object[] { this.g, this.h, this.i, this.j, this.k, Arrays.hashCode(this.d), Arrays.hashCode(this.e), Arrays.hashCode(this.f), this.a, this.b, this.c });
    }
}
