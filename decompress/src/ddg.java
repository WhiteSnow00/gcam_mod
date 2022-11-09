// 
// Decompiled by Procyon v0.6.0
// 

final class ddg extends ah
{
    public ddg(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE OR ABORT `shot_log` SET `sequence` = ?,`shot_id` = ?,`time_millis` = ?,`message` = ? WHERE `sequence` = ?";
    }
}
