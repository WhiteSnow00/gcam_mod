// 
// Decompiled by Procyon v0.6.0
// 

package com.google.android.apps.camera.backup;

import android.app.backup.BackupDataInput;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.content.Context;
import android.preference.PreferenceManager;
import java.util.Map;

public class CameraBackupAgent extends kiv
{
    public eyt a;
    
    private final void e() {
        if (this.a == null) {
            ((bwv)((egp)this.getApplicationContext()).c(bwv.class)).a(this);
        }
    }
    
    @Override
    protected final Map a() {
        return nnx.o(PreferenceManager.getDefaultSharedPreferencesName((Context)this), new knf());
    }
    
    @Override
    public final void onBackup(final ParcelFileDescriptor parcelFileDescriptor, final BackupDataOutput backupDataOutput, final ParcelFileDescriptor parcelFileDescriptor2) {
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        this.e();
        this.a.h();
    }
    
    @Override
    public final void onRestore(final BackupDataInput backupDataInput, final int n, final ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, n, parcelFileDescriptor);
        this.e();
        this.a.i();
    }
}
