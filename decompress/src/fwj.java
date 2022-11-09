// 
// Decompiled by Procyon v0.6.0
// 

public final class fwj
{
    public final gzq a;
    public final gzr b;
    public final float c;
    public final boolean d;
    public final niz e;
    public final int f;
    
    public fwj(final gzq a, final gzr b, final float c, final boolean d, final niz e, final int f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static fwj a() {
        return new fwj(gzq.a, gzr.a, 0.0f, false, nii.a, 0);
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = true;
        if (o == this) {
            return true;
        }
        if (!(o instanceof fwj)) {
            return false;
        }
        final fwj fwj = (fwj)o;
        boolean b2 = this.a == fwj.a && this.b == fwj.b && this.c == fwj.c && this.d == fwj.d && this.f == fwj.f;
        if (this.e.g() && fwj.e.g()) {
            b2 = (b2 && this.e.c().equals(fwj.e.c()) && b);
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return (((this.a.h + 527) * 31 + this.b.h) * 31 + Float.floatToIntBits(this.c)) * 31 + (this.d ? 1 : 0);
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final float c = this.c;
        final boolean d = this.d;
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 97 + String.valueOf(value2).length());
        sb.append("{controlAfMode=");
        sb.append(value);
        sb.append(", controlAfState=");
        sb.append(value2);
        sb.append(", lensFocusDistance=");
        sb.append(c);
        sb.append(", isSceneChangeDetected=");
        sb.append(d);
        sb.append('}');
        return sb.toString();
    }
}
