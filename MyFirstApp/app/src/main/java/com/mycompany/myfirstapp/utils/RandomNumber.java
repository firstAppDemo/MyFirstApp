package com.mycompany.myfirstapp.utils;

import android.util.Log;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.UUID;

/**
 * Created by Administrator on 2017/4/24.
 */

public class RandomNumber {

    public static String getCode(int passLength, int type)
    {
        StringBuffer buffer = null;
        StringBuffer sb = new StringBuffer();
        Random r = new Random();
        r.setSeed(new Date().getTime());
        switch (type)
        {
            case 0:
                buffer = new StringBuffer("0123456789");
                break;
            case 1:
                buffer = new StringBuffer("abcdefghijklmnopqrstuvwxyz");
                break;
            case 2:
                buffer = new StringBuffer("ABCDEFGHIJKLMNOPQRSTUVWXYZ");
                break;
            case 3:
                buffer = new StringBuffer(
                        "0123456789abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ");
                break;
            case 4:
                buffer = new StringBuffer(
                        "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789");
                sb.append(buffer.charAt(r.nextInt(buffer.length() - 10)));
                passLength -= 1;
                break;
            case 5:
                String s = UUID.randomUUID().toString();
                sb.append(s.substring(0, 8) + s.substring(9, 13)
                        + s.substring(14, 18) + s.substring(19, 23)
                        + s.substring(24));
                break;
            case 6:
                SimpleDateFormat sdf = new SimpleDateFormat("yyyyMMddHHmmss");//设置日期格式
                sb.append( "YQGL-" );
                sb.append( sdf.format(new Date()) );
        }

     /*   if (type != 5)
        {
            int range = buffer.length();
            for (int i = 0; i < passLength; ++i)
            {
                sb.append(buffer.charAt(r.nextInt(range)));
            }
        }*/
        return sb.toString();
    }

}
