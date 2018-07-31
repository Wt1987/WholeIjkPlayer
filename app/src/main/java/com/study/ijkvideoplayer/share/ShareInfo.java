package com.study.ijkvideoplayer.share;

/**
 * author : taowang
 * date :2018/7/30
 * description:
 **/
public class ShareInfo {
    private int id;
    private int appId;
    private Object skuId;
    private int shareType;
    private int startTime;
    private int spareTime;
    private String txTitle;
    private String txContent;
    private String txLink;
    private String txUrl;
    private String weiboLink;
    private String weiboContent;

    public ShareInfo() {
    }

    public int getId() {
        return this.id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAppId() {
        return this.appId;
    }

    public void setAppId(int appId) {
        this.appId = appId;
    }

    public Object getSkuId() {
        return this.skuId;
    }

    public void setSkuId(Object skuId) {
        this.skuId = skuId;
    }

    public int getShareType() {
        return this.shareType;
    }

    public void setShareType(int shareType) {
        this.shareType = shareType;
    }

    public int getStartTime() {
        return this.startTime;
    }

    public void setStartTime(int startTime) {
        this.startTime = startTime;
    }

    public int getSpareTime() {
        return this.spareTime;
    }

    public void setSpareTime(int spareTime) {
        this.spareTime = spareTime;
    }

    public String getTxTitle() {
        return this.txTitle;
    }

    public void setTxTitle(String txTitle) {
        this.txTitle = txTitle;
    }

    public String getTxContent() {
        return this.txContent;
    }

    public void setTxContent(String txContent) {
        this.txContent = txContent;
    }

    public String getTxLink() {
        return this.txLink;
    }

    public void setTxLink(String txLink) {
        this.txLink = txLink;
    }

    public String getTxUrl() {
        return this.txUrl;
    }

    public void setTxUrl(String txUrl) {
        this.txUrl = txUrl;
    }

    public String getWeiboLink() {
        return this.weiboLink;
    }

    public void setWeiboLink(String weiboLink) {
        this.weiboLink = weiboLink;
    }

    public String getWeiboContent() {
        return this.weiboContent;
    }

    public void setWeiboContent(String weiboContent) {
        this.weiboContent = weiboContent;
    }
}
