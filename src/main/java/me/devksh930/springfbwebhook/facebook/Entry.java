
package me.devksh930.springfbwebhook.facebook;

import java.util.List;
import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;
import me.devksh930.springfbwebhook.facebook.Messaging;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
public class Entry {

    @SerializedName("id")
    private String mId;
    @SerializedName("messaging")
    private List<Messaging> mMessaging;
    @SerializedName("time")
    private Long mTime;

    public String getId() {
        return mId;
    }

    public void setId(String id) {
        mId = id;
    }

    public List<Messaging> getMessaging() {
        return mMessaging;
    }

    public void setMessaging(List<Messaging> messaging) {
        mMessaging = messaging;
    }

    public Long getTime() {
        return mTime;
    }

    public void setTime(Long time) {
        mTime = time;
    }

}
