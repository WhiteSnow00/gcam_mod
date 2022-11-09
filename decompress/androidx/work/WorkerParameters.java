// 
// Decompiled by Procyon v0.6.0
// 

package androidx.work;

import java.util.HashSet;
import java.util.Collection;
import java.util.concurrent.Executor;
import java.util.UUID;

public final class WorkerParameters
{
    public UUID a;
    public aiq b;
    public Executor c;
    public ajk d;
    public ait e;
    public apa f;
    
    public WorkerParameters(final UUID a, final aiq b, final Collection collection, final Executor c, final apa f, final ajk d, final ait e) {
        this.a = a;
        this.b = b;
        new HashSet(collection);
        this.c = c;
        this.f = f;
        this.d = d;
        this.e = e;
    }
}
