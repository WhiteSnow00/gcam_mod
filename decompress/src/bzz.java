import java.util.concurrent.Executor;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bzz extends cac implements ewc
{
    private final bzi a;
    
    public bzz(final Context context, final Executor executor, final kjm kjm, final ewy ewy, final String s, final bzi a) {
        super(context, executor, kjm, ewy, s);
        this.a = a;
    }
    
    @Override
    public final void b() {
        this.c();
        this.a.h();
    }
}
