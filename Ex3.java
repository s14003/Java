class Ex3{

  public String ex3_0(int n){
    if(n>0){
      return  "その値は正です";
    }else{
      return "その値は０か負です";
    }


  }

  public int ex3_1(int n){
    return Math.abs(n);

  }

  public String ex3_2(int a, int b){

    if(a%b==0){
      return b + "は" + a + "の約数です";
    }else{
      return b + "は" + a + "の約数ではありません";
    }
  }

  public String ex3_3(int a, int b){

    if(a > b){
      return a+"の方が大きいです";
    }else if(a==b){
      return "同じ値です";
    }else{
      return b+"の方が大きいです";
    }

  }

  public String ex3_4(int a){
    if(a > 0 ){
      if(a%5==0){
        return "その値は5で割り切れます";
      }else{
        return "その値は5で割り切れません";
      }
    }else{
      return "正でない整数値です";
    }
  }

  public String ex3_5(int a){
    if(a > 0){
      if(a% 10 ==0){
        return "その値は10の倍数です";
      }else{
        return "その値は10の倍数ではありません";
      }
    }else{
      return "正でない整数値です";
    }
  }

  public String ex3_6(int a){
    if(a > 0){
      if(a % 3 ==0){
        return "その値は3で割り切れます"; 
      }else if(a % 3 ==1){
        return "その値を3で割った余りは1です";
      }else {
        return "その値を3で割った余りは2です";
      } 
    }else{
      return "正でない整数値です";
    } 
  }
  public String ex3_7(int a){
    if(a > 100){
      return "範囲(0～100)外の値です";
    }else if(a > 79){
      return "優";
    }else if(a > 69){
      return "良"; 
    }else if(a > 59){
      return "可";
    }else if(a > -1){
      return "不可";
    }else{
      return "範囲(0～100)外の値です";
    }
  }

  public double ex3_8(double a, double b){
    return Math.max(a,b);
  }

  public int ex3_9(int a, int b){
    return Math.abs(a-b);
  }

  public String ex3_10(int a, int b){
    int x = Math.abs(a-b);
    if(x < 11){
      return "それらの差は10以下です"; 
    }else{
      return "それらの差は11以上です";
    }
  }

  public int ex3_11(int a, int b, int c){
    if(a > b){
      if(b > c ){
        return c;
      }else{
        return b;
      }
    }else if(a > c){
      return c;
    }else{
      return a;
    }

  }


  public int ex3_12(int a, int b, int c){
    if(a > b){
      if(b > c){
        return b;
      }else if(a > c){
        return c;
      }else{
        return a;
      }

    }else if(c > b){
      return b;
    }else if(a > c){
      return a;
    }else{
      return c;
    }

  }

  public String ex3_13(int a){
    if(a < 13 ){
      if(a > 1){
      if(a > 11){
        return "冬";
      }else if(a > 8){
        return "秋";
      }else if(a > 5){
        return "夏";
      }else if(a > 2){
        return "春";
      }else{
        return "冬";
      }

      }else{
      return "範囲(1～12)外の値です";
      }

      }else{
      return "範囲(1～12)外の値です";
    }
  }
}
