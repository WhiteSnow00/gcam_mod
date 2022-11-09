import java.util.Locale;

// 
// Decompiled by Procyon v0.6.0
// 

public final class atj
{
    public static String a(final String s) {
        return s.toLowerCase(Locale.US).replaceAll("_", "-");
    }
    
    public static String b(final String s) {
        return s.toUpperCase(Locale.US).replaceAll("-", "_");
    }
    
    public static String c(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("UNKNOWN(");
                sb.append(n);
                sb.append(")");
                return sb.toString();
            }
            case 601: {
                return "CAPTURE_PHOTO";
            }
            case 502: {
                return "SET_DISPLAY_ORIENTATION";
            }
            case 501: {
                return "ENABLE_SHUTTER_SOUND";
            }
            case 463: {
                return "STOP_FACE_DETECTION";
            }
            case 462: {
                return "START_FACE_DETECTION";
            }
            case 461: {
                return "SET_FACE_DETECTION_LISTENER";
            }
            case 305: {
                return "CANCEL_AUTO_FOCUS_FINISH";
            }
            case 304: {
                return "SET_ZOOM_CHANGE_LISTENER";
            }
            case 303: {
                return "SET_AUTO_FOCUS_MOVE_CALLBACK";
            }
            case 302: {
                return "CANCEL_AUTO_FOCUS";
            }
            case 301: {
                return "AUTO_FOCUS";
            }
            case 204: {
                return "APPLY_SETTINGS";
            }
            case 203: {
                return "REFRESH_PARAMETERS";
            }
            case 202: {
                return "GET_PARAMETERS";
            }
            case 201: {
                return "SET_PARAMETERS";
            }
            case 108: {
                return "SET_ONE_SHOT_PREVIEW_CALLBACK";
            }
            case 107: {
                return "SET_PREVIEW_CALLBACK";
            }
            case 106: {
                return "SET_PREVIEW_DISPLAY_ASYNC";
            }
            case 105: {
                return "ADD_CALLBACK_BUFFER";
            }
            case 104: {
                return "SET_PREVIEW_CALLBACK_WITH_BUFFER";
            }
            case 103: {
                return "STOP_PREVIEW";
            }
            case 102: {
                return "START_PREVIEW_ASYNC";
            }
            case 101: {
                return "SET_PREVIEW_TEXTURE_ASYNC";
            }
            case 5: {
                return "LOCK";
            }
            case 4: {
                return "UNLOCK";
            }
            case 3: {
                return "RECONNECT";
            }
            case 2: {
                return "RELEASE";
            }
            case 1: {
                return "OPEN_CAMERA";
            }
        }
    }
}
