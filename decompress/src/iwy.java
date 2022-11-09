import android.content.res.Resources;

// 
// Decompiled by Procyon v0.6.0
// 

public final class iwy implements iwv
{
    private final int a;
    private final int b;
    private final Object[] c;
    
    public iwy(final int a, final int b, final Object... c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    
    @Override
    public final String a(final Resources resources) {
        return resources.getQuantityString(this.a, this.b, this.c);
    }
}
