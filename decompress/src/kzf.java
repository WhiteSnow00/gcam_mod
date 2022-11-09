// 
// Decompiled by Procyon v0.6.0
// 

public final class kzf
{
    private final krr a;
    private kyw b;
    
    public kzf(final krr krr) {
        this.a = krr.a("FrameServerLock");
    }
    
    public final void a(final kyw b) {
        synchronized (this) {
            if (!b.equals(this.b)) {
                final krr a = this.a;
                final String value = String.valueOf(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15);
                sb.append(value);
                sb.append(" is now active.");
                a.b(sb.toString());
                this.b = b;
            }
        }
    }
    
    public final void b(final kyw b) {
        synchronized (this) {
            if (!b.equals(this.b)) {
                final krr a = this.a;
                final String value = String.valueOf(b);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 15);
                sb.append(value);
                sb.append(" is now active.");
                a.b(sb.toString());
                this.b = b;
            }
        }
    }
    
    public final void c(final kyw kyw) {
        synchronized (this) {
            if (this.b == kyw) {
                this.b = null;
            }
        }
    }
    
    public final boolean d(final kyw kyw) {
        synchronized (this) {
            return kyw.equals(this.b);
        }
    }
}
