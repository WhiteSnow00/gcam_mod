import android.hardware.Camera$AutoFocusMoveCallback;
import android.hardware.Camera$FaceDetectionListener;
import android.hardware.Camera$AutoFocusCallback;
import android.hardware.Camera$Parameters;
import android.view.SurfaceHolder;
import android.hardware.Camera$OnZoomChangeListener;
import android.hardware.Camera$PreviewCallback;
import java.util.List;
import java.util.Collections;
import java.io.IOException;
import android.graphics.SurfaceTexture;
import android.os.Message;
import android.os.Looper;
import android.hardware.Camera;
import android.hardware.Camera$ErrorCallback;

// 
// Decompiled by Procyon v0.6.0
// 

final class art extends aty implements Camera$ErrorCallback
{
    final /* synthetic */ asa a;
    private final atd b;
    private Camera c;
    private int d;
    private aru e;
    private int f;
    
    public art(final asa a, final atd b, final Looper looper) {
        this.a = a;
        super(looper);
        this.d = -1;
        this.f = 0;
        this.b = b;
    }
    
    @Override
    public final void handleMessage(final Message message) {
        super.handleMessage(message);
        if (this.a.e.d()) {
            final aub a = asa.a;
            atj.c(message.what);
            auc.g(a);
            return;
        }
        final aub a2 = asa.a;
        atj.c(message.what);
        auc.g(a2);
        final int what = message.what;
        boolean b = false;
        int d = 0;
    Label_1915_Outer:
        while (true) {
            Label_1594: {
                switch (what) {
                    default: {
                        break Label_1915_Outer;
                    }
                    case 601: {
                        break Label_1915_Outer;
                    }
                    case 503: {
                        break Label_1915_Outer;
                    }
                    case 502: {
                        break Label_1915_Outer;
                    }
                    case 501: {
                        break Label_1915_Outer;
                    }
                    case 463: {
                        break Label_1915_Outer;
                    }
                    case 462: {
                        break Label_1915_Outer;
                    }
                    case 461: {
                        break Label_1915_Outer;
                    }
                    case 305: {
                        break Label_1915_Outer;
                    }
                    case 304: {
                        break Label_1915_Outer;
                    }
                    case 303: {
                        break Label_1915_Outer;
                    }
                    case 302: {
                        break Label_1915_Outer;
                    }
                    case 301: {
                        break Label_1915_Outer;
                    }
                    case 204: {
                        break Label_1915_Outer;
                    }
                    case 203: {
                        break Label_1915_Outer;
                    }
                    case 202: {
                        break Label_1915_Outer;
                    }
                    case 201: {
                        break Label_1915_Outer;
                    }
                    case 108: {
                        break Label_1915_Outer;
                    }
                    case 107: {
                        break Label_1915_Outer;
                    }
                    case 106: {
                        break Label_1915_Outer;
                    }
                    case 105: {
                        break Label_1327;
                    }
                    case 104: {
                        break Label_1594;
                    }
                    case 103: {
                        break Label_1594;
                    }
                    case 102: {
                        break Label_1594;
                    }
                    case 101: {
                        break Label_1594;
                    }
                    case 5: {
                        break Label_1594;
                    }
                    case 4: {
                        break Label_1594;
                    }
                    case 3: {
                        break Label_1594;
                    }
                    case 2: {
                        break Label_1594;
                    }
                    case 1: {
                        Label_1643: {
                            break Label_1643;
                            aub a3;
                            Object obj;
                            Camera$Parameters a4;
                            atu atu;
                            ati t;
                            ata ata;
                            float p;
                            List zoomRatios;
                            int binarySearch;
                            int zoom;
                            aua aua;
                            aua z;
                            int n;
                            asi asi;
                            int arg1;
                            Camera$Parameters a5;
                            Camera$Parameters a6;
                            Camera c;
                            Camera$Parameters a7;
                            asa a8;
                            atj w;
                            aua e;
                            aua f;
                            int j;
                            ars ars;
                            Camera open;
                            asn asn;
                            int arg2;
                            asa a9;
                            Camera c2;
                            Object obj2;
                            int a10;
                            StringBuilder sb;
                            String string;
                            aub a11;
                            StringBuilder sb2;
                            int arg3;
                            StringBuilder sb3;
                            final aub aub;
                            Label_1051_Outer:Label_0769_Outer:Block_29_Outer:
                            while (true) {
                                try {
                                    try {
                                        a3 = asa.a;
                                        break Label_1051_Outer;
                                        obj = message.obj;
                                        try {
                                            this.c.setPreviewTexture((SurfaceTexture)obj);
                                        }
                                        catch (final IOException ex) {
                                            auc.b(asa.a, "Could not set preview texture", ex);
                                        }
                                        break Label_1915;
                                        while (true) {
                                            Label_0769:Block_31_Outer:Block_30_Outer:
                                            while (true) {
                                                while (true) {
                                                Label_1145_Outer:
                                                    while (true) {
                                                    Label_1145:
                                                        while (true) {
                                                            Label_1051:Block_20_Outer:Label_0469_Outer:Block_22_Outer:Block_5_Outer:
                                                            while (true) {
                                                                while (true) {
                                                                    while (true) {
                                                                        Block_10: {
                                                                            while (true) {
                                                                                Block_13: {
                                                                                    while (true) {
                                                                                        Label_0913_Outer:Block_28_Outer:
                                                                                        while (true) {
                                                                                        Block_27_Outer:
                                                                                            while (true) {
                                                                                            Block_8_Outer:
                                                                                                while (true) {
                                                                                                    while (true) {
                                                                                                        Label_0431: {
                                                                                                            while (true) {
                                                                                                                while (true) {
                                                                                                                    Block_12: {
                                                                                                                        while (true) {
                                                                                                                            Block_18: {
                                                                                                                            Block_7_Outer:
                                                                                                                                while (true) {
                                                                                                                                    while (true) {
                                                                                                                                    Block_19_Outer:
                                                                                                                                        while (true) {
                                                                                                                                            while (true) {
                                                                                                                                                while (true) {
                                                                                                                                                    Label_1003: {
                                                                                                                                                        while (true) {
                                                                                                                                                            while (true) {
                                                                                                                                                                a4.setMeteringAreas(atu.h());
                                                                                                                                                                break Label_1051;
                                                                                                                                                                Label_0877: {
                                                                                                                                                                    while (true) {
                                                                                                                                                                        while (true) {
                                                                                                                                                                            Label_1111: {
                                                                                                                                                                                while (true) {
                                                                                                                                                                                    a4.setPictureFormat(atu.o);
                                                                                                                                                                                    a4.removeGpsData();
                                                                                                                                                                                    this.c.setParameters(a4);
                                                                                                                                                                                    this.e.b();
                                                                                                                                                                                    break Label_1915;
                                                                                                                                                                                    a4.setSceneMode(atj.a(t.name()));
                                                                                                                                                                                    break Label_1111;
                                                                                                                                                                                    this.c.enableShutterSound(b);
                                                                                                                                                                                    break Label_1915;
                                                                                                                                                                                    ata = (ata)message.obj;
                                                                                                                                                                                    this.c.startPreview();
                                                                                                                                                                                    iftrue(Label_1915:)(ata == null);
                                                                                                                                                                                    ata.a();
                                                                                                                                                                                    break Label_1915;
                                                                                                                                                                                    this.c.unlock();
                                                                                                                                                                                    this.a.e.c(4);
                                                                                                                                                                                    break Label_1915;
                                                                                                                                                                                    this.e.b();
                                                                                                                                                                                    break Label_1915;
                                                                                                                                                                                    p = atu.p;
                                                                                                                                                                                    zoomRatios = a4.getZoomRatios();
                                                                                                                                                                                    binarySearch = Collections.binarySearch(zoomRatios, (int)(p * 100.0f));
                                                                                                                                                                                    iftrue(Label_0870:)((zoom = binarySearch) >= 0);
                                                                                                                                                                                    break Block_10;
                                                                                                                                                                                    this.c.setOneShotPreviewCallback((Camera$PreviewCallback)message.obj);
                                                                                                                                                                                    break Label_1915;
                                                                                                                                                                                    a4.setJpegThumbnailSize(aua.b(), aua.a());
                                                                                                                                                                                    continue Block_20_Outer;
                                                                                                                                                                                }
                                                                                                                                                                                a4.setFocusMode(atj.a(atu.s.name()));
                                                                                                                                                                                iftrue(Label_0955:)(!this.a.c.d(atf.f));
                                                                                                                                                                                break Block_13;
                                                                                                                                                                                this.c.addCallbackBuffer((byte[])message.obj);
                                                                                                                                                                                break Label_1915;
                                                                                                                                                                            }
                                                                                                                                                                            a4.setRecordingHint(atu.y);
                                                                                                                                                                            z = atu.z;
                                                                                                                                                                            iftrue(Label_1136:)(z != null);
                                                                                                                                                                            break Label_1051;
                                                                                                                                                                            a4.setFocusAreas(atu.g());
                                                                                                                                                                            break Label_1003;
                                                                                                                                                                            this.c.setZoomChangeListener((Camera$OnZoomChangeListener)message.obj);
                                                                                                                                                                            break Label_1915;
                                                                                                                                                                            a4.setZoom(zoom);
                                                                                                                                                                            break Label_0877;
                                                                                                                                                                            ++this.f;
                                                                                                                                                                            this.c.cancelAutoFocus();
                                                                                                                                                                            this.a.e.c(2);
                                                                                                                                                                            break Label_1915;
                                                                                                                                                                            auc.g(asa.a);
                                                                                                                                                                            break Label_1915;
                                                                                                                                                                            a4.setPreviewFormat(atu.l);
                                                                                                                                                                            a4.setJpegQuality((int)atu.n);
                                                                                                                                                                            iftrue(Label_0877:)(!this.a.c.d(atf.a));
                                                                                                                                                                            continue Block_22_Outer;
                                                                                                                                                                        }
                                                                                                                                                                        zoom = n - 1;
                                                                                                                                                                        continue Block_7_Outer;
                                                                                                                                                                    }
                                                                                                                                                                    Label_0997: {
                                                                                                                                                                        a4.setFocusAreas((List)null);
                                                                                                                                                                    }
                                                                                                                                                                    break Label_1003;
                                                                                                                                                                }
                                                                                                                                                                a4.setExposureCompensation(atu.q);
                                                                                                                                                                iftrue(Label_0913:)(!this.a.c.d(atf.e));
                                                                                                                                                                break Block_12;
                                                                                                                                                                Label_1631: {
                                                                                                                                                                    auc.c(asa.a, "Releasing camera without any camera opened.");
                                                                                                                                                                }
                                                                                                                                                                break Label_1915;
                                                                                                                                                                d = this.a.b.d(message.arg1);
                                                                                                                                                                break Label_0431;
                                                                                                                                                                asi.c(arg1, this.c(arg1));
                                                                                                                                                                break Label_1915;
                                                                                                                                                                try {
                                                                                                                                                                    this.c.setPreviewDisplay((SurfaceHolder)message.obj);
                                                                                                                                                                    break Label_1915;
                                                                                                                                                                }
                                                                                                                                                                catch (final IOException ex2) {
                                                                                                                                                                    throw new RuntimeException(ex2);
                                                                                                                                                                }
                                                                                                                                                                continue Label_1915_Outer;
                                                                                                                                                                a5 = this.e.a();
                                                                                                                                                                a5.setRotation(message.arg1);
                                                                                                                                                                this.c.setParameters(a5);
                                                                                                                                                                this.e.b();
                                                                                                                                                                break Label_1915;
                                                                                                                                                                a6 = this.e.a();
                                                                                                                                                                a6.unflatten((String)message.obj);
                                                                                                                                                                this.c.setParameters(a6);
                                                                                                                                                                this.e.b();
                                                                                                                                                                break Label_1915;
                                                                                                                                                                --this.f;
                                                                                                                                                                break Label_1915;
                                                                                                                                                                iftrue(Label_1045:)(atu.h().size() == 0);
                                                                                                                                                                continue Label_1051_Outer;
                                                                                                                                                            }
                                                                                                                                                            t = atu.t;
                                                                                                                                                            iftrue(Label_1111:)(t == null);
                                                                                                                                                            continue Label_0469_Outer;
                                                                                                                                                        }
                                                                                                                                                        asi.d(arg1, this.c(arg1));
                                                                                                                                                        break Label_1915;
                                                                                                                                                    }
                                                                                                                                                    iftrue(Label_1051:)(!this.a.c.d(atf.d));
                                                                                                                                                    continue Block_19_Outer;
                                                                                                                                                }
                                                                                                                                                c.release();
                                                                                                                                                this.a.e.c(1);
                                                                                                                                                this.c = null;
                                                                                                                                                this.d = -1;
                                                                                                                                                break Label_1915;
                                                                                                                                                a4.setPreviewFpsRange(atu.h, atu.i);
                                                                                                                                                continue Label_0769;
                                                                                                                                                ((Camera$Parameters[])message.obj)[0] = this.e.a();
                                                                                                                                                break Label_1915;
                                                                                                                                                iftrue(Label_1078:)(atu.r == atg.a);
                                                                                                                                                break Block_18;
                                                                                                                                                this.c.stopFaceDetection();
                                                                                                                                                break Label_1915;
                                                                                                                                                iftrue(Label_1111:)(atu.t == ati.a);
                                                                                                                                                continue Block_28_Outer;
                                                                                                                                            }
                                                                                                                                            Label_1136: {
                                                                                                                                                aua = new aua(z);
                                                                                                                                            }
                                                                                                                                            break Label_1145;
                                                                                                                                            iftrue(Label_0997:)(atu.g().size() == 0);
                                                                                                                                            continue Block_7_Outer;
                                                                                                                                        }
                                                                                                                                        iftrue(Label_0635:)(this.f <= 0);
                                                                                                                                        continue Label_0769_Outer;
                                                                                                                                    }
                                                                                                                                    this.c.setPreviewCallback((Camera$PreviewCallback)message.obj);
                                                                                                                                    break Label_1915;
                                                                                                                                    b = true;
                                                                                                                                    continue Block_22_Outer;
                                                                                                                                }
                                                                                                                                this.c.setPreviewCallbackWithBuffer((Camera$PreviewCallback)message.obj);
                                                                                                                                break Label_1915;
                                                                                                                            }
                                                                                                                            a4.setFlashMode(atj.a(atu.r.name()));
                                                                                                                            continue Label_1145_Outer;
                                                                                                                        }
                                                                                                                    }
                                                                                                                    a4.setAutoExposureLock(atu.w);
                                                                                                                    continue Label_0769_Outer;
                                                                                                                }
                                                                                                                iftrue(Label_1003:)(!this.a.c.d(atf.c));
                                                                                                                continue Block_5_Outer;
                                                                                                            }
                                                                                                        }
                                                                                                        a7.setRotation(d);
                                                                                                        this.c.setParameters(a7);
                                                                                                        this.e.b();
                                                                                                        break Label_1915;
                                                                                                        a8 = this.a;
                                                                                                        asi.b(new arr(a8, this.b, arg1, this.c, a8.c));
                                                                                                        break Label_1915;
                                                                                                        a4 = this.e.a();
                                                                                                        atu = (atu)message.obj;
                                                                                                        w = this.a.c.w;
                                                                                                        e = atu.e();
                                                                                                        a4.setPictureSize(e.b(), e.a());
                                                                                                        f = atu.f();
                                                                                                        a4.setPreviewSize(f.b(), f.a());
                                                                                                        j = atu.j;
                                                                                                        iftrue(Label_0762:)(j != -1);
                                                                                                        continue Label_1145_Outer;
                                                                                                    }
                                                                                                    this.c.lock();
                                                                                                    this.a.e.c(2);
                                                                                                    break Label_1915;
                                                                                                    this.c.stopPreview();
                                                                                                    break Label_1915;
                                                                                                    Label_0635: {
                                                                                                        this.a.e.c(16);
                                                                                                    }
                                                                                                    this.c.autoFocus((Camera$AutoFocusCallback)message.obj);
                                                                                                    break Label_1915;
                                                                                                    c = this.c;
                                                                                                    iftrue(Label_1631:)(c == null);
                                                                                                    continue Block_8_Outer;
                                                                                                }
                                                                                                asi = (asi)message.obj;
                                                                                                arg1 = message.arg1;
                                                                                                iftrue(Label_1688:)(this.a.e.a() == 1);
                                                                                                continue Block_27_Outer;
                                                                                            }
                                                                                            this.a.e.c(8);
                                                                                            ars = (ars)message.obj;
                                                                                            this.c.takePicture(ars.a, ars.b, ars.c, ars.d);
                                                                                            break Label_1915;
                                                                                            iftrue(Label_1162:)(aua == null);
                                                                                            continue Label_0913_Outer;
                                                                                        }
                                                                                        this.c.setDisplayOrientation(this.a.b.e(message.arg1, true));
                                                                                        a7 = this.e.a();
                                                                                        iftrue(Label_0431:)(message.arg2 <= 0);
                                                                                        continue Block_31_Outer;
                                                                                    }
                                                                                }
                                                                                a4.setAutoWhiteBalanceLock(atu.x);
                                                                                continue Block_30_Outer;
                                                                            }
                                                                            this.c.startFaceDetection();
                                                                            break Label_1915;
                                                                        }
                                                                        n = -(binarySearch + 1);
                                                                        iftrue(Label_0870:)((zoom = n) != zoomRatios.size());
                                                                        continue Block_31_Outer;
                                                                    }
                                                                    iftrue(Label_0469:)(message.arg1 != 1);
                                                                    continue Block_30_Outer;
                                                                }
                                                                Label_1045: {
                                                                    a4.setMeteringAreas((List)null);
                                                                }
                                                                continue Label_1051;
                                                            }
                                                            aua = null;
                                                            continue Label_1145;
                                                        }
                                                        Label_1848: {
                                                            iftrue(Label_1915:)(asi == null);
                                                        }
                                                        continue Label_1145_Outer;
                                                    }
                                                    this.d = arg1;
                                                    this.e = new aru(open);
                                                    this.a.b = ari.c().b(arg1);
                                                    this.a.c = new asb(this.e.a());
                                                    this.c.setErrorCallback((Camera$ErrorCallback)this);
                                                    this.a.e.c(2);
                                                    iftrue(Label_1915:)(asi == null);
                                                    continue Block_29_Outer;
                                                }
                                                this.c.setFaceDetectionListener((Camera$FaceDetectionListener)message.obj);
                                                break Label_1915;
                                                Label_0762: {
                                                    a4.setPreviewFrameRate(j);
                                                }
                                                continue Label_0769;
                                            }
                                            asn = (asn)message.obj;
                                            arg2 = message.arg1;
                                            try {
                                                this.c.reconnect();
                                                this.a.e.c(2);
                                                if (asn != null) {
                                                    a9 = this.a;
                                                    asn.b(new arr(a9, a9, arg2, this.c, a9.c));
                                                }
                                            }
                                            catch (final IOException ex3) {
                                                if (asn != null) {
                                                    asn.a.post((Runnable)new asm(asn, this.c(this.d)));
                                                }
                                            }
                                            break Label_1915;
                                            Label_1688: {
                                                auc.f(asa.a);
                                            }
                                            open = Camera.open(arg1);
                                            iftrue(Label_1848:)((this.c = open) == null);
                                            continue;
                                        }
                                        c2 = this.c;
                                        obj2 = message.obj;
                                        try {
                                            c2.setAutoFocusMoveCallback((Camera$AutoFocusMoveCallback)obj2);
                                            break Label_1915;
                                        }
                                        catch (final RuntimeException ex4) {
                                            auc.c(asa.a, ex4.getMessage());
                                            break Label_1915;
                                        }
                                    }
                                    finally {}
                                }
                                catch (final RuntimeException ex5) {
                                    a10 = this.a.e.a();
                                    sb = new StringBuilder();
                                    sb.append("CameraAction[");
                                    sb.append(atj.c(what));
                                    sb.append("] at CameraState[");
                                    sb.append(a10);
                                    sb.append("]");
                                    string = sb.toString();
                                    a11 = asa.a;
                                    sb2 = new StringBuilder();
                                    sb2.append("RuntimeException during ");
                                    sb2.append(string);
                                    auc.b(a11, sb2.toString(), ex5);
                                    this.a.e.b();
                                    Label_2107: {
                                        if (this.c != null) {
                                            auc.f(asa.a);
                                            try {
                                                try {
                                                    this.c.release();
                                                    this.c = null;
                                                }
                                                finally {}
                                            }
                                            catch (final Exception ex6) {
                                                auc.b(asa.a, "Fail when calling Camera.release().", ex6);
                                                this.c = null;
                                                break Label_2107;
                                            }
                                            this.c = null;
                                        }
                                    }
                                    if (message.what == 1 && this.c == null) {
                                        arg3 = message.arg1;
                                        if (message.obj != null) {
                                            ((asi)message.obj).c(message.arg1, this.c(arg3));
                                        }
                                    }
                                    else {
                                        ((asa)this.b).g.b(ex5, this.c(this.d), what, a10);
                                    }
                                    atc.a(message);
                                    return;
                                    sb3 = new StringBuilder();
                                    sb3.append("Invalid CameraProxy message=");
                                    sb3.append(message.what);
                                    auc.a(aub, sb3.toString());
                                    continue;
                                }
                                break;
                            }
                        }
                        atc.a(message);
                        break;
                    }
                }
            }
            break;
        }
    }
    
    public final void onError(int intValue, final Camera camera) {
        this.a.g.a(intValue);
        if (intValue == 100) {
            intValue = super.r.peekLast();
            this.a.g.b(new RuntimeException("Media server died."), this.c(this.d), intValue, this.a.e.a());
        }
    }
}
