import android.hardware.camera2.CameraAccessException;
import java.util.Collection;
import java.util.ArrayList;
import java.util.List;
import android.hardware.camera2.CameraManager;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lfr implements lfo
{
    private final CameraManager a;
    private final krr b;
    
    public lfr(final CameraManager a, final krr krr) {
        this.a = a;
        this.b = krr.a("DefaultCamIdsPrdr");
    }
    
    @Override
    public final List a() {
        try {
            final String[] cameraIdList = this.a.getCameraIdList();
            cameraIdList.getClass();
            final int length = cameraIdList.length;
            if (length != 0) {
                final ArrayList list = new ArrayList(length);
                for (int i = 0; i < length; ++i) {
                    list.add((Object)lfj.b(cameraIdList[i]));
                }
                return nns.j(list);
            }
            this.b.d("No cameras available");
            throw new lfq();
        }
        catch (final CameraAccessException ex) {
            this.b.d("Unable to read camera list.");
            throw new lfp("Unable to read camera list.", ex.getReason(), (Throwable)ex);
        }
    }
    
    @Override
    public final List b() {
        return nns.l();
    }
}
