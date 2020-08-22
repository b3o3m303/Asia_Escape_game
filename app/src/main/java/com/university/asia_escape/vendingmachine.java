package com.university.asia_escape;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

public class vendingmachine extends AppCompatActivity {
    private int[] ibtns_id = {R.id.imageButton1, R.id.imageButton2,R.id.imageButton3,
            R.id.imageButton4,R.id.imageButton5,R.id.imageButton6,R.id.imageButton7,
            R.id.imageButton8,R.id.imageButton9,R.id.imageButton10,R.id.imageButton11,R.id.imageButton12};
    private ImageButton[] ibtns = new ImageButton[12];
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vendingmachine);
        //region 每一頁都有
        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);
        final value gv = (value) getApplicationContext();//變數呼叫
        final ImageButton left = (ImageButton) findViewById(R.id.left);
        final TextView talk = (TextView) findViewById(R.id.talk);
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
        final Button wc = (Button) findViewById(R.id.wc);
        final Button drink = (Button) findViewById(R.id.drink);
        final Button pwd = (Button) findViewById(R.id.pwd);
        final Button spendcoin  = (Button) findViewById(R.id.spendcoin);


        //region 左轉 A
        left.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpA();
            }
        });
        //endregion
        //region WC
        wc.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpwc();
            }
        });
        //endregion
        //region drink
        drink.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpD();
            }
        });
        //endregion drink
        //region 轉到側邊
        pwd.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumppwd();
            }
        });
        //endregion
        //region 花掉硬幣
        spendcoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                jumpspend();
            }
        });
        //endregion
        if(gv.getN7()==0||gv.getN7()==1||gv.getN7()==2){
            talk.setText("好想喝飲料...如果有錢就可以投飲料了");
        }

    }

    public void jumpA() {
        Intent intent = new Intent();
        intent.setClass(vendingmachine.this, art.class);
        startActivity(intent);
        vendingmachine.this.finish();
    }

    public void jumpwc() {
        Intent intent = new Intent();
        intent.setClass(vendingmachine.this, wc.class);
        startActivity(intent);
        vendingmachine.this.finish();
    }

    public void jumpD() {
        Intent intent = new Intent();
        intent.setClass(vendingmachine.this, getdrink.class);
        startActivity(intent);
        vendingmachine.this.finish();
    }

    public void jumppwd() {
        Intent intent = new Intent();
        intent.setClass(vendingmachine.this, getpwd.class);
        startActivity(intent);
        vendingmachine.this.finish();
    }
    public void jumpspend() {
        Intent intent = new Intent();
        intent.setClass(vendingmachine.this, spendcoin.class);
        startActivity(intent);
        vendingmachine.this.finish();
    }

}
