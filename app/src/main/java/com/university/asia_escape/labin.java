package com.university.asia_escape;

import android.content.Intent;
import android.os.Handler;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class labin extends AppCompatActivity {
    private int[] ibtns_id = {R.id.imageButton1, R.id.imageButton2, R.id.imageButton3,
            R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7,
            R.id.imageButton8, R.id.imageButton9, R.id.imageButton10, R.id.imageButton11, R.id.imageButton12};
    private ImageButton[] ibtns = new ImageButton[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_labin);
        //region 每一頁都有
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        final value gv = (value) getApplicationContext();//變數呼叫
        final TextView talk = (TextView) findViewById(R.id.talk);
        final ImageButton right=(ImageButton)findViewById(R.id.right);
        final ImageButton left=(ImageButton)findViewById(R.id.left);
        final ImageButton coin = (ImageButton) findViewById(R.id.coin);
        for (int i = 0; i < 12; i++) {
            ibtns[i] = (ImageButton) findViewById(ibtns_id[i]);
        }
        //region 開啟或關閉道具
        if (gv.getN1() == 1) {
            ibtns[0].setVisibility(View.VISIBLE);
        }
        if (gv.getN2() == 1) {
            ibtns[1].setVisibility(View.VISIBLE);
        }
        if (gv.getN3() == 1||gv.getN3() == -1) {
            ibtns[2].setVisibility(View.VISIBLE);
        }
        if (gv.getN4() == 1) {
            ibtns[3].setVisibility(View.VISIBLE);
        }
        if (gv.getN5() == 1) {
            ibtns[4].setVisibility(View.VISIBLE);
        }
        if (gv.getN6() == 1) {
            ibtns[5].setVisibility(View.VISIBLE);
        }
        if (gv.getN7() == 1) {
            ibtns[6].setVisibility(View.VISIBLE);
        }
        if (gv.getN7() == 2 || gv.getN7() == -1) {
            coin.setVisibility(View.VISIBLE);
            ibtns[6].setVisibility(View.INVISIBLE);
        }
        if (gv.getN8() == 1) {
            ibtns[7].setVisibility(View.VISIBLE);
        }
        if (gv.getN9() == 1) {
            ibtns[8].setVisibility(View.VISIBLE);
        }
        if (gv.getN10() == 1) {
            ibtns[9].setVisibility(View.VISIBLE);
        }
        if (gv.getN11() == 1) {
            ibtns[10].setVisibility(View.VISIBLE);
        }
        if (gv.getN12() == 1) {
            ibtns[11].setVisibility(View.VISIBLE);
        }
        //endregion
        //region 按鈕解說
        //region btn0
        ibtns[0].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN1() == -1) {
                    talk.setText("已經用過了");
                } else {
                    talk.setText("一把鑰匙");
                }
            }
        });
        //endregion
        //region btn1
        ibtns[1].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                talk.setText("完整的一張亞洲大學地圖");
            }
        });
        //endregion
        //region btn2
        ibtns[2].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN3() == -1) {
                    talk.setText("喝過蒸餾水的燒杯");
                } else {
                    talk.setText("蒸餾水...應該可以喝...應該吧");
                }
            }
        });
        //endregion
        //region btn3
        ibtns[3].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                if (gv.getN9() == 0) {
                    talk.setText("裝有紙張的罐子，再按一下拿出紙張");
                }
                if (gv.getPASS3() == 1) {
                    talk.setText("沒有用處的空瓶子");
                }
                if (gv.getN9() == 1) {
                    ibtns[8].setVisibility(View.VISIBLE);
                }
                gv.setN9(1);
                gv.setPASS3(1);
            }
        });
//endregion
        //region btn4
        ibtns[4].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN5() == -1) {
                    talk.setText("用過的空燒杯");
                } else {
                    talk.setText("空燒杯");
                }

            }
        });
        //endregion
        //region btn5
        ibtns[5].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN6() == -1) {
                    talk.setText("用過的亞洲大學地圖的一部分-D");
                } else {
                    talk.setText("亞洲大學地圖的一部分-D");
                }

            }
        });
        //endregion
        //region btn6
        ibtns[6].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                talk.setText("肥皂裡面好像有東西");
            }
        });
        //endregion
        //region btncoin
        coin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN7() != -1) {
                    talk.setText("硬幣");
                } else {
                    talk.setText("已經用過了");
                }
            }
        });
        //endregion
        //region btn7
        ibtns[7].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN8() == -1) {
                    talk.setText("用過的亞洲大學地圖的一部分-C");
                } else {
                    talk.setText("亞洲大學地圖的一部分-C");
                }

            }
        });
        //endregion
        //region btn8
        ibtns[8].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN9() == -1) {
                    talk.setText("用過的亞洲大學地圖的一部分-A");
                } else {
                    talk.setText("亞洲大學地圖的一部分-A");
                }
            }
        });
        //endregion
        //region btn9
        ibtns[9].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN10() == -1) {
                    talk.setText("用過的螺絲起子");
                } else {
                    talk.setText("螺絲起子");
                }

            }
        });
        //endregion
        //region btn10
        ibtns[10].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN11() == -1) {
                    talk.setText("用過的亞洲大學地圖的一部分-B");
                } else {
                    talk.setText("亞洲大學地圖的一部分-B");
                }

            }
        });
        //endregion
        //region btn11
        ibtns[11].setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getN12() == -1) {
                    talk.setText("用過的火柴");
                } else {
                    talk.setText("火柴");
                }

            }
        });
        //endregion
//endregion
//endregion
        final ImageButton close = (ImageButton) findViewById(R.id.close);
        final ImageView bg = (ImageView) findViewById(R.id.imageView4);
        final Button click = (Button) findViewById(R.id.click);
        //region 初始化 背景 設定按鈕出現

        switch (gv.getPASS6()) {
            case 2:
                bg.setImageDrawable(getDrawable(R.drawable.lab_2));
                break;
            case 3:
                bg.setImageDrawable(getDrawable(R.drawable.lab_3));
                break;
            case 4:
                bg.setImageDrawable(getDrawable(R.drawable.lab_4));
                break;
            case 5:
                bg.setImageDrawable(getDrawable(R.drawable.lab_4));
                talk.setText("已經做完蒸餾水實驗了");
                break;
        }
        //endregion
        //region click說明實驗
        click.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gv.getPASS6() == 0) {
                    click.setVisibility(View.INVISIBLE);
                    talk.setText("做到一半的蒸餾水實驗");
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            talk.setText("要是有接水的容器跟燃燒的酒精燈");
                        }
                    }, 1500);
                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            talk.setText("就可以繼續實驗了");
                            gv.setPASS6(1);
                            click.setVisibility(View.VISIBLE);
                        }
                    }, 3000);

                } else if (gv.getPASS6() == 1 && gv.getN5() == 1) {
                    talk.setText("放上燒杯");
                    bg.setImageDrawable(getDrawable(R.drawable.lab_2));
                    gv.setPASS6(2);

                } else if (gv.getPASS6() == 1 && gv.getN5() == 0) {
                    talk.setText("要先放上接水的容器....");
                } else if (gv.getPASS6() == 2 && gv.getN12() == 1) {
                    talk.setText("用火柴點燃酒精燈了");
                    gv.setPASS6(3);
                    bg.setImageDrawable(getDrawable(R.drawable.lab_3));
                    click.setVisibility(View.INVISIBLE);
                    close.setVisibility(View.INVISIBLE);
                    Handler handler = new Handler();
                    handler.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            talk.setText("等蒸餾完成(5秒鐘)，就可以拿走水杯了");
                        }
                    }, 1000);
                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            click.setVisibility(View.VISIBLE);
                            gv.setPASS6(4);
                            talk.setText("可以拿起來了");

                        }
                    }, 6000);
                } else if (gv.getPASS6() == 4) {
                    ibtns[2].setVisibility(View.VISIBLE);
                    gv.setN3(1);
                    talk.setText("得到了能夠喝的水...");
                    bg.setImageDrawable(getDrawable(R.drawable.lab_4));
                    Handler handler1 = new Handler();
                    handler1.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            talk.setText("不過我也不敢喝...");
                            click.setVisibility(View.INVISIBLE);
                        }
                    }, 1500);
                    Handler handler2 = new Handler();
                    handler2.postDelayed(new Runnable() {
                        @Override
                        public void run() {
                            talk.setText("還是拿給外面的旅人喝好了");
                            close.setVisibility(View.VISIBLE);
                        }
                    }, 3000);
                gv.setPASS4(5);}


            }
        });
        //endregion
        //region close
        close.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumplab();
            }
        });
        //endregion

    }

    public void jumplab() {
        Intent intent = new Intent();
        intent.setClass(labin.this, lab.class);
        startActivity(intent);
        labin.this.finish();
    }
}
