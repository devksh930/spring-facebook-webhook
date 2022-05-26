
package me.devksh930.springfbwebhook.facebook;

import javax.annotation.Generated;
import com.google.gson.annotations.SerializedName;
import lombok.ToString;

@Generated("net.hexar.json2pojo")
@SuppressWarnings("unused")
@ToString
public class Messaging {

    @SerializedName("message")
    private Message mMessage;
    @SerializedName("recipient")
    private Recipient mRecipient;
    @SerializedName("sender")
    private Sender mSender;
    @SerializedName("timestamp")
    private Long mTimestamp;

    public Message getMessage() {
        return mMessage;
    }

    public void setMessage(Message message) {
        mMessage = message;
    }

    public Recipient getRecipient() {
        return mRecipient;
    }

    public void setRecipient(Recipient recipient) {
        mRecipient = recipient;
    }

    public Sender getSender() {
        return mSender;
    }

    public void setSender(Sender sender) {
        mSender = sender;
    }

    public Long getTimestamp() {
        return mTimestamp;
    }

    public void setTimestamp(Long timestamp) {
        mTimestamp = timestamp;
    }

}
