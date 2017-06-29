package test;

import pareseData.ParseKey;
import pareseData.TargetKey;

import java.util.List;

/**
 * Created by 王洋 on 2017/6/22.
 * email:1440214507@qq.com
 * version:1.0
 * 成都嘉承兴业科技有限公司版权所有
 * des:
 */
public class Target {
    public Target(){
        inners=new Inner();
        inners.setUrl("hahha");
    }

    @ParseKey("name")
    private String name;
    @ParseKey("id")
    private int id;

    private String url;

    public Inner getInners() {
        return inners;
    }

    public void setInners(Inner inners) {
        this.inners = inners;
    }

    private Inner inners;

    public static class Inner {
        @ParseKey("url")
        public String url;

        public String getUrl() {
            return url;
        }

        public void setUrl(String url) {
            this.url = url;
        }
    }

    @Override
    public String toString() {
        return "Target{" +
                "name='" + name + '\'' +
                ", id=" + id +
                ", url='" + url + '\'' +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }
}
