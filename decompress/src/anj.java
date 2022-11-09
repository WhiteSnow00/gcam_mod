// 
// Decompiled by Procyon v0.6.0
// 

final class anj extends ba
{
    public anj(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE workspec SET schedule_requested_at=-1 WHERE state NOT IN (2, 3, 5)";
    }
}
