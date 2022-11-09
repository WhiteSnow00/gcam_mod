import android.content.ContentValues;
import android.database.Cursor;
import android.net.Uri;
import java.io.IOException;
import java.io.File;
import android.provider.MediaStore$Files;
import java.util.concurrent.ExecutionException;

// 
// Decompiled by Procyon v0.6.0
// 

public final class drt implements drs
{
    private final dro a;
    private final dru b;
    
    public drt(final dro a, final dru b) {
        this.a = a;
        this.b = b;
    }
    
    @Override
    public final niz a(final long n) {
        final dro a = this.a;
        final oey h = odg.h(a.b, new drm(n), a.d);
        niz a2 = null;
        Label_0047: {
            try {
                a2 = h.get();
                break Label_0047;
            }
            catch (final ExecutionException ex) {}
            catch (final InterruptedException ex2) {}
            a2 = nii.a;
        }
        if (!a2.g()) {
            Object o = this.b;
            ((dru)o).c.f("SpecialType");
            try {
                final Uri build = MediaStore$Files.getContentUri("external").buildUpon().appendPath(Long.toString(n)).build();
                build.getClass();
                final Cursor query = ((dru)o).b.query(build, new String[] { "_data" }, (String)null, (String[])null, (String)null);
                niz niz;
                if (query != null && query.moveToFirst()) {
                    String string;
                    try {
                        string = query.getString(0);
                    }
                    catch (final Exception ex3) {
                        a.n(dru.a.b(), "Fail to find the file path for the uri %s", build, '\u0382', ex3);
                        string = null;
                    }
                    query.close();
                    if (string == null) {
                        niz = nii.a;
                    }
                    else if (new File(string).exists()) {
                        niz = niz.i(string);
                    }
                    else {
                        niz = nii.a;
                    }
                }
                else {
                    niz = nii.a;
                }
                Label_0381: {
                    if (!niz.g()) {
                        dru.a.c().E(897).q("No metadata for %d", n);
                        final niz niz2 = nii.a;
                        o = ((dru)o).c;
                    }
                    else {
                        final String s = (String)niz.c();
                        final String lowerCase = s.toLowerCase();
                        if (lowerCase.endsWith("jpg") || lowerCase.endsWith("jpeg")) {
                            break Label_0381;
                        }
                        if (lowerCase.endsWith("dng")) {
                            break Label_0381;
                        }
                        dru.a.c().E(896).r("Ignoring metadata for file which is not an image %s", s);
                        final niz niz2 = nii.a;
                        o = ((dru)o).c;
                    }
                    while (true) {
                        ((kse)o).g();
                        Label_0538: {
                            break Label_0538;
                            try {
                                final String s;
                                final String canonicalPath = new File(s).getCanonicalPath();
                                canonicalPath.getClass();
                                if (!canonicalPath.startsWith(((dru)o).e.b()) && !s.startsWith(((dru)o).f.b())) {
                                    dru.a.c().E(895).r("Ignoring metadata for image that is not in supported location: %s", s);
                                    final niz niz2 = nii.a;
                                    o = ((dru)o).c;
                                    continue;
                                }
                                if (s.toLowerCase().endsWith("dng")) {
                                    final niz niz2 = nii.a;
                                    o = ((dru)o).c;
                                    continue;
                                }
                                final boolean a3 = ((dru)o).d.a;
                                final niz niz2 = drk.b(lmx.f(lmx.l(s)));
                                o = ((dru)o).c;
                                continue;
                                iftrue(Label_0560:)(!niz2.g());
                                this.b(n, (drk)niz2.c());
                                Label_0560:;
                            }
                            catch (final IOException ex4) {
                                throw new IllegalStateException("Fails to obtain canonical path", ex4);
                            }
                        }
                        break;
                    }
                }
            }
            finally {
                ((dru)o).c.g();
            }
        }
        if (a2.g()) {
            a2.c();
        }
        return a2;
    }
    
    @Override
    public final void b(final long n, final drk drk) {
        final dro a = this.a;
        final ContentValues contentValues = new ContentValues();
        contentValues.put("media_store_id", Long.valueOf(n));
        contentValues.put("special_type_id", drk.c());
        odg.h(a.c, new drn(contentValues), a.d);
    }
}
