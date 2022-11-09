import android.media.AudioFormat;

// 
// Decompiled by Procyon v0.6.0
// 

final class mbb
{
    public final Object a;
    public final long b;
    public final int c;
    public final int d;
    public long e;
    
    public mbb(final AudioFormat audioFormat) {
        this.b = 1000000000L / audioFormat.getSampleRate();
        this.d = audioFormat.getChannelCount();
        this.c = a(audioFormat);
        this.a = new Object();
        this.e = 0L;
    }
    
    public static int a(final AudioFormat audioFormat) {
        switch (audioFormat.getEncoding()) {
            default: {
                final String value = String.valueOf(audioFormat);
                final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 17);
                sb.append("Bad audio format ");
                sb.append(value);
                throw new IllegalArgumentException(sb.toString());
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 1;
            }
            case 1:
            case 2:
            case 13: {
                return 2;
            }
        }
    }
}
