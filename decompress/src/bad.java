import java.util.HashMap;
import java.util.Map;

// 
// Decompiled by Procyon v0.6.0
// 

final class bad
{
    public final Map a;
    public final bac b;
    
    public bad() {
        this.a = new HashMap();
        this.b = new bac();
    }
    
    final void a(final String s) {
        synchronized (this) {
            final bab bab = this.a.get(s);
            bit.a(bab);
            final int b = bab.b;
            if (b > 0) {
                Label_0244: {
                    if ((bab.b = b - 1) == 0) {
                        final bab bab2 = this.a.remove(s);
                        if (bab2.equals(bab)) {
                            final bac b2 = this.b;
                            synchronized (b2.a) {
                                if (b2.a.size() < 10) {
                                    b2.a.offer(bab2);
                                }
                                break Label_0244;
                            }
                        }
                        final String value = String.valueOf(bab);
                        final String value2 = String.valueOf(bab2);
                        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 79 + String.valueOf(value2).length() + s.length());
                        sb.append("Removed the wrong lock, expected to remove: ");
                        sb.append(value);
                        sb.append(", but actually removed: ");
                        sb.append(value2);
                        sb.append(", safeKey: ");
                        sb.append(s);
                        throw new IllegalStateException(sb.toString());
                    }
                }
                monitorexit(this);
                bab.a.unlock();
                return;
            }
            final StringBuilder sb2 = new StringBuilder(s.length() + 81);
            sb2.append("Cannot release a lock that is not held, safeKey: ");
            sb2.append(s);
            sb2.append(", interestedThreads: ");
            sb2.append(b);
            throw new IllegalStateException(sb2.toString());
        }
    }
}
