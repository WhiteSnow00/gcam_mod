// 
// Decompiled by Procyon v0.6.0
// 

package android.support.wearable.complications.rendering;

import j$.util.Objects;
import android.app.PendingIntent$CanceledException;
import android.content.Intent;
import android.content.ComponentName;
import android.util.Log;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.text.TextPaint;
import android.support.wearable.complications.ComplicationData;
import android.graphics.ColorFilter;
import android.graphics.Canvas;
import android.graphics.Typeface;
import android.content.res.Resources$Theme;
import android.content.res.TypedArray;
import android.util.Xml;
import org.xmlpull.v1.XmlPullParser;
import android.content.res.Resources;
import android.os.Bundle;
import android.graphics.Rect;
import android.os.Parcel;
import android.os.Looper;
import android.os.Handler;
import android.content.Context;
import android.os.Parcelable$Creator;
import android.os.Parcelable;
import android.graphics.drawable.Drawable;

public class ComplicationDrawable extends Drawable implements Parcelable
{
    public static final int BORDER_STYLE_DASHED = 2;
    public static final int BORDER_STYLE_NONE = 0;
    public static final int BORDER_STYLE_SOLID = 1;
    public static final Parcelable$Creator CREATOR;
    private static final String FIELD_ACTIVE_STYLE_BUILDER = "active_style_builder";
    private static final String FIELD_AMBIENT_STYLE_BUILDER = "ambient_style_builder";
    private static final String FIELD_BOUNDS = "bounds";
    private static final String FIELD_HIGHLIGHT_DURATION = "highlight_duration";
    private static final String FIELD_NO_DATA_TEXT = "no_data_text";
    private static final String FIELD_RANGED_VALUE_PROGRESS_HIDDEN = "ranged_value_progress_hidden";
    private static final String TAG = "ComplicationDrawable";
    private final ComplicationStyle$Builder mActiveStyleBuilder;
    private boolean mAlreadyStyled;
    private final ComplicationStyle$Builder mAmbientStyleBuilder;
    private boolean mBurnInProtection;
    private ur mComplicationRenderer;
    private Context mContext;
    private long mCurrentTimeMillis;
    private long mHighlightDuration;
    private boolean mInAmbientMode;
    private boolean mIsHighlighted;
    private boolean mIsInflatedFromXml;
    private boolean mIsStyleUpToDate;
    private boolean mLowBitAmbient;
    private final Handler mMainThreadHandler;
    private CharSequence mNoDataText;
    private boolean mRangedValueProgressHidden;
    private final up mRendererInvalidateListener;
    private final Runnable mUnhighlightRunnable;
    
    static {
        CREATOR = (Parcelable$Creator)new ul();
    }
    
    public ComplicationDrawable() {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new um(this);
        this.mRendererInvalidateListener = new un(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder();
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder();
    }
    
    public ComplicationDrawable(final Context context) {
        this();
        this.setContext(context);
    }
    
    private ComplicationDrawable(final Parcel parcel) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new um(this);
        this.mRendererInvalidateListener = new un(this);
        final Bundle bundle = parcel.readBundle(this.getClass().getClassLoader());
        this.mActiveStyleBuilder = (ComplicationStyle$Builder)bundle.getParcelable("active_style_builder");
        this.mAmbientStyleBuilder = (ComplicationStyle$Builder)bundle.getParcelable("ambient_style_builder");
        this.mNoDataText = bundle.getCharSequence("no_data_text");
        this.mHighlightDuration = bundle.getLong("highlight_duration");
        this.mRangedValueProgressHidden = bundle.getBoolean("ranged_value_progress_hidden");
        this.setBounds((Rect)bundle.getParcelable("bounds"));
        this.mAlreadyStyled = true;
    }
    
    public ComplicationDrawable(final ComplicationDrawable complicationDrawable) {
        this.mMainThreadHandler = new Handler(Looper.getMainLooper());
        this.mUnhighlightRunnable = new um(this);
        this.mRendererInvalidateListener = new un(this);
        this.mActiveStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mActiveStyleBuilder);
        this.mAmbientStyleBuilder = new ComplicationStyle$Builder(complicationDrawable.mAmbientStyleBuilder);
        final CharSequence mNoDataText = complicationDrawable.mNoDataText;
        this.mNoDataText = mNoDataText.subSequence(0, mNoDataText.length());
        this.mHighlightDuration = complicationDrawable.mHighlightDuration;
        this.mRangedValueProgressHidden = complicationDrawable.mRangedValueProgressHidden;
        this.setBounds(complicationDrawable.getBounds());
        this.mAlreadyStyled = true;
    }
    
    private void assertInitialized() {
        if (this.mContext != null) {
            return;
        }
        throw new IllegalStateException("ComplicationDrawable does not have a context. Use setContext(Context) to set it first.");
    }
    
    private ComplicationStyle$Builder getComplicationStyleBuilder(final boolean b) {
        ComplicationStyle$Builder complicationStyle$Builder;
        if (b) {
            complicationStyle$Builder = this.mAmbientStyleBuilder;
        }
        else {
            complicationStyle$Builder = this.mActiveStyleBuilder;
        }
        return complicationStyle$Builder;
    }
    
    private void inflateAttributes(final Resources resources, final XmlPullParser xmlPullParser) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), ug.e);
        this.setRangedValueProgressHidden(obtainAttributes.getBoolean(11, false));
        obtainAttributes.recycle();
    }
    
    private void inflateStyle(final boolean b, final Resources resources, final XmlPullParser xmlPullParser) {
        final TypedArray obtainAttributes = resources.obtainAttributes(Xml.asAttributeSet(xmlPullParser), ug.e);
        final ComplicationStyle$Builder complicationStyleBuilder = this.getComplicationStyleBuilder(b);
        if (obtainAttributes.hasValue(0)) {
            complicationStyleBuilder.a = obtainAttributes.getColor(0, resources.getColor(2131099762, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(1)) {
            complicationStyleBuilder.b = obtainAttributes.getDrawable(1);
        }
        if (obtainAttributes.hasValue(14)) {
            complicationStyleBuilder.c = obtainAttributes.getColor(14, resources.getColor(2131099768, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(17)) {
            complicationStyleBuilder.d = obtainAttributes.getColor(17, resources.getColor(2131099769, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(16)) {
            complicationStyleBuilder.e = Typeface.create(obtainAttributes.getString(16), 0);
        }
        if (obtainAttributes.hasValue(19)) {
            complicationStyleBuilder.f = Typeface.create(obtainAttributes.getString(19), 0);
        }
        if (obtainAttributes.hasValue(15)) {
            complicationStyleBuilder.g = obtainAttributes.getDimensionPixelSize(15, resources.getDimensionPixelSize(2131165358));
        }
        if (obtainAttributes.hasValue(18)) {
            complicationStyleBuilder.h = obtainAttributes.getDimensionPixelSize(18, resources.getDimensionPixelSize(2131165359));
        }
        if (obtainAttributes.hasValue(9)) {
            complicationStyleBuilder.j = obtainAttributes.getColor(9, resources.getColor(2131099765, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(2)) {
            complicationStyleBuilder.k = obtainAttributes.getColor(2, resources.getColor(2131099763, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(5)) {
            complicationStyleBuilder.n = obtainAttributes.getDimensionPixelSize(5, resources.getDimensionPixelSize(2131165355));
        }
        if (obtainAttributes.hasValue(6)) {
            complicationStyleBuilder.b(obtainAttributes.getInt(6, resources.getInteger(2131492885)));
        }
        if (obtainAttributes.hasValue(4)) {
            complicationStyleBuilder.l = obtainAttributes.getDimensionPixelSize(4, resources.getDimensionPixelSize(2131165354));
        }
        if (obtainAttributes.hasValue(3)) {
            complicationStyleBuilder.m = obtainAttributes.getDimensionPixelSize(3, resources.getDimensionPixelSize(2131165353));
        }
        if (obtainAttributes.hasValue(7)) {
            complicationStyleBuilder.o = obtainAttributes.getDimensionPixelSize(7, resources.getDimensionPixelSize(2131165356));
        }
        if (obtainAttributes.hasValue(12)) {
            complicationStyleBuilder.p = obtainAttributes.getDimensionPixelSize(12, resources.getDimensionPixelSize(2131165357));
        }
        if (obtainAttributes.hasValue(10)) {
            complicationStyleBuilder.q = obtainAttributes.getColor(10, resources.getColor(2131099766, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(13)) {
            complicationStyleBuilder.r = obtainAttributes.getColor(13, resources.getColor(2131099767, (Resources$Theme)null));
        }
        if (obtainAttributes.hasValue(8)) {
            complicationStyleBuilder.s = obtainAttributes.getColor(8, resources.getColor(2131099764, (Resources$Theme)null));
        }
        obtainAttributes.recycle();
    }
    
    private static void setStyleToDefaultValues(final ComplicationStyle$Builder complicationStyle$Builder, final Resources resources) {
        complicationStyle$Builder.a = resources.getColor(2131099762, (Resources$Theme)null);
        complicationStyle$Builder.c = resources.getColor(2131099768, (Resources$Theme)null);
        complicationStyle$Builder.d = resources.getColor(2131099769, (Resources$Theme)null);
        complicationStyle$Builder.e = Typeface.create(resources.getString(2131951870), 0);
        complicationStyle$Builder.f = Typeface.create(resources.getString(2131951871), 0);
        complicationStyle$Builder.g = resources.getDimensionPixelSize(2131165358);
        complicationStyle$Builder.h = resources.getDimensionPixelSize(2131165359);
        complicationStyle$Builder.j = resources.getColor(2131099765, (Resources$Theme)null);
        complicationStyle$Builder.k = resources.getColor(2131099763, (Resources$Theme)null);
        complicationStyle$Builder.o = resources.getDimensionPixelSize(2131165356);
        complicationStyle$Builder.n = resources.getDimensionPixelSize(2131165355);
        complicationStyle$Builder.b(resources.getInteger(2131492885));
        complicationStyle$Builder.l = resources.getDimensionPixelSize(2131165354);
        complicationStyle$Builder.m = resources.getDimensionPixelSize(2131165353);
        complicationStyle$Builder.p = resources.getDimensionPixelSize(2131165357);
        complicationStyle$Builder.q = resources.getColor(2131099766, (Resources$Theme)null);
        complicationStyle$Builder.r = resources.getColor(2131099767, (Resources$Theme)null);
        complicationStyle$Builder.s = resources.getColor(2131099764, (Resources$Theme)null);
    }
    
    private void updateStyleIfRequired() {
        if (!this.mIsStyleUpToDate) {
            this.mComplicationRenderer.g(this.mActiveStyleBuilder.a(), this.mAmbientStyleBuilder.a());
            this.mIsStyleUpToDate = true;
        }
    }
    
    public int describeContents() {
        return 0;
    }
    
    public void draw(final Canvas canvas) {
        this.assertInitialized();
        this.updateStyleIfRequired();
        final ur mComplicationRenderer = this.mComplicationRenderer;
        final long mCurrentTimeMillis = this.mCurrentTimeMillis;
        final boolean mInAmbientMode = this.mInAmbientMode;
        final boolean mLowBitAmbient = this.mLowBitAmbient;
        final boolean mBurnInProtection = this.mBurnInProtection;
        final boolean mIsHighlighted = this.mIsHighlighted;
        final ComplicationData b = mComplicationRenderer.b;
        if (b != null) {
            final int b2 = b.b;
            if (b2 != 2 && b2 != 1 && mCurrentTimeMillis >= b.c.getLong("START_TIME", 0L) && mCurrentTimeMillis <= b.c.getLong("END_TIME", Long.MAX_VALUE)) {
                if (!mComplicationRenderer.c.isEmpty()) {
                    uq uq;
                    if (mInAmbientMode) {
                        final uq w = mComplicationRenderer.w;
                        if (w.j != mLowBitAmbient || w.k != mBurnInProtection) {
                            mComplicationRenderer.w = new uq(mComplicationRenderer.z, true, mLowBitAmbient, mBurnInProtection);
                        }
                        uq = mComplicationRenderer.w;
                    }
                    else {
                        uq = mComplicationRenderer.v;
                    }
                    if (mComplicationRenderer.b.h() != null) {
                        mComplicationRenderer.l.e(1);
                        mComplicationRenderer.l.g(mComplicationRenderer.b.h().a(mComplicationRenderer.a, mCurrentTimeMillis));
                        if (mComplicationRenderer.b.i() != null) {
                            mComplicationRenderer.m.g(mComplicationRenderer.b.i().a(mComplicationRenderer.a, mCurrentTimeMillis));
                        }
                        else {
                            mComplicationRenderer.m.g("");
                        }
                    }
                    if (mComplicationRenderer.b.f() != null) {
                        mComplicationRenderer.l.g(mComplicationRenderer.b.f().a(mComplicationRenderer.a, mCurrentTimeMillis));
                        if (mComplicationRenderer.b.g() != null) {
                            mComplicationRenderer.m.g(mComplicationRenderer.b.g().a(mComplicationRenderer.a, mCurrentTimeMillis));
                            mComplicationRenderer.l.e(1);
                        }
                        else {
                            mComplicationRenderer.m.g("");
                            mComplicationRenderer.l.e(2);
                        }
                    }
                    canvas.save();
                    canvas.translate((float)mComplicationRenderer.c.left, (float)mComplicationRenderer.c.top);
                    final int a = mComplicationRenderer.a(uq.h);
                    final float n = (float)a;
                    canvas.drawRoundRect(mComplicationRenderer.o, n, n, uq.f);
                    if (uq.h.c != null && !uq.a()) {
                        mComplicationRenderer.i.a(uq.h.c);
                        final uu i = mComplicationRenderer.i;
                        i.b = a;
                        i.setBounds(mComplicationRenderer.n);
                        mComplicationRenderer.i.draw(canvas);
                    }
                    if (!mComplicationRenderer.p.isEmpty()) {
                        final Drawable d = mComplicationRenderer.d;
                        if (d != null) {
                            Drawable drawable = d;
                            if (uq.a()) {
                                final Drawable e = mComplicationRenderer.e;
                                drawable = d;
                                if (e != null) {
                                    drawable = e;
                                }
                            }
                            drawable.setColorFilter(uq.l);
                            final Rect p = mComplicationRenderer.p;
                            drawable.setBounds(0, 0, p.width(), p.height());
                            canvas.save();
                            canvas.translate((float)p.left, (float)p.top);
                            drawable.draw(canvas);
                            canvas.restore();
                        }
                    }
                    Label_0753: {
                        if (!mComplicationRenderer.q.isEmpty()) {
                            if (!uq.a()) {
                                mComplicationRenderer.k.a(mComplicationRenderer.f);
                                if (mComplicationRenderer.f == null) {
                                    break Label_0753;
                                }
                            }
                            else {
                                mComplicationRenderer.k.a(mComplicationRenderer.g);
                                if (mComplicationRenderer.g == null) {
                                    break Label_0753;
                                }
                            }
                            if (mComplicationRenderer.b.a() == 2) {
                                mComplicationRenderer.k.setColorFilter(null);
                                mComplicationRenderer.k.b = 0;
                            }
                            else {
                                mComplicationRenderer.k.setColorFilter(uq.h.j);
                                mComplicationRenderer.k.b = mComplicationRenderer.b(uq.h, mComplicationRenderer.q);
                            }
                            mComplicationRenderer.k.setBounds(mComplicationRenderer.q);
                            mComplicationRenderer.k.draw(canvas);
                        }
                    }
                    if (!mComplicationRenderer.r.isEmpty()) {
                        if (!uq.a()) {
                            mComplicationRenderer.j.a(mComplicationRenderer.h);
                            mComplicationRenderer.j.b = mComplicationRenderer.b(uq.h, mComplicationRenderer.r);
                            mComplicationRenderer.j.setBounds(mComplicationRenderer.r);
                            mComplicationRenderer.j.setColorFilter(uq.h.j);
                            mComplicationRenderer.j.draw(canvas);
                        }
                    }
                    if (!mComplicationRenderer.u.isEmpty()) {
                        final ComplicationData b3 = mComplicationRenderer.b;
                        ComplicationData.k("MAX_VALUE", b3.b);
                        final float float1 = b3.c.getFloat("MAX_VALUE");
                        final ComplicationData b4 = mComplicationRenderer.b;
                        ComplicationData.k("MIN_VALUE", b4.b);
                        final float n2 = float1 - b4.c.getFloat("MIN_VALUE");
                        float n3 = 0.0f;
                        if (n2 > 0.0f) {
                            final ComplicationData b5 = mComplicationRenderer.b;
                            ComplicationData.k("VALUE", b5.b);
                            n3 = b5.c.getFloat("VALUE") / n2;
                        }
                        final float n4 = n3 * 352.0f;
                        final int n5 = (int)Math.ceil(uq.c.getStrokeWidth());
                        final float n6 = (float)n5;
                        mComplicationRenderer.u.inset(n6, n6);
                        canvas.drawArc(mComplicationRenderer.u, -88.0f, n4, false, uq.c);
                        canvas.drawArc(mComplicationRenderer.u, 4.0f + (-88.0f + n4), 352.0f - n4, false, uq.d);
                        final float n7 = (float)(-n5);
                        mComplicationRenderer.u.inset(n7, n7);
                    }
                    if (!mComplicationRenderer.s.isEmpty()) {
                        final TextPaint x = mComplicationRenderer.x;
                        final TextPaint a2 = uq.a;
                        if (x != a2) {
                            mComplicationRenderer.x = a2;
                            mComplicationRenderer.l.f(mComplicationRenderer.x);
                            mComplicationRenderer.l.d(uq.i);
                        }
                        mComplicationRenderer.l.a(canvas, mComplicationRenderer.s);
                    }
                    if (!mComplicationRenderer.t.isEmpty()) {
                        final TextPaint y = mComplicationRenderer.y;
                        final TextPaint b6 = uq.b;
                        if (y != b6) {
                            mComplicationRenderer.y = b6;
                            mComplicationRenderer.m.f(mComplicationRenderer.y);
                            mComplicationRenderer.m.d(uq.i);
                        }
                        mComplicationRenderer.m.a(canvas, mComplicationRenderer.t);
                    }
                    if (mIsHighlighted && !uq.i) {
                        final float n8 = (float)mComplicationRenderer.a(uq.h);
                        canvas.drawRoundRect(mComplicationRenderer.o, n8, n8, uq.g);
                    }
                    final us h = uq.h;
                    if (h.m != 0) {
                        final float n9 = (float)mComplicationRenderer.a(h);
                        canvas.drawRoundRect(mComplicationRenderer.o, n9, n9, uq.e);
                    }
                    canvas.restore();
                }
            }
        }
    }
    
    public void draw(final Canvas canvas, final long currentTimeMillis) {
        this.assertInitialized();
        this.setCurrentTimeMillis(currentTimeMillis);
        this.draw(canvas);
    }
    
    us getActiveStyle() {
        return this.mActiveStyleBuilder.a();
    }
    
    us getAmbientStyle() {
        return this.mAmbientStyleBuilder.a();
    }
    
    ur getComplicationRenderer() {
        return this.mComplicationRenderer;
    }
    
    public long getHighlightDuration() {
        return this.mHighlightDuration;
    }
    
    CharSequence getNoDataText() {
        return this.mNoDataText;
    }
    
    public int getOpacity() {
        return -3;
    }
    
    public void inflate(final Resources resources, final XmlPullParser xmlPullParser, final AttributeSet set, final Resources$Theme resources$Theme) {
        this.mIsInflatedFromXml = true;
        final int depth = xmlPullParser.getDepth();
        this.inflateAttributes(resources, xmlPullParser);
        setStyleToDefaultValues(this.mActiveStyleBuilder, resources);
        setStyleToDefaultValues(this.mAmbientStyleBuilder, resources);
        this.inflateStyle(false, resources, xmlPullParser);
        this.inflateStyle(true, resources, xmlPullParser);
        while (true) {
            final int next = xmlPullParser.next();
            if (next == 1) {
                break;
            }
            if (next == 3) {
                if (xmlPullParser.getDepth() <= depth) {
                    break;
                }
                continue;
            }
            else {
                if (next != 2) {
                    continue;
                }
                final String name = xmlPullParser.getName();
                if (TextUtils.equals((CharSequence)name, (CharSequence)"ambient")) {
                    this.inflateStyle(true, resources, xmlPullParser);
                }
                else {
                    final String value = String.valueOf(this);
                    final StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 43 + String.valueOf(value).length());
                    sb.append("Unknown element: ");
                    sb.append(name);
                    sb.append(" for ComplicationDrawable ");
                    sb.append(value);
                    Log.w("ComplicationDrawable", sb.toString());
                }
            }
        }
        this.mIsStyleUpToDate = false;
    }
    
    public boolean isHighlighted() {
        return this.mIsHighlighted;
    }
    
    public boolean isRangedValueProgressHidden() {
        return this.mRangedValueProgressHidden;
    }
    
    protected void onBoundsChange(final Rect rect) {
        final ur mComplicationRenderer = this.mComplicationRenderer;
        if (mComplicationRenderer != null) {
            mComplicationRenderer.h(rect);
        }
    }
    
    public boolean onTap(final int n, final int n2) {
        final ur mComplicationRenderer = this.mComplicationRenderer;
        if (mComplicationRenderer == null) {
            return false;
        }
        final ComplicationData b = mComplicationRenderer.b;
        if (b != null && (b.b() != null || b.b == 9)) {
            if (this.getBounds().contains(n, n2)) {
                Label_0143: {
                    if (b.b == 9) {
                        final Context mContext = this.mContext;
                        if (mContext instanceof vv) {
                            final ComponentName componentName = new ComponentName(mContext, (Class)mContext.getClass());
                            final Intent intent = new Intent(mContext, (Class)ui.class);
                            intent.setAction("android.support.wearable.complications.ACTION_PERMISSION_REQUEST_ONLY");
                            intent.putExtra("android.support.wearable.complications.EXTRA_WATCH_FACE_COMPONENT_NAME", (Parcelable)componentName);
                            mContext.startActivity(intent.addFlags(268435456));
                            break Label_0143;
                        }
                        return false;
                    }
                    try {
                        b.b().send();
                        if (this.getHighlightDuration() > 0L) {
                            this.setIsHighlighted(true);
                            this.invalidateSelf();
                            this.mMainThreadHandler.removeCallbacks(this.mUnhighlightRunnable);
                            this.mMainThreadHandler.postDelayed(this.mUnhighlightRunnable, this.getHighlightDuration());
                        }
                        return true;
                    }
                    catch (final PendingIntent$CanceledException ex) {
                        return false;
                    }
                }
            }
        }
        return false;
    }
    
    @Deprecated
    public boolean onTap(final int n, final int n2, final long n3) {
        return this.onTap(n, n2);
    }
    
    public void setAlpha(final int n) {
    }
    
    public void setBackgroundColorActive(final int a) {
        this.getComplicationStyleBuilder(false).a = a;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBackgroundColorAmbient(final int a) {
        this.getComplicationStyleBuilder(true).a = a;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBackgroundDrawableActive(final Drawable b) {
        this.getComplicationStyleBuilder(false).b = b;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBackgroundDrawableAmbient(final Drawable b) {
        this.getComplicationStyleBuilder(true).b = b;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderColorActive(final int k) {
        this.getComplicationStyleBuilder(false).k = k;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderColorAmbient(final int k) {
        this.getComplicationStyleBuilder(true).k = k;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderDashGapActive(final int m) {
        this.getComplicationStyleBuilder(false).m = m;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderDashGapAmbient(final int m) {
        this.getComplicationStyleBuilder(true).m = m;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderDashWidthActive(final int l) {
        this.getComplicationStyleBuilder(false).l = l;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderDashWidthAmbient(final int l) {
        this.getComplicationStyleBuilder(true).l = l;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderRadiusActive(final int n) {
        this.getComplicationStyleBuilder(false).n = n;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderRadiusAmbient(final int n) {
        this.getComplicationStyleBuilder(true).n = n;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderStyleActive(final int n) {
        this.getComplicationStyleBuilder(false).b(n);
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderStyleAmbient(final int n) {
        this.getComplicationStyleBuilder(true).b(n);
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderWidthActive(final int o) {
        this.getComplicationStyleBuilder(false).o = o;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBorderWidthAmbient(final int o) {
        this.getComplicationStyleBuilder(true).o = o;
        this.mIsStyleUpToDate = false;
    }
    
    public void setBurnInProtection(final boolean mBurnInProtection) {
        this.mBurnInProtection = mBurnInProtection;
    }
    
    public void setColorFilter(final ColorFilter colorFilter) {
    }
    
    public void setComplicationData(final ComplicationData complicationData) {
        this.assertInitialized();
        this.mComplicationRenderer.d(complicationData);
    }
    
    public void setContext(final Context mContext) {
        if (mContext == null) {
            throw new IllegalArgumentException("Argument \"context\" should not be null.");
        }
        if (Objects.equals((Object)mContext, (Object)this.mContext)) {
            return;
        }
        this.mContext = mContext;
        if (!this.mIsInflatedFromXml && !this.mAlreadyStyled) {
            setStyleToDefaultValues(this.mActiveStyleBuilder, mContext.getResources());
            setStyleToDefaultValues(this.mAmbientStyleBuilder, mContext.getResources());
        }
        if (!this.mAlreadyStyled) {
            this.mHighlightDuration = mContext.getResources().getInteger(2131492886);
        }
        final ur mComplicationRenderer = new ur(this.mContext, this.mActiveStyleBuilder.a(), this.mAmbientStyleBuilder.a());
        this.mComplicationRenderer = mComplicationRenderer;
        mComplicationRenderer.A = this.mRendererInvalidateListener;
        final CharSequence mNoDataText = this.mNoDataText;
        if (mNoDataText == null) {
            this.setNoDataText(mContext.getString(2131951869));
        }
        else {
            mComplicationRenderer.e(mNoDataText);
        }
        this.mComplicationRenderer.f(this.mRangedValueProgressHidden);
        this.mComplicationRenderer.h(this.getBounds());
        this.mIsStyleUpToDate = true;
    }
    
    public void setCurrentTimeMillis(final long mCurrentTimeMillis) {
        this.mCurrentTimeMillis = mCurrentTimeMillis;
    }
    
    public void setHighlightColorActive(final int s) {
        this.getComplicationStyleBuilder(false).s = s;
        this.mIsStyleUpToDate = false;
    }
    
    public void setHighlightColorAmbient(final int s) {
        this.getComplicationStyleBuilder(true).s = s;
        this.mIsStyleUpToDate = false;
    }
    
    public void setHighlightDuration(final long mHighlightDuration) {
        if (mHighlightDuration >= 0L) {
            this.mHighlightDuration = mHighlightDuration;
            return;
        }
        throw new IllegalArgumentException("Highlight duration should be non-negative.");
    }
    
    public void setIconColorActive(final int j) {
        this.getComplicationStyleBuilder(false).j = j;
        this.mIsStyleUpToDate = false;
    }
    
    public void setIconColorAmbient(final int j) {
        this.getComplicationStyleBuilder(true).j = j;
        this.mIsStyleUpToDate = false;
    }
    
    public void setImageColorFilterActive(final ColorFilter i) {
        this.getComplicationStyleBuilder(false).i = i;
        this.mIsStyleUpToDate = false;
    }
    
    public void setImageColorFilterAmbient(final ColorFilter i) {
        this.getComplicationStyleBuilder(true).i = i;
        this.mIsStyleUpToDate = false;
    }
    
    public void setInAmbientMode(final boolean mInAmbientMode) {
        this.mInAmbientMode = mInAmbientMode;
    }
    
    public void setIsHighlighted(final boolean mIsHighlighted) {
        this.mIsHighlighted = mIsHighlighted;
    }
    
    public void setLowBitAmbient(final boolean mLowBitAmbient) {
        this.mLowBitAmbient = mLowBitAmbient;
    }
    
    public void setNoDataText(final CharSequence charSequence) {
        if (charSequence == null) {
            this.mNoDataText = "";
        }
        else {
            this.mNoDataText = charSequence.subSequence(0, charSequence.length());
        }
        final ur mComplicationRenderer = this.mComplicationRenderer;
        if (mComplicationRenderer != null) {
            mComplicationRenderer.e(this.mNoDataText);
        }
    }
    
    public void setRangedValuePrimaryColorActive(final int q) {
        this.getComplicationStyleBuilder(false).q = q;
        this.mIsStyleUpToDate = false;
    }
    
    public void setRangedValuePrimaryColorAmbient(final int q) {
        this.getComplicationStyleBuilder(true).q = q;
        this.mIsStyleUpToDate = false;
    }
    
    public void setRangedValueProgressHidden(final boolean mRangedValueProgressHidden) {
        this.mRangedValueProgressHidden = mRangedValueProgressHidden;
        final ur mComplicationRenderer = this.mComplicationRenderer;
        if (mComplicationRenderer != null) {
            mComplicationRenderer.f(mRangedValueProgressHidden);
        }
    }
    
    public void setRangedValueRingWidthActive(final int p) {
        this.getComplicationStyleBuilder(false).p = p;
        this.mIsStyleUpToDate = false;
    }
    
    public void setRangedValueRingWidthAmbient(final int p) {
        this.getComplicationStyleBuilder(true).p = p;
        this.mIsStyleUpToDate = false;
    }
    
    public void setRangedValueSecondaryColorActive(final int r) {
        this.getComplicationStyleBuilder(false).r = r;
        this.mIsStyleUpToDate = false;
    }
    
    public void setRangedValueSecondaryColorAmbient(final int r) {
        this.getComplicationStyleBuilder(true).r = r;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTextColorActive(final int c) {
        this.getComplicationStyleBuilder(false).c = c;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTextColorAmbient(final int c) {
        this.getComplicationStyleBuilder(true).c = c;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTextSizeActive(final int g) {
        this.getComplicationStyleBuilder(false).g = g;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTextSizeAmbient(final int g) {
        this.getComplicationStyleBuilder(true).g = g;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTextTypefaceActive(final Typeface e) {
        this.getComplicationStyleBuilder(false).e = e;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTextTypefaceAmbient(final Typeface e) {
        this.getComplicationStyleBuilder(true).e = e;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTitleColorActive(final int d) {
        this.getComplicationStyleBuilder(false).d = d;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTitleColorAmbient(final int d) {
        this.getComplicationStyleBuilder(true).d = d;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTitleSizeActive(final int h) {
        this.getComplicationStyleBuilder(false).h = h;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTitleSizeAmbient(final int h) {
        this.getComplicationStyleBuilder(true).h = h;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTitleTypefaceActive(final Typeface f) {
        this.getComplicationStyleBuilder(false).f = f;
        this.mIsStyleUpToDate = false;
    }
    
    public void setTitleTypefaceAmbient(final Typeface f) {
        this.getComplicationStyleBuilder(true).f = f;
        this.mIsStyleUpToDate = false;
    }
    
    public void writeToParcel(final Parcel parcel, final int n) {
        final Bundle bundle = new Bundle();
        bundle.putParcelable("active_style_builder", (Parcelable)this.mActiveStyleBuilder);
        bundle.putParcelable("ambient_style_builder", (Parcelable)this.mAmbientStyleBuilder);
        bundle.putCharSequence("no_data_text", this.mNoDataText);
        bundle.putLong("highlight_duration", this.mHighlightDuration);
        bundle.putBoolean("ranged_value_progress_hidden", this.mRangedValueProgressHidden);
        bundle.putParcelable("bounds", (Parcelable)this.getBounds());
        parcel.writeBundle(bundle);
    }
}
