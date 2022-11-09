import android.database.DataSetObserver;

// 
// Decompiled by Procyon v0.6.0
// 

final class rg extends DataSetObserver
{
    final /* synthetic */ rj a;
    
    public rg(final rj a) {
        this.a = a;
    }
    
    public final void onChanged() {
        if (this.a.u()) {
            this.a.s();
        }
    }
    
    public final void onInvalidated() {
        this.a.k();
    }
}
