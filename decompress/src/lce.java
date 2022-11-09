import android.hardware.camera2.CameraCaptureSession;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;
import java.util.Iterator;
import android.os.Handler;
import android.util.Log;
import java.util.ArrayList;
import android.hardware.camera2.CaptureRequest;
import java.util.List;

// 
// Decompiled by Procyon v0.6.0
// 

public final class lce implements lcs
{
    private final lek a;
    
    public lce(final lek a) {
        this.a = a;
    }
    
    private final List g(ljh highSpeedRequestList, final boolean b) {
        final lek a = this.a;
        try {
            highSpeedRequestList = (IllegalArgumentException)a.b.createHighSpeedRequestList((CaptureRequest)lfe.d((ljc)highSpeedRequestList));
            final ArrayList<Object> list = new ArrayList<Object>(((List)highSpeedRequestList).size());
            for (int i = 0; i < ((List)highSpeedRequestList).size(); ++i) {
                list.add(new len((CaptureRequest)((List<Object>)highSpeedRequestList).get(i)));
            }
            if (b) {
                return list;
            }
            final int size = list.size();
            boolean b2 = true;
            if (size == 1) {
                return list;
            }
            if (list.size() <= 0) {
                b2 = false;
            }
            njo.r(b2, "No requests returned from createHighSpeedRequestList for %s!", this.a);
            list.get(0).getClass();
            return nns.m(list.get(0));
        }
        catch (final IllegalArgumentException highSpeedRequestList) {}
        catch (final IllegalStateException ex) {}
        if (highSpeedRequestList instanceof IllegalArgumentException) {
            Log.w("HFRCaptureSession", "The exception may cause by surface was destroyed before calling createHighSpeedRequestList");
        }
        throw new ljd(highSpeedRequestList);
    }
    
    private final int h(final List list, final ldg ldg, final Handler handler, final boolean b) {
        final nnn nnn = new nnn();
        final Iterator iterator = list.iterator();
        while (iterator.hasNext()) {
            nnn.h(this.g((ljh)iterator.next(), b));
        }
        return this.a.f(nnn.f(), ldg, handler);
    }
    
    @Override
    public final void a() {
        this.a.b();
    }
    
    @Override
    public final void b() {
        this.a.d();
    }
    
    @Override
    public final leo c(final lda lda) {
        return this.a.a().h(lda.a);
    }
    
    @Override
    public final int d(final ljh ljh, final ldg ldg, final Handler handler, final boolean b) {
        return this.h(nns.m(ljh), ldg, handler, b);
    }
    
    @Override
    public final int e(final List list, final ldg ldg, final Handler handler, final boolean b) {
        return this.h(list, ldg, handler, b);
    }
    
    @Override
    public final int f(ljh ex, final ldg ldg, final Handler handler, final boolean b) {
        final List g = this.g((ljh)ex, b);
        ex = (SecurityException)this.a;
        try {
            ex = (SecurityException)((lej)ex).a;
            return ((CameraCaptureSession)ex).setRepeatingBurst(lfe.e(g), (CameraCaptureSession$CaptureCallback)new lei(ldg), handler);
        }
        catch (final SecurityException ex) {}
        catch (final IllegalStateException ex2) {}
        throw new ljd(ex);
    }
}
