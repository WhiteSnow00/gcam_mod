import java.util.concurrent.CopyOnWriteArrayList;

// 
// Decompiled by Procyon v0.6.0
// 

public final class wf
{
    public boolean a;
    public final CopyOnWriteArrayList b;
    final /* synthetic */ fi c;
    
    public wf() {
        this.b = new CopyOnWriteArrayList();
        this.a = false;
    }
    
    public wf(final fi c) {
        this.c = c;
        this.b = new CopyOnWriteArrayList();
        this.a = false;
    }
    
    public final void a(final vz vz) {
        this.b.add(vz);
    }
    
    public final void b(final vz vz) {
        this.b.remove(vz);
    }
}
