// 
// Decompiled by Procyon v0.6.0
// 

final class ctm extends ai
{
    public ctm(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR IGNORE INTO `HardwareHelpDialogCounts` (`reason`,`impressionsBeforeReboot`,`impressionsAfterReboot`,`rebootCount`) VALUES (?,?,?,?)";
    }
}
