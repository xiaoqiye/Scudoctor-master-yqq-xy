package com.scudoctor.view;

/**
 * Created by xianyou on 15/03/2017.
 */

//MessageBox对象封装消息发送者名字、消息内容、以及发送者头像，getImageId用于区分没有头像的对象
public class MessageBox {
    private String vistorName;
    private String incomeMessage;
    private int imageId = NO_IMAGE_PROVIDED;
    private static final int NO_IMAGE_PROVIDED = -1;

    public MessageBox(String vistorName, String incomeMessage, int imageId) {
        this.vistorName = vistorName;
        this.incomeMessage = incomeMessage;
        this.imageId = imageId;
    }

    public MessageBox(String vistorName, String incomeMessage) {
        this.vistorName = vistorName;
        this.incomeMessage = incomeMessage;
    }


    public void setVistorName(String vistorName) {
        this.vistorName = vistorName;
    }

    public String getVistorName() {
        return vistorName;
    }

    public void setIncomeMessage(String incomeMessage) {
        this.incomeMessage = incomeMessage;
    }

    public String getIncomeMessage() {
        return incomeMessage;
    }

    public void setImageId(int imageId) {
        this.imageId = imageId;
    }

    public int getImageId() {
        return imageId;
    }

    public boolean hasImage() {
        return imageId != NO_IMAGE_PROVIDED;
    }
}