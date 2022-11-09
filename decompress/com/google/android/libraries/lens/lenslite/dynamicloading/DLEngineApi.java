// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.libraries.lens.lenslite.dynamicloading;

import com.google.android.libraries.lens.lenslite.api.DownloadListener;
import java.util.List;
import android.graphics.PointF;
import com.google.android.libraries.lens.lenslite.api.LoggingListener;
import com.google.android.libraries.lens.lenslite.api.LinkHighResBitmapRequester;
import com.google.android.libraries.lens.lenslite.api.KeyguardDismisser;
import android.os.Handler;
import com.google.android.libraries.lens.lenslite.api.LinkEventListener;
import android.app.AlertDialog$Builder;
import android.app.Activity;
import com.google.android.libraries.lens.lenslite.api.ImageProxy;
import android.media.Image;
import android.graphics.Bitmap;
import com.google.android.libraries.lens.lenslite.api.ModelInfoListener;
import com.google.android.libraries.lens.lenslite.api.DownloadParam;

public interface DLEngineApi
{
    void cancel();
    
    long getHostApiVersion();
    
    void getModelInfo(final DownloadParam p0, final ModelInfoListener p1);
    
    void invalidate();
    
    long onNewBitmap(final Bitmap p0, final int p1);
    
    long onNewImage(final Image p0, final int p1);
    
    long onNewImage(final ImageProxy p0, final int p1);
    
    void restart();
    
    void setActivity(final Activity p0);
    
    void setAlertDialogBuilder(final AlertDialog$Builder p0);
    
    void setEventListener(final LinkEventListener p0, final Handler p1);
    
    void setKeyguardDismisser(final KeyguardDismisser p0);
    
    void setLinkHighResBitmapRequester(final LinkHighResBitmapRequester p0);
    
    void setLoggingListener(final LoggingListener p0);
    
    void setPointOfInterest(final PointF p0);
    
    void setResultListener(final DLLinkResultListener p0);
    
    void shutdown();
    
    void start();
    
    void startDownload(final List p0, final DownloadListener p1);
    
    String startLinkLogging(final String p0, final int p1);
    
    void stop();
    
    void stopLinkLogging();
}
