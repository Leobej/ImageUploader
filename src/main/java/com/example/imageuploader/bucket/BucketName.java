package com.example.imageuploader.bucket;

public enum BucketName {
    PROFILE_IMAGE("imageuploaderleo");
    private final String bucketName;

    BucketName(String bucketName) {
        this.bucketName = bucketName;
    }

    public String getBucketName() {
        return bucketName;
    }
}
