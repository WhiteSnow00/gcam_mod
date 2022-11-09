// 
// Decompiled by Procyon v0.6.0
// 

public final class mfy
{
    public int a;
    public mfx b;
    
    public final mfz a() {
        final int a = this.a;
        if (a != 0) {
            final mfx b = this.b;
            if (b != null) {
                return new mfz(a, b);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == 0) {
            sb.append(" enablement");
        }
        if (this.b == null) {
            sb.append(" metricExtensionProvider");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        int a;
        if (!b) {
            a = 2;
        }
        else {
            a = 3;
        }
        this.a = a;
    }
}
