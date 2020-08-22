package com.university.asia_escape;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class health extends AppCompatActivity {
    private int[] ibtns_id = {R.id.imageButton1, R.id.imageButton2, R.id.imageButton3,
            R.id.imageButton4, R.id.imageButton5, R.id.imageButton6, R.id.imageButton7,
            R.id.imageButton8, R.id.imageButton9, R.id.imageButton10, R.id.imageButton11, R.id.imageButton12};
    private ImageButton[] ibtns = new ImageButton[12];

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_health);
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
        final Button person = (Button) findViewById(R.id.person);
        final Button jumpH=(Button)findViewById(R.id.jumpH);

        //region 左轉 I棟
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpI();
            }
        });
        //endregion
        //region 右轉 M棟
        right.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpM();
            }
        });
        //endregion
        //region 旅人
        person.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
             if(gv.getT()==0){
                 talk.setText("我快渴死了......");
                 gv.setT(1);
             }else if(gv.getT()==1){
                 talk.setText("如果你可以給我白開水");
                 gv.setT(2);
             }else if(gv.getT()==2){
                 talk.setText("我可能會有你想要的東西");
                 gv.setT(3);
             }else if(gv.getT()==3){
                 talk.setText("口好渴....沒有水嗎");
                 if(gv.getN3()==1){
                    gv.setT(4);
                     talk.setText("謝謝你的水，這個是我撿到的一片紙");
                     gv.setN8(1);
                     ibtns[7].setVisibility(View.VISIBLE);
                     gv.setN3(-1);
                 }
             }else if(gv.getT()==4){
                 talk.setText("謝謝你的水，我沒有東西可以給你了");
             }
            }
        });
        //endregion
        //region 進實驗室
        jumpH.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent();
                intent.setClass(health.this,lab.class);
                startActivity(intent);
                health.this.finish();
            }
        });
        //endregion
        talk.setText("醫學暨健康學院");

    }

    public void jumpM() {
        Intent intent = new Intent();
        intent.setClass(health.this, management.class);
        startActivity(intent);
        health.this.finish();
    }

    public void jumpI() {
        Intent intent = new Intent();
        intent.setClass(health.this, information.class);
        startActivity(intent);
        health.this.finish();
    }
}
