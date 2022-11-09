import android.os.ParcelFileDescriptor;
import android.content.pm.ProviderInfo;
import android.content.ContentResolver;
import java.io.IOException;
import android.os.Environment;
import android.system.OsConstants;
import java.util.concurrent.Callable;
import android.system.StructStat;
import java.io.File;
import android.os.Process;
import java.io.FileNotFoundException;
import android.content.res.AssetFileDescriptor;
import android.net.Uri;
import android.content.Context;
import android.os.Build;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mrb
{
    private static final String[] a;
    private static final String[] b;
    private static final String[] c;
    
    static {
        a = new String[] { "com.android.", "com.google.", "com.chrome.", "com.nest.", "com.waymo.", "com.waze" };
        String s;
        if (!Build.HARDWARE.equals("goldfish") && !Build.HARDWARE.equals("ranchu")) {
            s = "";
        }
        else {
            s = "androidx.test.services.storage.runfiles";
        }
        b = new String[] { "media", s };
        c = new String[] { "", "", "com.google.android.apps.docs.storage.legacy" };
    }
    
    public static AssetFileDescriptor a(final Context context, final Uri uri, final String s) {
        return b(context, uri, s, mra.a);
    }
    
    public static AssetFileDescriptor b(final Context context, Uri openAssetFileDescriptor, String canonicalPath, final mra mra) {
        final ContentResolver contentResolver = context.getContentResolver();
        final Uri parse = Uri.parse(openAssetFileDescriptor.toString());
        final String scheme = parse.getScheme();
        if ("android.resource".equals(scheme)) {
            return contentResolver.openAssetFileDescriptor(parse, canonicalPath);
        }
        if ("content".equals(scheme)) {
            int n = 0;
            Label_0185: {
                switch (canonicalPath.hashCode()) {
                    case 113359: {
                        if (canonicalPath.equals("rwt")) {
                            n = 4;
                            break Label_0185;
                        }
                        break;
                    }
                    case 3805: {
                        if (canonicalPath.equals("wt")) {
                            n = 2;
                            break Label_0185;
                        }
                        break;
                    }
                    case 3653: {
                        if (canonicalPath.equals("rw")) {
                            n = 3;
                            break Label_0185;
                        }
                        break;
                    }
                    case 119: {
                        if (canonicalPath.equals("w")) {
                            n = 1;
                            break Label_0185;
                        }
                        break;
                    }
                    case 114: {
                        if (canonicalPath.equals("r")) {
                            n = 0;
                            break Label_0185;
                        }
                        break;
                    }
                }
                n = -1;
            }
            int n2 = 0;
            switch (n) {
                default: {
                    throw new IllegalArgumentException();
                }
                case 1:
                case 2:
                case 3:
                case 4: {
                    n2 = 2;
                    break;
                }
                case 0: {
                    n2 = 1;
                    break;
                }
            }
            final String authority = parse.getAuthority();
            final ProviderInfo resolveContentProvider = context.getPackageManager().resolveContentProvider(authority, 0);
            String substring = authority;
            ProviderInfo resolveContentProvider2 = resolveContentProvider;
            Label_0712: {
                if (resolveContentProvider == null) {
                    final int lastIndex = authority.lastIndexOf(64);
                    if (lastIndex >= 0) {
                        substring = authority.substring(lastIndex + 1);
                        resolveContentProvider2 = context.getPackageManager().resolveContentProvider(substring, 0);
                    }
                    else {
                        resolveContentProvider2 = resolveContentProvider;
                        substring = authority;
                    }
                    if (resolveContentProvider2 == null) {
                        final mra a = mra.a;
                        if (!mra.b) {
                            break Label_0712;
                        }
                        throw new FileNotFoundException("Can't open content uri.");
                    }
                }
                final mra a2 = mra.a;
                final nns d = mra.d;
                final int c = ((nql)d).c;
                int i = 0;
                while (true) {
                    while (i < c) {
                        final mre mre = d.get(i);
                        final boolean b = mra.b;
                        int n3 = 0;
                        Label_0445: {
                            if (context.getPackageName().equals(resolveContentProvider2.packageName)) {
                                if (b) {
                                    n3 = 1;
                                    break Label_0445;
                                }
                            }
                            else if (!b) {
                                if (mre.a.equals(resolveContentProvider2.packageName)) {
                                    n3 = 1;
                                    break Label_0445;
                                }
                                n3 = 3;
                                break Label_0445;
                            }
                            n3 = 2;
                        }
                        ++i;
                        int n4 = 0;
                        switch (n3 - 1) {
                            default: {
                                continue;
                            }
                            case 1: {
                                n4 = 2;
                                break;
                            }
                            case 0: {
                                n4 = 1;
                                break;
                            }
                        }
                        switch (n4 - 1) {
                            default: {
                                if (context.getPackageName().equals(resolveContentProvider2.packageName)) {
                                    if (mra.b) {
                                        break Label_0712;
                                    }
                                    throw new FileNotFoundException("Can't open content uri.");
                                }
                                else {
                                    if (mra.b) {
                                        throw new FileNotFoundException("Can't open content uri.");
                                    }
                                    if (context.checkUriPermission(parse, Process.myPid(), Process.myUid(), n2) != 0 && resolveContentProvider2.exported) {
                                        final String[] b2 = mrb.b;
                                        final int length = b2.length;
                                        for (int j = 0; j < 2; ++j) {
                                            if (b2[j].equals(substring)) {
                                                break Label_0712;
                                            }
                                        }
                                        final String[] c2 = mrb.c;
                                        final int length2 = c2.length;
                                        for (int k = 0; k < 3; ++k) {
                                            if (c2[k].equals(substring)) {
                                                break Label_0712;
                                            }
                                        }
                                        final String[] a3 = mrb.a;
                                        for (int l = 0; l < 6; ++l) {
                                            final String s = a3[l];
                                            if (s.charAt(s.length() - 1) == '.') {
                                                if (resolveContentProvider2.packageName.startsWith(s)) {
                                                    throw new FileNotFoundException("Can't open content uri.");
                                                }
                                            }
                                            else if (resolveContentProvider2.packageName.equals(s)) {
                                                throw new FileNotFoundException("Can't open content uri.");
                                            }
                                        }
                                    }
                                    break Label_0712;
                                }
                                break;
                            }
                            case 0: {
                                break Label_0712;
                            }
                            case 1: {
                                throw new FileNotFoundException("Can't open content uri.");
                            }
                        }
                    }
                    int n4 = 3;
                    continue;
                }
            }
            final AssetFileDescriptor openAssetFileDescriptor2 = contentResolver.openAssetFileDescriptor(parse, canonicalPath);
            f(openAssetFileDescriptor2);
            return openAssetFileDescriptor2;
        }
        if ("file".equals(scheme)) {
            openAssetFileDescriptor = (Uri)contentResolver.openAssetFileDescriptor(parse, canonicalPath);
            f(openAssetFileDescriptor);
            try {
                final ParcelFileDescriptor parcelFileDescriptor = ((AssetFileDescriptor)openAssetFileDescriptor).getParcelFileDescriptor();
                canonicalPath = new File(parse.getPath()).getCanonicalPath();
                final StructStat structStat = (StructStat)mty.c(new mrc(parcelFileDescriptor.getFileDescriptor()));
                final long st_dev = structStat.st_dev;
                final long st_ino = structStat.st_ino;
                OsConstants.S_ISLNK(structStat.st_mode);
                final StructStat structStat2 = (StructStat)mty.c(new mrd(canonicalPath));
                final long st_dev2 = structStat2.st_dev;
                final long st_ino2 = structStat2.st_ino;
                if (OsConstants.S_ISLNK(structStat2.st_mode)) {
                    final String value = String.valueOf(canonicalPath);
                    String concat;
                    if (value.length() != 0) {
                        concat = "Can't open file: ".concat(value);
                    }
                    else {
                        concat = new String("Can't open file: ");
                    }
                    throw new FileNotFoundException(concat);
                }
                if (st_dev == st_dev2 && st_ino == st_ino2) {
                    if (!canonicalPath.startsWith("/proc/")) {
                        if (!canonicalPath.startsWith("/data/misc/")) {
                            final mra a4 = mra.a;
                            if (!mra.c) {
                                final File m = aaj.k(context);
                                boolean b3 = false;
                                Label_1209: {
                                    if (m != null) {
                                        if (canonicalPath.startsWith(c(m))) {
                                            b3 = true;
                                            break Label_1209;
                                        }
                                    }
                                    else if (canonicalPath.startsWith(c(Environment.getDataDirectory()))) {
                                        b3 = true;
                                        break Label_1209;
                                    }
                                    final Context j2 = aaj.j(context);
                                    if (j2 != null) {
                                        final File k2 = aaj.k(j2);
                                        if (k2 != null && canonicalPath.startsWith(c(k2))) {
                                            b3 = true;
                                            break Label_1209;
                                        }
                                    }
                                    for (final File file : e(new mqy(context))) {
                                        if (file != null && canonicalPath.startsWith(c(file))) {
                                            b3 = true;
                                            break Label_1209;
                                        }
                                    }
                                    for (final File file2 : e(new mqy(context, 2))) {
                                        if (file2 != null && canonicalPath.startsWith(c(file2))) {
                                            b3 = true;
                                            break Label_1209;
                                        }
                                    }
                                    b3 = false;
                                }
                                if (b3 == mra.b) {
                                    return (AssetFileDescriptor)openAssetFileDescriptor;
                                }
                            }
                        }
                    }
                    final String value2 = String.valueOf(canonicalPath);
                    String concat2;
                    if (value2.length() != 0) {
                        concat2 = "Can't open file: ".concat(value2);
                    }
                    else {
                        concat2 = new String("Can't open file: ");
                    }
                    throw new FileNotFoundException(concat2);
                }
                final String value3 = String.valueOf(canonicalPath);
                String concat3;
                if (value3.length() != 0) {
                    concat3 = "Can't open file: ".concat(value3);
                }
                else {
                    concat3 = new String("Can't open file: ");
                }
                throw new FileNotFoundException(concat3);
            }
            catch (final IOException ex) {
                final FileNotFoundException ex2 = new FileNotFoundException("Validation failed.");
                ex2.initCause(ex);
                d((AssetFileDescriptor)openAssetFileDescriptor, ex2);
                throw ex2;
            }
            catch (final FileNotFoundException ex3) {
                d((AssetFileDescriptor)openAssetFileDescriptor, ex3);
                throw ex3;
            }
        }
        throw new FileNotFoundException("Not implemented. Contact tiktok-users@");
    }
    
    private static String c(final File file) {
        String s2;
        final String s = s2 = file.getCanonicalPath();
        if (!s.endsWith("/")) {
            s2 = String.valueOf(s).concat("/");
        }
        return s2;
    }
    
    private static void d(final AssetFileDescriptor assetFileDescriptor, final FileNotFoundException ex) {
        try {
            assetFileDescriptor.close();
        }
        catch (final IOException ex2) {
            ex.addSuppressed(ex2);
        }
    }
    
    private static File[] e(final Callable callable) {
        try {
            return callable.call();
        }
        catch (final Exception ex) {
            throw new RuntimeException(ex);
        }
        catch (final NullPointerException ex2) {
            throw ex2;
        }
    }
    
    private static void f(final Object o) {
        if (o != null) {
            return;
        }
        throw new FileNotFoundException("Content resolver returned null value.");
    }
}
