package cn.org.yuwang.JzOffer;

/**
 * Created by m1500 on 2016/7/31.
 */
public class 替换空格 {
    public String replaceSpace(StringBuffer str) {
        int strLength=str.length();
        int strOldLength=str.length();
        int spaceN=0;
        for (int i=0;i<str.length();i++){
            if(str.charAt(i)==' '){
                spaceN++;
            }
        }
        strLength+=spaceN*2;
        str.setLength(strLength);
        for (int i=strOldLength-1,j=strLength-1;i>=0;i--){
            if(str.charAt(i)!=' '){
                str.setCharAt(j--,str.charAt(i));
            }else {
                str.setCharAt(j--,'0');
                str.setCharAt(j--,'2');
                str.setCharAt(j--,'%');

            }
        }
        return str.toString();
    }
}
