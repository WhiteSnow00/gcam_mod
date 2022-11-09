// 
// Decompiled by Procyon v0.6.0
// 

final class ctn extends ai
{
    public ctn(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR REPLACE INTO `HardwareHelpDialogCounts` (`reason`,`impressionsBeforeReboot`,`impressionsAfterReboot`,`rebootCount`) VALUES (?,?,?,?)";
    }
}
