import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.UUID;
import java.util.Set;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aje
{
    public final Set a;
    public final int b;
    private final UUID c;
    private final aiq d;
    private final aiq e;
    private final int f;
    
    public aje(final UUID c, final int b, final aiq d, final List list, final aiq e, final int f) {
        this.c = c;
        this.b = b;
        this.d = d;
        this.a = new HashSet(list);
        this.e = e;
        this.f = f;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final aje aje = (aje)o;
            return this.f == aje.f && this.c.equals(aje.c) && this.b == aje.b && this.d.equals(aje.d) && this.a.equals(aje.a) && this.e.equals(aje.e);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.c.hashCode();
        final int b = this.b;
        cwz.g(b);
        return ((((hashCode * 31 + b) * 31 + this.d.hashCode()) * 31 + this.a.hashCode()) * 31 + this.e.hashCode()) * 31 + this.f;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("WorkInfo{mId='");
        sb.append(this.c);
        sb.append("', mState=");
        sb.append((Object)cwz.e(this.b));
        sb.append(", mOutputData=");
        sb.append(this.d);
        sb.append(", mTags=");
        sb.append(this.a);
        sb.append(", mProgress=");
        sb.append(this.e);
        sb.append('}');
        return sb.toString();
    }
}
