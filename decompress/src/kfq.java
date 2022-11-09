import com.google.android.gms.common.data.DataHolder;

// 
// Decompiled by Procyon v0.6.0
// 

final class kfq implements Runnable
{
    final /* synthetic */ DataHolder a;
    
    public kfq(final DataHolder a) {
        this.a = a;
    }
    
    @Override
    public final void run() {
        new jud(this.a).b();
    }
}
