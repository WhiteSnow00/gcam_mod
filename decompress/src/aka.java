// 
// Decompiled by Procyon v0.6.0
// 

final class aka extends be
{
    public aka() {
        super(8, 9);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("ALTER TABLE workspec ADD COLUMN `run_in_foreground` INTEGER NOT NULL DEFAULT 0");
    }
}
