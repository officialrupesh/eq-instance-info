
package com.project.earthquakeinstanceinformation.models;


import com.google.gson.annotations.SerializedName;


@SuppressWarnings("unused")
public class Metadata {

    @SerializedName("api")
    private String mApi;
    @SerializedName("count")
    private Long mCount;
    @SerializedName("generated")
    private Long mGenerated;
    @SerializedName("limit")
    private Long mLimit;
    @SerializedName("offset")
    private Long mOffset;
    @SerializedName("status")
    private Long mStatus;
    @SerializedName("title")
    private String mTitle;
    @SerializedName("url")
    private String mUrl;

    public String getApi() {
        return mApi;
    }

    public void setApi(String api) {
        mApi = api;
    }

    public Long getCount() {
        return mCount;
    }

    public void setCount(Long count) {
        mCount = count;
    }

    public Long getGenerated() {
        return mGenerated;
    }

    public void setGenerated(Long generated) {
        mGenerated = generated;
    }

    public Long getLimit() {
        return mLimit;
    }

    public void setLimit(Long limit) {
        mLimit = limit;
    }

    public Long getOffset() {
        return mOffset;
    }

    public void setOffset(Long offset) {
        mOffset = offset;
    }

    public Long getStatus() {
        return mStatus;
    }

    public void setStatus(Long status) {
        mStatus = status;
    }

    public String getTitle() {
        return mTitle;
    }

    public void setTitle(String title) {
        mTitle = title;
    }

    public String getUrl() {
        return mUrl;
    }

    public void setUrl(String url) {
        mUrl = url;
    }

}
