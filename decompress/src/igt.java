// 
// Decompiled by Procyon v0.6.0
// 

public final class igt
{
    private static final nsd a;
    
    static {
        a = nsd.g("com/google/android/apps/camera/tracking/api/TrackingStatus");
    }
    
    public static int a(final int n) {
        switch (n) {
            default: {
                igt.a.c().E(2729).p("Invalid tracking status: %d", n);
                return 1;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
}
