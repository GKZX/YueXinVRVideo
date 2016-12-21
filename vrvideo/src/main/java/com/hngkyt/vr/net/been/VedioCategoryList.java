package com.hngkyt.vr.net.been;

import android.os.Parcel;
import android.os.Parcelable;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by wrf on 2016/12/20.
 */

public class VedioCategoryList implements Parcelable {


    private List<VedioCategoryListBean> vedioCategoryList;

    public List<VedioCategoryListBean> getVedioCategoryList() {
        return vedioCategoryList;
    }

    public void setVedioCategoryList(List<VedioCategoryListBean> vedioCategoryList) {
        this.vedioCategoryList = vedioCategoryList;
    }

    public static class VedioCategoryListBean implements Parcelable {
        /**
         * id : 1
         * logoImgUrl : http://192.168.0.104:8080/yuexinvr/img/category1.png
         * smallLogoImgUrl : http://192.168.0.104:8080/yuexinvr/img/category11.png
         * vedioCategoryName : 宗教文化
         */

        private int id;
        private String logoImgUrl;
        private String smallLogoImgUrl;
        private String vedioCategoryName;

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getLogoImgUrl() {
            return logoImgUrl;
        }

        public void setLogoImgUrl(String logoImgUrl) {
            this.logoImgUrl = logoImgUrl;
        }

        public String getSmallLogoImgUrl() {
            return smallLogoImgUrl;
        }

        public void setSmallLogoImgUrl(String smallLogoImgUrl) {
            this.smallLogoImgUrl = smallLogoImgUrl;
        }

        public String getVedioCategoryName() {
            return vedioCategoryName;
        }

        public void setVedioCategoryName(String vedioCategoryName) {
            this.vedioCategoryName = vedioCategoryName;
        }

        @Override
        public String toString() {
            return "VedioCategoryListBean{" +
                    "id=" + id +
                    ", logoImgUrl='" + logoImgUrl + '\'' +
                    ", smallLogoImgUrl='" + smallLogoImgUrl + '\'' +
                    ", vedioCategoryName='" + vedioCategoryName + '\'' +
                    '}';
        }


        @Override
        public int describeContents() {
            return 0;
        }

        @Override
        public void writeToParcel(Parcel dest, int flags) {
            dest.writeInt(this.id);
            dest.writeString(this.logoImgUrl);
            dest.writeString(this.smallLogoImgUrl);
            dest.writeString(this.vedioCategoryName);
        }

        public VedioCategoryListBean() {
        }

        protected VedioCategoryListBean(Parcel in) {
            this.id = in.readInt();
            this.logoImgUrl = in.readString();
            this.smallLogoImgUrl = in.readString();
            this.vedioCategoryName = in.readString();
        }

        public static final Creator<VedioCategoryListBean> CREATOR = new Creator<VedioCategoryListBean>() {
            @Override
            public VedioCategoryListBean createFromParcel(Parcel source) {
                return new VedioCategoryListBean(source);
            }

            @Override
            public VedioCategoryListBean[] newArray(int size) {
                return new VedioCategoryListBean[size];
            }
        };
    }

    @Override
    public String toString() {
        return "VedioCategoryList{" +
                "vedioCategoryList=" + vedioCategoryList +
                '}';
    }


    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {
        dest.writeList(this.vedioCategoryList);
    }

    public VedioCategoryList() {
    }

    protected VedioCategoryList(Parcel in) {
        this.vedioCategoryList = new ArrayList<VedioCategoryListBean>();
        in.readList(this.vedioCategoryList, VedioCategoryListBean.class.getClassLoader());
    }

    public static final Parcelable.Creator<VedioCategoryList> CREATOR = new Parcelable.Creator<VedioCategoryList>() {
        @Override
        public VedioCategoryList createFromParcel(Parcel source) {
            return new VedioCategoryList(source);
        }

        @Override
        public VedioCategoryList[] newArray(int size) {
            return new VedioCategoryList[size];
        }
    };
}