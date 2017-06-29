package test;

import pareseData.DataLocation;
import pareseData.ResultCode;
import pareseData.TargetKey;

import java.util.List;

/**
 * Created by qq1440214507 on 2017/6/23.
 */
public class Demo {



    private int roomTotal;
    private String pathPrefix;
    @ResultCode("0")
    private String TagCode;
    @DataLocation
    private List<Rooms> roomList;

    public int getRoomTotal() {
        return roomTotal;
    }

    public void setRoomTotal(int roomTotal) {
        this.roomTotal = roomTotal;
    }

    public String getPathPrefix() {
        return pathPrefix;
    }

    public void setPathPrefix(String pathPrefix) {
        this.pathPrefix = pathPrefix;
    }

    public String getTagCode() {
        return TagCode;
    }

    public void setTagCode(String TagCode) {
        this.TagCode = TagCode;
    }

    public List<Rooms> getRoomList() {
        return roomList;
    }

    public void setRoomList(List<Rooms> roomList) {
        this.roomList = roomList;
    }



}
