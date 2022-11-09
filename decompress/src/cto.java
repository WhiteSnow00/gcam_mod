// 
// Decompiled by Procyon v0.6.0
// 

final class cto extends ba
{
    public cto(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE HardwareHelpDialogCounts SET rebootCount = rebootCount+1 WHERE reason=? AND impressionsBeforeReboot > ?";
    }
}
