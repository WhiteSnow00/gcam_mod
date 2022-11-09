import java.io.FileDescriptor;
import java.io.RandomAccessFile;
import java.io.FileOutputStream;

// 
// Decompiled by Procyon v0.6.0
// 

final class lmj extends FileOutputStream
{
    final /* synthetic */ RandomAccessFile a;
    
    public lmj(final FileDescriptor fileDescriptor, final RandomAccessFile a) {
        this.a = a;
        super(fileDescriptor);
    }
    
    @Override
    public final void close() {
        super.close();
        this.a.close();
    }
}
