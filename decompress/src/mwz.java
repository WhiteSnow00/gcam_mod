// 
// Decompiled by Procyon v0.6.0
// 

final class mwz extends ai
{
    public mwz(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR ABORT INTO `AnnotachmentEntity` (`resourceOnDeviceId`,`isAttachment`,`id`,`contentType`,`onDeviceSize`,`uploadTransferHandle`,`blobstoreId`,`contentHash`,`onDeviceId`,`status_addedToAirlockEpochTimestamp`,`status_uploadToF250RequestedEpochTimestamp`,`status_uploadToF250CompletedEpochTimestamp`,`status_airlockFileState`,`status_uploadState`,`status_uploadProgressPercent`) VALUES (?,?,?,?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?)";
    }
}
