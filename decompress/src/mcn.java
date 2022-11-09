import com.google.android.gms.common.api.Status;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.RunnableScheduledFuture;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.Executors;
import java.util.concurrent.ExecutorService;
import android.opengl.EGLSurface;
import android.opengl.EGLDisplay;
import android.opengl.EGLContext;
import android.util.Log;
import android.opengl.EGLObjectHandle;
import java.util.Locale;
import android.opengl.GLES31;
import android.opengl.GLES30;
import android.opengl.EGL14;
import android.media.MediaFormat;
import java.util.concurrent.Executor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mcn
{
    public static mcm a(final Executor executor) {
        return new mck(executor);
    }
    
    public static void b(final String s, final MediaFormat mediaFormat, final MediaFormat mediaFormat2) {
        if (mediaFormat.containsKey(s)) {
            mediaFormat2.setInteger(s, mediaFormat.getInteger(s));
        }
    }
    
    public static mbl c(final mbz mbz) {
        return new mbp(mbz);
    }
    
    public static void d(final Runnable runnable, int i, int n, int n2, final boolean b) {
        final int[] array = new int[2];
        final int[] array2 = { 0 };
        final int[] array3 = { 0 };
        final int[] array4 = { 0 };
        final int[] array5 = new int[2];
        final int[] array6 = { 0 };
        final int[] array7 = { 0 };
        final int[] array8 = new int[4];
        final String name = Thread.currentThread().getName();
        final Thread currentThread = Thread.currentThread();
        final ThreadGroup threadGroup = currentThread.getThreadGroup();
        int n4;
        int n5;
        if (threadGroup != null) {
            final int activeCount = threadGroup.activeCount();
            final int n3 = activeCount + activeCount;
            final Thread[] array9 = new Thread[n3];
            threadGroup.enumerate(array9, true);
            int j = 0;
            n4 = 0;
            n5 = 1;
            while (j < n3) {
                final Thread thread = array9[j];
                int n6 = n4;
                if (thread != null) {
                    n6 = n4;
                    if (thread.getName().equals(name)) {
                        n6 = n4 + 1;
                    }
                }
                if (thread == currentThread) {
                    n5 = n6;
                }
                ++j;
                n4 = n6;
            }
        }
        else {
            n4 = 0;
            n5 = 1;
        }
        final EGLContext eglGetCurrentContext = EGL14.eglGetCurrentContext();
        final EGLDisplay eglGetCurrentDisplay = EGL14.eglGetCurrentDisplay();
        final EGLSurface eglGetCurrentSurface = EGL14.eglGetCurrentSurface(12378);
        final EGLSurface eglGetCurrentSurface2 = EGL14.eglGetCurrentSurface(12377);
        GLES30.glGetIntegerv(33307, array, 0);
        GLES30.glGetIntegerv(33308, array, 1);
        GLES30.glGetIntegerv(35725, array2, 0);
        GLES30.glGetIntegerv(34016, array3, 0);
        GLES30.glGetIntegerv(36010, array6, 0);
        GLES30.glGetIntegerv(36007, array7, 0);
        GLES30.glGetIntegerv(32873, array4, 0);
        GLES30.glGetIntegerv(2978, array8, 0);
        if (array4[0] != 0) {
            if (array[0] == 3 && array[1] > 0) {
                GLES31.glGetTexLevelParameteriv(3553, 0, 4096, array5, 0);
                GLES31.glGetTexLevelParameteriv(3553, 0, 4097, array5, 1);
            }
            else {
                array5[1] = (array5[0] = -1);
            }
        }
        final Locale us = Locale.US;
        final int n7 = array[0];
        final int n8 = array[1];
        final String name2 = Thread.currentThread().getName();
        final String string = runnable.toString();
        String r;
        if (eglGetCurrentContext.equals((Object)EGL14.EGL_NO_CONTEXT)) {
            r = "EGL_NO_CONTEXT";
        }
        else {
            r = r((EGLObjectHandle)eglGetCurrentContext);
        }
        String r2;
        if (eglGetCurrentDisplay.equals((Object)EGL14.EGL_NO_DISPLAY)) {
            r2 = "EGL_NO_DISPLAY";
        }
        else {
            r2 = r((EGLObjectHandle)eglGetCurrentDisplay);
        }
        final boolean equals = eglGetCurrentSurface.equals((Object)EGL14.EGL_NO_SURFACE);
        String r3 = "EGL_NO_SURFACE";
        String r4;
        if (equals) {
            r4 = "EGL_NO_SURFACE";
        }
        else {
            r4 = r((EGLObjectHandle)eglGetCurrentSurface);
        }
        if (!eglGetCurrentSurface2.equals((Object)EGL14.EGL_NO_SURFACE)) {
            r3 = r((EGLObjectHandle)eglGetCurrentSurface2);
        }
        String value;
        if (n == 12288) {
            value = "EGL_SUCCESS";
        }
        else {
            value = String.valueOf(n);
        }
        String value2;
        if (n2 == 0) {
            value2 = "GL_NO_ERROR";
        }
        else {
            value2 = String.valueOf(n2);
        }
        n2 = array2[0];
        final int n9 = array3[0];
        n = array4[0];
        final int n10 = array5[0];
        String value3 = "?";
        String value4;
        if (n10 != -1) {
            value4 = String.valueOf(n10);
        }
        else {
            value4 = "?";
        }
        final int n11 = array5[1];
        if (n11 != -1) {
            value3 = String.valueOf(n11);
        }
        final String format = String.format(us, "\n- General EGL Status ------------------\nVersion: %d.%d\nThread: %s (%d of %d)\nCommands Executed: %d\nCommand Run: %s\nCurrent Context: %s\nCurrent Display: %s\nCurrent Read Surface: %s\nCurrent Draw Surface: %s\nEGL Error: %s\nGL Error: %s\nClosing: %b\n- GL Status ---------------------------\nBound Program: %d\nActive Texture Slot: %d\nTexture2D Binding: %d\nTexture Size: %sx%s\nFBO Binding: %d\nRenderbuffer Binding: %d\nViewport: %d,%d,%dx%d\n", n7, n8, name2, n5, n4, i, string, r, r2, r4, r3, value, value2, b, n2, n9 - 33984, n, value4, value3, array6[0], array7[0], array8[0], array8[1], array8[2], array8[3]);
        final StringBuilder sb = new StringBuilder();
        if (array2[0] != 0) {
            sb.append("- Program Details ---------------------\n");
            n = array2[0];
            final StringBuilder sb2 = new StringBuilder();
            final int[] array10 = { 0 };
            GLES30.glGetProgramiv(n, 35718, array10, 0);
            sb2.append(String.format(Locale.US, "Uni Count: %d\n", array10[0]));
            final int[] array11 = { 0 };
            GLES30.glGetProgramiv(n, 35719, array11, 0);
            int[] array12;
            int[] array13;
            int[] array14;
            byte[] array15;
            for (i = 0; i < array10[0]; ++i) {
                array12 = new int[] { 0 };
                array13 = new int[] { 0 };
                array14 = new int[] { 0 };
                array15 = new byte[255];
                GLES30.glGetActiveUniform(n, i, array11[0], array12, 0, array13, 0, array14, 0, array15, 0);
                sb2.append(String.format("Uni 0x%X %s\n", array14[0], new String(array15, 0, q(array15))));
            }
            sb.append(sb2.toString());
            n = array2[0];
            final StringBuilder sb3 = new StringBuilder();
            final int[] array16 = { 0 };
            GLES30.glGetProgramiv(n, 35721, array16, 0);
            sb3.append(String.format(Locale.US, "Attrib Count: %d\n", array16[0]));
            final int[] array17 = { 0 };
            GLES30.glGetProgramiv(n, 35722, array17, 0);
            int[] array18;
            int[] array19;
            int[] array20;
            byte[] array21;
            for (i = 0; i < array16[0]; ++i) {
                array18 = new int[] { 0 };
                array19 = new int[] { 0 };
                array20 = new int[] { 0 };
                array21 = new byte[255];
                GLES30.glGetActiveAttrib(n, i, array17[0], array18, 0, array19, 0, array20, 0, array21, 0);
                sb3.append(String.format("Attrib 0x%X %s\n", array20[0], new String(array21, 0, q(array21))));
            }
            sb.append(sb3.toString());
        }
        final String value5 = String.valueOf(format);
        final String value6 = String.valueOf(sb.toString());
        String concat;
        if (value6.length() != 0) {
            concat = value5.concat(value6);
        }
        else {
            concat = new String(value5);
        }
        Log.e("GLContext", concat);
    }
    
    public static ExecutorService e(final String a) {
        final kjx a2 = kjy.a();
        a2.a = a;
        a2.c(0);
        return f(a2.a());
    }
    
    public static ExecutorService f(final kjy kjy) {
        njo.d(kjy.a >= 0);
        final ThreadFactory s = s(kjy);
        final int a = kjy.a;
        switch (a) {
            default: {
                return Executors.newFixedThreadPool(a, s);
            }
            case 1: {
                return Executors.newSingleThreadExecutor(s);
            }
            case 0: {
                return Executors.newCachedThreadPool(s);
            }
        }
    }
    
    public static ExecutorService g(final String a, final int n) {
        final kjx a2 = kjy.a();
        a2.a = a;
        a2.c(n);
        return f(a2.a());
    }
    
    public static ExecutorService h(final String a) {
        final kjx a2 = kjy.a();
        a2.a = a;
        a2.c(1);
        return f(a2.a());
    }
    
    public static RunnableScheduledFuture i(final RunnableScheduledFuture runnableScheduledFuture) {
        return new kkb(runnableScheduledFuture);
    }
    
    public static ScheduledExecutorService j(final kjy kjy) {
        njo.d(kjy.a > 0);
        final ThreadFactory s = s(kjy);
        final int a = kjy.a;
        ScheduledThreadPoolExecutor scheduledThreadPoolExecutor;
        if (!kjy.d) {
            scheduledThreadPoolExecutor = new ScheduledThreadPoolExecutor(a, s);
        }
        else {
            scheduledThreadPoolExecutor = new kka(a, s);
        }
        return scheduledThreadPoolExecutor;
    }
    
    public static ScheduledExecutorService k(final String a, final int n) {
        final kjx a2 = kjy.a();
        a2.a = a;
        a2.c(n);
        return j(a2.a());
    }
    
    public static ScheduledExecutorService l(final String a) {
        final kjx a2 = kjy.a();
        a2.a = a;
        a2.c(1);
        return j(a2.a());
    }
    
    public static ExecutorService m(final String a, final int n) {
        final kjx a2 = kjy.a();
        a2.a = a;
        a2.c(2);
        a2.b(n);
        return f(a2.a());
    }
    
    public static Executor n() {
        return o(new kjm());
    }
    
    public static Executor o(final kjm kjm) {
        return new kjq(kjm);
    }
    
    public static Status p(final int n) {
        String l = null;
        switch (n) {
            default: {
                l = lio.l(n);
                break;
            }
            case 4010: {
                l = "ACCOUNT_KEY_CREATION_FAILED";
                break;
            }
            case 4009: {
                l = "UNSUPPORTED_BY_TARGET";
                break;
            }
            case 4008: {
                l = "WIFI_CREDENTIAL_SYNC_NO_CREDENTIAL_FETCHED";
                break;
            }
            case 4007: {
                l = "UNKNOWN_CAPABILITY";
                break;
            }
            case 4006: {
                l = "DUPLICATE_CAPABILITY";
                break;
            }
            case 4005: {
                l = "ASSET_UNAVAILABLE";
                break;
            }
            case 4004: {
                l = "INVALID_TARGET_NODE";
                break;
            }
            case 4003: {
                l = "DATA_ITEM_TOO_LARGE";
                break;
            }
            case 4002: {
                l = "UNKNOWN_LISTENER";
                break;
            }
            case 4001: {
                l = "DUPLICATE_LISTENER";
                break;
            }
            case 4000: {
                l = "TARGET_NODE_NOT_CONNECTED";
                break;
            }
        }
        return new Status(n, l);
    }
    
    private static int q(final byte[] array) {
        for (int i = 0; i < 255; ++i) {
            if (array[i] == 0) {
                return i;
            }
        }
        return 255;
    }
    
    private static String r(final EGLObjectHandle eglObjectHandle) {
        return String.format("0x%X", eglObjectHandle.getNativeHandle());
    }
    
    private static ThreadFactory s(final kjy kjy) {
        final boolean b = kjy.a == 1;
        final boolean b2 = b || kjy.b.length() <= 13;
        final String b3 = kjy.b;
        if (b2) {
            return new kjz(kjy, b);
        }
        throw new IllegalArgumentException(njo.b("Thread name %s is too long, must be less than %s", b3, 13));
    }
}
