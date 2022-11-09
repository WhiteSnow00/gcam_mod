// 
// Decompiled by Procyon v0.6.0
// 

final class ajx extends be
{
    public ajx() {
        super(4, 5);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("ALTER TABLE workspec ADD COLUMN `trigger_content_update_delay` INTEGER NOT NULL DEFAULT -1");
        afh.g("ALTER TABLE workspec ADD COLUMN `trigger_max_content_delay` INTEGER NOT NULL DEFAULT -1");
    }
}
