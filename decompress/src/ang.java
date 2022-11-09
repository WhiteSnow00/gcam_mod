// 
// Decompiled by Procyon v0.6.0
// 

final class ang extends ba
{
    public ang(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE workspec SET run_attempt_count=run_attempt_count+1 WHERE id=?";
    }
}
