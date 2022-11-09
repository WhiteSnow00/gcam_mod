import android.content.Context;
import java.util.concurrent.Callable;

// 
// Decompiled by Procyon v0.6.0
// 

public final class aay implements Callable
{
    final /* synthetic */ String a;
    final /* synthetic */ Context b;
    final /* synthetic */ aav c;
    final /* synthetic */ int d;
    
    public aay(final String a, final Context b, final aav c, final int d) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.d = d;
    }
    
    public final aba a() {
        return abb.a(this.a, this.b, this.c, this.d);
    }
}
