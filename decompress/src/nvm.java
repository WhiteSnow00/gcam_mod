import java.util.Calendar;
import java.util.Date;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nvm extends nvn
{
    private final nvl c;
    
    public nvm(final nth nth, int n, final nvl c) {
        super(nth, n);
        this.c = c;
        final StringBuilder sb = new StringBuilder("%");
        nth.f(sb);
        char c2;
        if (!nth.d()) {
            n = (c2 = 't');
        }
        else {
            n = (c2 = 'T');
        }
        sb.append(c2);
        sb.append(c.G);
        sb.toString();
    }
    
    @Override
    public final void a(final nvo nvo, final Object o) {
        final nvl c = this.c;
        final nth b = super.b;
        if (!(o instanceof Date) && !(o instanceof Calendar) && !(o instanceof Long)) {
            final StringBuilder d = ((nvs)nvo).d;
            final char g = c.G;
            final StringBuilder sb = new StringBuilder(3);
            sb.append("%t");
            sb.append(g);
            nvs.d(d, o, sb.toString());
            return;
        }
        final StringBuilder sb2 = new StringBuilder("%");
        b.f(sb2);
        char c2;
        if (!b.d()) {
            c2 = 't';
        }
        else {
            c2 = 'T';
        }
        sb2.append(c2);
        sb2.append(c.G);
        ((nvs)nvo).d.append(String.format(ntn.a, sb2.toString(), o));
    }
}
