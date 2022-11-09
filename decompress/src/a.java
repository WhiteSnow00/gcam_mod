import android.view.ViewGroup;
import android.app.AppOpsManager;
import android.os.Process;
import android.content.Context;
import org.xmlpull.v1.XmlPullParser;
import android.util.Base64;
import java.util.ArrayList;
import java.util.List;
import android.view.View;

// 
// Decompiled by Procyon v0.6.0
// 

public final class a
{
    public static final y a(final Class clazz, final z z, final ac ac) {
        final String canonicalName = clazz.getCanonicalName();
        if (canonicalName != null) {
            final StringBuilder sb = new StringBuilder();
            sb.append("android.arch.lifecycle.ViewModelProvider.DefaultKey:");
            sb.append(canonicalName);
            final String string = sb.toString();
            final y y = ac.a.get(string);
            y y2;
            if (clazz.isInstance(y)) {
                if (z instanceof ab) {
                    final ab ab = (ab)z;
                    return y;
                }
                y2 = y;
            }
            else {
                y y3;
                if (z instanceof aa) {
                    y3 = ((aa)z).b();
                }
                else {
                    y3 = z.a();
                }
                final y y4 = ac.a.put(string, y3);
                y2 = y3;
                if (y4 != null) {
                    y4.a();
                    return y3;
                }
            }
            return y2;
        }
        throw new IllegalArgumentException("Local and anonymous classes can not be ViewModels");
    }
    
    public static void b(final View view, final ad ad) {
        view.setTag(2131428132, (Object)ad);
    }
    
    public static List c(final String[] array) {
        final ArrayList list = new ArrayList();
        for (int length = array.length, i = 0; i < length; ++i) {
            list.add(Base64.decode(array[i], 0));
        }
        return list;
    }
    
    public static void d(final XmlPullParser xmlPullParser) {
        int i = 1;
        while (i > 0) {
            switch (xmlPullParser.next()) {
                default: {
                    continue;
                }
                case 3: {
                    --i;
                    continue;
                }
                case 2: {
                    ++i;
                    continue;
                }
            }
        }
    }
    
    public static int e(final Context context, String s) {
        final int myPid = Process.myPid();
        final int myUid = Process.myUid();
        final String packageName = context.getPackageName();
        final int checkPermission = context.checkPermission(s, myPid, myUid);
        int n = 0;
        if (checkPermission == -1) {
            n = -1;
        }
        else {
            final String permissionToOp = AppOpsManager.permissionToOp(s);
            if (permissionToOp != null) {
                if (packageName == null) {
                    final String[] packagesForUid = context.getPackageManager().getPackagesForUid(myUid);
                    if (packagesForUid == null) {
                        n = -1;
                        return n;
                    }
                    if (packagesForUid.length <= 0) {
                        n = -1;
                        return n;
                    }
                    s = packagesForUid[0];
                }
                else {
                    s = packageName;
                }
                if (((AppOpsManager)context.getSystemService((Class)AppOpsManager.class)).noteProxyOpNoThrow(permissionToOp, s) == 0) {
                    return 0;
                }
                n = -2;
            }
        }
        return n;
    }
    
    public static int g(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("Unknown visibility ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            case 8: {
                return 3;
            }
            case 4: {
                return 4;
            }
            case 0: {
                return 2;
            }
        }
    }
    
    public static int h(final View view) {
        if (view.getAlpha() == 0.0f && view.getVisibility() == 0) {
            return 4;
        }
        return g(view.getVisibility());
    }
    
    public static void i(final int n, final View view) {
        switch (n - 1) {
            default: {
                if (fi.R(2)) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("SpecialEffectsController: Setting view ");
                    sb.append(view);
                    sb.append(" to INVISIBLE");
                    sb.toString();
                }
                view.setVisibility(4);
                return;
            }
            case 2: {
                if (fi.R(2)) {
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("SpecialEffectsController: Setting view ");
                    sb2.append(view);
                    sb2.append(" to GONE");
                    sb2.toString();
                }
                view.setVisibility(8);
                return;
            }
            case 1: {
                if (fi.R(2)) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("SpecialEffectsController: Setting view ");
                    sb3.append(view);
                    sb3.append(" to VISIBLE");
                    sb3.toString();
                }
                view.setVisibility(0);
                return;
            }
            case 0: {
                final ViewGroup viewGroup = (ViewGroup)view.getParent();
                if (viewGroup != null) {
                    if (fi.R(2)) {
                        final StringBuilder sb4 = new StringBuilder();
                        sb4.append("SpecialEffectsController: Removing view ");
                        sb4.append(view);
                        sb4.append(" from container ");
                        sb4.append(viewGroup);
                        sb4.toString();
                    }
                    viewGroup.removeView(view);
                }
            }
        }
    }
}
