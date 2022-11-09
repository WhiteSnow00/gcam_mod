import java.io.FileInputStream;
import java.io.IOException;
import android.media.MediaExtractor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fei
{
    private static final nsd a;
    private final fez b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/microvideo/SafeMp4FixApplier");
    }
    
    public fei(final fez b) {
        this.b = b;
    }
    
    public final void a(final lkb luk) {
        if (this.b != fez.a) {
            return;
        }
        try {
            final feg feg = new feg((lkb)luk);
            Object o = new MediaExtractor();
            try {
                Object a = feg.a();
                try {
                    ((MediaExtractor)o).setDataSource(((FileInputStream)a).getFD());
                    final int trackCount = ((MediaExtractor)o).getTrackCount();
                    int i = 0;
                    int n = 0;
                    while (i < trackCount) {
                        final String string = ((MediaExtractor)o).getTrackFormat(i).getString("mime");
                        int n2 = n;
                        niz niz = null;
                        Label_0142: {
                            if (lsp.h(string)) {
                                n2 = ++n;
                                if (n == 2) {
                                    niz = niz.i(i + 1);
                                    ((FileInputStream)a).close();
                                    break Label_0142;
                                }
                            }
                            if (!string.equals("application/motionphoto-highres")) {
                                ++i;
                                n = n2;
                                continue;
                            }
                            niz = niz.i(i + 1);
                            ((FileInputStream)a).close();
                        }
                        ((MediaExtractor)o).release();
                        if (!niz.g()) {
                            return;
                        }
                        niz.c();
                        a = new feg((lkb)luk);
                        o = new feh((lkb)luk);
                        lso.a((feg)a, (feh)o, ((lkb)luk).a(), (int)niz.c());
                        return;
                    }
                    niz niz = nii.a;
                    ((FileInputStream)a).close();
                }
                finally {
                    try {
                        ((FileInputStream)a).close();
                    }
                    finally {
                        final Throwable t;
                        luk.addSuppressed(t);
                    }
                }
            }
            finally {
                ((MediaExtractor)o).release();
            }
        }
        catch (final luk luk) {}
        catch (final IOException ex) {}
        a.m(fei.a.b(), "Couldn't apply MP4 fix", '\u0625', luk);
    }
}
