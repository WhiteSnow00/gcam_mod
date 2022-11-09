// 
// Decompiled by Procyon v0.6.0
// 

package androidx.media;

import android.util.SparseIntArray;

public class AudioAttributesCompat implements agc
{
    private static final SparseIntArray b;
    public AudioAttributesImpl a;
    
    static {
        final SparseIntArray b2 = new SparseIntArray();
        (b = b2).put(5, 1);
        b2.put(6, 2);
        b2.put(7, 2);
        b2.put(8, 1);
        b2.put(9, 1);
        b2.put(10, 1);
    }
    
    static String a(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder();
                sb.append("unknown usage ");
                sb.append(n);
                return sb.toString();
            }
            case 16: {
                return "USAGE_ASSISTANT";
            }
            case 14: {
                return "USAGE_GAME";
            }
            case 13: {
                return "USAGE_ASSISTANCE_SONIFICATION";
            }
            case 12: {
                return "USAGE_ASSISTANCE_NAVIGATION_GUIDANCE";
            }
            case 11: {
                return "USAGE_ASSISTANCE_ACCESSIBILITY";
            }
            case 10: {
                return "USAGE_NOTIFICATION_EVENT";
            }
            case 9: {
                return "USAGE_NOTIFICATION_COMMUNICATION_DELAYED";
            }
            case 8: {
                return "USAGE_NOTIFICATION_COMMUNICATION_INSTANT";
            }
            case 7: {
                return "USAGE_NOTIFICATION_COMMUNICATION_REQUEST";
            }
            case 6: {
                return "USAGE_NOTIFICATION_RINGTONE";
            }
            case 5: {
                return "USAGE_NOTIFICATION";
            }
            case 4: {
                return "USAGE_ALARM";
            }
            case 3: {
                return "USAGE_VOICE_COMMUNICATION_SIGNALLING";
            }
            case 2: {
                return "USAGE_VOICE_COMMUNICATION";
            }
            case 1: {
                return "USAGE_MEDIA";
            }
            case 0: {
                return "USAGE_UNKNOWN";
            }
        }
    }
    
    static int b(int n, final int n2) {
        if ((n & 0x1) == 0x1) {
            return 7;
        }
        if ((n & 0x4) == 0x4) {
            return 6;
        }
        n = 3;
        switch (n2) {
            default: {
                return 3;
            }
            case 13: {
                return 1;
            }
            case 11: {
                return 10;
            }
            case 6: {
                return 2;
            }
            case 5:
            case 7:
            case 8:
            case 9:
            case 10: {
                return 5;
            }
            case 4: {
                return 4;
            }
            case 3: {
                return 8;
            }
            case 2: {
                n = 0;
            }
            case 0:
            case 1:
            case 12:
            case 14:
            case 16: {
                return n;
            }
        }
    }
    
    @Override
    public final boolean equals(final Object o) {
        if (!(o instanceof AudioAttributesCompat)) {
            return false;
        }
        final AudioAttributesCompat audioAttributesCompat = (AudioAttributesCompat)o;
        final AudioAttributesImpl a = this.a;
        if (a == null) {
            return audioAttributesCompat.a == null;
        }
        return a.equals(audioAttributesCompat.a);
    }
    
    @Override
    public final int hashCode() {
        return this.a.hashCode();
    }
    
    @Override
    public final String toString() {
        return this.a.toString();
    }
}
