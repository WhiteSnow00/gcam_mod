// 
// Decompiled by Procyon v0.6.0
// 

public final class hpd
{
    public String a;
    public niz b;
    public niz c;
    public int d;
    private noi e;
    private noi f;
    private Boolean g;
    private Boolean h;
    private klv i;
    
    public hpd() {
    }
    
    public hpd(final byte[] array) {
        this.b = nii.a;
        this.c = nii.a;
    }
    
    public final hpe a() {
        final String a = this.a;
        if (a != null) {
            final noi e = this.e;
            if (e != null) {
                final noi f = this.f;
                if (f != null) {
                    final Boolean g = this.g;
                    if (g != null && this.h != null && this.i != null) {
                        if (this.d != 0) {
                            final hpe hpe = new hpe(a, e, f, g, this.h, this.i, this.d, this.b, this.c);
                            njo.e(hpe.a.length() <= 32, "Smarts Processor name is too long.");
                            njo.o(hpe.b.isEmpty() ^ true);
                            njo.o(hpe.c.isEmpty() ^ true);
                            return hpe;
                        }
                    }
                }
            }
        }
        final StringBuilder sb = new StringBuilder();
        if (this.a == null) {
            sb.append(" name");
        }
        if (this.e == null) {
            sb.append(" activeModes");
        }
        if (this.f == null) {
            sb.append(" activeCameraFacing");
        }
        if (this.g == null) {
            sb.append(" shouldPauseDuringCapture");
        }
        if (this.h == null) {
            sb.append(" shouldPauseWhenTimerActive");
        }
        if (this.i == null) {
            sb.append(" externalToggle");
        }
        if (this.d == 0) {
            sb.append(" notificationPriority");
        }
        final String value = String.valueOf(sb);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(value).length() + 28);
        sb2.append("Missing required properties:");
        sb2.append(value);
        throw new IllegalStateException(sb2.toString());
    }
    
    public final void b(final noi f) {
        if (f != null) {
            this.f = f;
            return;
        }
        throw new NullPointerException("Null activeCameraFacing");
    }
    
    public final void c(final noi e) {
        if (e != null) {
            this.e = e;
            return;
        }
        throw new NullPointerException("Null activeModes");
    }
    
    public final void d(final klv i) {
        if (i != null) {
            this.i = i;
            return;
        }
        throw new NullPointerException("Null externalToggle");
    }
    
    public final void e(final boolean b) {
        this.g = b;
    }
    
    public final void f(final boolean b) {
        this.h = b;
    }
}
