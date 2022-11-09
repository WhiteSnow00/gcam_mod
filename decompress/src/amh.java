// 
// Decompiled by Procyon v0.6.0
// 

final class amh extends ai
{
    public amh(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR IGNORE INTO `Dependency` (`work_spec_id`,`prerequisite_id`) VALUES (?,?)";
    }
}
