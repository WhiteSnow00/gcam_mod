import android.os.StrictMode$ThreadPolicy;
import java.io.IOException;
import java.util.Map;
import android.net.Uri;
import java.util.HashMap;
import java.io.Reader;
import java.io.BufferedReader;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.FileInputStream;
import android.util.Log;
import java.io.File;
import android.os.StrictMode;
import android.os.Build;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public class mnu
{
    private static String a(final String s) {
        return new String(s);
    }
    
    public static niz b(Context context) {
        final String type = Build.TYPE;
        final String tags = Build.TAGS;
        if ((!type.equals("eng") && !type.equals("userdebug")) || (!tags.contains("dev-keys") && !tags.contains("test-keys"))) {
            return nii.a;
        }
        context = loq.a(context);
        final StrictMode$ThreadPolicy allowThreadDiskReads = StrictMode.allowThreadDiskReads();
        try {
            StrictMode.allowThreadDiskWrites();
            niz niz;
            try {
                final File file = new File(context.getDir("phenotype_hermetic", 0), "overrides.txt");
                if (file.exists()) {
                    niz = niz.i(file);
                }
                else {
                    niz = nii.a;
                }
            }
            catch (final RuntimeException ex) {
                Log.e("HermeticFileOverrides", "no data dir", (Throwable)ex);
                niz = nii.a;
            }
            if (niz.g()) {
                final File file2 = (File)niz.c();
                try {
                    final BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(new FileInputStream(file2)));
                    try {
                        final HashMap hashMap = new HashMap();
                        final HashMap hashMap2 = new HashMap();
                        while (true) {
                            final String line = bufferedReader.readLine();
                            if (line == null) {
                                break;
                            }
                            final String[] split = line.split(" ", 3);
                            if (split.length != 3) {
                                String concat;
                                if (line.length() != 0) {
                                    concat = "Invalid: ".concat(line);
                                }
                                else {
                                    concat = new String("Invalid: ");
                                }
                                Log.e("HermeticFileOverrides", concat);
                            }
                            else {
                                final String a = a(split[0]);
                                final String decode = Uri.decode(a(split[1]));
                                String decode2;
                                if ((decode2 = (String)hashMap2.get(split[2])) == null) {
                                    final String a2 = a(split[2]);
                                    decode2 = Uri.decode(a2);
                                    if (decode2.length() < 1024 || decode2 == a2) {
                                        hashMap2.put(a2, decode2);
                                    }
                                }
                                if (!hashMap.containsKey(a)) {
                                    hashMap.put(a, new HashMap());
                                }
                                ((Map<String, String>)hashMap.get(a)).put(decode, decode2);
                            }
                        }
                        String.valueOf(String.valueOf(file2)).length();
                        final mnt mnt = new mnt(hashMap);
                        bufferedReader.close();
                        niz.i(mnt);
                    }
                    finally {
                        try {
                            bufferedReader.close();
                        }
                        finally {
                            final Throwable t;
                            ((Throwable)context).addSuppressed(t);
                        }
                    }
                }
                catch (final IOException ex2) {
                    throw new RuntimeException(ex2);
                }
            }
            context = (Context)nii.a;
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            return (niz)context;
        }
        finally {
            StrictMode.setThreadPolicy(allowThreadDiskReads);
            while (true) {}
        }
    }
}
