// 
// Decompiled by Procyon v0.6.0
// 

final class ann extends ai
{
    public ann(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR IGNORE INTO `WorkTag` (`tag`,`work_spec_id`) VALUES (?,?)";
    }
}
