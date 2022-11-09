// 
// Decompiled by Procyon v0.6.0
// 

public enum knh implements kng
{
    a("H263", 0, "video/3gpp"), 
    b("H264", 1, "video/avc"), 
    c("MPEG_4_SP", 2, "video/mp4v-es"), 
    d("HEVC", 3, "video/hevc");
    
    public final String e;
    
    private knh(final String s, final int n, final String e) {
        this.e = e;
    }
    
    public static knh a(final int n) {
        switch (n) {
            default: {
                final StringBuilder sb = new StringBuilder(41);
                sb.append("Unsupported video codec type: ");
                sb.append(n);
                throw new IllegalArgumentException(sb.toString());
            }
            case 5: {
                return knh.d;
            }
            case 3: {
                return knh.c;
            }
            case 2: {
                return knh.b;
            }
            case 1: {
                return knh.a;
            }
        }
    }
    
    @Override
    public final String b() {
        return this.e;
    }
}
