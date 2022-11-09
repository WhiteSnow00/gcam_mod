// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v4.graphics.drawable;

import android.graphics.Bitmap;
import android.graphics.drawable.Icon;
import android.content.res.ColorStateList;
import android.os.Parcelable;
import android.graphics.PorterDuff$Mode;
import androidx.versionedparcelable.CustomVersionedParcelable;

public class IconCompat extends CustomVersionedParcelable
{
    public static final PorterDuff$Mode a;
    public int b;
    public Object c;
    public byte[] d;
    public Parcelable e;
    public int f;
    public int g;
    public ColorStateList h;
    public PorterDuff$Mode i;
    public String j;
    public String k;
    
    static {
        a = PorterDuff$Mode.SRC_IN;
    }
    
    public IconCompat() {
        this.b = -1;
        this.d = null;
        this.e = null;
        this.f = 0;
        this.g = 0;
        this.h = null;
        this.i = IconCompat.a;
        this.j = null;
    }
    
    @Override
    public final String toString() {
        if (this.b == -1) {
            return String.valueOf(this.c);
        }
        final StringBuilder sb = new StringBuilder("Icon(typ=");
        String s = null;
        switch (this.b) {
            default: {
                s = "UNKNOWN";
                break;
            }
            case 6: {
                s = "URI_MASKABLE";
                break;
            }
            case 5: {
                s = "BITMAP_MASKABLE";
                break;
            }
            case 4: {
                s = "URI";
                break;
            }
            case 3: {
                s = "DATA";
                break;
            }
            case 2: {
                s = "RESOURCE";
                break;
            }
            case 1: {
                s = "BITMAP";
                break;
            }
        }
        sb.append(s);
        switch (this.b) {
            case 4:
            case 6: {
                sb.append(" uri=");
                sb.append(this.c);
                break;
            }
            case 3: {
                sb.append(" len=");
                sb.append(this.f);
                if (this.g != 0) {
                    sb.append(" off=");
                    sb.append(this.g);
                    break;
                }
                break;
            }
            case 2: {
                sb.append(" pkg=");
                sb.append(this.k);
                sb.append(" id=");
                final int b = this.b;
                int n;
                if (b == -1) {
                    n = ((Icon)this.c).getResId();
                }
                else {
                    if (b != 2) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("called getResId() on ");
                        sb2.append(this);
                        throw new IllegalStateException(sb2.toString());
                    }
                    n = this.f;
                }
                sb.append(String.format("0x%08x", n));
                break;
            }
            case 1:
            case 5: {
                sb.append(" size=");
                sb.append(((Bitmap)this.c).getWidth());
                sb.append("x");
                sb.append(((Bitmap)this.c).getHeight());
                break;
            }
        }
        if (this.h != null) {
            sb.append(" tint=");
            sb.append(this.h);
        }
        if (this.i != IconCompat.a) {
            sb.append(" mode=");
            sb.append(this.i);
        }
        sb.append(")");
        return sb.toString();
    }
}
