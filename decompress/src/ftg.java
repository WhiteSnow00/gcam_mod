import android.os.SystemClock;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

final class ftg
{
    public final ofn a;
    public final long b;
    public boolean c;
    public boolean d;
    public long e;
    public List f;
    
    public ftg() {
        this.a = ofn.f();
        this.b = SystemClock.elapsedRealtimeNanos();
        this.c = false;
        this.e = -1L;
        this.f = null;
    }
}
