import com.google.mediapipe.framework.MediaPipeException;
import java.util.NoSuchElementException;
import com.google.mediapipe.framework.ProtoUtil$SerializedMessage;

// 
// Decompiled by Procyon v0.6.0
// 

public final class ojc
{
    static final ojd a;
    
    static {
        a = new ojd();
    }
    
    public static ProtoUtil$SerializedMessage a(final omj omj) {
        final ProtoUtil$SerializedMessage protoUtil$SerializedMessage = new ProtoUtil$SerializedMessage();
        protoUtil$SerializedMessage.typeName = ojc.a.a.get(omj.getClass());
        if (protoUtil$SerializedMessage.typeName != null) {
            protoUtil$SerializedMessage.value = omj.g();
            return protoUtil$SerializedMessage;
        }
        final String value = String.valueOf(omj.getClass());
        final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 96);
        sb.append("Cannot determine the protobuf type name for class: ");
        sb.append(value);
        sb.append(". Have you called ProtoUtil.registerTypeName?");
        throw new NoSuchElementException(sb.toString());
    }
    
    public static void b(final Class clazz, final String s) {
        final ojd a = ojc.a;
        if (a.a.containsKey(clazz) && !((String)a.a.get(clazz)).equals(s)) {
            final int ordinal = ojb.g.ordinal();
            final String s2 = a.a.get(clazz);
            final StringBuilder sb = new StringBuilder(s.length() + 37 + String.valueOf(s2).length());
            sb.append("Protobuf type name: ");
            sb.append(s);
            sb.append(" conflicts with: ");
            sb.append(s2);
            throw new MediaPipeException(ordinal, sb.toString());
        }
        a.a.put(clazz, s);
    }
}
