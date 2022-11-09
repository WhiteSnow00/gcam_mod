import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;

// 
// Decompiled by Procyon v0.6.0
// 

final class axp extends WeakReference
{
    final awc a;
    final boolean b;
    aza c;
    
    public axp(final awc a, final ayt ayt, final ReferenceQueue referenceQueue) {
        super(ayt, referenceQueue);
        bit.a(a);
        this.a = a;
        this.c = null;
        this.b = ayt.a;
    }
    
    final void a() {
        this.c = null;
        this.clear();
    }
}
