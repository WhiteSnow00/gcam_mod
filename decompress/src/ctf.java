// 
// Decompiled by Procyon v0.6.0
// 

final class ctf extends ai
{
    public ctf(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR IGNORE INTO `FatalErrorCounts` (`cameraId`,`failuresBeforeRebootDuringOpen`,`failuresAfterRebootDuringOpen`,`failuresBeforeRebootDuringSession`,`failuresAfterRebootDuringSession`,`lastFatalErrorTimestamp`,`rebootCount`) VALUES (?,?,?,?,?,?,?)";
    }
}
