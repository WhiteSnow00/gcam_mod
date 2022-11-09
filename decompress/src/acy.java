import android.util.Log;

// 
// Decompiled by Procyon v0.6.0
// 

final class acy implements Runnable
{
    final /* synthetic */ String a;
    final /* synthetic */ ade b;
    
    public acy(final String a, final ade b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final void run() {
        final StringBuilder sb = new StringBuilder();
        sb.append("Policy violation with PENALTY_DEATH in ");
        sb.append(this.a);
        Log.e("FragmentStrictMode", sb.toString(), (Throwable)this.b);
        throw this.b;
    }
}
