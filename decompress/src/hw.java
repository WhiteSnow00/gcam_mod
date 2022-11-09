import android.os.Bundle;
import android.net.Uri;
import android.content.ClipData;

// 
// Decompiled by Procyon v0.6.0
// 

public final class hw
{
    public final ClipData a;
    public final int b;
    public final int c;
    final Uri d;
    final Bundle e;
    
    public hw(final hv hv) {
        final ClipData a = hv.a;
        hh.d(a);
        this.a = a;
        this.b = hv.b;
        this.c = hv.c;
        this.d = hv.d;
        this.e = hv.e;
    }
    
    @Override
    public final String toString() {
        final StringBuilder sb = new StringBuilder();
        sb.append("ContentInfoCompat{clip=");
        sb.append(this.a.getDescription());
        sb.append(", source=");
        String s = null;
        switch (this.b) {
            default: {
                s = "SOURCE_DRAG_AND_DROP";
                break;
            }
            case 2: {
                s = "SOURCE_INPUT_METHOD";
                break;
            }
            case 1: {
                s = "SOURCE_CLIPBOARD";
                break;
            }
        }
        sb.append(s);
        sb.append(", flags=");
        String s2;
        if (1 != this.c) {
            s2 = "0";
        }
        else {
            s2 = "FLAG_CONVERT_TO_PLAIN_TEXT";
        }
        sb.append(s2);
        final Uri d = this.d;
        final String s3 = "";
        String string;
        if (d == null) {
            string = "";
        }
        else {
            final StringBuilder sb2 = new StringBuilder();
            sb2.append(", hasLinkUri(");
            sb2.append(this.d.toString().length());
            sb2.append(")");
            string = sb2.toString();
        }
        sb.append(string);
        String s4;
        if (this.e == null) {
            s4 = s3;
        }
        else {
            s4 = ", hasExtras";
        }
        sb.append(s4);
        sb.append("}");
        return sb.toString();
    }
}
