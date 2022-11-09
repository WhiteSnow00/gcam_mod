// 
// Decompiled by Procyon v0.6.0
// 

final class csz extends ai
{
    public csz(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR REPLACE INTO `EnumerationErrorCounts` (`errorCode`,`failuresBeforeReboot`,`failuresAfterReboot`,`rebootCount`,`lastFailureTimestamp`) VALUES (?,?,?,?,?)";
    }
}
