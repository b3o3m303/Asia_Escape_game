package com.university.asia_escape;

import android.app.Application;

public class value extends Application {
    private int N1=0;
    private int N2=0;
    private int N3=0;
    private int N4=0;
    private int N5=0;
    private int N6=0;
    private int N7=0;//1是肥皂 2是硬幣 -1花光
    private int N8=0;
    private int N9=0;
    private int N10=0;
    private int N11=0;
    private int N12=0;

    private int PASS1=0; //販賣機密碼
    private int PASS2=0;//水開關 0開水1關水
    private int PASS3=0;//瓶中信沒開過,1開過
    private int PASS4=0;//1=飲料滾出來
    private int PASS5=0;//1=主機開過
    private int PASS6=0;//說明實驗 1是有說明過 2是有點燒杯  3是有火 4是都有
    private int PASS7=0;//背包沒開過 1開過 2撿走



    private int G=0;//警衛說話
    private int T=0;//旅人說話

    //region set
    public void setN1(int n1) {
        this.N1 = n1;
    }

    public void setN2(int n2) {
        this.N2 = n2;
    }

    public void setN3(int n3) {
        this.N3 = n3;
    }

    public void setN4(int n4) {
        this.N4 = n4;
    }

    public void setN5(int n5) {
        this.N5 = n5;
    }

    public void setN6(int n6) {
        this.N6 = n6;
    }

    public void setN7(int n7) {
        this.N7 = n7;
    }

    public void setN8(int n8) {
        this.N8 = n8;
    }

    public void setN9(int n9) {
        this.N9 = n9;
    }

    public void setN10(int n10) {
        this.N10 = n10;
    }

    public void setN11(int n11) {
        this.N11 = n11;
    }

    public void setN12(int n12) {
        this.N12 = n12;
    }
    //endregion

    //regiton get
   public int getN1(){
        return N1;
   }


    public int getN2() {
        return N2;
    }


    public int getN3() {
        return N3;
    }


    public int getN4() {
        return N4;
    }


    public int getN5() {
        return N5;
    }


    public int getN6() {
        return N6;
    }


    public int getN7() {
        return N7;
    }

    public int getN8() {
        return N8;
    }

    public int getN9() {
        return N9;
    }


    public int getN10() {
        return N10;
    }


    public int getN11() {
        return N11;
    }


    public int getN12() {
        return N12;
    }


    //endregion

    public void setPASS1(int pass1) {
        this.PASS1 = pass1;
    }

    public void setPASS2(int pass2) {
        this.PASS2 = pass2;
    }

    public void setPASS3(int pass3) {
        this.PASS3 = pass3;
    }

    public void setPASS4(int pass4) {
        this.PASS4 = pass4;
    }

    public void setPASS5(int pass5) {
        this.PASS5 = pass5;
    }

    public void setPASS6(int pass6) {
        this.PASS6 = pass6;
    }

    public void setPASS7(int pass7) {
        this.PASS7 = pass7;
    }




    public int getPASS1() {
        return PASS1;
    }

    public int getPASS2() {
        return PASS2;
    }

    public int getPASS3() {
        return PASS3;
    }

    public int getPASS4() {
        return PASS4;
    }

    public int getPASS5() {
        return PASS5;
    }


    public int getPASS6() {
        return PASS6;
    }


    public int getPASS7() {
        return PASS7;
    }

    public void setG(int g){this.G=g;}
    public int getG(){return G;}
    public void setT(int t){this.T=t;}
    public int getT(){return T;}
}
