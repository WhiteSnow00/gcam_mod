import android.net.Uri;
import android.media.MediaMetadataRetriever;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dab
{
    private final fbm a;
    
    public dab(final fbm a) {
        this.a = a;
    }
    
    public final boolean a(Context context, final bqr bqr) {
        final fbk fbk = new fbk();
        final boolean equals = bqr.b().equals(bqt.b);
        boolean b = true;
        Label_0434: {
            if (equals) {
                final fbq a = fbr.a(context, bqr.a().c());
                if (a == fbr.a) {
                    bqr.a().c();
                    b = false;
                }
                else {
                    fbk.e = true;
                    fbk.f = a.b;
                    fbk.g = a.a;
                    fbk.h = a.c;
                }
            }
            else if (bqr.b().equals(bqt.c)) {
                final fbm a2 = this.a;
                final Uri c = bqr.a().c();
                context = (Context)new MediaMetadataRetriever();
                try {
                    try {
                        ((MediaMetadataRetriever)context).setDataSource(a2.b, c);
                        final String metadata = ((MediaMetadataRetriever)context).extractMetadata(24);
                        final String metadata2 = ((MediaMetadataRetriever)context).extractMetadata(18);
                        final String metadata3 = ((MediaMetadataRetriever)context).extractMetadata(19);
                        final String metadata4 = ((MediaMetadataRetriever)context).extractMetadata(25);
                        if (metadata2 != null && metadata3 != null) {
                            fbk.b = Integer.parseInt(metadata2);
                            fbk.c = Integer.parseInt(metadata3);
                        }
                        else {
                            fbm.a.c().E(1511).r("Size metadata does not exist for the video at %s", c);
                        }
                        if (metadata != null) {
                            fbk.a = metadata;
                        }
                        else {
                            fbm.a.c().E(1512).r("Orientation metadata does not exist for the video at %s", c);
                        }
                        if (metadata4 != null) {
                            fbk.d = (int)Double.parseDouble(metadata4);
                        }
                        else {
                            fbm.a.c().E(1513).r("Framerate metadata does not exist for the video at %s", c);
                        }
                        if (metadata2 != null && metadata3 != null && metadata != null) {
                            ((MediaMetadataRetriever)context).release();
                            ((MediaMetadataRetriever)context).close();
                            break Label_0434;
                        }
                    }
                    finally {}
                }
                catch (final RuntimeException ex) {
                    fbm.a.b().h(ex).E(1514).o("VideoRotationMetadataLoader.loadRotationMetadata() failed!");
                }
                ((MediaMetadataRetriever)context).release();
                ((MediaMetadataRetriever)context).close();
                b = false;
                break Label_0434;
                ((MediaMetadataRetriever)context).release();
                ((MediaMetadataRetriever)context).close();
            }
            else {
                b = false;
            }
        }
        bqr.g(fbk.a());
        return b;
    }
}
