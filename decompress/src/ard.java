import android.hardware.camera2.CameraAccessException;
import java.util.Collection;
import java.util.HashSet;
import java.util.Arrays;
import java.util.ArrayList;
import android.os.Handler;
import android.content.Context;
import android.os.HandlerThread;
import java.util.List;
import android.media.MediaActionSound;
import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

final class ard extends atd
{
    public static final aub a;
    public final arb b;
    public final atv c;
    public final atx d;
    public final CameraManager e;
    public final MediaActionSound f;
    public att g;
    public final List h;
    private final HandlerThread j;
    private int k;
    
    static {
        a = new aub("AndCam2AgntImp");
    }
    
    public ard(final Context context) {
        final HandlerThread j = new HandlerThread("Camera2 Handler Thread");
        (this.j = j).start();
        final arb b = new arb(this, j.getLooper());
        this.b = b;
        this.g = new att(b);
        this.c = new atv();
        (this.d = new atx(b, j)).start();
        this.e = (CameraManager)context.getSystemService("camera");
        (this.f = new MediaActionSound()).load(0);
        this.k = 0;
        this.h = new ArrayList();
        this.h();
    }
    
    private final void h() {
        try {
            final String[] cameraIdList = this.e.getCameraIdList();
            final HashSet set = new HashSet(Arrays.asList(cameraIdList));
            final int n = 0;
            for (int i = 0; i < this.h.size(); ++i) {
                if (!set.contains(this.h.get(i))) {
                    this.h.set(i, null);
                    --this.k;
                }
            }
            set.removeAll(this.h);
            for (int length = cameraIdList.length, j = n; j < length; ++j) {
                final String s = cameraIdList[j];
                if (set.contains(s)) {
                    this.h.add(s);
                    ++this.k;
                }
            }
        }
        catch (final CameraAccessException ex) {
            auc.b(ard.a, "Could not get device listing from camera subsystem", (Throwable)ex);
        }
    }
    
    @Override
    protected final Handler a() {
        return this.b;
    }
    
    @Override
    public final atn b() {
        this.h();
        return new aqn(this.e, this.h.toArray(new String[0]));
    }
    
    @Override
    public final att c() {
        return this.g;
    }
    
    @Override
    protected final atv d() {
        return this.c;
    }
    
    @Override
    public final atx e() {
        return this.d;
    }
    
    @Override
    public final void f(final att g) {
        this.g = g;
    }
}
