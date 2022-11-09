import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class loj
{
    public final lne a;
    private final lnm b;
    
    public loj(final Context a, final lnm b) {
        final Throwable t = new Throwable();
        final lnd lnd = new lnd(null);
        lnd.a();
        if (a != null) {
            lnd.a = a;
            lnd.c = niz.i(t);
            lnd.a();
            final Context a2 = lnd.a;
            if (a2 != null) {
                final Boolean d = lnd.d;
                if (d != null) {
                    this.a = new lne(a2, lnd.b, lnd.c, d);
                    this.b = b;
                    return;
                }
            }
            final StringBuilder sb = new StringBuilder();
            if (lnd.a == null) {
                sb.append(" context");
            }
            if (lnd.d == null) {
                sb.append(" googlerOverridesCheckbox");
            }
            final String value = String.valueOf(sb);
            final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
            sb2.append("Missing required properties:");
            sb2.append(value);
            throw new IllegalStateException(sb2.toString());
        }
        throw new NullPointerException("Null context");
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder("CollectionBasisLogVerifier{");
        sb.append("collectionBasisContext=");
        sb.append(this.a);
        sb.append(", basis=");
        sb.append(this.b);
        sb.append("}");
        return sb.toString();
    }
}
