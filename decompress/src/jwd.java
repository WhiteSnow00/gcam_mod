import android.os.Parcel;

// 
// Decompiled by Procyon v0.6.0
// 

public final class jwd extends RuntimeException
{
    public jwd(final String s, final Parcel parcel) {
        final int dataPosition = parcel.dataPosition();
        final int dataSize = parcel.dataSize();
        final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 41);
        sb.append(s);
        sb.append(" Parcel: pos=");
        sb.append(dataPosition);
        sb.append(" size=");
        sb.append(dataSize);
        super(sb.toString());
    }
}
