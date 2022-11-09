import java.util.HashMap;
import android.app.backup.BackupDataInput;
import android.app.backup.BackupHelper;
import android.content.Context;
import android.app.backup.SharedPreferencesBackupHelper;
import android.app.backup.BackupDataOutput;
import android.os.ParcelFileDescriptor;
import android.content.SharedPreferences;
import java.util.Map;
import java.io.File;
import java.util.Iterator;
import android.util.Log;
import java.util.Set;
import android.content.SharedPreferences$Editor;
import android.app.backup.BackupAgentHelper;

// 
// Decompiled by Procyon v0.6.0
// 

public abstract class kiv extends BackupAgentHelper
{
    public static void c(final SharedPreferences$Editor sharedPreferences$Editor, final String s, final Object o) {
        if (o instanceof Boolean) {
            sharedPreferences$Editor.putBoolean(s, (boolean)o);
            return;
        }
        if (o instanceof Float) {
            sharedPreferences$Editor.putFloat(s, (float)o);
            return;
        }
        if (o instanceof Integer) {
            sharedPreferences$Editor.putInt(s, (int)o);
            return;
        }
        if (o instanceof Long) {
            sharedPreferences$Editor.putLong(s, (long)o);
            return;
        }
        if (o instanceof String) {
            sharedPreferences$Editor.putString(s, (String)o);
            return;
        }
        final boolean b = o instanceof Set;
        final Object o2 = null;
        final Object o3 = null;
        if (b) {
            final Set set = (Set)o;
            final Iterator iterator = set.iterator();
            while (iterator.hasNext()) {
                if (!(iterator.next() instanceof String)) {
                    Object class1;
                    if (o == null) {
                        class1 = o3;
                    }
                    else {
                        class1 = o.getClass();
                    }
                    final String value = String.valueOf(class1);
                    final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 82 + String.valueOf(value).length());
                    sb.append("Skipping restore of key ");
                    sb.append(s);
                    sb.append(" because its value is a set containing an object of type ");
                    sb.append(value);
                    sb.append(".");
                    Log.w("PersistentBackupAgentHe", sb.toString());
                    return;
                }
            }
            sharedPreferences$Editor.putStringSet(s, set);
            return;
        }
        Object class2;
        if (o == null) {
            class2 = o2;
        }
        else {
            class2 = o.getClass();
        }
        final String value2 = String.valueOf(class2);
        final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 69 + String.valueOf(value2).length());
        sb2.append("Skipping restore of key ");
        sb2.append(s);
        sb2.append(" because its value is the unrecognized type ");
        sb2.append(value2);
        sb2.append(".");
        Log.w("PersistentBackupAgentHe", sb2.toString());
    }
    
    public static boolean d(final String s) {
        return !s.contains(File.separator) && !s.contains("/") && !"persistent_backup_agent_helper".equals(s);
    }
    
    private final void e() {
        this.getSharedPreferences("persistent_backup_agent_helper", 0).edit().clear().apply();
    }
    
    protected abstract Map a();
    
    protected final SharedPreferences b(final String s) {
        return this.getSharedPreferences(s, 0);
    }
    
    public void onBackup(final ParcelFileDescriptor parcelFileDescriptor, final BackupDataOutput backupDataOutput, final ParcelFileDescriptor parcelFileDescriptor2) {
        final Map a = this.a();
        final SharedPreferences$Editor edit = this.getSharedPreferences("persistent_backup_agent_helper", 0).edit();
        edit.clear();
        for (final Map.Entry<String, V> entry : ((nnx)a).s()) {
            final String s = entry.getKey();
            final knf knf = (knf)entry.getValue();
            if (!d(s)) {
                final StringBuilder sb = new StringBuilder(String.valueOf(s).length() + 43);
                sb.append("Unsupported shared preferences file name \"");
                sb.append(s);
                sb.append("\"");
                throw new IllegalArgumentException(sb.toString());
            }
            for (final Map.Entry<String, V> entry2 : this.b(s).getAll().entrySet()) {
                final String s2 = entry2.getKey();
                final V value = entry2.getValue();
                final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 1 + String.valueOf(s2).length());
                sb2.append(s);
                sb2.append("/");
                sb2.append(s2);
                c(edit, sb2.toString(), value);
            }
        }
        edit.apply();
        super.onBackup(parcelFileDescriptor, backupDataOutput, parcelFileDescriptor2);
        this.e();
    }
    
    public final void onCreate() {
        this.addHelper("persistent_backup_agent_helper_prefs", (BackupHelper)new SharedPreferencesBackupHelper((Context)this, new String[] { "persistent_backup_agent_helper" }));
    }
    
    public void onRestore(final BackupDataInput backupDataInput, int index, final ParcelFileDescriptor parcelFileDescriptor) {
        super.onRestore(backupDataInput, index, parcelFileDescriptor);
        final SharedPreferences sharedPreferences = this.getSharedPreferences("persistent_backup_agent_helper", 0);
        final HashMap hashMap = new HashMap();
        for (final Map.Entry<String, V> entry : sharedPreferences.getAll().entrySet()) {
            final String s = entry.getKey();
            final V value = entry.getValue();
            index = s.indexOf("/");
            if (index >= 0 && index < s.length() - 1) {
                final String substring = s.substring(0, index);
                final String substring2 = s.substring(index + 1);
                SharedPreferences$Editor edit;
                if ((edit = (SharedPreferences$Editor)hashMap.get(substring)) == null) {
                    if (!d(substring)) {
                        final StringBuilder sb = new StringBuilder(String.valueOf(substring).length() + 52);
                        sb.append("Skipping unsupported shared preferences file name \"");
                        sb.append(substring);
                        sb.append("\"");
                        Log.w("PersistentBackupAgentHe", sb.toString());
                        continue;
                    }
                    edit = this.b(substring).edit();
                    hashMap.put(substring, edit);
                }
                c(edit, substring2, value);
            }
            else {
                final StringBuilder sb2 = new StringBuilder(String.valueOf(s).length() + 57);
                sb2.append("Format of key \"");
                sb2.append(s);
                sb2.append("\" not understood, so skipping its restore.");
                Log.w("PersistentBackupAgentHe", sb2.toString());
            }
        }
        final Iterator iterator2 = hashMap.values().iterator();
        while (iterator2.hasNext()) {
            ((SharedPreferences$Editor)iterator2.next()).apply();
        }
        hashMap.keySet();
        this.e();
    }
}
