package test;


import pareseData.TargetKey;

/**
 * Created by Administrator on 2017/6/22.
 */

public class Room {
    @TargetKey("roomId")
    private String roomId;
    private String roomName;
    @TargetKey("nickName")
    private String nickName;
    @TargetKey("liveStream")
    private String liveStream;
    private Integer roomState;
    @TargetKey("roomCity")
    private String roomCity;
    @TargetKey("auchorGender")
    private Integer auchorGender;
    @TargetKey("auchorAvatar")
    private String auchorAvatar;
    @TargetKey("onlineCount")
    private Integer onlineCount;

    public String getRoomId() {
        return roomId;
    }

    public void setRoomId(String roomId) {
        this.roomId = roomId;
    }

    public String getRoomName() {
        return roomName;
    }

    public void setRoomName(String roomName) {
        this.roomName = roomName;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getLiveStream() {
        return liveStream;
    }

    public void setLiveStream(String liveStream) {
        this.liveStream = liveStream;
    }

    public Integer getRoomState() {
        return roomState;
    }

    public void setRoomState(Integer roomState) {
        this.roomState = roomState;
    }

    public String getRoomCity() {
        return roomCity;
    }

    public void setRoomCity(String roomCity) {
        this.roomCity = roomCity;
    }

    public Integer getAuchorGender() {
        return auchorGender;
    }

    public void setAuchorGender(Integer auchorGender) {
        this.auchorGender = auchorGender;
    }

    public String getAuchorAvatar() {
        return auchorAvatar;
    }

    public void setAuchorAvatar(String auchorAvatar) {
        this.auchorAvatar = auchorAvatar;
    }

    public Integer getOnlineCount() {
        return onlineCount;
    }

    public void setOnlineCount(Integer onlineCount) {
        this.onlineCount = onlineCount;
    }

    @Override
    public String toString() {
        return "Room{" +
                "roomId='" + roomId + '\'' +
                ", roomName='" + roomName + '\'' +
                ", nickName='" + nickName + '\'' +
                ", liveStream='" + liveStream + '\'' +
                ", roomState=" + roomState +
                ", roomCity='" + roomCity + '\'' +
                ", auchorGender=" + auchorGender +
                ", auchorAvatar='" + auchorAvatar + '\'' +
                ", onlineCount=" + onlineCount +
                '}';
    }
}
