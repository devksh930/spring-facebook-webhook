
package me.devksh930.springfbwebhook.facebook;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString

public class Message {

    @SerializedName("mid")
    private String mMid;
    @SerializedName("text")
    private String mText;

    public String getMid() {
        return mMid;
    }

    public void setMid(String mid) {
        mMid = mid;
    }

    public String getText() {
        return mText;
    }

    public void setText(String text) {
        mText = text;
    }

}
