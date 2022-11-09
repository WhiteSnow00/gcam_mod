import android.view.KeyEvent;
import android.util.Log;
import android.view.View;
import android.view.ViewParent;
import android.os.Bundle;
import android.net.Uri;
import android.media.MediaDescription$Builder;
import android.graphics.Bitmap;
import android.media.MediaDescription;
import j$.util.concurrent.ConcurrentHashMap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hg
{
    public hg() {
        new ConcurrentHashMap();
    }
    
    public hg(final byte[] array) {
        this();
    }
    
    public static Bitmap a(final MediaDescription mediaDescription) {
        return mediaDescription.getIconBitmap();
    }
    
    public static MediaDescription$Builder b() {
        return new MediaDescription$Builder();
    }
    
    public static MediaDescription c(final MediaDescription$Builder mediaDescription$Builder) {
        return mediaDescription$Builder.build();
    }
    
    public static Uri d(final MediaDescription mediaDescription) {
        return mediaDescription.getIconUri();
    }
    
    public static Bundle e(final MediaDescription mediaDescription) {
        return mediaDescription.getExtras();
    }
    
    public static CharSequence f(final MediaDescription mediaDescription) {
        return mediaDescription.getDescription();
    }
    
    public static CharSequence g(final MediaDescription mediaDescription) {
        return mediaDescription.getSubtitle();
    }
    
    public static CharSequence h(final MediaDescription mediaDescription) {
        return mediaDescription.getTitle();
    }
    
    public static String i(final MediaDescription mediaDescription) {
        return mediaDescription.getMediaId();
    }
    
    public static void j(final MediaDescription$Builder mediaDescription$Builder, final CharSequence description) {
        mediaDescription$Builder.setDescription(description);
    }
    
    public static void k(final MediaDescription$Builder mediaDescription$Builder, final Bundle extras) {
        mediaDescription$Builder.setExtras(extras);
    }
    
    public static void l(final MediaDescription$Builder mediaDescription$Builder, final Bitmap iconBitmap) {
        mediaDescription$Builder.setIconBitmap(iconBitmap);
    }
    
    public static void m(final MediaDescription$Builder mediaDescription$Builder, final Uri iconUri) {
        mediaDescription$Builder.setIconUri(iconUri);
    }
    
    public static void n(final MediaDescription$Builder mediaDescription$Builder, final String mediaId) {
        mediaDescription$Builder.setMediaId(mediaId);
    }
    
    public static void o(final MediaDescription$Builder mediaDescription$Builder, final CharSequence subtitle) {
        mediaDescription$Builder.setSubtitle(subtitle);
    }
    
    public static void p(final MediaDescription$Builder mediaDescription$Builder, final CharSequence title) {
        mediaDescription$Builder.setTitle(title);
    }
    
    public static void q(final ViewParent viewParent, final View view, final int n, final int n2, final int[] array, final int n3) {
        if (viewParent instanceof ib) {
            ((ib)viewParent).a(view, n, n2, array, n3);
            return;
        }
        if (n3 == 0) {
            try {
                viewParent.onNestedPreScroll(view, n, n2, array);
            }
            catch (final AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedPreScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static void r(final ViewParent viewParent, final View view, final int n, final int n2, final int n3, final int n4, final int n5, final int[] array) {
        if (viewParent instanceof ic) {
            ((ic)viewParent).f(view, n, n2, n3, n4, n5, array);
            return;
        }
        array[0] += n3;
        array[1] += n4;
        if (viewParent instanceof ib) {
            ((ib)viewParent).b(view, n, n2, n3, n4, n5);
            return;
        }
        if (n5 == 0) {
            try {
                viewParent.onNestedScroll(view, n, n2, n3, n4);
            }
            catch (final AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static void s(final ViewParent viewParent, final View view, final View view2, final int n, final int n2) {
        if (viewParent instanceof ib) {
            ((ib)viewParent).c(view, view2, n, n2);
            return;
        }
        if (n2 == 0) {
            try {
                viewParent.onNestedScrollAccepted(view, view2, n);
            }
            catch (final AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onNestedScrollAccepted");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static void t(final ViewParent viewParent, final View view, final int n) {
        if (viewParent instanceof ib) {
            ((ib)viewParent).d(view, n);
            return;
        }
        if (n == 0) {
            try {
                viewParent.onStopNestedScroll(view);
            }
            catch (final AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStopNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
    }
    
    public static boolean u(final ViewParent viewParent, final View view, final float n, final float n2, final boolean b) {
        try {
            return viewParent.onNestedFling(view, n, n2, b);
        }
        catch (final AbstractMethodError abstractMethodError) {
            final StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedFling");
            Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static boolean v(final ViewParent viewParent, final View view, final float n, final float n2) {
        try {
            return viewParent.onNestedPreFling(view, n, n2);
        }
        catch (final AbstractMethodError abstractMethodError) {
            final StringBuilder sb = new StringBuilder();
            sb.append("ViewParent ");
            sb.append(viewParent);
            sb.append(" does not implement interface method onNestedPreFling");
            Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            return false;
        }
    }
    
    public static boolean w(final ViewParent viewParent, final View view, final View view2, final int n, final int n2) {
        if (viewParent instanceof ib) {
            return ((ib)viewParent).e(view, view2, n, n2);
        }
        if (n2 == 0) {
            try {
                return viewParent.onStartNestedScroll(view, view2, n);
            }
            catch (final AbstractMethodError abstractMethodError) {
                final StringBuilder sb = new StringBuilder();
                sb.append("ViewParent ");
                sb.append(viewParent);
                sb.append(" does not implement interface method onStartNestedScroll");
                Log.e("ViewParentCompat", sb.toString(), (Throwable)abstractMethodError);
            }
        }
        return false;
    }
    
    public static boolean x(final hy hy, final KeyEvent keyEvent) {
        return hy != null && hy.g(keyEvent);
    }
}
