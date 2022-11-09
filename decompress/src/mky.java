// 
// Decompiled by Procyon v0.6.0
// 

public final class mky
{
    public Boolean a;
    public niz b;
    public int c;
    
    public mky() {
    }
    
    public mky(final byte[] array) {
        this.b = nii.a;
    }
    
    public final mkz a() {
        final int c = this.c;
        if (c != 0) {
            final Boolean a = this.a;
            if (a != null) {
                return new mkz(c, a, this.b);
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.c == 0) {
            sb.append(" enablement");
        }
        if (this.a == null) {
            sb.append(" manualCapture");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        int c;
        if (!b) {
            c = 2;
        }
        else {
            c = 3;
        }
        this.c = c;
    }
}
