// 
// Decompiled by Procyon v0.6.0
// 

final class akb extends be
{
    public akb() {
        super(11, 12);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("ALTER TABLE workspec ADD COLUMN `out_of_quota_policy` INTEGER NOT NULL DEFAULT 0");
    }
}
