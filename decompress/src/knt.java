import java.io.IOException;
import android.media.MediaMuxer;
import java.io.FileOutputStream;
import java.io.FileDescriptor;

// 
// Decompiled by Procyon v0.6.0
// 

public final class knt implements kny
{
    private final /* synthetic */ int a;
    
    public knt() {
    }
    
    public knt(final int a) {
        this.a = a;
    }
    
    @Override
    public final ljy a(final FileDescriptor fileDescriptor, final int n) {
        switch (this.a) {
            default: {
                final FileOutputStream fileOutputStream = new FileOutputStream(fileDescriptor);
                final ltn a = lto.a();
                a.c = 1;
                return new lsz(new ltq(fileOutputStream, a.a()), mcn.h("gca-muxer"));
            }
            case 0: {
                String.valueOf(String.valueOf(fileDescriptor)).length();
                try {
                    return new lez(new MediaMuxer(fileDescriptor, n));
                }
                catch (final IOException ex) {
                    throw new knx("file descriptor", n, ex);
                }
                break;
            }
        }
    }
}
