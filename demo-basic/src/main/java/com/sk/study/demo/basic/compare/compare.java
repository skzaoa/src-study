package com.sk.study.demo.basic.compare;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

/**
 * @author sk
 * create on  2020/6/13:20:59
 */
@Slf4j
public class compare {
    public String test1(String s){
        long startTime=System.currentTimeMillis();
        int len = s.length();
        int tmp = 0;
        String result = "";
        for(int i=0;i<len;i++){
            if(tmp+i-len>0){
                break;
            }
            int lenj = len-1;
            for(int j=lenj;j>=i;j--){
                if(tmp>j-i+1){
                    break;
                }
                String ch = s.substring(i,i+1);
                String chj = s.substring(j,j+1);
                if(ch.equals(chj)){
                    String str = s.substring(i,j+1);
                    if(tmp>str.length()){
                        continue;
                    }
                    boolean bl = true;
                    int ln = str.length();
                    int lenm = ln/2+1;
                    for(int m=0;m<lenm;m++){
                        CharSequence start = str.subSequence(m, m+1);
                        CharSequence end = str.subSequence(ln-m-1,ln-m);
                        if(!start.equals(end)){
                            bl = false;
                            break;
                        }
                    }
                    if(bl && ln>tmp){
                        result = str;
                        tmp = ln;
                    }
                }
            }
        }
        log.info(result);
        long endTime=System.currentTimeMillis();
        log.info("程序运行时间： "+(endTime-startTime)+"ms");
        return result;
    }

    public String test2(String s){
        long startTime=System.currentTimeMillis();
        int len = s.length();
        int tmp = 0;
        String result = "";
        for(int i=0;i<len;i++){
            if(tmp+i-len>0){
                break;
            }
            for(int j=len-1;j>=i;j--){
                if(tmp>j-i+1){
                    break;
                }
                String str = s.substring(i,j+1);
                boolean bl = true;
                for(int m=0;m<(str.length()/2+1);m++){
                    Character start = str.charAt(m);
                    Character end = str.charAt(str.length()-m-1);
                    if(!start.equals(end)){
                        bl = false;
                        break;
                    }
                }
                if(bl && str.length()>tmp){
                    result = str;
                    tmp = str.length();
                    break;
                }
            }
        }
        log.info(result);
        long endTime=System.currentTimeMillis();
        log.info("程序运行时间： "+(endTime-startTime)+"ms");
        return result;
    }

    @Test
    public void substringTest() {
        compare lp = new compare();
        String s = "aaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaabcaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaaa";
        lp.test2(s);

        lp.test1(s);
    }

}
