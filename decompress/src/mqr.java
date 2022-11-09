import android.net.Uri;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mqr
{
    public static final Uri a;
    
    static {
        a = Uri.withAppendedPath(mqu.a, "file");
        nns.o("file_name", "media_type", "mime_type");
        noi.M("file_name", "is_pending", "is_visible", "media_type", "mime_type", "progress_status", "progress_percentage", "restore_path", "special_type_id", "timezone_offset", "utc_timestamp");
    }
}
