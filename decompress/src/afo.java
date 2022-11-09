import android.support.v7.widget.RecyclerView;
import android.view.accessibility.AccessibilityEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import java.nio.ByteBuffer;
import android.net.Uri;
import android.os.Trace;
import com.bumptech.glide.load.ImageHeaderParser$ImageType;
import java.io.InputStream;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public class afo
{
    public static ImageHeaderParser$ImageType A(final List list, final InputStream inputStream, final azi azi) {
        if (inputStream == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new bel(inputStream, azi);
        }
        inputStream2.mark(5242880);
        return B(list, new avu(inputStream2));
    }
    
    public static ImageHeaderParser$ImageType B(final List list, final awb awb) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final ImageHeaderParser$ImageType a = awb.a(list.get(i));
            if (a != ImageHeaderParser$ImageType.UNKNOWN) {
                return a;
            }
        }
        return ImageHeaderParser$ImageType.UNKNOWN;
    }
    
    public static boolean a() {
        return Trace.isEnabled();
    }
    
    public static boolean u(final Uri uri) {
        return uri != null && "content".equals(uri.getScheme()) && "media".equals(uri.getAuthority());
    }
    
    public static boolean v(final int n, final int n2) {
        return n != Integer.MIN_VALUE && n2 != Integer.MIN_VALUE && n <= 512 && n2 <= 384;
    }
    
    public static boolean w(final Uri uri) {
        return uri.getPathSegments().contains("video");
    }
    
    public static int x(final List list, final InputStream inputStream, final azi azi) {
        if (inputStream == null) {
            return -1;
        }
        InputStream inputStream2 = inputStream;
        if (!inputStream.markSupported()) {
            inputStream2 = new bel(inputStream, azi);
        }
        inputStream2.mark(5242880);
        return y(list, new avy(inputStream2, azi));
    }
    
    public static int y(final List list, final awa awa) {
        for (int size = list.size(), i = 0; i < size; ++i) {
            final int a = awa.a(list.get(i));
            if (a != -1) {
                return a;
            }
        }
        return -1;
    }
    
    public static ImageHeaderParser$ImageType z(final List list, final ByteBuffer byteBuffer) {
        if (byteBuffer == null) {
            return ImageHeaderParser$ImageType.UNKNOWN;
        }
        return B(list, new avv(byteBuffer));
    }
    
    public CharSequence b() {
        throw new IllegalStateException("Not implemented.");
    }
    
    public String c() {
        throw new IllegalStateException("Not implemented.");
    }
    
    public void d(final rw rw) {
    }
    
    public void e(final rw rw) {
    }
    
    public void f(final AccessibilityNodeInfo accessibilityNodeInfo) {
    }
    
    public void g(final jc jc) {
    }
    
    public void h(final View view, final jc jc) {
    }
    
    public void i() {
    }
    
    public void j(final AccessibilityEvent accessibilityEvent) {
    }
    
    public void k() {
    }
    
    public void l() {
    }
    
    public void m() {
    }
    
    public boolean n() {
        return false;
    }
    
    public boolean o(final int n) {
        return false;
    }
    
    public boolean p() {
        return false;
    }
    
    public boolean q(final int n) {
        return false;
    }
    
    public void r(final RecyclerView recyclerView) {
    }
    
    public void s(final int n) {
        throw new IllegalStateException("Not implemented.");
    }
    
    public void t(final int n) {
        throw new IllegalStateException("Not implemented.");
    }
}
