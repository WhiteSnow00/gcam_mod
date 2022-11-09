// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.legacy.app.settings;

import java.util.Collection;
import android.preference.Preference;
import java.util.Iterator;
import android.database.MatrixCursor;
import android.database.Cursor;
import android.provider.SearchIndexablesContract;
import android.app.Activity;
import android.provider.SearchIndexablesProvider;

public class CameraSearchIndexablesProvider extends SearchIndexablesProvider
{
    private static final nsd a;
    private erl b;
    
    static {
        a = nsd.g("com/google/android/apps/camera/legacy/app/settings/CameraSearchIndexablesProvider");
    }
    
    private final erl a() {
        synchronized (this) {
            if (this.b == null) {
                (this.b = ((emg)this.getContext().getApplicationContext()).d().i(new erm((Activity)this.getContext())).a()).a(this.getContext());
            }
            return this.b;
        }
    }
    
    private final String b() {
        return this.getContext().getApplicationInfo().packageName;
    }
    
    private final Object[] c(final String s, final String s2, final String s3) {
        final Object[] array = new Object[SearchIndexablesContract.INDEXABLES_RAW_COLUMNS.length];
        array[12] = s3;
        array[1] = s;
        array[2] = s2;
        array[8] = 2131231203;
        array[9] = "com.android.settings.action.EXTRA_SETTINGS";
        array[10] = this.b();
        array[11] = CameraSettingsActivity.class.getName();
        return array;
    }
    
    public final boolean onCreate() {
        a.l(CameraSearchIndexablesProvider.a.c(), "Called onCreate", '\u055f');
        return true;
    }
    
    public final Cursor queryNonIndexableKeys(final String[] array) {
        a.l(CameraSearchIndexablesProvider.a.c(), "Called queryNonIndexableKeys", '\u055a');
        final MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS);
        for (final String s : this.a().m) {
            final Object[] array2 = new Object[SearchIndexablesContract.NON_INDEXABLES_KEYS_COLUMNS.length];
            array2[0] = s;
            matrixCursor.addRow(array2);
        }
        return (Cursor)matrixCursor;
    }
    
    public final Cursor queryRawData(final String[] array) {
        a.l(CameraSearchIndexablesProvider.a.c(), "Called queryRawData", '\u055c');
        final String string = this.getContext().getString(2131951740);
        final MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_RAW_COLUMNS);
        matrixCursor.addRow(this.c(string, this.getContext().getString(2131952288), "camera_settings"));
        final nkx nkx = (nkx)this.a().o;
        Collection d = nkx.d;
        if (d == null) {
            d = new nkw(nkx);
            nkx.d = d;
        }
        for (final Preference preference : d) {
            preference.getTitle();
            preference.getSummary();
            preference.getKey();
            matrixCursor.addRow(this.c(preference.getTitle().toString(), preference.getSummary().toString(), preference.getKey()));
        }
        return (Cursor)matrixCursor;
    }
    
    public final Cursor queryXmlResources(final String[] array) {
        a.l(CameraSearchIndexablesProvider.a.c(), "Called queryXmlResources", '\u055e');
        final MatrixCursor matrixCursor = new MatrixCursor(SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS);
        final Object[] array2 = new Object[SearchIndexablesContract.INDEXABLES_XML_RES_COLUMNS.length];
        array2[0] = 1;
        array2[1] = 2132148224;
        array2[2] = null;
        array2[3] = 0;
        array2[4] = "android.intent.action.MAIN";
        array2[5] = this.b();
        array2[6] = CameraSettingsActivity.class.getName();
        matrixCursor.addRow(array2);
        return (Cursor)matrixCursor;
    }
}
