import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import android.content.Context;
import java.util.concurrent.ExecutorService;

// 
// Decompiled by Procyon v0.6.0
// 

public final class gxy implements gwp
{
    public static final nsd a;
    private static final ExecutorService d;
    public final gwo b;
    public final Runnable c;
    private final hhy e;
    
    static {
        a = nsd.g("com/google/android/apps/camera/processing/imagebackend/ImageShadowTaskImpl");
        d = mcn.e("ImgShadowTask");
    }
    
    public gxy(final gwo b, final hhy e, final niz niz) {
        this.b = b;
        this.e = e;
        this.c = (Runnable)niz.f();
    }
    
    public gxy(final hhy hhy) {
        final gwo gwo = new gwo();
        gwo.e(1);
        this(gwo, hhy, nii.a);
    }
    
    @Override
    public final String b() {
        final String value = String.valueOf(this.e.h());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 16);
        sb.append("ImageShadowTask-");
        sb.append(value);
        return sb.toString();
    }
    
    @Override
    public final void c(final kqq kqq) {
        throw new RuntimeException("Not implemented yet");
    }
    
    @Override
    public final void d(final Context context) {
        final Future<Object> submit = gxy.d.submit(new gxx(this), (Object)null);
        try {
            try {
                submit.get(5L, TimeUnit.MINUTES);
                this.b.e(0);
                this.b.d();
            }
            finally {
                this.b.e(0);
                this.b.d();
                while (true) {}
            }
        }
        catch (final InterruptedException ex) {}
        catch (final TimeoutException ex2) {}
        catch (final ExecutionException ex3) {}
    }
    
    @Override
    public final void e(final kqq kqq) {
        throw new RuntimeException("Not implemented yet");
    }
    
    @Override
    public final void f() {
    }
    
    @Override
    public final void g() {
    }
    
    @Override
    public final void h() {
        this.b.e(0);
        this.b.d();
    }
}
