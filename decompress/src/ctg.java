// 
// Decompiled by Procyon v0.6.0
// 

final class ctg extends ah
{
    public ctg(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE OR ABORT `FatalErrorCounts` SET `cameraId` = ?,`failuresBeforeRebootDuringOpen` = ?,`failuresAfterRebootDuringOpen` = ?,`failuresBeforeRebootDuringSession` = ?,`failuresAfterRebootDuringSession` = ?,`lastFatalErrorTimestamp` = ?,`rebootCount` = ? WHERE `cameraId` = ?";
    }
}
