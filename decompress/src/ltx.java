import java.util.Collection;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.List;
import android.media.MediaFormat;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ltx
{
    final MediaFormat a;
    public final int b;
    final List c;
    final List d;
    final List e;
    final Deque f;
    boolean g;
    final /* synthetic */ lty h;
    
    public ltx(final lty h, final MediaFormat a, final int b) {
        this.h = h;
        this.c = new ArrayList();
        this.d = new ArrayList();
        this.e = new ArrayList();
        this.f = new ArrayDeque();
        this.g = false;
        this.a = a;
        this.b = b;
    }
    
    public final int a() {
        if (lue.d(this.a)) {
            return 48000;
        }
        return 90000;
    }
    
    public final nns b() {
        return nns.j(this.c);
    }
}
