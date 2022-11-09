import android.os.Message;
import java.util.Iterator;
import android.os.Looper;
import java.util.LinkedList;
import android.os.Handler;

// 
// Decompiled by Procyon v0.6.0
// 

class aty extends Handler
{
    final LinkedList r;
    
    public aty(final Looper looper) {
        super(looper);
        (this.r = new LinkedList()).offerLast(-1);
    }
    
    final String c(final int n) {
        final String s = new String("HIST");
        final StringBuilder sb = new StringBuilder();
        sb.append(s);
        sb.append("_ID");
        sb.append(n);
        String s2 = sb.toString();
        for (final Integer n2 : this.r) {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(s2);
            sb2.append('_');
            sb2.append(n2.toString());
            s2 = sb2.toString();
        }
        final StringBuilder sb3 = new StringBuilder();
        sb3.append(s2);
        sb3.append("_HEND");
        return sb3.toString();
    }
    
    public void handleMessage(final Message message) {
        this.r.offerLast(message.what);
        while (this.r.size() > 400) {
            this.r.pollFirst();
        }
    }
}
