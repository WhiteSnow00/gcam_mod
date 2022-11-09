import com.google.android.gms.common.api.Status;

// 
// Decompiled by Procyon v0.6.0
// 

public class jqq extends Exception
{
    @Deprecated
    public final Status a;
    
    public jqq(final Status a) {
        final int g = a.g;
        String h;
        if ((h = a.h) == null) {
            h = "";
        }
        final StringBuilder sb = new StringBuilder(h.length() + 13);
        sb.append(g);
        sb.append(": ");
        sb.append(h);
        super(sb.toString());
        this.a = a;
    }
    
    public final int a() {
        return this.a.g;
    }
}
