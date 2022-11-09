import android.widget.EdgeEffect;
import android.support.v7.widget.RecyclerView;
import android.graphics.Rect;
import java.util.concurrent.Future;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutorService;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class aai
{
    public static int b(final Context context, final int n) {
        return context.getColor(n);
    }
    
    public static Object c(final ExecutorService executorService, final Callable callable, final int n) {
        final Future<Object> submit = executorService.submit((Callable<Object>)callable);
        final long n2 = n;
        try {
            return submit.get(n2, TimeUnit.MILLISECONDS);
        }
        catch (final TimeoutException ex) {
            throw new InterruptedException("timeout");
        }
        catch (final InterruptedException ex2) {
            throw ex2;
        }
        catch (final ExecutionException ex3) {
            throw new RuntimeException(ex3);
        }
    }
    
    public static void d(final Rect rect, final Rect rect2) {
        if (rect.isEmpty()) {
            return;
        }
        final int centerX = rect.centerX();
        final int centerY = rect.centerY();
        if (!rect.intersect(rect2)) {
            rect.setEmpty();
            return;
        }
        f(rect, rect);
        final int n = centerX - rect.centerX();
        final int n2 = centerY - rect.centerY();
        rect.offset(n, n2);
        if (!rect2.contains(rect)) {
            rect.offset(-n, -n2);
        }
    }
    
    public static void e(final Rect rect, final Rect rect2) {
        rect.set(rect2.left, (rect2.top + rect2.bottom) / 2, rect2.right, rect2.bottom);
    }
    
    public static void f(final Rect rect, final Rect rect2) {
        final int n = Math.min(rect2.width(), rect2.height()) / 2;
        rect.set(rect2.centerX() - n, rect2.centerY() - n, rect2.centerX() + n, rect2.centerY() + n);
    }
    
    public static void g(final Rect rect, final Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.setEmpty();
            return;
        }
        rect.set(rect2.left, rect2.top, rect2.left + rect2.height(), rect2.bottom);
    }
    
    public static void h(final Rect rect, final Rect rect2) {
        if (rect2.width() < rect2.height()) {
            rect.set(rect2);
            return;
        }
        rect.set(rect2.left + rect2.height(), rect2.top, rect2.right, rect2.bottom);
    }
    
    public static void i(final Rect rect, final Rect rect2) {
        rect.set(rect2.left, rect2.top, rect2.right, (rect2.top + rect2.bottom) / 2);
    }
    
    public static void j(final Rect rect, final Rect rect2, float n) {
        rect.set(rect2);
        n = 0.5f - n / 2.0f;
        rect.inset((int)(rect.width() * n), (int)(rect.height() * n));
    }
    
    public static boolean k(final Rect rect) {
        final int width = rect.width();
        final float n = (float)rect.height();
        return width > n + n;
    }
    
    public EdgeEffect a(final RecyclerView recyclerView) {
        throw null;
    }
}
