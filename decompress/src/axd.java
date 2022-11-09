import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder$InternalRewinder;

// 
// Decompiled by Procyon v0.6.0
// 

public final class axd implements awr
{
    private final ParcelFileDescriptorRewinder$InternalRewinder a;
    
    public axd(final ParcelFileDescriptor parcelFileDescriptor) {
        this.a = new ParcelFileDescriptorRewinder$InternalRewinder(parcelFileDescriptor);
    }
    
    @Override
    public final void b() {
    }
    
    public final ParcelFileDescriptor c() {
        return this.a.rewind();
    }
}
