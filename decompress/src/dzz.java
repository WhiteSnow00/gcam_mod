import java.io.InputStream;
import java.io.FileOutputStream;
import android.content.Context;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dzz
{
    private final krr a;
    private final Context b;
    private final pii c;
    private final kse d;
    
    public dzz(final krr krr, final kse d, final pii c, final Context b) {
        this.a = krr.a("HexagonEnv");
        this.c = c;
        this.b = b;
        this.d = d;
    }
    
    public final void a() {
        try {
            try {
                this.a.f("Loading libhalide_hexagon_host.so.");
                System.loadLibrary("halide_hexagon_host");
                final String a = ((eac)this.c).a().a;
                this.d.f("HexagonEnvironment#copyHexagonRemoteToDisk");
                final String concat = String.valueOf(a).concat("/libhalide_hexagon_remote_skel.so");
                final krr a2 = this.a;
                final String value = String.valueOf(concat);
                String concat2;
                if (value.length() != 0) {
                    concat2 = "Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to ".concat(value);
                }
                else {
                    concat2 = new String("Writing libhalide_hexagon_remote_skel_signed_by_testsig.so to ");
                }
                a2.f(concat2);
                final InputStream openRawResource = this.b.getResources().openRawResource(2131886094);
                final FileOutputStream fileOutputStream = new FileOutputStream(concat);
                final byte[] array = new byte[1024];
                while (true) {
                    final int read = openRawResource.read(array);
                    if (read == -1) {
                        break;
                    }
                    fileOutputStream.write(array, 0, read);
                }
                fileOutputStream.flush();
                openRawResource.close();
                fileOutputStream.close();
                this.d.g();
                return;
            }
            catch (final Exception ex) {}
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            this.a.i("Failed to load Hexagon library", unsatisfiedLinkError);
            return;
        }
        final Exception ex;
        this.a.i("Error initializing Hexagon", ex);
    }
}
