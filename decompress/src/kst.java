// 
// Decompiled by Procyon v0.6.0
// 

public enum kst
{
    a("CAMERA_OPEN_TIMEOUT", 0, -12), 
    b("CAMERAS_NOT_ENUMERATED", 1, -11), 
    c("CAMERA_SECURITY_EXCEPTION", 2, -10), 
    d("CAMERA_ID_NOT_VALID", 3, -9), 
    e("CAMERA_ACCESS_CAMERA_ERROR", 4, -8), 
    f("CAMERA_ACCESS_CAMERA_DISCONNECTED", 5, -7), 
    g("CAMERA_ACCESS_CAMERA_DISABLED", 6, -6), 
    h("CAMERA_ACCESS_MAX_CAMERAS_IN_USE", 7, -5), 
    i("CAMERA_ACCESS_CAMERA_IN_USE", 8, -4), 
    j("CAMERA_NO_WAKELOCK_ERROR_CODE", 9, -3), 
    k("CAMERA_DISCONNECTED_ERROR_CODE", 10, -2), 
    l("CAMERA_CLOSED_ERROR_CODE", 11, -1), 
    m("CAMERA_ERROR_CODE_UNKNOWN", 12, 0), 
    n("CAMERA_DEVICE_ERROR_CAMERA_IN_USE", 13, 1), 
    o("CAMERA_DEVICE_ERROR_MAX_CAMERAS_IN_USE", 14, 2), 
    p("CAMERA_DEVICE_ERROR_CAMERA_DISABLED", 15, 3), 
    q("CAMERA_DEVICE_ERROR_CAMERA_DEVICE", 16, 4), 
    r("CAMERA_DEVICE_ERROR_CAMERA_SERVICE", 17, 5);
    
    public static final nnx s;
    private static final nnx u;
    public final int t;
    
    static {
        final nnt l2 = nnx.l();
        final Integer value = 4;
        final kst kst9;
        l2.d(value, kst9);
        final Integer value2 = 5;
        final kst kst8;
        l2.d(value2, kst8);
        final Integer value3 = 1;
        final kst kst7;
        l2.d(value3, kst7);
        final Integer value4 = 2;
        final kst kst6;
        l2.d(value4, kst6);
        final Integer value5 = 3;
        final kst kst5;
        l2.d(value5, kst5);
        u = l2.b();
        final nnt l3 = nnx.l();
        final kst kst14;
        l3.d(value3, kst14);
        final kst kst15;
        l3.d(value4, kst15);
        final kst kst16;
        l3.d(value5, kst16);
        final kst kst17;
        l3.d(value, kst17);
        final kst kst18;
        l3.d(value2, kst18);
        s = l3.b();
    }
    
    private kst(final String s, final int n, final int t) {
        this.t = t;
    }
    
    public static kst a(final int n) {
        final kst kst = (kst)kst.u.get(n);
        if (kst != null) {
            return kst;
        }
        throw new IllegalStateException("Unknown Camera Access error code");
    }
    
    public static boolean c(final kst kst) {
        return kst.equals(kst.b) || kst.equals(kst.e);
    }
    
    public static boolean d(final kst kst) {
        return kst.equals(kst.q) || kst.equals(kst.r);
    }
    
    public final String b() {
        switch (this.ordinal()) {
            default: {
                final int t = this.t;
                final StringBuilder sb = new StringBuilder(36);
                sb.append("Unknown failure reason (");
                sb.append(t);
                sb.append(")");
                return sb.toString();
            }
            case 17: {
                return "Camera service encountered a fatal error (5)";
            }
            case 16: {
                return "Camera encountered a fatal error (4)";
            }
            case 15: {
                return "Camera is disabled (3)";
            }
            case 14: {
                return "Maximum cameras in use (2)";
            }
            case 13: {
                return "Camera is in use (1)";
            }
            case 11: {
                return "App closed the camera device";
            }
            case 10: {
                return "Camera was disconnected";
            }
            case 9: {
                return "App is not holding a camera wakelock";
            }
            case 8: {
                return "CameraAccessException - The camera device is in use already.";
            }
            case 7: {
                return "CameraAccessException - Maximum cameras in use.";
            }
            case 6: {
                return "CameraAccessException - The camera is disabled due to a device policy, and cannot be opened.";
            }
            case 5: {
                return "CameraAccessException - Camera disconnected";
            }
            case 4: {
                return "CameraAccessException - The camera device is currently in the error state.";
            }
            case 3: {
                return "Camera id no longer valid";
            }
            case 2: {
                return "App does not have permission to access camera at the moment";
            }
            case 1: {
                return "Unable to connect to any camera";
            }
            case 0: {
                return "Camera open timed out.";
            }
        }
    }
}
