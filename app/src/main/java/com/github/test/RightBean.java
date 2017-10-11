package com.github.test;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by fatchao
 * 日期  2017-07-24.
 * 邮箱  fat_chao@163.com
 */

public class RightBean implements Parcelable {
    private String name;
    private String titleName;
    private String tag;
    private boolean isTitle;
    private String activityName;

    public RightBean(String name,String activityName) {
        this.name = name;
        this.activityName=activityName;
    }

    protected RightBean(Parcel in) {
        name = in.readString();
        titleName = in.readString();
        tag = in.readString();
        isTitle = in.readByte() != 0;
        activityName = in.readString();
    }

    public static final Creator<RightBean> CREATOR = new Creator<RightBean>() {
        @Override
        public RightBean createFromParcel(Parcel in) {
            return new RightBean(in);
        }

        @Override
        public RightBean[] newArray(int size) {
            return new RightBean[size];
        }
    };



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTitleName() {
        return titleName;
    }

    public void setTitleName(String titleName) {
        this.titleName = titleName;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public boolean isTitle() {
        return isTitle;
    }

    public void setTitle(boolean title) {
        isTitle = title;
    }

    public String getAcitivityName() {
        return activityName;
    }

    public void setAcitivityName(String activityName) {
        this.activityName = activityName;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeString(name);
        dest.writeString(titleName);
        dest.writeString(tag);
        dest.writeByte((byte) (isTitle ? 1 : 0));
        dest.writeString(activityName);
    }
}
