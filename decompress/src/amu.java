// 
// Decompiled by Procyon v0.6.0
// 

final class amu extends ai
{
    public amu(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR REPLACE INTO `WorkProgress` (`work_spec_id`,`progress`) VALUES (?,?)";
    }
}
