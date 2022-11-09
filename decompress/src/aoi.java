import androidx.work.impl.WorkDatabase;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aoi implements ait
{
    final alz a;
    final anb b;
    public final apa c;
    
    static {
        aiy.b("WMFgUpdater");
    }
    
    public aoi(final WorkDatabase workDatabase, final alz a, final apa c) {
        this.a = a;
        this.c = c;
        this.b = workDatabase.s();
    }
}
