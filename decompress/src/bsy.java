import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executor;
import java.util.concurrent.ScheduledExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bsy
{
    public static final ScheduledExecutorService a;
    public static final ScheduledExecutorService b;
    
    static {
        a = btj.a(mcn.k("GcaGeneric", 2));
        b = btj.a(mcn.k("GcaLowPrio", 1));
    }
    
    public static ofa a(final ScheduledExecutorService scheduledExecutorService) {
        return ofi.d(scheduledExecutorService);
    }
    
    public static ofa b(final kjm kjm) {
        return new kjo(mcn.o(kjm));
    }
    
    public static ofa c(final ScheduledExecutorService scheduledExecutorService) {
        return ofi.d(scheduledExecutorService);
    }
    
    public static Executor d(final ScheduledExecutorService scheduledExecutorService) {
        return new kjs(scheduledExecutorService);
    }
    
    public static Executor e(final ExecutorService executorService) {
        return new kjs(executorService);
    }
    
    public static Executor f(final Executor executor) {
        return ofi.e(executor);
    }
    
    public static ExecutorService g(final ScheduledExecutorService scheduledExecutorService) {
        return new kjv(scheduledExecutorService);
    }
    
    public static ExecutorService h(final ScheduledExecutorService scheduledExecutorService) {
        return new kjv(scheduledExecutorService);
    }
    
    public static ScheduledExecutorService i() {
        final kjx a = kjy.a();
        a.a = "CriticalPath";
        a.b(-1);
        a.c(1);
        return btj.a(mcn.j(a.a()));
    }
    
    public static ScheduledExecutorService j() {
        return btj.a(mcn.l("00UiWorker"));
    }
    
    public static kkn k() {
        return kqm.c(mcn.h("pck-temporal-binning"));
    }
}
