import java.util.Arrays;
import java.util.List;
import android.hardware.HardwareBuffer;
import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public class ljr implements lju
{
    protected final lju e;
    
    public ljr(final lju e) {
        this.e = e;
    }
    
    @Override
    public final int a() {
        return this.e.a();
    }
    
    @Override
    public final int b() {
        return this.e.b();
    }
    
    @Override
    public final int c() {
        return this.e.c();
    }
    
    @Override
    public void close() {
        this.e.close();
    }
    
    @Override
    public long d() {
        return this.e.d();
    }
    
    @Override
    public final Rect e() {
        return this.e.e();
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == null) {
            return false;
        }
        if (!(o instanceof lju)) {
            return false;
        }
        final lju lju = (lju)o;
        return lju.a() == this.a() && lju.c() == this.c() && lju.b() == this.b() && lju.d() == this.d();
    }
    
    @Override
    public final HardwareBuffer f() {
        return this.e.f();
    }
    
    @Override
    public final lfa g() {
        return this.e.g();
    }
    
    @Override
    public final List h() {
        return this.e.h();
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a(), this.c(), this.b(), this.d() });
    }
    
    @Override
    public final void i(final Rect rect) {
        this.e.i(rect);
    }
    
    @Override
    public String toString() {
        return this.e.toString();
    }
}
