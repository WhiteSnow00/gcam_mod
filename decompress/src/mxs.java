import android.database.Cursor;
import java.util.Arrays;
import java.util.Set;
import java.util.Map;
import java.util.HashSet;
import java.util.HashMap;
import java.util.List;
import com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.F250RoomDatabase_Impl;

// 
// Decompiled by Procyon v0.6.0
// 

public final class mxs extends ar
{
    final /* synthetic */ F250RoomDatabase_Impl b;
    
    public mxs(final F250RoomDatabase_Impl b) {
        this.b = b;
        super(4);
    }
    
    @Override
    public final void a() {
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), i = 0; i < size; ++i) {
                final cp cp = this.b.e.get(i);
            }
        }
    }
    
    @Override
    public final as b(final afh afh) {
        final HashMap hashMap = new HashMap(25);
        hashMap.put("title", new bg("title", "TEXT", false, 0, null, 1));
        hashMap.put("experienceId", new bg("experienceId", "TEXT", false, 0, null, 1));
        hashMap.put("queryableTags", new bg("queryableTags", "TEXT", true, 0, null, 1));
        hashMap.put("queryableEpochTimestamp", new bg("queryableEpochTimestamp", "INTEGER", false, 0, null, 1));
        hashMap.put("queryableDuration", new bg("queryableDuration", "INTEGER", false, 0, null, 1));
        hashMap.put("approximateTotalSize", new bg("approximateTotalSize", "INTEGER", true, 0, null, 1));
        hashMap.put("namespaceId", new bg("namespaceId", "TEXT", false, 0, null, 1));
        hashMap.put("partitionId", new bg("partitionId", "TEXT", false, 0, null, 1));
        hashMap.put("f250ResourceId", new bg("f250ResourceId", "TEXT", false, 0, null, 1));
        hashMap.put("f250AutoUploadDelay", new bg("f250AutoUploadDelay", "INTEGER", false, 0, null, 1));
        hashMap.put("airlockExpiration", new bg("airlockExpiration", "INTEGER", false, 0, null, 1));
        hashMap.put("f250Expiration", new bg("f250Expiration", "INTEGER", false, 0, null, 1));
        hashMap.put("deleteAirlockFilesOnceUploaded", new bg("deleteAirlockFilesOnceUploaded", "INTEGER", true, 0, null, 1));
        hashMap.put("nonSignedInDataOwners", new bg("nonSignedInDataOwners", "TEXT", true, 0, null, 1));
        hashMap.put("overridenObfuscatedGaiaId", new bg("overridenObfuscatedGaiaId", "TEXT", false, 0, null, 1));
        hashMap.put("uploadTransferHandle", new bg("uploadTransferHandle", "TEXT", false, 0, null, 1));
        hashMap.put("relations", new bg("relations", "BLOB", false, 0, null, 1));
        hashMap.put("indexTokens", new bg("indexTokens", "BLOB", false, 0, null, 1));
        hashMap.put("onDeviceId", new bg("onDeviceId", "INTEGER", true, 1, null, 1));
        hashMap.put("status_addedToAirlockEpochTimestamp", new bg("status_addedToAirlockEpochTimestamp", "INTEGER", true, 0, null, 1));
        hashMap.put("status_uploadToF250RequestedEpochTimestamp", new bg("status_uploadToF250RequestedEpochTimestamp", "INTEGER", false, 0, null, 1));
        hashMap.put("status_uploadToF250CompletedEpochTimestamp", new bg("status_uploadToF250CompletedEpochTimestamp", "INTEGER", false, 0, null, 1));
        hashMap.put("status_airlockFileState", new bg("status_airlockFileState", "INTEGER", true, 0, null, 1));
        hashMap.put("status_uploadState", new bg("status_uploadState", "INTEGER", true, 0, null, 1));
        hashMap.put("status_uploadProgressPercent", new bg("status_uploadProgressPercent", "REAL", true, 0, null, 1));
        final bk bk = new bk("ResourceEntity", hashMap, new HashSet(0), new HashSet(0));
        final bk a = bk.a(afh, "ResourceEntity");
        if (!bk.equals(a)) {
            final String value = String.valueOf(bk);
            final String value2 = String.valueOf(a);
            final StringBuilder sb = new StringBuilder(String.valueOf(value).length() + 125 + String.valueOf(value2).length());
            sb.append("ResourceEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceEntity).\n Expected:\n");
            sb.append(value);
            sb.append("\n Found:\n");
            sb.append(value2);
            return new as(false, sb.toString());
        }
        final HashSet set = new HashSet(6);
        set.add("experienceId");
        set.add("queryableTags");
        set.add("namespaceId");
        set.add("partitionId");
        set.add("f250ResourceId");
        set.add("nonSignedInDataOwners");
        final bf bf = new bf(set);
        Object o = afh.b("PRAGMA table_info(`ResourceFts`)");
        final HashSet set2 = new HashSet();
        try {
            if (((Cursor)o).getColumnCount() > 0) {
                final int columnIndex = ((Cursor)o).getColumnIndex("name");
                while (((Cursor)o).moveToNext()) {
                    set2.add(((Cursor)o).getString(columnIndex));
                }
            }
            ((Cursor)o).close();
            final Cursor b = afh.b("SELECT * FROM sqlite_master WHERE `name` = 'ResourceFts'");
            try {
                if (b.moveToFirst()) {
                    o = b.getString(b.getColumnIndexOrThrow("sql"));
                }
                else {
                    o = "";
                }
                b.close();
                o = new bf(set2, bf.a((String)o));
                if (!bf.equals(o)) {
                    final String value3 = String.valueOf(bf);
                    o = String.valueOf(o);
                    final StringBuilder sb2 = new StringBuilder(String.valueOf(value3).length() + 119 + String.valueOf(o).length());
                    sb2.append("ResourceFts(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.ResourceFts).\n Expected:\n");
                    sb2.append(value3);
                    sb2.append("\n Found:\n");
                    sb2.append((String)o);
                    return new as(false, sb2.toString());
                }
                o = new HashMap(15);
                ((HashMap<String, bg>)o).put("resourceOnDeviceId", new bg("resourceOnDeviceId", "INTEGER", true, 0, null, 1));
                ((HashMap<String, bg>)o).put("isAttachment", new bg("isAttachment", "INTEGER", true, 0, null, 1));
                ((HashMap<String, bg>)o).put("id", new bg("id", "TEXT", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("contentType", new bg("contentType", "TEXT", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("onDeviceSize", new bg("onDeviceSize", "INTEGER", true, 0, null, 1));
                ((HashMap<String, bg>)o).put("uploadTransferHandle", new bg("uploadTransferHandle", "TEXT", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("blobstoreId", new bg("blobstoreId", "TEXT", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("contentHash", new bg("contentHash", "TEXT", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("onDeviceId", new bg("onDeviceId", "INTEGER", true, 1, null, 1));
                ((HashMap<String, bg>)o).put("status_addedToAirlockEpochTimestamp", new bg("status_addedToAirlockEpochTimestamp", "INTEGER", true, 0, null, 1));
                ((HashMap<String, bg>)o).put("status_uploadToF250RequestedEpochTimestamp", new bg("status_uploadToF250RequestedEpochTimestamp", "INTEGER", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("status_uploadToF250CompletedEpochTimestamp", new bg("status_uploadToF250CompletedEpochTimestamp", "INTEGER", false, 0, null, 1));
                ((HashMap<String, bg>)o).put("status_airlockFileState", new bg("status_airlockFileState", "INTEGER", true, 0, null, 1));
                ((HashMap<String, bg>)o).put("status_uploadState", new bg("status_uploadState", "INTEGER", true, 0, null, 1));
                ((HashMap<String, bg>)o).put("status_uploadProgressPercent", new bg("status_uploadProgressPercent", "REAL", true, 0, null, 1));
                final HashSet<bh> set3 = new HashSet<bh>(1);
                set3.add(new bh("ResourceEntity", "NO ACTION", "NO ACTION", Arrays.asList("resourceOnDeviceId"), Arrays.asList("onDeviceId")));
                final HashSet<bj> set4 = new HashSet<bj>(1);
                set4.add(new bj("index_AnnotachmentEntity_resourceOnDeviceId", false, Arrays.asList("resourceOnDeviceId")));
                final bk bk2 = new bk("AnnotachmentEntity", (Map)o, set3, set4);
                o = bk.a(afh, "AnnotachmentEntity");
                if (!bk2.equals(o)) {
                    final String value4 = String.valueOf(bk2);
                    final String value5 = String.valueOf(o);
                    o = new StringBuilder(String.valueOf(value4).length() + 133 + String.valueOf(value5).length());
                    ((StringBuilder)o).append("AnnotachmentEntity(com.google.android.libraries.vision.visionkit.f250.internal.airlock.room.AnnotachmentEntity).\n Expected:\n");
                    ((StringBuilder)o).append(value4);
                    ((StringBuilder)o).append("\n Found:\n");
                    ((StringBuilder)o).append(value5);
                    return new as(false, ((StringBuilder)o).toString());
                }
                return new as(true, null);
            }
            finally {
                b.close();
            }
        }
        finally {
            ((Cursor)o).close();
            while (true) {}
        }
    }
    
    @Override
    public final void c(final afh afh) {
        afh.g("CREATE TABLE IF NOT EXISTS `ResourceEntity` (`title` TEXT, `experienceId` TEXT, `queryableTags` TEXT NOT NULL, `queryableEpochTimestamp` INTEGER, `queryableDuration` INTEGER, `approximateTotalSize` INTEGER NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `f250AutoUploadDelay` INTEGER, `airlockExpiration` INTEGER, `f250Expiration` INTEGER, `deleteAirlockFilesOnceUploaded` INTEGER NOT NULL, `nonSignedInDataOwners` TEXT NOT NULL, `overridenObfuscatedGaiaId` TEXT, `uploadTransferHandle` TEXT, `relations` BLOB, `indexTokens` BLOB, `onDeviceId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status_addedToAirlockEpochTimestamp` INTEGER NOT NULL, `status_uploadToF250RequestedEpochTimestamp` INTEGER, `status_uploadToF250CompletedEpochTimestamp` INTEGER, `status_airlockFileState` INTEGER NOT NULL, `status_uploadState` INTEGER NOT NULL, `status_uploadProgressPercent` REAL NOT NULL)");
        afh.g("CREATE VIRTUAL TABLE IF NOT EXISTS `ResourceFts` USING FTS4(`experienceId` TEXT, `queryableTags` TEXT NOT NULL, `namespaceId` TEXT, `partitionId` TEXT, `f250ResourceId` TEXT, `nonSignedInDataOwners` TEXT NOT NULL, content=`ResourceEntity`)");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_UPDATE BEFORE UPDATE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_DELETE BEFORE DELETE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_UPDATE AFTER UPDATE ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_INSERT AFTER INSERT ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        afh.g("CREATE TABLE IF NOT EXISTS `AnnotachmentEntity` (`resourceOnDeviceId` INTEGER NOT NULL, `isAttachment` INTEGER NOT NULL, `id` TEXT, `contentType` TEXT, `onDeviceSize` INTEGER NOT NULL, `uploadTransferHandle` TEXT, `blobstoreId` TEXT, `contentHash` TEXT, `onDeviceId` INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL, `status_addedToAirlockEpochTimestamp` INTEGER NOT NULL, `status_uploadToF250RequestedEpochTimestamp` INTEGER, `status_uploadToF250CompletedEpochTimestamp` INTEGER, `status_airlockFileState` INTEGER NOT NULL, `status_uploadState` INTEGER NOT NULL, `status_uploadProgressPercent` REAL NOT NULL, FOREIGN KEY(`resourceOnDeviceId`) REFERENCES `ResourceEntity`(`onDeviceId`) ON UPDATE NO ACTION ON DELETE NO ACTION )");
        afh.g("CREATE INDEX IF NOT EXISTS `index_AnnotachmentEntity_resourceOnDeviceId` ON `AnnotachmentEntity` (`resourceOnDeviceId`)");
        afh.g("CREATE TABLE IF NOT EXISTS room_master_table (id INTEGER PRIMARY KEY,identity_hash TEXT)");
        afh.g("INSERT OR REPLACE INTO room_master_table (id,identity_hash) VALUES(42, 'c277ec47daa9c8ec4aae322c60562992')");
    }
    
    @Override
    public final void d(final afh afh) {
        afh.g("DROP TABLE IF EXISTS `ResourceEntity`");
        afh.g("DROP TABLE IF EXISTS `ResourceFts`");
        afh.g("DROP TABLE IF EXISTS `AnnotachmentEntity`");
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), i = 0; i < size; ++i) {
                final cp cp = this.b.e.get(i);
            }
        }
    }
    
    @Override
    public final void e(final afh i) {
        (this.b.i = i).g("PRAGMA foreign_keys = ON");
        this.b.p(i);
        final List e = this.b.e;
        if (e != null) {
            for (int size = e.size(), j = 0; j < size; ++j) {
                ((cp)this.b.e.get(j)).c(i);
            }
        }
    }
    
    @Override
    public final void f(final afh afh) {
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_UPDATE BEFORE UPDATE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_BEFORE_DELETE BEFORE DELETE ON `ResourceEntity` BEGIN DELETE FROM `ResourceFts` WHERE `docid`=OLD.`rowid`; END");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_UPDATE AFTER UPDATE ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
        afh.g("CREATE TRIGGER IF NOT EXISTS room_fts_content_sync_ResourceFts_AFTER_INSERT AFTER INSERT ON `ResourceEntity` BEGIN INSERT INTO `ResourceFts`(`docid`, `experienceId`, `queryableTags`, `namespaceId`, `partitionId`, `f250ResourceId`, `nonSignedInDataOwners`) VALUES (NEW.`rowid`, NEW.`experienceId`, NEW.`queryableTags`, NEW.`namespaceId`, NEW.`partitionId`, NEW.`f250ResourceId`, NEW.`nonSignedInDataOwners`); END");
    }
    
    @Override
    public final void g(final afh afh) {
        gz.t(afh);
    }
}
