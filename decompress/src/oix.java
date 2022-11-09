import java.util.Iterator;
import java.util.List;
import com.google.mediapipe.framework.TextureFrame;
import com.google.mediapipe.framework.GraphTextureFrame;
import com.google.mediapipe.framework.PacketGetter;
import android.util.Log;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.PacketCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class oix implements PacketCallback
{
    final /* synthetic */ oiy a;
    
    public oix(final oiy a) {
        this.a = a;
    }
    
    @Override
    public final void process(final Packet packet) {
        monitorenter(this);
        try {
            final oiy a = this.a;
            if (a.f > 0) {
                final Long n = a.e.poll();
                if (n == null || n != packet.a()) {
                    Log.w("FrameProcessor", String.format("WARNING: output timestamp was %d, but expected %d. if output frames are skipped, in-flight accounting will break", packet.a(), n));
                }
            }
            final List a2 = this.a.a;
            monitorexit(this);
            final Iterator iterator = a2.iterator();
            while (iterator.hasNext()) {
                ((oiz)iterator.next()).a(new GraphTextureFrame(PacketGetter.nativeGetGpuBuffer(packet.getNativeHandle()), packet.a()));
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
}
