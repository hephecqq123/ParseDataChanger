package platformData;

import pareseData.DataLocation;
import pareseData.ParseKey;
import pareseData.ResultCode;

import java.util.List;

/**
 * Created by qq1440214507 on 2017/6/23.
 * 制服直播
 */
public class ZFLive {

    /**
     * code : 1
     * info : [{"anchorState":0,"aud":1426,"dpic":"","familyid":10811,"familyname":"浠欏コ鏄�","id":881729287,"ip":[{"ip":"183.131.73.167","isp":3,"port":5203,"property":0},{"ip":"101.69.184.121","isp":5,"port":5203,"property":1},{"ip":"112.12.67.97","isp":4,"port":5203,"property":1}],"levelInfo":{"consume":"31910900","consumebase":"4","consumediff":"0","consumelevle":"21","income":"11223091","incomebase":"4","incomediff":"0","incomelevle":"1","user_id":881729287},"name":"%E6%9D%8E%E5%B0%8F%E7%94%9C%E7%94%9C%E2%9D%A4%EF%B8%8F","nobility":0,"phid":32006,"pos":"鑻忓窞甯�","regionlimit":1,"roomid":2878,"stype":1,"title":"鏉庡皬鐢滅敎鉂わ笍寮\u20ac鎾暒","url":"http://hdlws.sinashow.com/live/881729287_1498193253.flv","userInfo":{"nick_nm":"鏉庡皬鐢滅敎鉂わ笍","photo_num":32006,"user_id":881729287}},{"anchorState":0,"aud":872,"dpic":"","familyid":10367,"familyname":"MH瀹舵棌","id":88302762,"ip":[{"ip":"122.226.254.215","isp":3,"port":5168,"property":0},{"ip":"101.69.184.140","isp":5,"port":5168,"property":1},{"ip":"112.12.67.161","isp":4,"port":5168,"property":1}],"levelInfo":{"consume":"878325540","consumebase":"5","consumediff":"0","consumelevle":"77","income":"396196612","incomebase":"5","incomediff":"0","incomelevle":"29","user_id":88302762},"name":"MH%2D%E8%B1%86%E6%B5%86","nobility":0,"phid":32087,"pos":"闀挎槬甯�","regionlimit":1,"roomid":2272,"stype":1,"title":"MH-璞嗘祮寮\u20ac鎾暒","url":"http://hdlws.sinashow.com/live/88302762_1498193952.flv","userInfo":{"nick_nm":"MH-璞嗘祮","photo_num":32087,"user_id":88302762}},{"anchorState":0,"aud":664,"dpic":"","familyid":11156,"familyname":"渚濇亱","id":88067918,"ip":[{"ip":"122.226.254.215","isp":3,"port":5441,"property":0},{"ip":"101.69.184.140","isp":5,"port":5441,"property":1},{"ip":"112.12.67.161","isp":4,"port":5441,"property":1}],"levelInfo":{"consume":"461132610","consumebase":"5","consumediff":"0","consumelevle":"36","income":"246529038","incomebase":"5","incomediff":"0","incomelevle":"14","user_id":88067918},"name":"%E9%B9%BF%F0%9F%A6%8C","nobility":0,"phid":32056,"pos":"淇￠槼甯�","regionlimit":0,"roomid":2243,"stype":1,"title":"楣筐煢屽紑鎾暒","url":"http://hdlws.sinashow.com/live/88067918_1498193739.flv","userInfo":{"nick_nm":"楣筐煢�","photo_num":32056,"user_id":88067918}},{"anchorState":1,"aud":946,"dpic":"","familyid":11222,"familyname":"鐑堥厭","id":88017582,"ip":[{"ip":"122.226.254.215","isp":3,"port":5411,"property":0},{"ip":"101.69.184.140","isp":5,"port":5411,"property":1},{"ip":"112.12.67.161","isp":4,"port":5411,"property":1}],"levelInfo":{"consume":"190420680","consumebase":"5","consumediff":"0","consumelevle":"9","income":"54781965","incomebase":"4","incomediff":"0","incomelevle":"44","user_id":88017582},"name":"%E7%83%88%E9%85%92%F0%9F%95%8AS%E5%87%AF%E7%91%9E","nobility":0,"phid":32044,"pos":"闀挎不甯�","regionlimit":1,"roomid":2159,"stype":1,"title":"鐑堥厭馃晩S鍑憺寮\u20ac鎾暒","url":"http://hdlws.sinashow.com/live/88017582_1498190574.flv","userInfo":{"nick_nm":"鐑堥厭馃晩S鍑憺","photo_num":32044,"user_id":88017582}},{"anchorState":0,"aud":655,"dpic":"","familyid":11167,"familyname":"MMY","id":89506577,"ip":[{"ip":"122.226.254.221","isp":3,"port":5032,"property":0},{"ip":"101.69.184.135","isp":5,"port":5032,"property":1},{"ip":"112.12.67.158","isp":4,"port":5032,"property":1}],"levelInfo":{"consume":"388237460","consumebase":"5","consumediff":"0","consumelevle":"28","income":"236571759","incomebase":"5","incomediff":"0","incomelevle":"13","user_id":89506577},"name":"%E5%B0%8F%E5%B0%8F%E5%93%88%F0%9F%92%97","nobility":0,"phid":32142,"pos":"闅鹃亾鍦ㄥ湡鏄�?","regionlimit":0,"roomid":2899,"stype":1,"title":"鍡ㄥ柦鍛\u20ac","url":"http://hdlws.sinashow.com/live/89506577_1498194791.flv","userInfo":{"nick_nm":"灏忓皬鍝堭煉�","photo_num":32142,"user_id":89506577}}]
     */
    @ResultCode("1")
    private int code;
    @DataLocation
    private List<InfoBean> info;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<InfoBean> getInfo() {
        return info;
    }

    public void setInfo(List<InfoBean> info) {
        this.info = info;
    }

    public static class InfoBean {
        @ParseKey("onlineCount")
        private int aud;
        @ParseKey("auchorGender")
        private int sex=0;
        private int phid;
        @ParseKey("roomCity")
        private String pos;

        public String getUserIcon() {
            return "http://img.live.sinashow.com/pic/avatar/"+userInfo.getUser_id()+"_"+phid+"_720*720.jpg";
        }

        public void setUserIcon(String userIcon) {
            this.userIcon = userIcon;
        }
        @ParseKey("liveStream")
        private String url;
        @ParseKey("auchorAvatar")
        private String userIcon;
        private UserInfoBean userInfo;

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public int getAud() {
            return aud;
        }

        public void setAud(int aud) {
            this.aud = aud;
        }


        public int getPhid() {
            return phid;
        }

        public void setPhid(int phid) {
            this.phid = phid;
        }

        public String getPos() {
            return pos;
        }

        public void setPos(String pos) {
            this.pos = pos;
        }

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }

        public UserInfoBean getUserInfo() {
            return userInfo;
        }

        public void setUserInfo(UserInfoBean userInfo) {
            this.userInfo = userInfo;
        }


        public static class UserInfoBean {
            /**
             * nick_nm : 鏉庡皬鐢滅敎鉂わ笍
             * photo_num : 32006
             * user_id : 881729287
             */
            @ParseKey("nickName")
            private String nick_nm;
            @ParseKey("roomId")
            private int user_id;

            public String getNick_nm() {
                return nick_nm;
            }

            public void setNick_nm(String nick_nm) {
                this.nick_nm = nick_nm;
            }


            public int getUser_id() {
                return user_id;
            }

            public void setUser_id(int user_id) {
                this.user_id = user_id;
            }
        }


    }
}
