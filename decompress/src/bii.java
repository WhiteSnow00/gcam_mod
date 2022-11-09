import java.nio.channels.spi.AbstractInterruptibleChannel;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.nio.channels.FileChannel;
import java.io.RandomAccessFile;
import java.io.File;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.concurrent.atomic.AtomicReference;

// 
// Decompiled by Procyon v0.6.0
// 

public final class bii
{
    private static final AtomicReference b;
    
    static {
        b = new AtomicReference();
    }
    
    public static InputStream a(final ByteBuffer byteBuffer) {
        return new big(byteBuffer);
    }
    
    public static ByteBuffer b(File channel) {
        Object load = null;
        final File file = null;
        RandomAccessFile randomAccessFile2 = null;
        Label_0118: {
            try {
                final long length = channel.length();
                if (length <= 2147483647L) {
                    if (length != 0L) {
                        final RandomAccessFile randomAccessFile = new RandomAccessFile(channel, "r");
                        channel = file;
                        try {
                            final FileChannel fileChannel = (FileChannel)(channel = (File)randomAccessFile.getChannel());
                            load = fileChannel.map(FileChannel.MapMode.READ_ONLY, 0L, length).load();
                            if (fileChannel != null) {
                                try {
                                    fileChannel.close();
                                }
                                catch (final IOException ex) {}
                            }
                            try {
                                randomAccessFile.close();
                            }
                            catch (final IOException ex2) {}
                            return (ByteBuffer)load;
                        }
                        finally {
                            load = channel;
                            break Label_0118;
                        }
                    }
                    throw new IOException("File unsuitable for memory mapping");
                }
                throw new IOException("File too large to map into memory");
            }
            finally {
                randomAccessFile2 = null;
            }
        }
        if (load != null) {
            try {
                ((AbstractInterruptibleChannel)load).close();
            }
            catch (final IOException ex3) {}
        }
        if (randomAccessFile2 != null) {
            try {
                randomAccessFile2.close();
            }
            catch (final IOException ex4) {}
        }
    }
    
    public static ByteBuffer c(final InputStream inputStream) {
        final ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        byte[] array;
        if ((array = bii.b.getAndSet(null)) == null) {
            array = new byte[16384];
        }
        while (true) {
            final int read = inputStream.read(array);
            if (read < 0) {
                break;
            }
            byteArrayOutputStream.write(array, 0, read);
        }
        bii.b.set(array);
        final byte[] byteArray = byteArrayOutputStream.toByteArray();
        return d(ByteBuffer.allocateDirect(byteArray.length).put(byteArray));
    }
    
    public static ByteBuffer d(final ByteBuffer byteBuffer) {
        return (ByteBuffer)byteBuffer.position(0);
    }
    
    public static void e(final ByteBuffer byteBuffer, File channel) {
        d(byteBuffer);
        Object o = null;
        final File file = null;
        try {
            final RandomAccessFile randomAccessFile = new RandomAccessFile(channel, "rw");
            channel = file;
            try {
                o = (channel = (File)randomAccessFile.getChannel());
                ((FileChannel)o).write(byteBuffer);
                channel = (File)o;
                ((FileChannel)o).force(false);
                channel = (File)o;
                ((FileChannel)o).close();
                channel = (File)o;
                randomAccessFile.close();
                if (o != null) {
                    try {
                        ((FileChannel)o).close();
                    }
                    catch (final IOException ex) {}
                }
                try {
                    randomAccessFile.close();
                    return;
                }
                catch (final IOException ex2) {
                    return;
                }
            }
            finally {
                o = channel;
            }
        }
        finally {
            channel = null;
        }
        if (o != null) {
            try {
                ((FileChannel)o).close();
            }
            catch (final IOException ex3) {}
        }
        if (channel != null) {
            try {
                ((RandomAccessFile)channel).close();
            }
            catch (final IOException ex4) {}
        }
    }
}
