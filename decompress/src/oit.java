import com.google.lens.sdk.LensApi$LensAvailabilityCallback;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oit implements loz
{
    private final LensApi$LensAvailabilityCallback a;
    private final int b;
    
    public oit(final LensApi$LensAvailabilityCallback a, final int b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void a(final lpz lpz) {
        final int b = this.b;
        final int n = 1;
        int a = 1;
        switch (b) {
            default: {
                a = lpy.a(lpz.e);
                if (a == 0) {
                    a = n;
                }
                a -= 2;
                break;
            }
            case 0: {
                final int a2 = lpy.a(lpz.d);
                if (a2 != 0) {
                    a = a2;
                }
                a -= 2;
                break;
            }
        }
        this.a.onAvailabilityStatusFetched(a);
    }
}
