// 
// Decompiled by Procyon v0.6.0
// 

final class ajw extends be
{
    public ajw() {
        super(3, 4);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("UPDATE workspec SET schedule_requested_at=0 WHERE state NOT IN (2, 3, 5) AND schedule_requested_at=-1 AND interval_duration<>0");
    }
}
