import java.util.List;
import java.util.Collection;

// 
// Decompiled by Procyon v0.6.0
// 

public final class myz
{
    public final oni a;
    private final mvc b;
    
    public myz(final lmy lmy, final mvc b, final byte[] array) {
        lmy.getClass();
        final oni b2 = ooc.b(lmy.a());
        b2.getClass();
        b2.getClass();
        this.b = b;
        this.a = b2;
    }
    
    public final mvb a(final Collection collection, final Collection collection2, final int n, final Throwable t) {
        collection.getClass();
        collection2.getClass();
        if (n != 0) {
            return new mvb(this.b, this.a, collection, collection2, n, t, null);
        }
        throw null;
    }
    
    public final mvb b(final int n, final Throwable t, final mvl mvl, final mxe mxe) {
        List list;
        if (mvl == null || (list = pjf.b(mvl)) == null) {
            list = pja.a;
        }
        List list2;
        if (mxe == null || (list2 = pjf.b(mxe)) == null) {
            list2 = pja.a;
        }
        return this.a(list, list2, n, t);
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (this != o) {
            if (o instanceof myz) {
                final myz myz = (myz)o;
                if (plr.b(this.b, myz.b) && plr.b(this.a, myz.a)) {
                    return true;
                }
            }
            return false;
        }
        return true;
    }
    
    @Override
    public final int hashCode() {
        final int hashCode = this.b.hashCode();
        final oni a = this.a;
        int ay;
        if (a != null) {
            ay = a.ay;
            if (ay == 0) {
                ay = omr.a.b(a).b(a);
                a.ay = ay;
            }
        }
        else {
            ay = 0;
        }
        return hashCode * 31 + ay;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("F250LogEventStarter(f250LogAction=");
        sb.append(this.b);
        sb.append(", logEpochTimestamp=");
        sb.append(this.a);
        sb.append(")");
        return sb.toString();
    }
}
