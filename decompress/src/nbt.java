// 
// Decompiled by Procyon v0.6.0
// 

public final class nbt extends nfw
{
    public final Throwable a;
    public final int b;
    
    public nbt(final int b, final Throwable a) {
        a.getClass();
        this.b = b;
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof nbt) {
                final nbt nbt = (nbt)o;
                if (this.b == nbt.b && plr.b(this.a, nbt.a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int b = this.b;
        final Throwable a = this.a;
        int hashCode;
        if (a != null) {
            hashCode = a.hashCode();
        }
        else {
            hashCode = 0;
        }
        return b * 31 + hashCode;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("UploadError(f250LogReason=");
        sb.append((Object)mvc.a(this.b));
        sb.append(", error=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
