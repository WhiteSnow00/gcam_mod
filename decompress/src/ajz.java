// 
// Decompiled by Procyon v0.6.0
// 

final class ajz extends be
{
    public ajz() {
        super(7, 8);
    }
    
    @Override
    public final void a(final afh afh) {
        afh.g("CREATE INDEX IF NOT EXISTS `index_WorkSpec_period_start_time` ON `workspec` (`period_start_time`)");
    }
}
