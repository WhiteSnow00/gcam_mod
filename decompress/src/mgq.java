// 
// Decompiled by Procyon v0.6.0
// 

public final class mgq
{
    public String a;
    public prk b;
    public String c;
    public mfa d;
    private Boolean e;
    private psp f;
    
    public final mgr a() {
        final Boolean e = this.e;
        if (e != null && this.f != null) {
            return new mgr(this.a, e, this.f, this.b, this.c, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.e == null) {
            sb.append(" isEventNameConstant");
        }
        if (this.f == null) {
            sb.append(" metric");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final boolean b) {
        this.e = b;
    }
    
    public final void c(final psp f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null metric");
    }
}
