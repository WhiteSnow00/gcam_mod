import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aio
{
    public final Uri a;
    public final boolean b;
    
    public aio(final Uri a, final boolean b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this == o) {
            return true;
        }
        if (o != null && this.getClass() == o.getClass()) {
            final aio aio = (aio)o;
            return this.b == aio.b && this.a.equals((Object)aio.a);
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode() * 31 + (this.b ? 1 : 0);
    }
}
