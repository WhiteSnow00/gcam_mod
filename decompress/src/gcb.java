import java.util.Arrays;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gcb
{
    public final gcf a;
    public final List b;
    public final List c;
    
    public gcb(final gcf a, final List b, final List c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (o instanceof gcb) {
            final gcf a = this.a;
            final gcb gcb = (gcb)o;
            if (a.equals(gcb.a) && this.b.equals(gcb.b) && this.c.equals(gcb.c)) {
                return true;
            }
        }
        return false;
    }
    
    @Override
    public final int hashCode() {
        return Arrays.hashCode(new Object[] { this.a, this.b, this.c });
    }
    
    @Override
    public final String toString() {
        final niy d = nfa.d("ImageSaverTrace");
        d.b("ProcessingMethod", this.a);
        d.b("Input Image Metadata", this.b);
        d.b("Reprocessing Metadata", this.c);
        return d.toString();
    }
}
