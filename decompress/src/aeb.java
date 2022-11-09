import android.content.BroadcastReceiver;
import android.content.IntentFilter;

// 
// Decompiled by Procyon v0.6.0
// 

final class aeb
{
    final IntentFilter a;
    final BroadcastReceiver b;
    boolean c;
    boolean d;
    
    public aeb(final IntentFilter a, final BroadcastReceiver b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder(128);
        sb.append("Receiver{");
        sb.append(this.b);
        sb.append(" filter=");
        sb.append(this.a);
        if (this.d) {
            sb.append(" DEAD");
        }
        sb.append("}");
        return sb.toString();
    }
}
