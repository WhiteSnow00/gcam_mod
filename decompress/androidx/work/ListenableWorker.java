// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.concurrent.Executor;
import java.util.UUID;
import android.content.Context;

public abstract class ListenableWorker
{
    public Context a;
    public WorkerParameters b;
    public volatile boolean c;
    public boolean d;
    public boolean e;
    
    public ListenableWorker(final Context a, final WorkerParameters b) {
        if (a == null) {
            throw new IllegalArgumentException("Application Context is null");
        }
        if (b != null) {
            this.a = a;
            this.b = b;
            return;
        }
        throw new IllegalArgumentException("WorkerParameters is null");
    }
    
    public final aiq a() {
        return this.b.b;
    }
    
    public void aG() {
    }
    
    public final void aH() {
        this.c = true;
        this.aG();
    }
    
    public abstract oey b();
    
    public final UUID c() {
        return this.b.a;
    }
    
    public final Executor d() {
        return this.b.c;
    }
    
    public boolean g() {
        return this.e;
    }
}
