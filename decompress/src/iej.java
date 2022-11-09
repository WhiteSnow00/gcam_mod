import android.content.Context;
import android.content.res.Resources;
import java.util.concurrent.atomic.AtomicInteger;
import android.widget.TextView;

// 
// Decompiled by Procyon v0.6.0
// 

public class iej extends TextView
{
    public final AtomicInteger a;
    public final Resources b;
    public final ieg c;
    
    public iej(final Context context, final ieg c) {
        super(context);
        this.a = new AtomicInteger(0);
        this.b = context.getResources();
        this.c = c;
    }
}
