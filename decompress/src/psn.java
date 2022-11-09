import android.content.ContentProviderClient;
import android.content.pm.ProviderInfo;
import java.util.Iterator;
import java.util.List;
import android.content.pm.ResolveInfo;
import android.content.Intent;
import java.util.ArrayList;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class psn
{
    public static int c(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static int d(final int n) {
        switch (n) {
            default: {
                return 0;
            }
            case 14: {
                return 15;
            }
            case 13: {
                return 14;
            }
            case 12: {
                return 13;
            }
            case 11: {
                return 12;
            }
            case 10: {
                return 11;
            }
            case 9: {
                return 10;
            }
            case 8: {
                return 9;
            }
            case 7: {
                return 8;
            }
            case 6: {
                return 7;
            }
            case 5: {
                return 6;
            }
            case 4: {
                return 5;
            }
            case 3: {
                return 4;
            }
            case 2: {
                return 3;
            }
            case 1: {
                return 2;
            }
            case 0: {
                return 1;
            }
        }
    }
    
    public static void e(final Throwable t) {
        if (t instanceof VirtualMachineError) {
            throw (VirtualMachineError)t;
        }
        if (t instanceof ThreadDeath) {
            throw (ThreadDeath)t;
        }
        if (!(t instanceof LinkageError)) {
            return;
        }
        throw (LinkageError)t;
    }
    
    public static oxp f() {
        return new oxr(oyw.b);
    }
    
    public static osi g(final Context context) {
        final boolean equals = "com.google.vr.vrcore".equals(context.getPackageName());
        final osj osj = null;
        ArrayList list;
        if (equals) {
            list = new ArrayList();
            list.add("com.google.vr.vrcore.settings");
        }
        else {
            final List queryIntentContentProviders = context.getPackageManager().queryIntentContentProviders(new Intent("android.content.action.VR_SETTINGS_PROVIDER"), 0);
            if (queryIntentContentProviders != null) {
                if (queryIntentContentProviders.isEmpty()) {
                    list = null;
                }
                else {
                    list = new ArrayList();
                    final Iterator iterator = queryIntentContentProviders.iterator();
                    while (iterator.hasNext()) {
                        final ProviderInfo providerInfo = ((ResolveInfo)iterator.next()).providerInfo;
                        final String packageName = providerInfo.packageName;
                        if (packageName != null && packageName.startsWith("com.google.")) {
                            list.add(providerInfo.authority);
                        }
                    }
                }
            }
            else {
                list = null;
            }
        }
        osj osj2 = null;
        Label_0223: {
            if (list != null) {
                for (final String s : list) {
                    final ContentProviderClient acquireContentProviderClient = context.getContentResolver().acquireContentProviderClient(s);
                    if (acquireContentProviderClient != null) {
                        osj2 = new osj(acquireContentProviderClient, s);
                        break Label_0223;
                    }
                }
            }
            osj2 = osj;
        }
        if (osj2 != null) {
            return new ort(osj2.a, osj2.b);
        }
        return new osf(context);
    }
    
    public void b(final org org) {
    }
}
