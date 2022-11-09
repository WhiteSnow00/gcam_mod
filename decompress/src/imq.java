// 
// Decompiled by Procyon v0.6.0
// 

public final class imq
{
    private Boolean a;
    private Boolean b;
    private klj c;
    private klj d;
    
    public final imr a() {
        final Boolean a = this.a;
        if (a != null && this.b != null && this.c != null && this.d != null) {
            return new imr(a, this.b, this.c, this.d);
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" showOutputTimer");
        }
        if (this.b == null) {
            sb.append(" showMutedAudioIcon");
        }
        if (this.c == null) {
            sb.append(" showMicInputExtWired");
        }
        if (this.d == null) {
            sb.append(" showMicInputExtBluetooth");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final klj d) {
        if (d != null) {
            this.d = d;
            return;
        }
        throw new NullPointerException("Null showMicInputExtBluetooth");
    }
    
    public final void c(final klj c) {
        if (c != null) {
            this.c = c;
            return;
        }
        throw new NullPointerException("Null showMicInputExtWired");
    }
    
    public final void d(final boolean b) {
        this.b = b;
    }
    
    public final void e(final boolean b) {
        this.a = b;
    }
}
