// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.oliveoil.util;

public class JniUtil
{
    static {
        a();
    }
    
    public static void a() {
        try {
            System.loadLibrary("oliveoil");
        }
        catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
            if (System.getProperty("java.vm.name").equals("Dalvik")) {
                throw unsatisfiedLinkError;
            }
            final String value = String.valueOf(unsatisfiedLinkError);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 32);
            sb.append("Not running Dalvik VM. Details: ");
            sb.append(value);
            throw new UnsatisfiedLinkError(sb.toString());
        }
    }
}
