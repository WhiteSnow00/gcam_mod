// 
// Decompiled by Procyon v0.6.0
// 

final class csy extends ai
{
    public csy(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR IGNORE INTO `EnumerationErrorCounts` (`errorCode`,`failuresBeforeReboot`,`failuresAfterReboot`,`rebootCount`,`lastFailureTimestamp`) VALUES (?,?,?,?,?)";
    }
}
