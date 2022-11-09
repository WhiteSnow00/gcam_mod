import android.graphics.RectF;

// 
// Decompiled by Procyon v0.6.0
// 

public final class igr
{
    public final igk a;
    public final RectF b;
    public final float c;
    public final int d;
    public final long e;
    public final int f;
    
    public igr() {
    }
    
    public igr(final int f, final igk a, final RectF b, final float c, final int d, final long e) {
        this.f = f;
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
    }
    
    public static igq a() {
        final igq igq = new igq();
        igq.a = 1;
        igq.f(igk.a);
        igq.d(new RectF(-1.0f, -1.0f, -1.0f, -1.0f));
        igq.b(0.0f);
        igq.c(0);
        igq.e(0L);
        return igq;
    }
    
    public static igr b() {
        return a().a();
    }
    
    public final boolean c() {
        return this.b.centerX() >= 0.0f && this.b.centerY() >= 0.0f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof igr)) {
            return false;
        }
        final igr igr = (igr)o;
        final int f = this.f;
        final int f2 = igr.f;
        if (f != 0) {
            return f == f2 && this.a.equals(igr.a) && this.b.equals((Object)igr.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(igr.c) && this.d == igr.d && this.e == igr.e;
        }
        throw null;
    }
    
    @Override
    public final int hashCode() {
        final int f = this.f;
        if (f != 0) {
            final int hashCode = this.a.hashCode();
            final int hashCode2 = this.b.hashCode();
            final int floatToIntBits = Float.floatToIntBits(this.c);
            final int d = this.d;
            final long e = this.e;
            return (((((f ^ 0xF4243) * 1000003 ^ hashCode) * 1000003 ^ hashCode2) * 1000003 ^ floatToIntBits) * 1000003 ^ d) * 1000003 ^ (int)(e >>> 32 ^ e);
        }
        throw null;
    }
    
    @Override
    public final String toString() {
        String s = null;
        switch (this.f) {
            default: {
                s = "null";
                break;
            }
            case 2: {
                s = "ON";
                break;
            }
            case 1: {
                s = "OFF";
                break;
            }
        }
        final String value = String.valueOf(this.a);
        final String value2 = String.valueOf(this.b);
        final float c = this.c;
        final int d = this.d;
        final long e = this.e;
        final StringBuilder sb = new StringBuilder(s.length() + 142 + String.valueOf(value).length() + String.valueOf(value2).length());
        sb.append("TrackingRoi{status=");
        sb.append(s);
        sb.append(", trackerType=");
        sb.append(value);
        sb.append(", roi=");
        sb.append(value2);
        sb.append(", confidence=");
        sb.append(c);
        sb.append(", numberOfRefresherCalls=");
        sb.append(d);
        sb.append(", trackedLengthMs=");
        sb.append(e);
        sb.append("}");
        return sb.toString();
    }
}
