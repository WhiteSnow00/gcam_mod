// 
// Decompiled by Procyon v0.6.0
// 

final class ajy extends be
{
    public ajy() {
        super(6, 7);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("CREATE TABLE IF NOT EXISTS `WorkProgress` (`work_spec_id` TEXT NOT NULL, `progress` BLOB NOT NULL, PRIMARY KEY(`work_spec_id`), FOREIGN KEY(`work_spec_id`) REFERENCES `WorkSpec`(`id`) ON UPDATE CASCADE ON DELETE CASCADE )");
    }
}
