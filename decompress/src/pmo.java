import java.util.Iterator;

// 
// Decompiled by Procyon v0.6.0
// 

public final class pmo implements pml
{
    final /* synthetic */ plc a;
    
    public pmo(final plc a) {
        this.a = a;
    }
    
    @Override
    public final Iterator a() {
        final plc a = this.a;
        final pmm pmm = new pmm();
        pmm.a = pjv.a(a, pmm, pmm);
        return pmm;
    }
}
