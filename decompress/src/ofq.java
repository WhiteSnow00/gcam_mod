import java.io.Serializable;
import java.util.concurrent.ScheduledFuture;
import java.util.concurrent.TimeUnit;

// 
// Decompiled by Procyon v0.6.0
// 

final class ofq implements Runnable
{
    ofs a;
    
    public ofq(final ofs a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        final ofs a = this.a;
        if (a == null) {
            return;
        }
        final oey a2 = a.a;
        if (a2 == null) {
            return;
        }
        this.a = null;
        if (!a2.isDone()) {
            try {
                final ScheduledFuture b = a.b;
                a.b = null;
                Serializable string = "Timed out";
                Label_0233: {
                    if (b != null) {
                        try {
                            final long abs = Math.abs(b.getDelay(TimeUnit.MILLISECONDS));
                            if (abs > 10L) {
                                final StringBuilder sb = new StringBuilder(75);
                                sb.append("Timed out");
                                sb.append(" (timeout delayed by ");
                                sb.append(abs);
                                sb.append(" ms after scheduled time)");
                                string = sb.toString();
                            }
                        }
                        finally {
                            break Label_0233;
                        }
                    }
                    try {
                        final String value = String.valueOf(string);
                        final String value2 = String.valueOf(a2);
                        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 2 + String.valueOf(value2).length());
                        sb2.append(value);
                        sb2.append(": ");
                        sb2.append(value2);
                        string = new ofr(sb2.toString());
                        a.a((Throwable)string);
                        return;
                    }
                    finally {}
                }
                a.a(new ofr((String)string));
                throw;
            }
            finally {
                a2.cancel(true);
            }
        }
        a.e(a2);
    }
}
