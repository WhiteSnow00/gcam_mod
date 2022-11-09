import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class eho
{
    private final cxl a;
    private final liz b;
    
    public eho(final cxl a, final liz b) {
        this.a = a;
        this.b = b;
    }
    
    public final boolean a() {
        final liz b = this.b;
        if (!b.h) {
            if (b.f) {
                if (Build.ID.startsWith("RD1A.2007")) {
                    return false;
                }
                if (Build.ID.startsWith("RD1A.2008")) {
                    return false;
                }
            }
            else {
                if (!b.g) {
                    return false;
                }
                if (Build.ID.substring(0, 3).equals("RD1")) {
                    return false;
                }
            }
        }
        if (this.a.k(cxr.ag)) {
            return true;
        }
        return false;
    }
}
