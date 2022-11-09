import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.ByteBuffer;

// 
// Decompiled by Procyon v0.6.0
// 

final class bax implements bav
{
    private final /* synthetic */ int a;
    
    public bax() {
    }
    
    public bax(final int a) {
        this.a = a;
    }
    
    @Override
    public final Class a() {
        switch (this.a) {
            default: {
                return ByteBuffer.class;
            }
            case 0: {
                return InputStream.class;
            }
        }
    }
}
