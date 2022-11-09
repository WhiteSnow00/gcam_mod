import android.os.Trace;

// 
// Decompiled by Procyon v0.6.0
// 

public final class izh implements izg
{
    private final String a;
    
    public izh(final String a) {
        this.a = a;
    }
    
    @Override
    public final void a(final String s) {
        final String a = this.a;
        final StringBuilder sb = new StringBuilder(String.valueOf(a).length() + 1 + s.length());
        sb.append(a);
        sb.append(":");
        sb.append(s);
        Trace.beginSection(sb.toString());
    }
    
    @Override
    public final void b() {
        Trace.endSection();
    }
}
