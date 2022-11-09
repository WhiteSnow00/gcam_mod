import com.google.googlex.gcam.YuvReadView;
import com.google.googlex.gcam.image.ImageUtils;
import com.google.googlex.gcam.LockedHardwareBuffer;
import com.google.googlex.gcam.InterleavedImageU8;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthResult;
import com.google.googlex.gcam.RawWriteView;
import com.google.googlex.gcam.YuvWriteView;
import com.google.android.apps.camera.moments.MomentsUtils;
import com.google.googlex.gcam.ShotMetadata;
import android.hardware.HardwareBuffer;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import com.google.android.apps.camera.dynamicdepth.DynamicDepthUtils;

// 
// Decompiled by Procyon v0.6.0
// 

public final class fsk implements fsj
{
    private final krr a;
    private final niz b;
    private final oui c;
    private final oui d;
    private final long e;
    private final DynamicDepthUtils f;
    private final ohs g;
    private final niz h;
    
    public fsk(final krr krr, final niz b, final oui c, final oui d, final long e, final DynamicDepthUtils f, final niz h) {
        this.g = new ohs();
        this.a = krr.a(fsk.class.getSimpleName());
        this.b = b;
        this.c = c;
        this.d = d;
        this.e = e;
        this.f = f;
        this.h = h;
    }
    
    private final lju c(dja a, final lju lju, final fsi fsi) {
        final long nanoTime = System.nanoTime();
        try {
            final diy diy = ((dja)a).a(new diz(lju, fsi.a, (ljm)((oev)fsi.c).b)).get();
            final long convert = TimeUnit.MILLISECONDS.convert(System.nanoTime() - nanoTime, TimeUnit.NANOSECONDS);
            final krr a2 = this.a;
            a = (ExecutionException)new StringBuilder(73);
            ((StringBuilder)a).append("Post-processing - image transformer finished. Took ");
            ((StringBuilder)a).append(convert);
            ((StringBuilder)a).append("ms");
            a2.b(((StringBuilder)a).toString());
            a = (ExecutionException)diy.a();
            return (lju)a;
        }
        catch (final ExecutionException a) {}
        catch (final InterruptedException ex) {}
        this.a.i("Couldn't apply post-processing", a);
        return lju;
    }
    
    private final lju d(final HardwareBuffer hardwareBuffer, final long n, final ShotMetadata shotMetadata) {
        if (!this.b.g()) {
            return new lgy(hardwareBuffer, n);
        }
        final HardwareBuffer allocateHardwareBuffer = MomentsUtils.allocateHardwareBuffer(hardwareBuffer.getWidth(), hardwareBuffer.getHeight(), hardwareBuffer.getFormat(), 1, this.e | 0x300L);
        if (allocateHardwareBuffer == null) {
            this.a.d("Unable to allocate output buffer for rectiface, return image without warping.");
            return new lgy(hardwareBuffer, n);
        }
        if (!((hbb)this.b.c()).h(hardwareBuffer, allocateHardwareBuffer, shotMetadata)) {
            allocateHardwareBuffer.close();
            return new lgy(hardwareBuffer, n);
        }
        hardwareBuffer.close();
        return new lgy(allocateHardwareBuffer, n);
    }
    
    @Override
    public final lju a(final fsi fsi, final YuvWriteView yuvWriteView, lju lju, final ShotMetadata shotMetadata) {
        final long longValue = fsi.b;
        Label_0258: {
            if (!fsi.d) {
                lju = (lju)nii.a;
                break Label_0258;
            }
            if (!this.h.g()) {
                this.a.f("Fast bokeh controller is absent, skipping blur.");
                lju = (lju)nii.a;
                break Label_0258;
            }
            if (lju.j()) {
                this.a.f("No PD data, skipping blur.");
                lju = (lju)nii.a;
                break Label_0258;
            }
            final niz a = this.g.a(lju);
            if (!a.g()) {
                this.a.h("Unable to get RawWriteView from PD, skipping blur.");
                lju = (lju)nii.a;
                break Label_0258;
            }
            if (!this.f.c((RawWriteView)a.c(), yuvWriteView, new DynamicDepthResult(kre.h(yuvWriteView.c(), yuvWriteView.b()), kra.a.ordinal(), false, false, null), shotMetadata)) {
                this.a.h("Failed to create depth map, skipping blur.");
                lju = (lju)nii.a;
                break Label_0258;
            }
            final InterleavedImageU8 interleavedImageU8 = (InterleavedImageU8)((fvi)this.h.c()).a().first;
            final HardwareBuffer create = HardwareBuffer.create(interleavedImageU8.b(), interleavedImageU8.a(), 1, 1, 51L);
            lju = (lju)LockedHardwareBuffer.c(create, 51L);
            try {
                ImageUtils.a(interleavedImageU8.c(), ((LockedHardwareBuffer)lju).b());
                ((LockedHardwareBuffer)lju).close();
                lju = (lju)niz.i(create);
                if (!((niz)lju).g()) {
                    if (this.b.g()) {
                        ((hbb)this.b.c()).f(yuvWriteView, shotMetadata);
                    }
                    return this.c((dja)this.c.get(), new dxs(yuvWriteView, longValue), fsi);
                }
                return this.c((dja)this.d.get(), this.d((HardwareBuffer)((niz)lju).c(), longValue, shotMetadata), fsi);
            }
            finally {
                try {
                    ((LockedHardwareBuffer)lju).close();
                }
                finally {
                    final Throwable t;
                    ((Throwable)fsi).addSuppressed(t);
                }
            }
        }
    }
    
    @Override
    public final lju b(final fsi fsi, final HardwareBuffer hardwareBuffer, final ShotMetadata shotMetadata) {
        return this.c((dja)this.d.get(), this.d(hardwareBuffer, fsi.b, shotMetadata), fsi);
    }
}
