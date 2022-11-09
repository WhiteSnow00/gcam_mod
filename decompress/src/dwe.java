import com.google.googlex.gcam.ThreadPriority;
import com.google.googlex.gcam.GcamModuleJNI;
import com.google.googlex.gcam.ThreadPoolConfig;
import java.io.File;
import com.google.googlex.gcam.InitParams;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dwe
{
    public final InitParams a;
    
    public dwe(final cxl cxl, final dug dug, final pii pii, final cyn cyn, final liz liz) {
        final niz a = ((ejf)pii).a();
        String absolutePath;
        if (a.g()) {
            absolutePath = ((File)a.c()).getAbsolutePath();
        }
        else {
            absolutePath = "";
        }
        final boolean a2 = liz.a;
        final InitParams a3 = new InitParams();
        final ThreadPoolConfig a4 = a(cxl, cxs.d, null);
        GcamModuleJNI.InitParams_capture_threads_set(a3.a, a3, ThreadPoolConfig.a(a4), a4);
        final ThreadPoolConfig a5 = a(cxl, cxs.e, 8);
        GcamModuleJNI.InitParams_merge_threads_set(a3.a, a3, ThreadPoolConfig.a(a5), a5);
        final ThreadPoolConfig a6 = a(cxl, cxs.f, 9);
        GcamModuleJNI.InitParams_finish_threads_set(a3.a, a3, ThreadPoolConfig.a(a6), a6);
        final cyn a7 = cyn.a;
        final boolean b = false;
        GcamModuleJNI.InitParams_allow_unknown_devices_set(a3.a, a3, cyn == a7 || a2);
        GcamModuleJNI.InitParams_max_payload_frames_set(a3.a, a3, dug.b);
        a3.c(0);
        GcamModuleJNI.InitParams_execute_postview_on_set(a3.a, a3, 0);
        if (dug.b()) {
            a3.c(1);
        }
        dug.a.d();
        GcamModuleJNI.InitParams_simultaneous_merge_and_finish_set(a3.a, a3, a3.a() != 0 || b);
        GcamModuleJNI.InitParams_serialized_cache_dir_set(a3.a, a3, absolutePath);
        this.a = a3;
    }
    
    private static ThreadPoolConfig a(final cxl cxl, final cxo cxo, final Integer n) {
        final int intValue = (int)cxl.a(cxo).c();
        njo.p(intValue > 0, "threadCount %d is not a valid value.");
        final ThreadPoolConfig threadPoolConfig = new ThreadPoolConfig(GcamModuleJNI.new_ThreadPoolConfig(), true);
        GcamModuleJNI.ThreadPoolConfig_count_set(threadPoolConfig.a, threadPoolConfig, intValue);
        if (n != null) {
            final ThreadPriority threadPriority = new ThreadPriority();
            GcamModuleJNI.ThreadPriority_explicitly_set_set(threadPriority.a, threadPriority, true);
            GcamModuleJNI.ThreadPriority_value_set(threadPriority.a, threadPriority, n);
            GcamModuleJNI.ThreadPoolConfig_priority_set(threadPoolConfig.a, threadPoolConfig, threadPriority.a, threadPriority);
        }
        return threadPoolConfig;
    }
}
