package test;

import pareseData.ParseKey;

/**
 * Created by qq1440214507 on 2017/6/29.
 */
public class T {

    private String text;
    @ParseKey("method:roomId")
    private String date;
    public T(String text) {
        this.text = text;
    }
    public String getDate(){
        return this.text;
    }
}
