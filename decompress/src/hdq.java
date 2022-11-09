import android.app.TaskStackBuilder;
import android.content.Intent;
import android.app.KeyguardManager$KeyguardDismissCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class hdq extends KeyguardManager$KeyguardDismissCallback
{
    final /* synthetic */ boolean a;
    final /* synthetic */ Intent b;
    final /* synthetic */ hdr c;
    
    public hdq(final hdr c, final boolean a, final Intent b) {
        this.c = c;
        this.a = a;
        this.b = b;
    }
    
    public final void onDismissSucceeded() {
        final TaskStackBuilder create = TaskStackBuilder.create(this.c.a);
        if (this.a) {
            final hdr c = this.c;
            final Intent intent = new Intent(c.a, c.c);
            intent.setFlags(intent.getFlags() | 0x4000000).setAction("android.intent.action.MAIN");
            create.addNextIntent(intent);
        }
        create.addNextIntent(this.b).startActivities();
    }
}
