import java.io.Serializable;

// 
// Decompiled by Procyon v0.6.0
// 

final class phk implements Serializable
{
    private static final long serialVersionUID = -1322257508628817540L;
    final pss a;
    
    public phk(final pss a) {
        this.a = a;
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 31);
        sb.append("NotificationLite.Subscription[");
        sb.append(value);
        sb.append("]");
        return sb.toString();
    }
}
