import java.util.Arrays;
import com.google.mediapipe.framework.Packet;
import com.google.mediapipe.framework.TextureReleaseCallback;
import com.google.mediapipe.framework.TextureFrame;
import java.io.InputStream;
import android.content.res.AssetManager;
import com.google.mediapipe.framework.MediaPipeException;
import android.util.Log;
import java.io.IOException;
import com.google.mediapipe.framework.PacketCallback;
import com.google.common.io.ByteStreams;
import java.io.File;
import java.util.ArrayDeque;
import java.util.ArrayList;
import android.content.Context;
import java.util.Queue;
import java.util.concurrent.atomic.AtomicBoolean;
import com.google.mediapipe.framework.AndroidPacketCreator;
import com.google.mediapipe.framework.Graph;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class oiy implements oiz
{
    public List a;
    public Graph b;
    public AndroidPacketCreator c;
    public final AtomicBoolean d;
    public final Queue e;
    public int f;
    private String g;
    private String h;
    
    public oiy(final Context context, final long n, final String s) {
        this.a = new ArrayList();
        new ArrayList();
        this.d = new AtomicBoolean(false);
        this.e = new ArrayDeque();
        this.f = 2;
        try {
            this.b = new Graph();
            Label_0135: {
                if (new File(s).isAbsolute()) {
                    this.b.e(s);
                    break Label_0135;
                }
                final Graph b = this.b;
                final AssetManager assets = context.getAssets();
                try {
                    final InputStream open = assets.open(s);
                    final byte[] byteArray = ByteStreams.toByteArray(open);
                    open.close();
                    b.f(byteArray);
                    this.c = new AndroidPacketCreator(this.b);
                    this.g = "input_video";
                    this.h = "output_video";
                    this.b.g(n);
                    final String h = this.h;
                    if (h != null) {
                        this.b.c(h, new oix(this));
                        this.b.k(this.h);
                    }
                }
                catch (final IOException ex) {
                    throw new RuntimeException(ex);
                }
            }
        }
        catch (final MediaPipeException ex2) {
            Log.e("FrameProcessor", "MediaPipe error: ", (Throwable)ex2);
        }
    }
    
    private final void d() {
        this.b.h();
    }
    
    @Override
    public final void a(TextureFrame ex) {
        final long timestamp = ((TextureFrame)ex).getTimestamp();
        MediaPipeException ex2 = null;
        Object o = null;
        Object o2 = null;
        Object o3 = null;
        Label_0292: {
            try {
                final long timestamp2 = ((TextureFrame)ex).getTimestamp();
                if (!this.d.getAndSet(true)) {
                    this.d();
                }
                synchronized (this) {
                    if (this.f > 0) {
                        if (this.e.size() >= this.f) {
                            String.format("%d frames already in flight and max is %d; dropping new frame ts %d", this.e.size(), this.f, timestamp2);
                            monitorexit(this);
                            if (ex != null) {
                                ((TextureFrame)ex).release();
                            }
                            return;
                        }
                        this.e.add(timestamp2);
                    }
                    monitorexit(this);
                    final AndroidPacketCreator c = this.c;
                    final Packet create = Packet.create(c.nativeCreateGpuBuffer(c.a.a(), ((TextureFrame)ex).getTextureName(), ((TextureFrame)ex).getWidth(), ((TextureFrame)ex).getHeight(), (TextureReleaseCallback)ex));
                    try {
                        try {
                            this.b.b(this.g, create, timestamp);
                        }
                        catch (final RuntimeException o) {}
                    }
                    catch (MediaPipeException ex) {
                        Log.e("FrameProcessor", "Mediapipe error: ", (Throwable)ex);
                        ex = (MediaPipeException)create;
                    }
                    if (ex != null) {
                        ((Packet)ex).release();
                    }
                    return;
                    o = create;
                    ex2 = null;
                    ex = (MediaPipeException)create;
                }
            }
            catch (final RuntimeException o) {
                o2 = ex;
                ex = ex2;
            }
            finally {
                o3 = ex;
                break Label_0292;
            }
            try {
                throw o;
            }
            finally {
                o3 = o2;
                o = ex;
                final Throwable t;
                o2 = t;
            }
        }
        if (o != null) {
            ((Packet)o).release();
        }
        if (o3 != null) {
            ((TextureFrame)o3).release();
        }
        throw o2;
    }
    
    public final void b() {
        if (!this.d.getAndSet(true)) {
            this.d();
        }
    }
    
    public final void c(final oiz oiz) {
        synchronized (this) {
            this.a = Arrays.asList(oiz);
        }
    }
}
