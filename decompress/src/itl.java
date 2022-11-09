import android.app.NotificationManager;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class itl implements oun
{
    private final pii a;
    private final pii b;
    
    public itl(final pii a, final pii b) {
        this.a = a;
        this.b = b;
    }
    
    public final itk a() {
        return new itk((ScheduledExecutorService)this.a.get(), (NotificationManager)this.b.get());
    }
}
