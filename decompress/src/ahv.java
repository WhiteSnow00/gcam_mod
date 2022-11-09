import android.graphics.Rect;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ahv
{
    public final ahm a;
    public final int b;
    private final int c;
    
    public ahv(final Rect rect, int c, int a) {
        rect.getClass();
        rect.getClass();
        final ahm a2 = new ahm(rect.left, rect.top, rect.right, rect.bottom);
        this.a = a2;
        this.c = c;
        this.b = a;
        c = a2.c;
        a = a2.a;
        if (c - a == 0 && a2.d - a2.b == 0) {
            throw new IllegalArgumentException("Bounds must be non zero".toString());
        }
        if (a != 0 && a2.b != 0) {
            throw new IllegalArgumentException("Bounding rectangle must start at the top or left window edge for folding features".toString());
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        final Class<? extends ahv> class1 = this.getClass();
        Object class2;
        if (o == null) {
            class2 = null;
        }
        else {
            class2 = o.getClass();
        }
        if (!plr.b(class1, class2)) {
            return false;
        }
        if (o != null) {
            final ahv ahv = (ahv)o;
            return plr.b(this.a, ahv.a) && this.c == ahv.c && this.b == ahv.b;
        }
        throw new NullPointerException("null cannot be cast to non-null type androidx.window.FoldingFeature");
    }
    
    @Override
    public final int hashCode() {
        return (this.a.hashCode() * 31 + this.c) * 31 + this.b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append((Object)ahv.class.getSimpleName());
        sb.append(" { ");
        sb.append(this.a);
        sb.append(", type=");
        String s = null;
        switch (this.c) {
            default: {
                s = "HINGE";
                break;
            }
            case 1: {
                s = "FOLD";
                break;
            }
        }
        sb.append(s);
        sb.append(", state=");
        String s2 = null;
        switch (this.b) {
            default: {
                s2 = "HALF_OPENED";
                break;
            }
            case 1: {
                s2 = "FLAT";
                break;
            }
        }
        sb.append(s2);
        sb.append(" }");
        return sb.toString();
    }
}
