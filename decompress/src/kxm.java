import android.hardware.camera2.params.MeteringRectangle;
import java.util.Arrays;
import j$.util.Objects;

// 
// Decompiled by Procyon v0.6.0
// 

final class kxm implements kvr
{
    final /* synthetic */ kxn a;
    
    public kxm(final kxn a) {
        this.a = a;
    }
    
    @Override
    public final Integer a() {
        return this.a.e;
    }
    
    @Override
    public final Integer b() {
        return this.a.d;
    }
    
    @Override
    public final Integer c() {
        return this.a.f;
    }
    
    @Override
    public final Integer d() {
        return this.a.c;
    }
    
    @Override
    public final Integer e() {
        return this.a.g;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof kvr) {
            final kvr kvr = (kvr)o;
            if (Objects.equals((Object)this.d(), (Object)kvr.d()) && Objects.equals((Object)this.b(), (Object)kvr.b()) && Objects.equals((Object)this.a(), (Object)kvr.a()) && Objects.equals((Object)this.c(), (Object)kvr.c()) && Objects.equals((Object)this.e(), (Object)kvr.e()) && Arrays.equals(this.g(), kvr.g()) && Arrays.equals(this.f(), kvr.f()) && Arrays.equals(this.h(), kvr.h())) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final MeteringRectangle[] f() {
        return this.a.i;
    }
    
    @Override
    public final MeteringRectangle[] g() {
        return this.a.h;
    }
    
    @Override
    public final MeteringRectangle[] h() {
        return this.a.j;
    }
    
    @Override
    public final int hashCode() {
        final kxn a = this.a;
        return Objects.hash(new Object[] { a.c, a.d, a.e, a.f, a.g, Arrays.hashCode(a.h), Arrays.hashCode(this.a.i), Arrays.hashCode(this.a.j) });
    }
}
