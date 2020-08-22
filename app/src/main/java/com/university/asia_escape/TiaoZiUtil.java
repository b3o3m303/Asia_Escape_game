package com.university.asia_escape;

import android.widget.TextView;

public class TiaoZiUtil {
    private static TextView tv;
    private static String s;
    private static int length;
    private static long time;
    static int n = 0;
    private static int nn;


    public TiaoZiUtil(TextView tv, String s, long time) {
        this.tv = tv;//textview
        this.s = s;//字串
        this.time = time;//間隔時間
        this.length = s.length();
        startTv(n);//run
    }


    public static void startTv(final int n) {

        new Thread(
                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            final String stv = s.substring(0, n);//get字串
                            tv.post(new Runnable() {
                                @Override
                                public void run() {
                                    tv.setText(stv);
                                }
                            });
                            Thread.sleep(time);//暫停
                            nn = n + 1;//n+1；下一個
                            if (nn <= length) {//如果還有字
                                startTv(nn);
                            }

                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }


                    }
                }

        ).start();


    }
}
