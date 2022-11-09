import android.graphics.PointF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class doo
{
    private final float a;
    private final float b;
    private final PointF c;
    private final PointF d;
    private final float e;
    private final float f;
    
    public doo(final float a, final float b, final PointF c, final PointF d, final float e, final float f) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
    }
    
    public static final float d(final float n) {
        return -n + 1.0f;
    }
    
    public final float a(final float n) {
        final float e = this.e;
        return e + (this.f - e) * n;
    }
    
    public final float b(final float n) {
        final float a = this.a;
        return a + (this.b - a) * n;
    }
    
    public final PointF c(final float n) {
        return new PointF(this.c.x + (this.d.x - this.c.x) * n, this.c.y + (this.d.y - this.c.y) * n);
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append(String.valueOf(this.getClass().getName()).concat(" {"));
        final float a = this.a;
        final float b = this.b;
        final StringBuilder sb2 = new StringBuilder(42);
        sb2.append(" scale: ");
        sb2.append(a);
        sb2.append(" -> ");
        sb2.append(b);
        sb.append(sb2.toString());
        final String value = String.valueOf(this.c);
        final String value2 = String.valueOf(this.d);
        final StringBuilder sb3 = new StringBuilder(String.valueOf(value).length() + 19 + String.valueOf(value2).length());
        sb3.append(", translation: ");
        sb3.append(value);
        sb3.append(" -> ");
        sb3.append(value2);
        sb.append(sb3.toString());
        final float e = this.e;
        final float f = this.f;
        final StringBuilder sb4 = new StringBuilder(44);
        sb4.append(", radius: ");
        sb4.append(e);
        sb4.append(" -> ");
        sb4.append(f);
        sb.append(sb4.toString());
        final StringBuilder sb5 = new StringBuilder(45);
        sb5.append(", bgAlpha: ");
        sb5.append(1.0f);
        sb5.append(" -> ");
        sb5.append(0.0f);
        sb.append(sb5.toString());
        sb.append("}");
        return sb.toString();
    }
}
