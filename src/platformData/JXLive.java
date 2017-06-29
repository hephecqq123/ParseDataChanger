package platformData;

import pareseData.DataLocation;
import pareseData.ParseKey;
import pareseData.ResultCode;

import java.util.List;

/**
 * Created by qq1440214507 on 2017/6/23.
 * 九秀直播
 */
public class JXLive {

    /**
     * code : 200
     * message :
     * data : [{"rid":"74453486","uid":"23010252","nickname":"AK.无双","phonehallposter":"http://upload.69xiu.com/upload/roomimg/2016/09/09/2301025257d22bede2709_370x280.jpg","recommend":"1","province":"山东","city":"枣庄","status":"1","sort":"5","publicnotice":"原来你是我最想留住的幸运..","usercount":7130,"fanscount":0,"opentime":"1498197157","timeLength":3925,"credit":"3620222266","creditLevel":24,"hotValue":"3428500","label":1,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"74453486"},{"rid":"78804065","uid":"27294693","nickname":"丫头等风也等你","phonehallposter":"http://img3.img.9xiu.com/upload/roomimg/2017/05/25/272946932234362ocjo1unmp_370x280.jpg","recommend":"1","province":"广西","city":"贵港","status":"1","sort":"5","publicnotice":"喜欢点关注群号465040637","usercount":13066,"fanscount":0,"opentime":"1498194527","timeLength":6555,"credit":"887507138","creditLevel":19,"hotValue":"2514800","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"78804065"},{"rid":"83812858","uid":"30368880","nickname":"超凡灬小护士呦","phonehallposter":"http://img0.img.9xiu.com/upload/roomimg/2017/06/09/30368880130715de61mtbnsv_370x280.jpg","recommend":"1","province":"山东","city":"德州","status":"1","sort":"5","publicnotice":"小护士，直播时间10-16 ，群号517667249","usercount":19309,"fanscount":0,"opentime":"1498184517","timeLength":16566,"credit":"426531780","creditLevel":17,"hotValue":"2466500","label":1,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"83812858"},{"rid":"77640066","uid":"26147840","nickname":"团子任务过不去","phonehallposter":"http://img0.img.9xiu.com/upload/roomimg/2017/03/25/2614784058d693c9748af_370x280.gif?v=1490457565702","recommend":"1","province":"江苏","city":"宿迁","status":"1","sort":"5","publicnotice":"群458201142 直播时间白天不定时,晚上八点到12左右","usercount":13793,"fanscount":0,"opentime":"1498192160","timeLength":8923,"credit":"4082315879","creditLevel":24,"hotValue":"878804","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"77640066"},{"rid":"85000415","uid":"31560303","nickname":"喜力~你的喜力","phonehallposter":"http://img3.img.9xiu.com/upload/roomimg/2017/06/03/31560303180205wdh9mv8bks_370x280.jpg","recommend":"1","province":"浙江","city":"金华","status":"1","sort":"5","publicnotice":"喝喜力 添动力","usercount":7343,"fanscount":0,"opentime":"1498197378","timeLength":3704,"credit":"61268020","creditLevel":12,"hotValue":"759700","label":3,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"85000415"},{"rid":"96237987","uid":"16997706","nickname":"帝王*龙瑶","phonehallposter":"http://img6.img.9xiu.com/upload/roomimg/2017/04/14/16997706135542h5u0f70nfb_370x280.jpg","recommend":"1","province":"黑龙江","city":"大庆","status":"1","sort":"4","publicnotice":"珍惜彼此，缘分自然来！","usercount":5410,"fanscount":0,"opentime":"1498194845","timeLength":6237,"credit":"1051473196","creditLevel":19,"hotValue":"4736200","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"96237987"},{"rid":"81462531","uid":"28062257","nickname":"板板/可可","phonehallposter":"http://img7.img.9xiu.com/upload/roomimg/2016/12/14/280622575850de2999c27_370x280.jpg","recommend":"1","province":"山东","city":"潍坊","status":"1","sort":"4","publicnotice":"每天直播时间是下午1点到6点 ，静候宝宝们的到来","usercount":3808,"fanscount":0,"opentime":"1498188979","timeLength":12104,"credit":"127398319","creditLevel":14,"hotValue":"4166500","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"81462531"},{"rid":"78608450","uid":"27101174","nickname":"baby你岚妹","phonehallposter":"http://img4.img.9xiu.com/upload/roomimg/2017/06/20/27101174233515q3aawhps62_370x280.jpg","recommend":"1","province":"吉林","city":"通化","status":"1","sort":"4","publicnotice":"每天直播时间白天 下午2点-5点 晚上11点-4点","usercount":5088,"fanscount":0,"opentime":"1498199335","timeLength":1747,"credit":"760978683","creditLevel":18,"hotValue":"3888900","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"78608450"},{"rid":"83123507","uid":"29809377","nickname":"国民初恋倩北鼻","phonehallposter":"http://img7.img.9xiu.com/upload/roomimg/2017/04/28/29809377154637d5ki0ub0xl_370x280.jpg","recommend":"1","province":"江苏","city":"盐城","status":"1","sort":"4","publicnotice":"直播时间早上9:00-15:00！新浪微博：倩姐姐温柔最迷人","usercount":3697,"fanscount":0,"opentime":"1498193939","timeLength":7143,"credit":"106816906","creditLevel":14,"hotValue":"2935204","label":0,"isTag5":1,"video_domain":"rtmp://live-rtmp.qn.9xiu.com:1935/9xiu/","video_flow":"83123507"},{"rid":"80543121","uid":"27786974","nickname":"童童～求升级","phonehallposter":"http://img4.img.9xiu.com/upload/roomimg/2017/02/17/2778697458a6bf5b18f6d_370x280.jpg","recommend":"1","province":"山东","city":"枣庄","status":"1","sort":"4","publicnotice":"越单纯越幸福","usercount":4310,"fanscount":0,"opentime":"1498190953","timeLength":10130,"credit":"149616687","creditLevel":15,"hotValue":"1659600","label":0,"isTag5":0,"video_domain":"rtmp://live-rtmp.qn.9xiu.com:1935/9xiu/","video_flow":"80543121"},{"rid":"83143542","uid":"29668015","nickname":"~惠儿~","phonehallposter":"http://img5.img.9xiu.com/upload/roomimg/2017/05/17/29668015164506f37y6x3hce_370x280.png","recommend":"1","province":"浙江","city":"温州","status":"1","sort":"4","publicnotice":"慧儿，非你莫属，我只愿守护有你给我的幸福~我在这里你会为我停留吗？","usercount":3180,"fanscount":0,"opentime":"1498193495","timeLength":7587,"credit":"63693943","creditLevel":12,"hotValue":"1626600","label":3,"isTag5":0,"video_domain":"rtmp://live-rtmp.qn.9xiu.com:1935/9xiu/","video_flow":"83143542"},{"rid":"81066833","uid":"27871994","nickname":"七月贺霸道升爵","phonehallposter":"http://img4.img.9xiu.com/upload/roomimg/2017/06/07/27871994091539x0mu2ha3s9_370x280.jpg","recommend":"1","province":"","city":"","status":"1","sort":"4","publicnotice":"你是对的，你是错的，反正规矩都是我定的！~","usercount":3738,"fanscount":0,"opentime":"1498179643","timeLength":21440,"credit":"158463418","creditLevel":15,"hotValue":"1570600","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"81066833"},{"rid":"82698026","uid":"29405596","nickname":"谁为爽停留","phonehallposter":"http://img6.img.9xiu.com/upload/roomimg/2017/05/10/29405596100927iui0logsx5_370x280.png","recommend":"1","province":"吉林","city":"白山","status":"1","sort":"4","publicnotice":"感谢所有陪我走到现在的人尤其感谢打算仍然硬着头皮陪我走下去的人","usercount":5316,"fanscount":0,"opentime":"1498179279","timeLength":21804,"credit":"64181167","creditLevel":12,"hotValue":"1486200","label":3,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"82698026"},{"rid":"81153569","uid":"27869580","nickname":"雨晴 加油吧","phonehallposter":"http://img0.img.9xiu.com/upload/roomimg/2017/05/21/278695802255364glx9aih98_370x280.jpg","recommend":"1","province":"山东","city":"枣庄","status":"1","sort":"4","publicnotice":"缘分相遇  相守靠人心","usercount":2845,"fanscount":0,"opentime":"1498195045","timeLength":6037,"credit":"268933429","creditLevel":16,"hotValue":"1293800","label":0,"isTag5":0,"video_domain":"rtmp://live-rtmp.qn.9xiu.com:1935/9xiu/","video_flow":"81153569"},{"rid":"81293235","uid":"28244459","nickname":"Boss★微笑","phonehallposter":"http://img9.img.9xiu.com/upload/roomimg/2017/04/24/282444591631312gejv8f4bt_370x280.gif?v=1493022694813","recommend":"1","province":"吉林","city":"通化","status":"1","sort":"4","publicnotice":"直播时间下午1\u20144 晚9\u20142 微笑求家人  求守护","usercount":3417,"fanscount":0,"opentime":"1498199458","timeLength":1624,"credit":"377290816","creditLevel":17,"hotValue":"1184000","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"81293235"},{"rid":"98715662","uid":"27414511","nickname":"风儿  加油","phonehallposter":"http://img1.img.9xiu.com/upload/roomimg/2016/11/25/2741451158382e60e35dc_370x280.gif?v=1480076901959","recommend":"1","province":"湖北","city":"荆门","status":"1","sort":"4","publicnotice":"招幕美女主播和星探 加扣扣 2631693636","usercount":2436,"fanscount":0,"opentime":"1498200440","timeLength":642,"credit":"259478333","creditLevel":16,"hotValue":"1107400","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"98715662"},{"rid":"76950337","uid":"25467240","nickname":"平凡之路，逗逗","phonehallposter":"http://img0.img.9xiu.com/upload/roomimg/2016/11/13/2546724058280f73bf65e_370x280.png","recommend":"1","province":"山东","city":"枣庄","status":"1","sort":"4","publicnotice":"珍惜当下","usercount":4172,"fanscount":0,"opentime":"1498195698","timeLength":5384,"credit":"248004119","creditLevel":16,"hotValue":"1103700","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"76950337"},{"rid":"81719066","uid":"28283754","nickname":"歌宝❤️哞哞","phonehallposter":"http://img4.img.9xiu.com/upload/roomimg/2017/05/05/28283754144402d05jslmg5d_370x280.png","recommend":"1","province":"贵州","city":"毕节","status":"1","sort":"4","publicnotice":"求过任务呀","usercount":4879,"fanscount":0,"opentime":"1498190581","timeLength":10502,"credit":"194691037","creditLevel":15,"hotValue":"984304","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"81719066"},{"rid":"84862557","uid":"31294998","nickname":"TV*美美的嗳","phonehallposter":"http://img8.img.9xiu.com/upload/roomimg/2017/06/04/31294998144720id5kb9js8e_370x280.jpg","recommend":"1","province":"吉林","city":"长春","status":"1","sort":"4","publicnotice":"靠近阳光，多些宠爱！！！","usercount":3041,"fanscount":0,"opentime":"1498195892","timeLength":5190,"credit":"18456750","creditLevel":9,"hotValue":"967000","label":3,"isTag5":0,"video_domain":"rtmp://live-rtmp.qn.9xiu.com:1935/9xiu/","video_flow":"84862557"},{"rid":"82631266","uid":"29200988","nickname":"还是那个乐抖抖","phonehallposter":"http://img8.img.9xiu.com/upload/roomimg/2017/04/07/2920098858e6e38e0d4fb_370x280.jpg","recommend":"1","province":"山东","city":"泰安","status":"1","sort":"4","publicnotice":"抖抖白天播粉丝联盟，王者游戏群518010117","usercount":2684,"fanscount":0,"opentime":"1498195748","timeLength":5334,"credit":"70840246","creditLevel":13,"hotValue":"844700","label":0,"isTag5":0,"video_domain":"rtmp://livedownrtmpws.9xiuimg.com:1935/9xiu/","video_flow":"82631266"}]
     */
    @ResultCode("200")
    private int code;
    @DataLocation
    private List<DataBean> data;

    public int getCode() {
        return code;
    }

    public void setCode(int code) {
        this.code = code;
    }

    public List<DataBean> getData() {
        return data;
    }

    public void setData(List<DataBean> data) {
        this.data = data;
    }

    public static class DataBean {

        private String rid;
        @ParseKey("roomId")
        private String uid;
        @ParseKey("nickName")
        private String nickname;
        @ParseKey("auchorAvatar")
        private String phonehallposter;
        @ParseKey("roomCity")
        private String city;
        @ParseKey("onlineCount")
        private int usercount;
        @ParseKey("liveStream")
        private String video_domain;
        @ParseKey("auchorGender")
        private int sex = 0;

        public int getSex() {
            return sex;
        }

        public void setSex(int sex) {
            this.sex = sex;
        }

        public String getRid() {
            return rid;
        }

        public void setRid(String rid) {
            this.rid = rid;
        }

        public String getUid() {
            return uid;
        }

        public void setUid(String uid) {
            this.uid = uid;
        }

        public String getNickname() {
            return nickname;
        }

        public void setNickname(String nickname) {
            this.nickname = nickname;
        }

        public String getPhonehallposter() {
            return phonehallposter;
        }

        public void setPhonehallposter(String phonehallposter) {
            this.phonehallposter = phonehallposter;
        }

        public String getCity() {
            return city;
        }

        public void setCity(String city) {
            this.city = city;
        }


        public int getUsercount() {
            return usercount;
        }

        public void setUsercount(int usercount) {
            this.usercount = usercount;
        }


        public String getVideo_domain() {
            return video_domain;
        }

        public void setVideo_domain(String video_domain) {
            this.video_domain = video_domain;
        }

    }
}
