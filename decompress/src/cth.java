// 
// Decompiled by Procyon v0.6.0
// 

final class cth extends ba
{
    public cth(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE FatalErrorCounts SET failuresBeforeRebootDuringOpen = 0 , failuresAfterRebootDuringOpen = 0 WHERE cameraId = ?";
    }
}
