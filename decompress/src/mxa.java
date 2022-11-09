// 
// Decompiled by Procyon v0.6.0
// 

final class mxa extends ah
{
    public mxa(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "UPDATE OR ABORT `AnnotachmentEntity` SET `resourceOnDeviceId` = ?,`isAttachment` = ?,`id` = ?,`contentType` = ?,`onDeviceSize` = ?,`uploadTransferHandle` = ?,`blobstoreId` = ?,`contentHash` = ?,`onDeviceId` = ?,`status_addedToAirlockEpochTimestamp` = ?,`status_uploadToF250RequestedEpochTimestamp` = ?,`status_uploadToF250CompletedEpochTimestamp` = ?,`status_airlockFileState` = ?,`status_uploadState` = ?,`status_uploadProgressPercent` = ? WHERE `onDeviceId` = ?";
    }
}
