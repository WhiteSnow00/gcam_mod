import android.hardware.HardwareBuffer;
import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.ShotMetadata;
import com.google.googlex.gcam.YuvWriteView;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ftz implements fsj
{
    @Override
    public final lju a(final fsi fsi, final YuvWriteView yuvWriteView, final lju lju, final ShotMetadata shotMetadata) {
        return new dxs(yuvWriteView, fsi.b);
    }
    
    @Override
    public final lju b(final fsi fsi, final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        return new lgy(hardwareBuffer, fsi.b);
    }
}
