// 
// Decompiled by Procyon v0.6.0
// 

final class dcx extends ah
{
    public dcx(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE OR ABORT `shots` SET `shot_id` = ?,`title` = ?,`start_millis` = ?,`persisted_millis` = ?,`canceled_millis` = ?,`deleted_millis` = ?,`most_recent_event_millis` = ?,`capture_session_type` = ?,`capture_session_shot_id` = ?,`pid` = ?,`stuck` = ?,`failed` = ? WHERE `shot_id` = ?";
    }
}
