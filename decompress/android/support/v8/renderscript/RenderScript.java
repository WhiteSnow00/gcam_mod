// 
// Decompiled by Procyon v0.6.0
// 

package android.support.v8.renderscript;

import android.content.pm.ApplicationInfo;
import android.view.Surface;
import java.nio.ByteBuffer;
import android.graphics.Bitmap;
import android.os.Build;
import android.content.pm.PackageManager$NameNotFoundException;
import java.io.File;
import android.os.Build$VERSION;
import android.util.Log;
import java.util.Iterator;
import java.util.concurrent.locks.ReentrantReadWriteLock;
import android.content.Context;
import java.lang.reflect.Method;
import java.util.ArrayList;

public class RenderScript
{
    private static final String CACHE_PATH = "com.android.renderscript.cache";
    public static final int CREATE_FLAG_NONE = 0;
    static final boolean DEBUG = false;
    static final boolean LOG_ENABLED = false;
    static final String LOG_TAG = "RenderScript_jni";
    static final int SUPPORT_LIB_API = 23;
    static final int SUPPORT_LIB_VERSION = 2301;
    static Object lock;
    private static String mBlackList;
    static String mCachePath;
    private static ArrayList mProcessContextList;
    static Method registerNativeAllocation;
    static Method registerNativeFree;
    static boolean sInitialized;
    private static int sNative;
    static int sPointerSize;
    static Object sRuntime;
    private static int sSdkVersion;
    static boolean sUseGCHooks;
    private static boolean useIOlib;
    private static boolean useNative;
    private Context mApplicationContext;
    long mContext;
    private int mContextFlags;
    private int mContextSdkVersion;
    RenderScript$ContextType mContextType;
    private boolean mDestroyed;
    private int mDispatchAPILevel;
    Element mElement_ALLOCATION;
    Element mElement_A_8;
    Element mElement_BOOLEAN;
    Element mElement_CHAR_2;
    Element mElement_CHAR_3;
    Element mElement_CHAR_4;
    Element mElement_DOUBLE_2;
    Element mElement_DOUBLE_3;
    Element mElement_DOUBLE_4;
    Element mElement_ELEMENT;
    Element mElement_F32;
    Element mElement_F64;
    Element mElement_FLOAT_2;
    Element mElement_FLOAT_3;
    Element mElement_FLOAT_4;
    Element mElement_I16;
    Element mElement_I32;
    Element mElement_I64;
    Element mElement_I8;
    Element mElement_INT_2;
    Element mElement_INT_3;
    Element mElement_INT_4;
    Element mElement_LONG_2;
    Element mElement_LONG_3;
    Element mElement_LONG_4;
    Element mElement_MATRIX_2X2;
    Element mElement_MATRIX_3X3;
    Element mElement_MATRIX_4X4;
    Element mElement_RGBA_4444;
    Element mElement_RGBA_5551;
    Element mElement_RGBA_8888;
    Element mElement_RGB_565;
    Element mElement_RGB_888;
    Element mElement_SAMPLER;
    Element mElement_SCRIPT;
    Element mElement_SHORT_2;
    Element mElement_SHORT_3;
    Element mElement_SHORT_4;
    Element mElement_TYPE;
    Element mElement_U16;
    Element mElement_U32;
    Element mElement_U64;
    Element mElement_U8;
    Element mElement_UCHAR_2;
    Element mElement_UCHAR_3;
    Element mElement_UCHAR_4;
    Element mElement_UINT_2;
    Element mElement_UINT_3;
    Element mElement_UINT_4;
    Element mElement_ULONG_2;
    Element mElement_ULONG_3;
    Element mElement_ULONG_4;
    Element mElement_USHORT_2;
    Element mElement_USHORT_3;
    Element mElement_USHORT_4;
    private boolean mEnableMultiInput;
    RenderScript$RSErrorHandler mErrorCallback;
    long mIncCon;
    boolean mIncLoaded;
    private boolean mIsProcessContext;
    RenderScript$RSMessageHandler mMessageCallback;
    RenderScript$MessageThread mMessageThread;
    private String mNativeLibDir;
    ReentrantReadWriteLock mRWLock;
    Sampler mSampler_CLAMP_LINEAR;
    Sampler mSampler_CLAMP_LINEAR_MIP_LINEAR;
    Sampler mSampler_CLAMP_NEAREST;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_LINEAR_MIP_LINEAR;
    Sampler mSampler_MIRRORED_REPEAT_NEAREST;
    Sampler mSampler_WRAP_LINEAR;
    Sampler mSampler_WRAP_LINEAR_MIP_LINEAR;
    Sampler mSampler_WRAP_NEAREST;
    
    static {
        RenderScript.mProcessContextList = new ArrayList();
        RenderScript.mBlackList = "";
        RenderScript.lock = new Object();
        RenderScript.sNative = -1;
        RenderScript.sSdkVersion = -1;
        RenderScript.useIOlib = false;
    }
    
    public RenderScript(Context applicationContext) {
        this.mIsProcessContext = false;
        this.mEnableMultiInput = false;
        this.mDispatchAPILevel = 0;
        this.mContextFlags = 0;
        this.mContextSdkVersion = 0;
        this.mDestroyed = false;
        this.mMessageCallback = null;
        this.mErrorCallback = null;
        this.mContextType = RenderScript$ContextType.NORMAL;
        if (applicationContext != null) {
            applicationContext = applicationContext.getApplicationContext();
            this.mApplicationContext = applicationContext;
            this.mNativeLibDir = applicationContext.getApplicationInfo().nativeLibraryDir;
        }
        this.mIncCon = 0L;
        this.mIncLoaded = false;
        this.mRWLock = new ReentrantReadWriteLock();
    }
    
    public static RenderScript create(final Context context) {
        return create(context, RenderScript$ContextType.NORMAL);
    }
    
    public static RenderScript create(final Context context, final int n) {
        return create(context, n, RenderScript$ContextType.NORMAL, 0);
    }
    
    public static RenderScript create(final Context context, final int n, final RenderScript$ContextType renderScript$ContextType) {
        return create(context, n, renderScript$ContextType, 0);
    }
    
    public static RenderScript create(final Context context, final int n, final RenderScript$ContextType renderScript$ContextType, final int n2) {
        final ArrayList mProcessContextList = RenderScript.mProcessContextList;
        monitorenter(mProcessContextList);
        try {
            for (RenderScript renderScript : RenderScript.mProcessContextList) {
                if (renderScript.mContextType == renderScript$ContextType && renderScript.mContextFlags == n2 && renderScript.mContextSdkVersion == n) {
                    monitorexit(mProcessContextList);
                    return renderScript;
                }
            }
            final RenderScript internalCreate = internalCreate(context, n, renderScript$ContextType, n2);
            internalCreate.mIsProcessContext = true;
            RenderScript.mProcessContextList.add(internalCreate);
            monitorexit(mProcessContextList);
            return internalCreate;
        }
        finally {
            monitorexit(mProcessContextList);
            while (true) {}
        }
    }
    
    public static RenderScript create(final Context context, final RenderScript$ContextType renderScript$ContextType) {
        return create(context, renderScript$ContextType, 0);
    }
    
    public static RenderScript create(final Context context, final RenderScript$ContextType renderScript$ContextType, final int n) {
        return create(context, context.getApplicationInfo().targetSdkVersion, renderScript$ContextType, n);
    }
    
    public static RenderScript createMultiContext(final Context context, final RenderScript$ContextType renderScript$ContextType, final int n, final int n2) {
        return internalCreate(context, n2, renderScript$ContextType, n);
    }
    
    public static void forceCompat() {
        RenderScript.sNative = 0;
    }
    
    private void helpDestroy() {
        monitorenter(this);
        try {
            final boolean mDestroyed = this.mDestroyed;
            final int n = 0;
            boolean b;
            if (!mDestroyed) {
                this.mDestroyed = true;
                b = true;
            }
            else {
                b = false;
            }
            monitorexit(this);
            if (b) {
                this.nContextFinish();
                if (this.mIncCon != 0L) {
                    this.nIncContextFinish();
                    this.nIncContextDestroy();
                    this.mIncCon = 0L;
                }
                this.nContextDeinitToClient(this.mContext);
                final RenderScript$MessageThread mMessageThread = this.mMessageThread;
                mMessageThread.mRun = false;
                mMessageThread.interrupt();
                final int n2 = 0;
                int i = n;
                int n3 = n2;
                while (i == 0) {
                    try {
                        this.mMessageThread.join();
                        i = 1;
                    }
                    catch (final InterruptedException ex) {
                        n3 = 1;
                    }
                }
                if (n3 != 0) {
                    Thread.currentThread().interrupt();
                }
                this.nContextDestroy();
            }
        }
        finally {
            monitorexit(this);
            while (true) {}
        }
    }
    
    private static RenderScript internalCreate(Context lock, final int n, final RenderScript$ContextType mContextType, final int mContextFlags) {
        final RenderScript renderScript = new RenderScript((Context)lock);
        final int sSdkVersion = RenderScript.sSdkVersion;
        if (sSdkVersion == -1) {
            RenderScript.sSdkVersion = n;
        }
        else if (sSdkVersion != n) {
            throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
        }
        RenderScript.useNative = setupNative(RenderScript.sSdkVersion, (Context)lock);
        lock = (UnsatisfiedLinkError)RenderScript.lock;
        synchronized (lock) {
            if (!RenderScript.sInitialized) {
                try {
                    final Class<?> forName = Class.forName("dalvik.system.VMRuntime");
                    RenderScript.sRuntime = forName.getDeclaredMethod("getRuntime", (Class[])new Class[0]).invoke(null, new Object[0]);
                    RenderScript.registerNativeAllocation = forName.getDeclaredMethod("registerNativeAllocation", Integer.TYPE);
                    RenderScript.registerNativeFree = forName.getDeclaredMethod("registerNativeFree", Integer.TYPE);
                    RenderScript.sUseGCHooks = true;
                }
                catch (final Exception ex) {
                    Log.e("RenderScript_jni", "No GC methods");
                    RenderScript.sUseGCHooks = false;
                }
                try {
                    System.loadLibrary("rsjni");
                    RenderScript.sInitialized = true;
                    RenderScript.sPointerSize = rsnSystemGetPointerSize();
                }
                catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                    final StringBuilder sb = new StringBuilder();
                    sb.append("Error loading RS jni library: ");
                    sb.append(unsatisfiedLinkError);
                    Log.e("RenderScript_jni", sb.toString());
                    final StringBuilder sb2 = new StringBuilder();
                    sb2.append("Error loading RS jni library: ");
                    sb2.append(unsatisfiedLinkError);
                    sb2.append(" Support lib API: ");
                    sb2.append(2301);
                    throw new RSRuntimeException(sb2.toString());
                }
            }
            monitorexit(lock);
            RenderScript.useIOlib = true;
            int sdk_INT;
            if (n < Build$VERSION.SDK_INT) {
                sdk_INT = Build$VERSION.SDK_INT;
            }
            else {
                sdk_INT = n;
            }
            if (!renderScript.nLoadSO(RenderScript.useNative, sdk_INT, null)) {
                if (RenderScript.useNative) {
                    RenderScript.useNative = false;
                }
                try {
                    System.loadLibrary("RSSupport");
                    if (!renderScript.nLoadSO(false, sdk_INT, null)) {
                        Log.e("RenderScript_jni", "Error loading RS Compat library: nLoadSO() failed; Support lib version: 2301");
                        throw new RSRuntimeException("Error loading libRSSupport library, Support lib version: 2301");
                    }
                }
                catch (final UnsatisfiedLinkError lock) {
                    final StringBuilder sb3 = new StringBuilder();
                    sb3.append("Error loading RS Compat library: ");
                    sb3.append(lock);
                    sb3.append(" Support lib version: 2301");
                    Log.e("RenderScript_jni", sb3.toString());
                    final StringBuilder sb4 = new StringBuilder();
                    sb4.append("Error loading RS Compat library: ");
                    sb4.append(lock);
                    sb4.append(" Support lib version: 2301");
                    throw new RSRuntimeException(sb4.toString());
                }
            }
            if (RenderScript.useIOlib) {
                try {
                    System.loadLibrary("RSSupportIO");
                }
                catch (final UnsatisfiedLinkError lock) {
                    RenderScript.useIOlib = false;
                }
                if (!RenderScript.useIOlib || !renderScript.nLoadIOSO()) {
                    RenderScript.useIOlib = false;
                }
            }
            if (sdk_INT >= 23) {
                renderScript.mEnableMultiInput = true;
                try {
                    System.loadLibrary("blasV8");
                }
                catch (final UnsatisfiedLinkError unsatisfiedLinkError2) {
                    lock = (UnsatisfiedLinkError)new StringBuilder();
                    ((StringBuilder)lock).append("Unable to load BLAS lib, ONLY BNNM will be supported: ");
                    ((StringBuilder)lock).append(unsatisfiedLinkError2);
                    ((StringBuilder)lock).toString();
                }
            }
            final long nContextCreate = renderScript.nContextCreate(renderScript.nDeviceCreate(), 0, n, mContextType.mID, renderScript.mNativeLibDir);
            renderScript.mContext = nContextCreate;
            renderScript.mContextType = mContextType;
            renderScript.mContextFlags = mContextFlags;
            renderScript.mContextSdkVersion = n;
            renderScript.mDispatchAPILevel = sdk_INT;
            if (nContextCreate != 0L) {
                lock = (UnsatisfiedLinkError)new RenderScript$MessageThread(renderScript);
                (renderScript.mMessageThread = (RenderScript$MessageThread)lock).start();
                return renderScript;
            }
            throw new RSDriverException("Failed to create RS context.");
        }
        throw new RSRuntimeException("Can't have two contexts with different SDK versions in support lib");
    }
    
    public static void releaseAllContexts() {
        Object mProcessContextList = RenderScript.mProcessContextList;
        monitorenter(mProcessContextList);
        try {
            final ArrayList mProcessContextList2 = RenderScript.mProcessContextList;
            RenderScript.mProcessContextList = new ArrayList();
            monitorexit(mProcessContextList);
            for (int size = mProcessContextList2.size(), i = 0; i < size; ++i) {
                mProcessContextList = mProcessContextList2.get(i);
                ((RenderScript)mProcessContextList).mIsProcessContext = false;
                ((RenderScript)mProcessContextList).destroy();
            }
            mProcessContextList2.clear();
        }
        finally {
            monitorexit(mProcessContextList);
            while (true) {}
        }
    }
    
    static native int rsnSystemGetPointerSize();
    
    public static void setBlackList(final String mBlackList) {
        if (mBlackList != null) {
            RenderScript.mBlackList = mBlackList;
        }
    }
    
    public static void setupDiskCache(File file) {
        file = new File(file, "com.android.renderscript.cache");
        RenderScript.mCachePath = file.getAbsolutePath();
        file.mkdirs();
    }
    
    private static boolean setupNative(int intValue, Context applicationInfo) {
        if (RenderScript.sNative == -1) {
            Label_0090: {
                try {
                    intValue = (int)Class.forName("android.os.SystemProperties").getDeclaredMethod("getInt", String.class, Integer.TYPE).invoke(null, "debug.rs.forcecompat", new Integer(0));
                    if (intValue != 0) {
                        RenderScript.sNative = 0;
                        break Label_0090;
                    }
                }
                catch (final Exception ex) {}
                RenderScript.sNative = 1;
            }
            if (RenderScript.sNative == 1) {
                try {
                    applicationInfo = (Context)applicationInfo.getPackageManager().getApplicationInfo(applicationInfo.getPackageName(), 128);
                    long longValue;
                    try {
                        longValue = (long)Class.forName("android.renderscript.RenderScript").getDeclaredMethod("getMinorID", (Class<?>[])new Class[0]).invoke(null, new Object[0]);
                    }
                    catch (final Exception ex2) {
                        longValue = 0L;
                    }
                    if (((ApplicationInfo)applicationInfo).metaData != null) {
                        if (((ApplicationInfo)applicationInfo).metaData.getBoolean("com.android.support.v8.renderscript.EnableAsyncTeardown") && longValue == 0L) {
                            RenderScript.sNative = 0;
                        }
                        ((ApplicationInfo)applicationInfo).metaData.getBoolean("com.android.support.v8.renderscript.EnableBlurWorkaround");
                    }
                }
                catch (final PackageManager$NameNotFoundException ex3) {
                    return true;
                }
            }
        }
        if (RenderScript.sNative == 1) {
            if (RenderScript.mBlackList.length() > 0) {
                final StringBuilder sb = new StringBuilder();
                sb.append('(');
                sb.append(Build.MANUFACTURER);
                sb.append(':');
                sb.append(Build.PRODUCT);
                sb.append(':');
                sb.append(Build.MODEL);
                sb.append(')');
                if (RenderScript.mBlackList.contains(sb.toString())) {
                    RenderScript.sNative = 0;
                    return false;
                }
            }
            return true;
        }
        return false;
    }
    
    public void contextDump() {
        this.validate();
        this.nContextDump(0);
    }
    
    public void destroy() {
        if (this.mIsProcessContext) {
            return;
        }
        this.validate();
        this.helpDestroy();
    }
    
    @Override
    protected void finalize() {
        this.helpDestroy();
        super.finalize();
    }
    
    public void finish() {
        this.nContextFinish();
    }
    
    public final Context getApplicationContext() {
        return this.mApplicationContext;
    }
    
    public int getDispatchAPILevel() {
        return this.mDispatchAPILevel;
    }
    
    public RenderScript$RSErrorHandler getErrorHandler() {
        return this.mErrorCallback;
    }
    
    public RenderScript$RSMessageHandler getMessageHandler() {
        return this.mMessageCallback;
    }
    
    public boolean isAlive() {
        return this.mContext != 0L;
    }
    
    public boolean isUseNative() {
        return RenderScript.useNative;
    }
    
    public void nAllocationCopyFromBitmap(final long n, final Bitmap bitmap) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationCopyFromBitmap(this.mContext, n, bitmap);
        }
    }
    
    public void nAllocationCopyToBitmap(final long n, final Bitmap bitmap) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationCopyToBitmap(this.mContext, n, bitmap);
        }
    }
    
    public long nAllocationCreateBitmapBackedAllocation(long rsnAllocationCreateBitmapBackedAllocation, final int n, final Bitmap bitmap, final int n2) {
        synchronized (this) {
            this.validate();
            rsnAllocationCreateBitmapBackedAllocation = this.rsnAllocationCreateBitmapBackedAllocation(this.mContext, rsnAllocationCreateBitmapBackedAllocation, n, bitmap, n2);
            return rsnAllocationCreateBitmapBackedAllocation;
        }
    }
    
    long nAllocationCreateBitmapRef(long rsnAllocationCreateBitmapRef, final Bitmap bitmap) {
        synchronized (this) {
            this.validate();
            rsnAllocationCreateBitmapRef = this.rsnAllocationCreateBitmapRef(this.mContext, rsnAllocationCreateBitmapRef, bitmap);
            return rsnAllocationCreateBitmapRef;
        }
    }
    
    long nAllocationCreateFromAssetStream(final int n, final int n2, final int n3) {
        synchronized (this) {
            this.validate();
            return this.rsnAllocationCreateFromAssetStream(this.mContext, n, n2, n3);
        }
    }
    
    public long nAllocationCreateFromBitmap(long rsnAllocationCreateFromBitmap, final int n, final Bitmap bitmap, final int n2) {
        synchronized (this) {
            this.validate();
            rsnAllocationCreateFromBitmap = this.rsnAllocationCreateFromBitmap(this.mContext, rsnAllocationCreateFromBitmap, n, bitmap, n2);
            return rsnAllocationCreateFromBitmap;
        }
    }
    
    public long nAllocationCreateTyped(long rsnAllocationCreateTyped, final int n, final int n2, final long n3) {
        synchronized (this) {
            this.validate();
            rsnAllocationCreateTyped = this.rsnAllocationCreateTyped(this.mContext, rsnAllocationCreateTyped, n, n2, n3);
            return rsnAllocationCreateTyped;
        }
    }
    
    public long nAllocationCubeCreateFromBitmap(long rsnAllocationCubeCreateFromBitmap, final int n, final Bitmap bitmap, final int n2) {
        synchronized (this) {
            this.validate();
            rsnAllocationCubeCreateFromBitmap = this.rsnAllocationCubeCreateFromBitmap(this.mContext, rsnAllocationCubeCreateFromBitmap, n, bitmap, n2);
            return rsnAllocationCubeCreateFromBitmap;
        }
    }
    
    public void nAllocationData1D(final long n, final int n2, final int n3, final int n4, final Object o, final int n5, final Element$DataType element$DataType, final int n6, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationData1D(this.mContext, n, n2, n3, n4, o, n5, element$DataType.mID, n6, b);
        }
    }
    
    public void nAllocationData2D(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final long n8, final int n9, final int n10, final int n11, final int n12) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationData2D(this.mContext, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12);
        }
    }
    
    public void nAllocationData2D(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Object o, final int n8, final Element$DataType element$DataType, final int n9, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationData2D(this.mContext, n, n2, n3, n4, n5, n6, n7, o, n8, element$DataType.mID, n9, b);
        }
    }
    
    public void nAllocationData2D(final long n, final int n2, final int n3, final int n4, final int n5, final Bitmap bitmap) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationData2D(this.mContext, n, n2, n3, n4, n5, bitmap);
        }
    }
    
    public void nAllocationData3D(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final long n9, final int n10, final int n11, final int n12, final int n13) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationData3D(this.mContext, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13);
        }
    }
    
    public void nAllocationData3D(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final Object o, final int n9, final Element$DataType element$DataType, final int n10, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationData3D(this.mContext, n, n2, n3, n4, n5, n6, n7, n8, o, n9, element$DataType.mID, n10, b);
        }
    }
    
    public void nAllocationElementData1D(final long n, final int n2, final int n3, final int n4, final byte[] array, final int n5) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationElementData1D(this.mContext, n, n2, n3, n4, array, n5);
        }
    }
    
    public void nAllocationGenerateMipmaps(final long n) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationGenerateMipmaps(this.mContext, n);
        }
    }
    
    public ByteBuffer nAllocationGetByteBuffer(final long n, final int n2, final int n3, final int n4) {
        synchronized (this) {
            this.validate();
            return this.rsnAllocationGetByteBuffer(this.mContext, n, n2, n3, n4);
        }
    }
    
    public long nAllocationGetStride(long rsnAllocationGetStride) {
        synchronized (this) {
            this.validate();
            rsnAllocationGetStride = this.rsnAllocationGetStride(this.mContext, rsnAllocationGetStride);
            return rsnAllocationGetStride;
        }
    }
    
    long nAllocationGetType(long rsnAllocationGetType) {
        synchronized (this) {
            this.validate();
            rsnAllocationGetType = this.rsnAllocationGetType(this.mContext, rsnAllocationGetType);
            return rsnAllocationGetType;
        }
    }
    
    public void nAllocationIoReceive(final long n) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationIoReceive(this.mContext, n);
        }
    }
    
    public void nAllocationIoSend(final long n) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationIoSend(this.mContext, n);
        }
    }
    
    public void nAllocationRead(final long n, final Object o, final Element$DataType element$DataType, final int n2, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationRead(this.mContext, n, o, element$DataType.mID, n2, b);
        }
    }
    
    public void nAllocationRead1D(final long n, final int n2, final int n3, final int n4, final Object o, final int n5, final Element$DataType element$DataType, final int n6, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationRead1D(this.mContext, n, n2, n3, n4, o, n5, element$DataType.mID, n6, b);
        }
    }
    
    public void nAllocationRead2D(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final Object o, final int n8, final Element$DataType element$DataType, final int n9, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationRead2D(this.mContext, n, n2, n3, n4, n5, n6, n7, o, n8, element$DataType.mID, n9, b);
        }
    }
    
    void nAllocationResize1D(final long n, final int n2) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationResize1D(this.mContext, n, n2);
        }
    }
    
    void nAllocationResize2D(final long n, final int n2, final int n3) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationResize2D(this.mContext, n, n2, n3);
        }
    }
    
    public void nAllocationSetSurface(final long n, final Surface surface) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationSetSurface(this.mContext, n, surface);
        }
    }
    
    public void nAllocationSyncAll(final long n, final int n2) {
        synchronized (this) {
            this.validate();
            this.rsnAllocationSyncAll(this.mContext, n, n2);
        }
    }
    
    public long nClosureCreate(long rsnClosureCreate, final long n, final long[] array, final long[] array2, final int[] array3, final long[] array4, final long[] array5) {
        synchronized (this) {
            this.validate();
            rsnClosureCreate = this.rsnClosureCreate(this.mContext, rsnClosureCreate, n, array, array2, array3, array4, array5);
            if (rsnClosureCreate != 0L) {
                return rsnClosureCreate;
            }
            throw new RSRuntimeException("Failed creating closure.");
        }
    }
    
    public void nClosureSetArg(final long n, final int n2, final long n3, final int n4) {
        synchronized (this) {
            this.validate();
            this.rsnClosureSetArg(this.mContext, n, n2, n3, n4);
        }
    }
    
    public void nClosureSetGlobal(final long n, final long n2, final long n3, final int n4) {
        synchronized (this) {
            this.validate();
            this.rsnClosureSetGlobal(this.mContext, n, n2, n3, n4);
        }
    }
    
    public long nContextCreate(long rsnContextCreate, final int n, final int n2, final int n3, final String s) {
        synchronized (this) {
            rsnContextCreate = this.rsnContextCreate(rsnContextCreate, n, n2, n3, s);
            return rsnContextCreate;
        }
    }
    
    public native void nContextDeinitToClient(final long p0);
    
    public void nContextDestroy() {
        synchronized (this) {
            this.validate();
            final ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
            writeLock.lock();
            final long mContext = this.mContext;
            this.mContext = 0L;
            writeLock.unlock();
            this.rsnContextDestroy(mContext);
        }
    }
    
    public void nContextDump(final int n) {
        synchronized (this) {
            this.validate();
            this.rsnContextDump(this.mContext, n);
        }
    }
    
    public void nContextFinish() {
        synchronized (this) {
            this.validate();
            this.rsnContextFinish(this.mContext);
        }
    }
    
    public native String nContextGetErrorMessage(final long p0);
    
    public native int nContextGetUserMessage(final long p0, final int[] p1);
    
    public native void nContextInitToClient(final long p0);
    
    public native int nContextPeekMessage(final long p0, final int[] p1);
    
    public void nContextSendMessage(final int n, final int[] array) {
        synchronized (this) {
            this.validate();
            this.rsnContextSendMessage(this.mContext, n, array);
        }
    }
    
    public void nContextSetPriority(final int n) {
        synchronized (this) {
            this.validate();
            this.rsnContextSetPriority(this.mContext, n);
        }
    }
    
    public native long nDeviceCreate();
    
    native void nDeviceDestroy(final long p0);
    
    native void nDeviceSetConfig(final long p0, final int p1, final int p2);
    
    public long nElementCreate(long rsnElementCreate, final int n, final boolean b, final int n2) {
        synchronized (this) {
            this.validate();
            rsnElementCreate = this.rsnElementCreate(this.mContext, rsnElementCreate, n, b, n2);
            return rsnElementCreate;
        }
    }
    
    public long nElementCreate2(final long[] array, final String[] array2, final int[] array3) {
        synchronized (this) {
            this.validate();
            return this.rsnElementCreate2(this.mContext, array, array2, array3);
        }
    }
    
    void nElementGetNativeData(final long n, final int[] array) {
        synchronized (this) {
            this.validate();
            this.rsnElementGetNativeData(this.mContext, n, array);
        }
    }
    
    void nElementGetSubElements(final long n, final long[] array, final String[] array2, final int[] array3) {
        synchronized (this) {
            this.validate();
            this.rsnElementGetSubElements(this.mContext, n, array, array2, array3);
        }
    }
    
    public long nIncAllocationCreateTyped(long rsnIncAllocationCreateTyped, final long n, final int n2) {
        synchronized (this) {
            this.validate();
            rsnIncAllocationCreateTyped = this.rsnIncAllocationCreateTyped(this.mContext, this.mIncCon, rsnIncAllocationCreateTyped, n, n2);
            return rsnIncAllocationCreateTyped;
        }
    }
    
    public long nIncContextCreate(long rsnIncContextCreate, final int n, final int n2, final int n3) {
        synchronized (this) {
            rsnIncContextCreate = this.rsnIncContextCreate(rsnIncContextCreate, n, n2, n3);
            return rsnIncContextCreate;
        }
    }
    
    public void nIncContextDestroy() {
        synchronized (this) {
            this.validate();
            final ReentrantReadWriteLock.WriteLock writeLock = this.mRWLock.writeLock();
            writeLock.lock();
            final long mIncCon = this.mIncCon;
            this.mIncCon = 0L;
            writeLock.unlock();
            this.rsnIncContextDestroy(mIncCon);
        }
    }
    
    public void nIncContextFinish() {
        synchronized (this) {
            this.validate();
            this.rsnIncContextFinish(this.mIncCon);
        }
    }
    
    public native long nIncDeviceCreate();
    
    native void nIncDeviceDestroy(final long p0);
    
    public long nIncElementCreate(long rsnIncElementCreate, final int n, final boolean b, final int n2) {
        synchronized (this) {
            this.validate();
            rsnIncElementCreate = this.rsnIncElementCreate(this.mIncCon, rsnIncElementCreate, n, b, n2);
            return rsnIncElementCreate;
        }
    }
    
    public native boolean nIncLoadSO(final int p0, final String p1);
    
    public void nIncObjDestroy(final long n) {
        final long mIncCon = this.mIncCon;
        if (mIncCon != 0L) {
            this.rsnIncObjDestroy(mIncCon, n);
        }
    }
    
    public long nIncTypeCreate(long rsnIncTypeCreate, final int n, final int n2, final int n3, final boolean b, final boolean b2, final int n4) {
        synchronized (this) {
            this.validate();
            rsnIncTypeCreate = this.rsnIncTypeCreate(this.mIncCon, rsnIncTypeCreate, n, n2, n3, b, b2, n4);
            return rsnIncTypeCreate;
        }
    }
    
    public long nInvokeClosureCreate(long rsnInvokeClosureCreate, final byte[] array, final long[] array2, final long[] array3, final int[] array4) {
        synchronized (this) {
            this.validate();
            rsnInvokeClosureCreate = this.rsnInvokeClosureCreate(this.mContext, rsnInvokeClosureCreate, array, array2, array3, array4);
            if (rsnInvokeClosureCreate != 0L) {
                return rsnInvokeClosureCreate;
            }
            throw new RSRuntimeException("Failed creating closure.");
        }
    }
    
    public native boolean nLoadIOSO();
    
    public native boolean nLoadSO(final boolean p0, final int p1, final String p2);
    
    public void nObjDestroy(final long n) {
        final long mContext = this.mContext;
        if (mContext != 0L) {
            this.rsnObjDestroy(mContext, n);
        }
    }
    
    public long nSamplerCreate(final int n, final int n2, final int n3, final int n4, final int n5, final float n6) {
        synchronized (this) {
            this.validate();
            return this.rsnSamplerCreate(this.mContext, n, n2, n3, n4, n5, n6);
        }
    }
    
    public void nScriptBindAllocation(final long n, final long n2, final int n3, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptBindAllocation(n4, n, n2, n3, b);
        }
    }
    
    public long nScriptCCreate(final String s, final String s2, final byte[] array, final int n) {
        synchronized (this) {
            this.validate();
            return this.rsnScriptCCreate(this.mContext, s, s2, array, n);
        }
    }
    
    public long nScriptFieldIDCreate(long rsnScriptFieldIDCreate, final int n, final boolean b) {
        synchronized (this) {
            this.validate();
            long n2 = this.mContext;
            if (b) {
                n2 = this.mIncCon;
            }
            rsnScriptFieldIDCreate = this.rsnScriptFieldIDCreate(n2, rsnScriptFieldIDCreate, n, b);
            return rsnScriptFieldIDCreate;
        }
    }
    
    public void nScriptForEach(final long n, final int n2, final long n3, final long n4, final byte[] array, final boolean b) {
        synchronized (this) {
            this.validate();
            if (array == null) {
                this.rsnScriptForEach(this.mContext, this.mIncCon, n, n2, n3, n4, b);
                return;
            }
            this.rsnScriptForEach(this.mContext, this.mIncCon, n, n2, n3, n4, array, b);
        }
    }
    
    public void nScriptForEach(final long n, final int n2, final long[] array, final long n3, final byte[] array2, final int[] array3) {
        synchronized (this) {
            if (this.mEnableMultiInput) {
                this.validate();
                this.rsnScriptForEach(this.mContext, n, n2, array, n3, array2, array3);
                return;
            }
            Log.e("RenderScript_jni", "Multi-input kernels are not supported, please change targetSdkVersion to >= 23");
            throw new RSRuntimeException("Multi-input kernels are not supported before API 23)");
        }
    }
    
    public void nScriptForEachClipped(final long n, final int n2, final long n3, final long n4, final byte[] array, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final boolean b) {
        monitorenter(this);
        try {
            this.validate();
            if (array == null) {
                final long mContext = this.mContext;
                final long mIncCon = this.mIncCon;
                try {
                    this.rsnScriptForEachClipped(mContext, mIncCon, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, b);
                    monitorexit(this);
                    return;
                }
                finally {}
            }
            this.rsnScriptForEachClipped(this.mContext, this.mIncCon, n, n2, n3, n4, array, n5, n6, n7, n8, n9, n10, b);
            monitorexit(this);
            return;
        }
        finally {}
        monitorexit(this);
    }
    
    public long nScriptGroup2Create(final String s, final String s2, final long[] array) {
        synchronized (this) {
            this.validate();
            return this.rsnScriptGroup2Create(this.mContext, s, s2, array);
        }
    }
    
    public void nScriptGroup2Execute(final long n) {
        synchronized (this) {
            this.validate();
            this.rsnScriptGroup2Execute(this.mContext, n);
        }
    }
    
    public long nScriptGroupCreate(final long[] array, final long[] array2, final long[] array3, final long[] array4, final long[] array5) {
        synchronized (this) {
            this.validate();
            return this.rsnScriptGroupCreate(this.mContext, array, array2, array3, array4, array5);
        }
    }
    
    public void nScriptGroupExecute(final long n) {
        synchronized (this) {
            this.validate();
            this.rsnScriptGroupExecute(this.mContext, n);
        }
    }
    
    public void nScriptGroupSetInput(final long n, final long n2, final long n3) {
        synchronized (this) {
            this.validate();
            this.rsnScriptGroupSetInput(this.mContext, n, n2, n3);
        }
    }
    
    public void nScriptGroupSetOutput(final long n, final long n2, final long n3) {
        synchronized (this) {
            this.validate();
            this.rsnScriptGroupSetOutput(this.mContext, n, n2, n3);
        }
    }
    
    public void nScriptIntrinsicBLAS_BNNM(final long n, final int n2, final int n3, final int n4, final long n5, final int n6, final long n7, final int n8, final long n9, final int n10, final int n11, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnScriptIntrinsicBLAS_BNNM(this.mContext, this.mIncCon, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, b);
        }
    }
    
    public void nScriptIntrinsicBLAS_Complex(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final float n11, final float n12, final long n13, final long n14, final float n15, final float n16, final long n17, final int n18, final int n19, final int n20, final int n21, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnScriptIntrinsicBLAS_Complex(this.mContext, this.mIncCon, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, b);
        }
    }
    
    public void nScriptIntrinsicBLAS_Double(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final double n11, final long n12, final long n13, final double n14, final long n15, final int n16, final int n17, final int n18, final int n19, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnScriptIntrinsicBLAS_Double(this.mContext, this.mIncCon, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, b);
        }
    }
    
    public void nScriptIntrinsicBLAS_Single(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final float n11, final long n12, final long n13, final float n14, final long n15, final int n16, final int n17, final int n18, final int n19, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnScriptIntrinsicBLAS_Single(this.mContext, this.mIncCon, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, b);
        }
    }
    
    public void nScriptIntrinsicBLAS_Z(final long n, final int n2, final int n3, final int n4, final int n5, final int n6, final int n7, final int n8, final int n9, final int n10, final double n11, final double n12, final long n13, final long n14, final double n15, final double n16, final long n17, final int n18, final int n19, final int n20, final int n21, final boolean b) {
        synchronized (this) {
            this.validate();
            this.rsnScriptIntrinsicBLAS_Z(this.mContext, this.mIncCon, n, n2, n3, n4, n5, n6, n7, n8, n9, n10, n11, n12, n13, n14, n15, n16, n17, n18, n19, n20, n21, b);
        }
    }
    
    public long nScriptIntrinsicCreate(final int n, long n2, final boolean b) {
        synchronized (this) {
            this.validate();
            if (b) {
                if (!this.mIncLoaded) {
                    try {
                        System.loadLibrary("RSSupport");
                        final StringBuilder sb = new StringBuilder();
                        sb.append(this.mNativeLibDir);
                        sb.append("/libRSSupport.so");
                        if (!this.nIncLoadSO(23, sb.toString())) {
                            throw new RSRuntimeException("Error loading libRSSupport library for Incremental Intrinsic Support");
                        }
                        this.mIncLoaded = true;
                    }
                    catch (final UnsatisfiedLinkError unsatisfiedLinkError) {
                        final StringBuilder sb2 = new StringBuilder();
                        sb2.append("Error loading RS Compat library for Incremental Intrinsic Support: ");
                        sb2.append(unsatisfiedLinkError);
                        Log.e("RenderScript_jni", sb2.toString());
                        final StringBuilder sb3 = new StringBuilder();
                        sb3.append("Error loading RS Compat library for Incremental Intrinsic Support: ");
                        sb3.append(unsatisfiedLinkError);
                        throw new RSRuntimeException(sb3.toString());
                    }
                }
                long mIncCon = this.mIncCon;
                if (mIncCon == 0L) {
                    mIncCon = this.nIncContextCreate(this.nIncDeviceCreate(), 0, 0, 0);
                    this.mIncCon = mIncCon;
                }
                n2 = this.rsnScriptIntrinsicCreate(mIncCon, n, n2, true);
                return n2;
            }
            n2 = this.rsnScriptIntrinsicCreate(this.mContext, n, n2, false);
            return n2;
        }
    }
    
    public void nScriptInvoke(final long n, final int n2, final boolean b) {
        synchronized (this) {
            this.validate();
            long n3 = this.mContext;
            if (b) {
                n3 = this.mIncCon;
            }
            this.rsnScriptInvoke(n3, n, n2, b);
        }
    }
    
    public long nScriptInvokeIDCreate(long rsnScriptInvokeIDCreate, final int n) {
        synchronized (this) {
            this.validate();
            rsnScriptInvokeIDCreate = this.rsnScriptInvokeIDCreate(this.mContext, rsnScriptInvokeIDCreate, n);
            return rsnScriptInvokeIDCreate;
        }
    }
    
    public void nScriptInvokeV(final long n, final int n2, final byte[] array, final boolean b) {
        synchronized (this) {
            this.validate();
            long n3 = this.mContext;
            if (b) {
                n3 = this.mIncCon;
            }
            this.rsnScriptInvokeV(n3, n, n2, array, b);
        }
    }
    
    public long nScriptKernelIDCreate(long rsnScriptKernelIDCreate, final int n, final int n2, final boolean b) {
        synchronized (this) {
            this.validate();
            long n3 = this.mContext;
            if (b) {
                n3 = this.mIncCon;
            }
            rsnScriptKernelIDCreate = this.rsnScriptKernelIDCreate(n3, rsnScriptKernelIDCreate, n, n2, b);
            return rsnScriptKernelIDCreate;
        }
    }
    
    public void nScriptReduce(final long n, final int n2, final long[] array, final long n3, final int[] array2) {
        synchronized (this) {
            this.validate();
            this.rsnScriptReduce(this.mContext, n, n2, array, n3, array2);
        }
    }
    
    public void nScriptSetTimeZone(final long n, final byte[] array, final boolean b) {
        synchronized (this) {
            this.validate();
            long n2 = this.mContext;
            if (b) {
                n2 = this.mIncCon;
            }
            this.rsnScriptSetTimeZone(n2, n, array, b);
        }
    }
    
    public void nScriptSetVarD(final long n, final int n2, final double n3, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptSetVarD(n4, n, n2, n3, b);
        }
    }
    
    public void nScriptSetVarF(final long n, final int n2, final float n3, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptSetVarF(n4, n, n2, n3, b);
        }
    }
    
    public void nScriptSetVarI(final long n, final int n2, final int n3, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptSetVarI(n4, n, n2, n3, b);
        }
    }
    
    public void nScriptSetVarJ(final long n, final int n2, final long n3, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptSetVarJ(n4, n, n2, n3, b);
        }
    }
    
    public void nScriptSetVarObj(final long n, final int n2, final long n3, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptSetVarObj(n4, n, n2, n3, b);
        }
    }
    
    public void nScriptSetVarV(final long n, final int n2, final byte[] array, final boolean b) {
        synchronized (this) {
            this.validate();
            long n3 = this.mContext;
            if (b) {
                n3 = this.mIncCon;
            }
            this.rsnScriptSetVarV(n3, n, n2, array, b);
        }
    }
    
    public void nScriptSetVarVE(final long n, final int n2, final byte[] array, final long n3, final int[] array2, final boolean b) {
        synchronized (this) {
            this.validate();
            long n4 = this.mContext;
            if (b) {
                n4 = this.mIncCon;
            }
            this.rsnScriptSetVarVE(n4, n, n2, array, n3, array2, b);
        }
    }
    
    public long nTypeCreate(long rsnTypeCreate, final int n, final int n2, final int n3, final boolean b, final boolean b2, final int n4) {
        synchronized (this) {
            this.validate();
            rsnTypeCreate = this.rsnTypeCreate(this.mContext, rsnTypeCreate, n, n2, n3, b, b2, n4);
            return rsnTypeCreate;
        }
    }
    
    void nTypeGetNativeData(final long n, final long[] array) {
        synchronized (this) {
            this.validate();
            this.rsnTypeGetNativeData(this.mContext, n, array);
        }
    }
    
    public native void rsnAllocationCopyFromBitmap(final long p0, final long p1, final Bitmap p2);
    
    public native void rsnAllocationCopyToBitmap(final long p0, final long p1, final Bitmap p2);
    
    public native long rsnAllocationCreateBitmapBackedAllocation(final long p0, final long p1, final int p2, final Bitmap p3, final int p4);
    
    public native long rsnAllocationCreateBitmapRef(final long p0, final long p1, final Bitmap p2);
    
    public native long rsnAllocationCreateFromAssetStream(final long p0, final int p1, final int p2, final int p3);
    
    public native long rsnAllocationCreateFromBitmap(final long p0, final long p1, final int p2, final Bitmap p3, final int p4);
    
    public native long rsnAllocationCreateTyped(final long p0, final long p1, final int p2, final int p3, final long p4);
    
    public native long rsnAllocationCubeCreateFromBitmap(final long p0, final long p1, final int p2, final Bitmap p3, final int p4);
    
    public native void rsnAllocationData1D(final long p0, final long p1, final int p2, final int p3, final int p4, final Object p5, final int p6, final int p7, final int p8, final boolean p9);
    
    public native void rsnAllocationData2D(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final long p8, final int p9, final int p10, final int p11, final int p12);
    
    public native void rsnAllocationData2D(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final Object p8, final int p9, final int p10, final int p11, final boolean p12);
    
    public native void rsnAllocationData2D(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final Bitmap p6);
    
    public native void rsnAllocationData3D(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final long p9, final int p10, final int p11, final int p12, final int p13);
    
    public native void rsnAllocationData3D(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final Object p9, final int p10, final int p11, final int p12, final boolean p13);
    
    public native void rsnAllocationElementData1D(final long p0, final long p1, final int p2, final int p3, final int p4, final byte[] p5, final int p6);
    
    public native void rsnAllocationGenerateMipmaps(final long p0, final long p1);
    
    public native ByteBuffer rsnAllocationGetByteBuffer(final long p0, final long p1, final int p2, final int p3, final int p4);
    
    public native long rsnAllocationGetStride(final long p0, final long p1);
    
    public native long rsnAllocationGetType(final long p0, final long p1);
    
    public native void rsnAllocationIoReceive(final long p0, final long p1);
    
    public native void rsnAllocationIoSend(final long p0, final long p1);
    
    public native void rsnAllocationRead(final long p0, final long p1, final Object p2, final int p3, final int p4, final boolean p5);
    
    public native void rsnAllocationRead1D(final long p0, final long p1, final int p2, final int p3, final int p4, final Object p5, final int p6, final int p7, final int p8, final boolean p9);
    
    public native void rsnAllocationRead2D(final long p0, final long p1, final int p2, final int p3, final int p4, final int p5, final int p6, final int p7, final Object p8, final int p9, final int p10, final int p11, final boolean p12);
    
    public native void rsnAllocationResize1D(final long p0, final long p1, final int p2);
    
    public native void rsnAllocationResize2D(final long p0, final long p1, final int p2, final int p3);
    
    public native void rsnAllocationSetSurface(final long p0, final long p1, final Surface p2);
    
    public native void rsnAllocationSyncAll(final long p0, final long p1, final int p2);
    
    public native long rsnClosureCreate(final long p0, final long p1, final long p2, final long[] p3, final long[] p4, final int[] p5, final long[] p6, final long[] p7);
    
    public native void rsnClosureSetArg(final long p0, final long p1, final int p2, final long p3, final int p4);
    
    public native void rsnClosureSetGlobal(final long p0, final long p1, final long p2, final long p3, final int p4);
    
    public native long rsnContextCreate(final long p0, final int p1, final int p2, final int p3, final String p4);
    
    public native void rsnContextDestroy(final long p0);
    
    public native void rsnContextDump(final long p0, final int p1);
    
    public native void rsnContextFinish(final long p0);
    
    public native void rsnContextSendMessage(final long p0, final int p1, final int[] p2);
    
    public native void rsnContextSetPriority(final long p0, final int p1);
    
    public native long rsnElementCreate(final long p0, final long p1, final int p2, final boolean p3, final int p4);
    
    public native long rsnElementCreate2(final long p0, final long[] p1, final String[] p2, final int[] p3);
    
    public native void rsnElementGetNativeData(final long p0, final long p1, final int[] p2);
    
    public native void rsnElementGetSubElements(final long p0, final long p1, final long[] p2, final String[] p3, final int[] p4);
    
    public native long rsnIncAllocationCreateTyped(final long p0, final long p1, final long p2, final long p3, final int p4);
    
    public native long rsnIncContextCreate(final long p0, final int p1, final int p2, final int p3);
    
    public native void rsnIncContextDestroy(final long p0);
    
    public native void rsnIncContextFinish(final long p0);
    
    public native long rsnIncElementCreate(final long p0, final long p1, final int p2, final boolean p3, final int p4);
    
    public native void rsnIncObjDestroy(final long p0, final long p1);
    
    public native long rsnIncTypeCreate(final long p0, final long p1, final int p2, final int p3, final int p4, final boolean p5, final boolean p6, final int p7);
    
    public native long rsnInvokeClosureCreate(final long p0, final long p1, final byte[] p2, final long[] p3, final long[] p4, final int[] p5);
    
    public native void rsnObjDestroy(final long p0, final long p1);
    
    public native long rsnSamplerCreate(final long p0, final int p1, final int p2, final int p3, final int p4, final int p5, final float p6);
    
    public native void rsnScriptBindAllocation(final long p0, final long p1, final long p2, final int p3, final boolean p4);
    
    public native long rsnScriptCCreate(final long p0, final String p1, final String p2, final byte[] p3, final int p4);
    
    public native long rsnScriptFieldIDCreate(final long p0, final long p1, final int p2, final boolean p3);
    
    public native void rsnScriptForEach(final long p0, final long p1, final int p2, final long[] p3, final long p4, final byte[] p5, final int[] p6);
    
    public native void rsnScriptForEach(final long p0, final long p1, final long p2, final int p3, final long p4, final long p5, final boolean p6);
    
    public native void rsnScriptForEach(final long p0, final long p1, final long p2, final int p3, final long p4, final long p5, final byte[] p6, final boolean p7);
    
    public native void rsnScriptForEachClipped(final long p0, final long p1, final long p2, final int p3, final long p4, final long p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final boolean p12);
    
    public native void rsnScriptForEachClipped(final long p0, final long p1, final long p2, final int p3, final long p4, final long p5, final byte[] p6, final int p7, final int p8, final int p9, final int p10, final int p11, final int p12, final boolean p13);
    
    public native long rsnScriptGroup2Create(final long p0, final String p1, final String p2, final long[] p3);
    
    public native void rsnScriptGroup2Execute(final long p0, final long p1);
    
    public native long rsnScriptGroupCreate(final long p0, final long[] p1, final long[] p2, final long[] p3, final long[] p4, final long[] p5);
    
    public native void rsnScriptGroupExecute(final long p0, final long p1);
    
    public native void rsnScriptGroupSetInput(final long p0, final long p1, final long p2, final long p3);
    
    public native void rsnScriptGroupSetOutput(final long p0, final long p1, final long p2, final long p3);
    
    public native void rsnScriptIntrinsicBLAS_BNNM(final long p0, final long p1, final long p2, final int p3, final int p4, final int p5, final long p6, final int p7, final long p8, final int p9, final long p10, final int p11, final int p12, final boolean p13);
    
    public native void rsnScriptIntrinsicBLAS_Complex(final long p0, final long p1, final long p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final float p12, final float p13, final long p14, final long p15, final float p16, final float p17, final long p18, final int p19, final int p20, final int p21, final int p22, final boolean p23);
    
    public native void rsnScriptIntrinsicBLAS_Double(final long p0, final long p1, final long p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final double p12, final long p13, final long p14, final double p15, final long p16, final int p17, final int p18, final int p19, final int p20, final boolean p21);
    
    public native void rsnScriptIntrinsicBLAS_Single(final long p0, final long p1, final long p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final float p12, final long p13, final long p14, final float p15, final long p16, final int p17, final int p18, final int p19, final int p20, final boolean p21);
    
    public native void rsnScriptIntrinsicBLAS_Z(final long p0, final long p1, final long p2, final int p3, final int p4, final int p5, final int p6, final int p7, final int p8, final int p9, final int p10, final int p11, final double p12, final double p13, final long p14, final long p15, final double p16, final double p17, final long p18, final int p19, final int p20, final int p21, final int p22, final boolean p23);
    
    public native long rsnScriptIntrinsicCreate(final long p0, final int p1, final long p2, final boolean p3);
    
    public native void rsnScriptInvoke(final long p0, final long p1, final int p2, final boolean p3);
    
    public native long rsnScriptInvokeIDCreate(final long p0, final long p1, final int p2);
    
    public native void rsnScriptInvokeV(final long p0, final long p1, final int p2, final byte[] p3, final boolean p4);
    
    public native long rsnScriptKernelIDCreate(final long p0, final long p1, final int p2, final int p3, final boolean p4);
    
    public native void rsnScriptReduce(final long p0, final long p1, final int p2, final long[] p3, final long p4, final int[] p5);
    
    public native void rsnScriptSetTimeZone(final long p0, final long p1, final byte[] p2, final boolean p3);
    
    public native void rsnScriptSetVarD(final long p0, final long p1, final int p2, final double p3, final boolean p4);
    
    public native void rsnScriptSetVarF(final long p0, final long p1, final int p2, final float p3, final boolean p4);
    
    public native void rsnScriptSetVarI(final long p0, final long p1, final int p2, final int p3, final boolean p4);
    
    public native void rsnScriptSetVarJ(final long p0, final long p1, final int p2, final long p3, final boolean p4);
    
    public native void rsnScriptSetVarObj(final long p0, final long p1, final int p2, final long p3, final boolean p4);
    
    public native void rsnScriptSetVarV(final long p0, final long p1, final int p2, final byte[] p3, final boolean p4);
    
    public native void rsnScriptSetVarVE(final long p0, final long p1, final int p2, final byte[] p3, final long p4, final int[] p5, final boolean p6);
    
    public native long rsnTypeCreate(final long p0, final long p1, final int p2, final int p3, final int p4, final boolean p5, final boolean p6, final int p7);
    
    public native void rsnTypeGetNativeData(final long p0, final long p1, final long[] p2);
    
    public long safeID(final BaseObj baseObj) {
        if (baseObj != null) {
            return baseObj.getID(this);
        }
        return 0L;
    }
    
    public void sendMessage(final int n, final int[] array) {
        this.nContextSendMessage(n, array);
    }
    
    public void setErrorHandler(final RenderScript$RSErrorHandler mErrorCallback) {
        this.mErrorCallback = mErrorCallback;
    }
    
    public void setMessageHandler(final RenderScript$RSMessageHandler mMessageCallback) {
        this.mMessageCallback = mMessageCallback;
    }
    
    public void setPriority(final RenderScript$Priority renderScript$Priority) {
        this.validate();
        this.nContextSetPriority(renderScript$Priority.mID);
    }
    
    public boolean usingIO() {
        return RenderScript.useIOlib;
    }
    
    public void validate() {
        if (this.mContext != 0L) {
            return;
        }
        throw new RSInvalidStateException("Calling RS with no Context active.");
    }
    
    public void validateObject(final BaseObj baseObj) {
        if (baseObj != null && baseObj.mRS != this) {
            throw new RSIllegalArgumentException("Attempting to use an object across contexts.");
        }
    }
}
