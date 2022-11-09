// 
// Decompiled by Procyon v0.6.0
// 

final class ank extends ba
{
    public ank(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "DELETE FROM workspec WHERE state IN (2, 3, 5) AND (SELECT COUNT(*)=0 FROM dependency WHERE     prerequisite_id=id AND     work_spec_id NOT IN         (SELECT id FROM workspec WHERE state IN (2, 3, 5)))";
    }
}
