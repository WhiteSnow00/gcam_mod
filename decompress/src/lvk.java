import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lvk extends lvl
{
    protected lvk(final int n, final int n2) {
        super(new int[] { n, n2 });
    }
    
    @Override
    public final String toString() {
        return String.format(Locale.ENGLISH, "Size(%d, %d)", this.b(), this.a());
    }
}
