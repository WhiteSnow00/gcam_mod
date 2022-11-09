// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.complications;

import android.content.Context;
import android.os.Parcelable;

public interface TimeDependentText extends Parcelable
{
    CharSequence a(final Context p0, final long p1);
    
    boolean b(final long p0, final long p1);
}
