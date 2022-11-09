// 
// Decompiled by Procyon v0.6.0
// 

final class mxv extends ai
{
    public mxv(final aq aq) {
        super(aq);
    }
    
    public final String d() {
        return "INSERT OR ABORT INTO `ResourceEntity` (`title`,`experienceId`,`queryableTags`,`queryableEpochTimestamp`,`queryableDuration`,`approximateTotalSize`,`namespaceId`,`partitionId`,`f250ResourceId`,`f250AutoUploadDelay`,`airlockExpiration`,`f250Expiration`,`deleteAirlockFilesOnceUploaded`,`nonSignedInDataOwners`,`overridenObfuscatedGaiaId`,`uploadTransferHandle`,`relations`,`indexTokens`,`onDeviceId`,`status_addedToAirlockEpochTimestamp`,`status_uploadToF250RequestedEpochTimestamp`,`status_uploadToF250CompletedEpochTimestamp`,`status_airlockFileState`,`status_uploadState`,`status_uploadProgressPercent`) VALUES (?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,?,nullif(?, 0),?,?,?,?,?,?)";
    }
}
