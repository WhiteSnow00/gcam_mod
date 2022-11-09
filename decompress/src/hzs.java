import java.util.List;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.stats.timing.CameraActivityTiming;
import java.util.Iterator;
import android.os.Bundle;
import java.io.IOException;
import java.io.Writer;
import java.io.BufferedWriter;
import java.io.FileWriter;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;
import android.content.Intent;
import com.google.android.apps.camera.stats.Instrumentation;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hzs implements hzr
{
    private final File b;
    private final Instrumentation c;
    
    public hzs(final Instrumentation c) {
        this.b = new File("/sdcard/camera_test_score/");
        this.c = c;
    }
    
    @Override
    public final void a(Intent intent) {
        final Bundle extras = intent.getExtras();
        if (extras == null) {
            a.l(hzs.a.c(), "Intent needs some extra parameters", '\u0a20');
        }
        final String string = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.SCORE_TYPE");
        if (string == null) {
            a.l(hzr.a.c(), "No score type given", '\u0a1b');
            intent = (Intent)nns.l();
        }
        else {
            try {
                final nnn e = nns.e();
                final Iterator iterator = njk.c(",").d(string).iterator();
                while (iterator.hasNext()) {
                    e.g(hzq.a((String)iterator.next()));
                }
                intent = (Intent)e.f();
            }
            catch (final IllegalArgumentException ex) {
                a.n(hzr.a.c(), "Unknown type:%s", string, '\u0a1a', ex);
                intent = (Intent)nns.l();
            }
        }
        if (!((List)intent).isEmpty()) {
            final String string2 = extras.getString("com.google.android.apps.camera.testing.prod.scoreprint.OUT_FILE_NAME");
            niz niz;
            if (string2 == null) {
                a.l(hzr.a.c(), "No file name given", '\u0a19');
                niz = nii.a;
            }
            else {
                niz = niz.i(string2);
            }
            if (niz.g()) {
                if (!((String)niz.c()).contains(File.separator)) {
                    final File file = new File(this.b, (String)niz.c());
                    Label_0259: {
                        if (!file.exists()) {
                            final Object o = nii.a;
                            break Label_0259;
                        }
                        try {
                            Object o = niz.i(new String(och.s(file)));
                            if (!((niz)o).g()) {
                                o = new JSONObject();
                            }
                            else {
                                try {
                                    o = new JSONObject((String)((niz)o).c());
                                }
                                catch (final JSONException ex2) {
                                    a.n(hzs.a.c(), "Invalid JSON data: %s", ((niz)o).c(), '\u0a1e', (Throwable)ex2);
                                    o = new JSONObject();
                                }
                            }
                            try {
                                final nrw t = ((nns)intent).t();
                                while (t.hasNext()) {
                                    final hzq hzq = t.next();
                                    final String name = hzq.name();
                                    JSONArray jsonArray;
                                    try {
                                        jsonArray = ((JSONObject)o).getJSONArray(name);
                                    }
                                    catch (final JSONException ex3) {
                                        a.n(hzs.a.b(), "The value is not an array: %s", o, '\u0a1d', (Throwable)ex3);
                                        jsonArray = new JSONArray();
                                    }
                                    int n = 0;
                                    switch (hzq.ordinal()) {
                                        default: {
                                            final String value = String.valueOf(hzq);
                                            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 56);
                                            sb.append("Shouldn't be reached: The switch statement should cover ");
                                            sb.append(value);
                                            throw new AssertionError((Object)sb.toString());
                                        }
                                        case 1: {
                                            n = this.b(hvu.p);
                                            break;
                                        }
                                        case 0: {
                                            n = this.b(hvu.m);
                                            break;
                                        }
                                    }
                                    jsonArray.put(n);
                                    ((JSONObject)o).put(name, (Object)jsonArray);
                                }
                                final String string3 = ((JSONObject)o).toString();
                                final File parentFile = file.getParentFile();
                                nov.z(parentFile);
                                parentFile.mkdirs();
                                try {
                                    intent = (Intent)new BufferedWriter(new FileWriter(file));
                                    try {
                                        ((Writer)intent).write(string3);
                                        ((BufferedWriter)intent).newLine();
                                        ((BufferedWriter)intent).close();
                                        return;
                                    }
                                    finally {
                                        try {
                                            ((BufferedWriter)intent).close();
                                        }
                                        finally {
                                            final Throwable t2;
                                            final Throwable t3;
                                            t2.addSuppressed(t3);
                                        }
                                    }
                                }
                                catch (final IOException ex4) {
                                    throw new RuntimeException(ex4);
                                }
                            }
                            catch (final JSONException ex5) {
                                throw new RuntimeException((Throwable)ex5);
                            }
                        }
                        catch (final IOException ex6) {
                            throw new RuntimeException(ex6);
                        }
                    }
                }
            }
            a.k(hzs.a.b(), "Wrong file name: %s", niz, '\u0a1f');
        }
    }
    
    final int b(final hvu hvu) {
        if (!this.c.e(CameraActivityTiming.class)) {
            a.l(hzs.a.c(), "No CameraActivitySession has recorded.", '\u0a1c');
            return 0;
        }
        final CameraActivityTiming cameraActivityTiming = (CameraActivityTiming)this.c.a(CameraActivityTiming.class);
        return (int)TimeUnit.NANOSECONDS.toMillis(cameraActivityTiming.g(hvu) - cameraActivityTiming.l);
    }
}
