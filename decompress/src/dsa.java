import java.io.IOException;
import java.io.DataOutputStream;
import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.io.OutputStream;
import android.graphics.Bitmap$CompressFormat;
import java.io.ByteArrayOutputStream;
import android.graphics.Bitmap;

// 
// Decompiled by Procyon v0.6.0
// 

public final class dsa implements drw
{
    private final /* synthetic */ int a;
    
    public dsa() {
    }
    
    public dsa(final int a) {
        this.a = a;
    }
    
    @Override
    public final ByteArrayOutputStream a(final Bitmap bitmap) {
        switch (this.a) {
            default: {
                final ByteArrayOutputStream d = dna.d();
                bitmap.compress(Bitmap$CompressFormat.JPEG, 90, (OutputStream)d);
                return d;
            }
            case 0: {
                final ByteArrayOutputStream d2 = dna.d();
                final ByteBuffer allocate = ByteBuffer.allocate(bitmap.getRowBytes() * bitmap.getHeight());
                bitmap.copyPixelsToBuffer((Buffer)allocate);
                final byte[] array = allocate.array();
                final DataOutputStream dataOutputStream = new DataOutputStream(d2);
                try {
                    try {
                        dataOutputStream.writeInt(array.length);
                        dataOutputStream.writeInt(bitmap.getWidth());
                        dataOutputStream.writeInt(bitmap.getHeight());
                        dataOutputStream.writeUTF(bitmap.getConfig().toString());
                        dataOutputStream.write(array);
                        dataOutputStream.close();
                        return d2;
                    }
                    finally {}
                }
                catch (final IOException ex) {
                    throw new IOException("Could not write into ByteArrayOutputStream", ex);
                }
                dataOutputStream.close();
                break;
            }
        }
    }
}
