import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class phj implements Serializable
{
    private static final long serialVersionUID = -8759979445933046293L;
    final Throwable a;
    
    public phj(final Throwable a) {
        this.a = a;
    }
    
    @Override
    public final boolean equals(final Object o) {
        final boolean b = o instanceof phj;
        boolean b2 = false;
        if (b) {
            final phj phj = (phj)o;
            final Throwable a = this.a;
            final Throwable a2 = phj.a;
            if (a != a2) {
                if (a == null) {
                    b2 = b2;
                    return b2;
                }
                if (!a.equals(a2)) {
                    return false;
                }
            }
            b2 = true;
        }
        return b2;
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 24);
        sb.append("NotificationLite.Error[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
