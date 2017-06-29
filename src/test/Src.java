package test;

import pareseData.TargetKey;

/**
 * Created by 王洋 on 2017/6/22.
 * email:1440214507@qq.com
 * version:1.0
 * 成都嘉承兴业科技有限公司版权所有
 * des:
 */
public class Src {
    @TargetKey("name")
    public String name;
    @TargetKey("id")
    public String code;
    @TargetKey("url")
    public String path;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    @Override
    public String toString() {
        return "Src{" +
                "name='" + name + '\'' +
                ", code=" + code +
                ", path='" + path + '\'' +
                '}';
    }
}
