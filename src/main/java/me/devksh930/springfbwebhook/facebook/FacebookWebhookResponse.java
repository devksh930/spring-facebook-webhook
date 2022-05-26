
package me.devksh930.springfbwebhook.facebook;

import com.google.gson.annotations.SerializedName;
import lombok.ToString;

import javax.annotation.Generated;
import java.util.List;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString

public class FacebookWebhookResponse {

    @SerializedName("entry")
    private List<Entry> mEntry;
    @SerializedName("object")
    private String mObject;

    public List<Entry> getEntry() {
        return mEntry;
    }

    public void setEntry(List<Entry> entry) {
        mEntry = entry;
    }

    public String getObject() {
        return mObject;
    }

    public void setObject(String object) {
        mObject = object;
    }

}
