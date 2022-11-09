import java.io.IOException;
import java.io.InputStream;
import com.google.common.io.ByteStreams;
import java.io.FileInputStream;
import java.io.File;

// 
// Decompiled by Procyon v0.6.0
// 

public final class nxd extends ofi
{
    private final File a;
    
    public nxd(final File a) {
        a.getClass();
        this.a = a;
    }
    
    @Override
    public final byte[] a() {
        final nxb nxb = new nxb(nxb.a);
        try {
            final FileInputStream fileInputStream = new FileInputStream(this.a);
            nxb.c.addFirst(fileInputStream);
            final byte[] byteArray = ByteStreams.toByteArray(fileInputStream, fileInputStream.getChannel().size());
            nxb.close();
            return byteArray;
        }
        finally {
            try {
                final Throwable d;
                njt.c(nxb.d = d, IOException.class);
                throw new RuntimeException(d);
            }
            finally {
                nxb.close();
            }
        }
    }
    
    @Override
    public final String toString() {
        final String value = String.valueOf(this.a);
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 20);
        sb.append("Files.asByteSource(");
        sb.append(value);
        sb.append(")");
        return sb.toString();
    }
}
