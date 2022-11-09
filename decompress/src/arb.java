import android.media.ImageReader$OnImageAvailableListener;
import android.os.Message;
import java.util.List;
import java.util.Arrays;
import android.hardware.camera2.CaptureRequest$Key;
import android.hardware.camera2.CameraAccessException;
import android.os.Handler;
import android.hardware.camera2.CameraCaptureSession$CaptureCallback;
import android.util.Size;
import android.util.Range;
import android.hardware.camera2.CaptureRequest;
import android.os.Looper;
import android.hardware.camera2.CameraCaptureSession$StateCallback;
import android.hardware.camera2.CameraDevice$StateCallback;
import android.view.Surface;
import android.graphics.SurfaceTexture;
import android.media.ImageReader;
import android.hardware.camera2.CameraCaptureSession;
import android.graphics.Rect;
import android.hardware.camera2.CameraDevice;

// 
// Decompiled by Procyon v0.6.0
// 

final class arb extends aty
{
    public asi a;
    public int b;
    public String c;
    public CameraDevice d;
    public aqu e;
    public aue f;
    public Rect g;
    public boolean h;
    public CameraCaptureSession i;
    public ImageReader j;
    public asy k;
    public asg l;
    public arc m;
    public ash n;
    public int o;
    public final ara p;
    final /* synthetic */ ard q;
    private int s;
    private aua t;
    private aua u;
    private SurfaceTexture v;
    private Surface w;
    private final CameraDevice$StateCallback x;
    private final CameraCaptureSession$StateCallback y;
    
    public arb(final ard q, final Looper looper) {
        this.q = q;
        super(looper);
        this.s = 0;
        this.o = 0;
        this.x = new aqx(this);
        this.y = new aqy(this);
        this.p = new aqz(this);
    }
    
    private final void d(final arf arf) {
        final aue f = this.f;
        arf.b(CaptureRequest.CONTROL_AE_REGIONS, arf.c(arf.e));
        arf.b(CaptureRequest.CONTROL_AF_REGIONS, arf.c(arf.f));
        arf.b(CaptureRequest.CONTROL_AE_TARGET_FPS_RANGE, new Range((Comparable)arf.h, (Comparable)arf.i));
        arf.b(CaptureRequest.JPEG_QUALITY, arf.n);
        arf.b.d(CaptureRequest.SCALER_CROP_REGION, arf.c);
        arf.b(CaptureRequest.CONTROL_AE_EXPOSURE_COMPENSATION, arf.q);
        final atg r = arf.r;
        final Integer value = 3;
        final Integer value2 = 4;
        Integer value3 = 0;
        final Integer value4 = 2;
        final Integer value5 = 1;
        Object o2;
        Object o = null;
        if (r != null) {
            final atk a = atk.a;
            final ati a2 = ati.a;
            final ath a3 = ath.a;
            switch (r.ordinal()) {
                default: {
                    final aub a4 = arf.a;
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Unable to convert to API 2 flash mode: ");
                    sb.append(arf.r);
                    auc.c(a4, sb.toString());
                    o = (o2 = null);
                    break;
                }
                case 5: {
                    o = value2;
                    o2 = null;
                    break;
                }
                case 4: {
                    o2 = value4;
                    o = null;
                    break;
                }
                case 3: {
                    o = value;
                    o2 = value5;
                    break;
                }
                case 2: {
                    o2 = value3;
                    o = value5;
                    break;
                }
                case 1: {
                    o = value4;
                    o2 = null;
                    break;
                }
            }
        }
        else {
            o = (o2 = null);
        }
        arf.b.d(CaptureRequest.CONTROL_AE_MODE, o);
        arf.b.d(CaptureRequest.FLASH_MODE, o2);
        final ath s = arf.s;
        Object value6 = null;
        if (s != null) {
            final atk a5 = atk.a;
            final ati a6 = ati.a;
            final atg a7 = atg.a;
            switch (s.ordinal()) {
                default: {
                    final aub a8 = arf.a;
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Unable to convert to API 2 focus mode: ");
                    sb2.append(arf.s);
                    auc.c(a8, sb2.toString());
                    value6 = null;
                    break;
                }
                case 6: {
                    value6 = value4;
                    break;
                }
                case 4: {
                    value6 = value3;
                    break;
                }
                case 3: {
                    value6 = 5;
                    break;
                }
                case 2: {
                    value6 = value;
                    break;
                }
                case 1: {
                    value6 = value2;
                    break;
                }
                case 0: {
                    value6 = value5;
                    break;
                }
            }
        }
        else {
            value6 = null;
        }
        arf.b.d(CaptureRequest.CONTROL_AF_MODE, value6);
        final ati t = arf.t;
        Object o3 = null;
        if (t != null) {
            final atk a9 = atk.a;
            final ath a10 = ath.a;
            final atg a11 = atg.a;
            switch (t.ordinal()) {
                default: {
                    final aub a12 = arf.a;
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Unable to convert to API 2 scene mode: ");
                    sb3.append(arf.t);
                    auc.c(a12, sb3.toString());
                    o3 = null;
                    break;
                }
                case 17: {
                    o3 = 7;
                    break;
                }
                case 16: {
                    o3 = 10;
                    break;
                }
                case 15: {
                    o3 = 11;
                    break;
                }
                case 14: {
                    o3 = 13;
                    break;
                }
                case 13: {
                    o3 = 9;
                    break;
                }
                case 12: {
                    o3 = value;
                    break;
                }
                case 11: {
                    o3 = 14;
                    break;
                }
                case 9: {
                    o3 = 5;
                    break;
                }
                case 8: {
                    o3 = value2;
                    break;
                }
                case 7: {
                    o3 = atz.a;
                    break;
                }
                case 6: {
                    o3 = 12;
                    break;
                }
                case 5: {
                    o3 = 15;
                    break;
                }
                case 4: {
                    o3 = 8;
                    break;
                }
                case 3: {
                    o3 = 16;
                    break;
                }
                case 2: {
                    o3 = value4;
                    break;
                }
                case 1: {
                    o3 = value3;
                    break;
                }
            }
        }
        else {
            o3 = null;
        }
        arf.b.d(CaptureRequest.CONTROL_SCENE_MODE, o3);
        final atk u = arf.u;
        Object o4 = null;
        if (u != null) {
            final ati a13 = ati.a;
            final ath a14 = ath.a;
            final atg a15 = atg.a;
            switch (u.ordinal()) {
                default: {
                    final aub a16 = arf.a;
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Unable to convert to API 2 white balance: ");
                    sb4.append(arf.u);
                    auc.c(a16, sb4.toString());
                    o4 = null;
                    break;
                }
                case 7: {
                    o4 = value2;
                    break;
                }
                case 6: {
                    o4 = 7;
                    break;
                }
                case 5: {
                    o4 = 8;
                    break;
                }
                case 4: {
                    o4 = value4;
                    break;
                }
                case 3: {
                    o4 = value;
                    break;
                }
                case 2: {
                    o4 = 5;
                    break;
                }
                case 1: {
                    o4 = 6;
                    break;
                }
                case 0: {
                    o4 = value5;
                    break;
                }
            }
        }
        else {
            o4 = null;
        }
        arf.b.d(CaptureRequest.CONTROL_AWB_MODE, o4);
        arf.b(CaptureRequest.CONTROL_VIDEO_STABILIZATION_MODE, (int)(arf.v ? 1 : 0));
        final aue b = arf.b;
        final CaptureRequest$Key lens_OPTICAL_STABILIZATION_MODE = CaptureRequest.LENS_OPTICAL_STABILIZATION_MODE;
        if (!arf.v) {
            value3 = null;
        }
        b.d(lens_OPTICAL_STABILIZATION_MODE, value3);
        arf.b(CaptureRequest.CONTROL_AE_LOCK, arf.w);
        arf.b(CaptureRequest.CONTROL_AWB_LOCK, arf.x);
        arf.b.d(CaptureRequest.JPEG_GPS_LOCATION, null);
        if (arf.z != null) {
            arf.b(CaptureRequest.JPEG_THUMBNAIL_SIZE, new Size(arf.z.b(), arf.z.a()));
        }
        else {
            arf.b(CaptureRequest.JPEG_THUMBNAIL_SIZE, null);
        }
        final aue b2 = arf.b;
        if (b2 != f) {
            f.a.putAll(b2.a);
            ++f.b;
        }
        this.t = arf.f();
        this.u = arf.e();
        if (this.q.c.a() >= 16) {
            try {
                this.i.setRepeatingRequest(this.f.a(this.d, 1, this.w), (CameraCaptureSession$CaptureCallback)this.p, (Handler)this);
                return;
            }
            catch (final CameraAccessException ex) {
                auc.b(ard.a, "Failed to apply updated request settings", (Throwable)ex);
                return;
            }
        }
        if (this.q.c.a() < 8) {
            this.a(4);
        }
    }
    
    private final void e() {
        try {
            this.i.abortCaptures();
            this.i = null;
        }
        catch (final CameraAccessException ex) {
            auc.b(ard.a, "Failed to close existing camera capture session", (Throwable)ex);
        }
        this.a(4);
    }
    
    private final void f(final SurfaceTexture v) {
        if (this.q.c.a() < 4) {
            auc.c(ard.a, "Ignoring texture setting at inappropriate time");
            return;
        }
        if (v == this.v) {
            auc.f(ard.a);
            return;
        }
        if (this.i != null) {
            this.e();
        }
        (this.v = v).setDefaultBufferSize(this.t.b(), this.t.a());
        final Surface w = this.w;
        if (w != null) {
            w.release();
        }
        this.w = new Surface(v);
        try (final ImageReader j = this.j) {}
        final ImageReader instance = ImageReader.newInstance(this.u.b(), this.u.a(), 256, 1);
        this.j = instance;
        try {
            this.d.createCaptureSession((List)Arrays.asList(this.w, instance.getSurface()), this.y, (Handler)this);
        }
        catch (final CameraAccessException ex) {
            auc.b(ard.a, "Failed to create camera capture session", (Throwable)ex);
        }
    }
    
    public final void a(final int n) {
        if (this.q.c.a() != n) {
            this.q.c.c(n);
            if (n < 16) {
                this.o = 0;
                final aqz aqz = (aqz)this.p;
                aqz.a = -1;
                aqz.b = -1L;
                aqz.c = -1L;
            }
        }
    }
    
    public final atu b() {
        try {
            return new arf(this.d, this.g, this.t, this.u);
        }
        catch (final CameraAccessException ex) {
            auc.a(ard.a, "Unable to query camera device to build settings representation");
            return null;
        }
    }
    
    @Override
    public final void handleMessage(final Message message) {
        super.handleMessage(message);
        final aub a = ard.a;
        atj.c(message.what);
        auc.g(a);
        final int what = message.what;
        int d = 0;
        final Integer value = 1;
        Label_0969: {
            switch (what) {
                default: {
                    break Label_0969;
                }
                case 601: {
                    break Label_0969;
                }
                case 503: {
                    break Label_0969;
                }
                case 502: {
                    break Label_0969;
                }
                case 305: {
                    break Label_0969;
                }
                case 303: {
                    break Label_0969;
                }
                case 302: {
                    break Label_0969;
                }
                case 301: {
                    break Label_0969;
                }
                case 204: {
                    break Label_0969;
                }
                case 103: {
                    break Label_0969;
                }
                case 102: {
                    break Label_0969;
                }
                case 101: {
                    break Label_0969;
                }
                case 2: {
                    break Label_0969;
                }
                case 1:
                case 3: {
                    Label_1113: {
                        break Label_1113;
                        try {
                            arc arc;
                            aqw aqw;
                            aue aue;
                            asi a2;
                            int arg1;
                            aub a3;
                            String c;
                            aue f;
                            CaptureRequest$Key jpeg_ORIENTATION;
                            CameraDevice d2;
                            Surface w;
                            aue aue2;
                            aqv aqv;
                            aue aue3;
                            ImageReader j;
                            CameraDevice d3;
                            String c2;
                            ard q;
                            final RuntimeException ex6;
                            StringBuilder sb;
                            asi a4;
                            int b;
                            aub a5;
                            StringBuilder sb2;
                            Label_0272_Outer:Block_4_Outer:Label_1502_Outer:Block_44_Outer:
                            while (true) {
                                try {
                                    new(java.lang.RuntimeException.class)();
                                    break Label_0272_Outer;
                                    ++this.s;
                                    iftrue(Label_0564:)(this.q.c.a() >= 16);
                                    Block_23_Outer:Label_1085_Outer:
                                    while (true) {
                                        while (true) {
                                        Block_24:
                                            while (true) {
                                                Label_1029: {
                                                    Block_26: {
                                                        Block_15: {
                                                        Block_25_Outer:
                                                            while (true) {
                                                            Label_0486_Outer:
                                                                while (true) {
                                                                Block_21_Outer:
                                                                    while (true) {
                                                                        Label_1062: {
                                                                            while (true) {
                                                                                Label_1011: {
                                                                                Block_3_Outer:
                                                                                    while (true) {
                                                                                        while (true) {
                                                                                            Block_17: {
                                                                                                Block_20: {
                                                                                                    Block_12: {
                                                                                                        break Block_12;
                                                                                                        this.n = (ash)message.obj;
                                                                                                        break Label_1265;
                                                                                                        while (true) {
                                                                                                            auc.g(ard.a);
                                                                                                            break Label_1265;
                                                                                                            iftrue(Label_0836:)(this.q.c.a() >= 16);
                                                                                                            break Block_17;
                                                                                                            this.d((arf)message.obj);
                                                                                                            break Label_1265;
                                                                                                            auc.f(ard.a);
                                                                                                            aqw = new aqw(this, arc);
                                                                                                            aue = new aue(this.f);
                                                                                                            aue.d(CaptureRequest.CONTROL_AE_PRECAPTURE_TRIGGER, value);
                                                                                                            try {
                                                                                                                this.i.capture(aue.a(this.d, 1, this.w), (CameraCaptureSession$CaptureCallback)aqw, (Handler)this);
                                                                                                            }
                                                                                                            catch (final CameraAccessException ex) {
                                                                                                                auc.b(ard.a, "Unable to run autoexposure and perform capture", (Throwable)ex);
                                                                                                            }
                                                                                                            break Label_1265;
                                                                                                            iftrue(Label_0995:)(this.q.c.a() != 1);
                                                                                                            break Block_20;
                                                                                                            iftrue(Label_0662:)(this.s <= 0);
                                                                                                            continue Label_0272_Outer;
                                                                                                        }
                                                                                                        Label_1158: {
                                                                                                            this.a = a2;
                                                                                                        }
                                                                                                        this.b = arg1;
                                                                                                        this.c = (String)this.q.h.get(arg1);
                                                                                                        a3 = ard.a;
                                                                                                        String.format("Opening camera index %d (id %s) with camera2 API", arg1, this.c);
                                                                                                        auc.f(a3);
                                                                                                        c = this.c;
                                                                                                        iftrue(Label_1249:)(c != null);
                                                                                                        break Block_26;
                                                                                                        a2.d(arg1, this.c(arg1));
                                                                                                        break Label_1265;
                                                                                                    }
                                                                                                    auc.c(ard.a, "Ignoring attempt to release focus lock without preview");
                                                                                                    break Label_1265;
                                                                                                    f.d(jpeg_ORIENTATION, d);
                                                                                                    break Label_1265;
                                                                                                    this.e();
                                                                                                    this.i = null;
                                                                                                    break Label_1011;
                                                                                                    auc.a(ard.a, "Photos may only be taken when a preview is active");
                                                                                                    break Label_1265;
                                                                                                    Label_0662: {
                                                                                                        iftrue(Label_0689:)(this.q.c.a() >= 16);
                                                                                                    }
                                                                                                    break Block_15;
                                                                                                    Label_1249:
                                                                                                    this.q.e.openCamera(c, this.x, (Handler)this);
                                                                                                    break Label_1265;
                                                                                                }
                                                                                                auc.c(ard.a, "Ignoring release at inappropriate time");
                                                                                                break Label_1265;
                                                                                                iftrue(Label_0879:)(this.q.c.a() == 8);
                                                                                                break Block_23_Outer;
                                                                                                this.f((SurfaceTexture)message.obj);
                                                                                                break Label_1265;
                                                                                                Label_0836: {
                                                                                                    this.i.stopRepeating();
                                                                                                }
                                                                                                this.a(8);
                                                                                                break Label_1265;
                                                                                                auc.c(ard.a, "Taking a (likely blurry) photo without the lens locked");
                                                                                                break Label_0486_Outer;
                                                                                            }
                                                                                            auc.c(ard.a, "Refusing to stop preview at inappropriate time");
                                                                                            break Label_1265;
                                                                                            d2.close();
                                                                                            this.d = null;
                                                                                            break Label_1029;
                                                                                            --this.s;
                                                                                            break Label_1265;
                                                                                            w.release();
                                                                                            this.w = null;
                                                                                            break Label_1062;
                                                                                            iftrue(Label_0190:)(this.q.c.a() >= 16);
                                                                                            continue Block_4_Outer;
                                                                                        }
                                                                                        Label_0995: {
                                                                                            iftrue(Label_1011:)(this.i == null);
                                                                                        }
                                                                                        continue Block_3_Outer;
                                                                                    }
                                                                                    Label_0564: {
                                                                                        this.a(16);
                                                                                    }
                                                                                    aue2 = new aue(this.f);
                                                                                    aue2.d(CaptureRequest.CONTROL_AF_TRIGGER, 2);
                                                                                    try {
                                                                                        this.i.capture(aue2.a(this.d, 1, this.w), (CameraCaptureSession$CaptureCallback)null, (Handler)this);
                                                                                    }
                                                                                    catch (final CameraAccessException ex2) {
                                                                                        auc.b(ard.a, "Unable to cancel autofocus", (Throwable)ex2);
                                                                                        this.a(32);
                                                                                    }
                                                                                    atc.a(message);
                                                                                    return;
                                                                                    Label_0689:
                                                                                    aqv = new aqv(this, (asg)message.obj);
                                                                                    this.a(32);
                                                                                    aue3 = new aue(this.f);
                                                                                    aue3.d(CaptureRequest.CONTROL_AF_TRIGGER, value);
                                                                                    try {
                                                                                        this.i.capture(aue3.a(this.d, 1, this.w), (CameraCaptureSession$CaptureCallback)aqv, (Handler)this);
                                                                                    }
                                                                                    catch (final CameraAccessException ex3) {
                                                                                        auc.b(ard.a, "Unable to lock autofocus", (Throwable)ex3);
                                                                                        this.a(16);
                                                                                    }
                                                                                    continue Label_0272_Outer;
                                                                                }
                                                                                d2 = this.d;
                                                                                iftrue(Label_1029:)(d2 == null);
                                                                                continue Block_23_Outer;
                                                                            }
                                                                            this.t = null;
                                                                            this.u = null;
                                                                            this.b = 0;
                                                                            this.c = null;
                                                                            this.a(1);
                                                                            continue Label_0272_Outer;
                                                                        }
                                                                        this.v = null;
                                                                        j = this.j;
                                                                        iftrue(Label_1085:)(j == null);
                                                                        break Block_24;
                                                                        f = this.f;
                                                                        jpeg_ORIENTATION = CaptureRequest.JPEG_ORIENTATION;
                                                                        iftrue(Label_0486:)(message.arg2 <= 0);
                                                                        d = this.e.a.d(message.arg1);
                                                                        continue Block_21_Outer;
                                                                    }
                                                                    Label_0879: {
                                                                        this.k = (asy)message.obj;
                                                                    }
                                                                    this.a(16);
                                                                    try {
                                                                        this.i.setRepeatingRequest(this.f.a(this.d, 1, this.w), (CameraCaptureSession$CaptureCallback)this.p, (Handler)this);
                                                                    }
                                                                    catch (final CameraAccessException ex4) {
                                                                        auc.d(ard.a, "Unable to start preview", (Throwable)ex4);
                                                                        this.a(8);
                                                                    }
                                                                    continue Label_0272_Outer;
                                                                    a2 = (asi)message.obj;
                                                                    arg1 = message.arg1;
                                                                    iftrue(Label_1158:)(this.q.c.a() <= 1);
                                                                    continue Label_0486_Outer;
                                                                }
                                                                arc = (arc)message.obj;
                                                                iftrue(Label_0363:)(this.h || (this.o == 2 && !this.f.c(CaptureRequest.CONTROL_AE_MODE, 3) && !this.f.c(CaptureRequest.FLASH_MODE, value)));
                                                                continue Block_25_Outer;
                                                            }
                                                            this.f.d(CaptureRequest.JPEG_ORIENTATION, message.arg1);
                                                            continue Label_0272_Outer;
                                                        }
                                                        auc.c(ard.a, "Ignoring attempt to autofocus without preview");
                                                        continue Label_0272_Outer;
                                                    }
                                                    this.a.a(message.arg1);
                                                    continue Label_0272_Outer;
                                                    Label_0363: {
                                                        auc.f(ard.a);
                                                    }
                                                    this.j.setOnImageAvailableListener((ImageReader$OnImageAvailableListener)arc, (Handler)this);
                                                    try {
                                                        this.i.capture(this.f.a(this.d, 2, this.j.getSurface()), (CameraCaptureSession$CaptureCallback)arc, (Handler)this);
                                                    }
                                                    catch (final CameraAccessException ex5) {
                                                        auc.b(ard.a, "Unable to initiate immediate capture", (Throwable)ex5);
                                                    }
                                                    continue Label_0272_Outer;
                                                }
                                                this.e = null;
                                                this.f = null;
                                                this.g = null;
                                                w = this.w;
                                                iftrue(Label_1062:)(w == null);
                                                continue Label_1085_Outer;
                                            }
                                            j.close();
                                            this.j = null;
                                            continue;
                                        }
                                        Label_0190: {
                                            iftrue(Label_0214:)(this.q.c.a() == 32);
                                        }
                                        continue Block_23_Outer;
                                    }
                                    auc.c(ard.a, "Refusing to start preview at inappropriate time");
                                }
                                finally {
                                    atc.a(message);
                                Block_41:
                                    while (true) {
                                        Label_1441: {
                                            while (true) {
                                                while (true) {}
                                                iftrue(Label_1347:)(what == 2);
                                                d3 = this.d;
                                                iftrue(Label_1347:)(d3 == null);
                                                d3.close();
                                                this.d = null;
                                                break Label_1441;
                                                c2 = this.c(Integer.parseInt(this.c));
                                                q = this.q;
                                                q.g.b(ex6, c2, what, q.c.a());
                                                continue Label_1502_Outer;
                                                sb = new StringBuilder();
                                                sb.append("Unimplemented CameraProxy message=");
                                                sb.append(message.what);
                                                new RuntimeException(sb.toString());
                                                continue Block_44_Outer;
                                            }
                                            a4 = this.a;
                                            iftrue(Label_1265:)(a4 == null);
                                            b = this.b;
                                            a4.c(b, this.c(b));
                                            continue Label_1502_Outer;
                                            Label_1391: {
                                                a5 = ard.a;
                                            }
                                            sb2 = new StringBuilder();
                                            sb2.append("Cannot handle message ");
                                            sb2.append(message.what);
                                            sb2.append(", mCamera is null");
                                            auc.c(a5, sb2.toString());
                                            continue Label_1502_Outer;
                                            Label_1347:
                                            iftrue(Label_1441:)(this.d != null);
                                            break Block_41;
                                        }
                                        iftrue(Label_1265:)(!(ex6 instanceof RuntimeException));
                                        continue;
                                    }
                                    iftrue(Label_1391:)(what != 1);
                                }
                                break;
                            }
                        }
                        catch (final Exception ex7) {}
                    }
                    break;
                }
            }
        }
    }
}
