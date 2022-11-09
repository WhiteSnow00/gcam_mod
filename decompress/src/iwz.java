import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwz implements iwv
{
    private final int a;
    private final Object[] b;
    
    public iwz(final int a, final Object... b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String a(final Resources resources) {
        return resources.getString(this.a, this.b);
    }
}
