import android.util.Log;
import java.io.IOException;
import android.util.Base64;

// 
// Decompiled by Procyon v0.6.0
// 

public final class moe extends moh
{
    public moe(final mof mof, final String s, final Object o) {
        super(mof, s, o, false);
    }
    
    @Override
    public final Object a(final Object o) {
        try {
            return oky.q(ouh.b, Base64.decode((String)o, 3));
        }
        catch (final IllegalArgumentException ex) {}
        catch (final IOException ex2) {}
        final String f = super.f();
        final int length = String.valueOf(f).length();
        final String s = (String)o;
        final StringBuilder sb = new StringBuilder(length + 27 + s.length());
        sb.append("Invalid byte[] value for ");
        sb.append(f);
        sb.append(": ");
        sb.append(s);
        Log.e("PhenotypeFlag", sb.toString());
        return null;
    }
}
