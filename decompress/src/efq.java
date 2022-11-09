import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class efq implements egi
{
    final /* synthetic */ Context a;
    
    public efq(final Context a) {
        this.a = a;
    }
    
    @Override
    public final Object a(final egh egh) {
        try {
            return egh.a.cast(this.a.getSystemService(egh.b));
        }
        catch (final Exception ex) {
            final String b = egh.b;
            String concat;
            if (b.length() != 0) {
                concat = "Unable to create or provide ".concat(b);
            }
            else {
                concat = new String("Unable to create or provide ");
            }
            throw new RuntimeException(concat, ex);
        }
    }
}
