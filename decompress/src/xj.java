import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class xj
{
    public final Context a;
    private final xk b;
    
    public xj(final Context a, final xk b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (!(o instanceof xj)) {
            return false;
        }
        final xj xj = (xj)o;
        return plr.b(this.a, xj.a) && plr.b(this.b, xj.b);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Config(appContext=");
        sb.append(this.a);
        sb.append(", threadConfig=");
        sb.append(this.b);
        sb.append(')');
        return sb.toString();
    }
}
