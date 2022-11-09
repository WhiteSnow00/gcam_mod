import java.util.concurrent.Future;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.ScheduledFuture;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofs extends oeh
{
    public oey a;
    public ScheduledFuture b;
    
    public ofs(final oey a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    protected final String bp() {
        final oey a = this.a;
        final ScheduledFuture b = this.b;
        if (a != null) {
            final String value = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 14);
            sb.append("inputFuture=[");
            sb.append(value);
            sb.append("]");
            String s2;
            final String s = s2 = sb.toString();
            if (b != null) {
                final long delay = b.getDelay(TimeUnit.MILLISECONDS);
                s2 = s;
                if (delay > 0L) {
                    final String value2 = String.valueOf(s);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value2).length() + 43);
                    sb2.append(value2);
                    sb2.append(", remaining delay=[");
                    sb2.append(delay);
                    sb2.append(" ms]");
                    s2 = sb2.toString();
                }
            }
            return s2;
        }
        return null;
    }
    
    @Override
    protected final void c() {
        this.n(this.a);
        final ScheduledFuture b = this.b;
        if (b != null) {
            b.cancel(false);
        }
        this.a = null;
        this.b = null;
    }
}
