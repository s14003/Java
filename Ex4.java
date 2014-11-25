class Ex4{

  public int [] ex4_1(int [] a){

    for(int i = 0;i<a.length-1;i++){

      for(int j = a.length-1;j>i;j--){

        if(a[j]<a[j-1]){
          int t = a[j];
          a[j] = a[j-1];
          a[j-1]=t;
        }
      }
    }return a;  
  }
  public int [] ex4_2(int [] a){
    for(int i = 0;i < a.length-1;i++){

      for(int j = a.length -1;j > i;j--){

        if(a[j] > a[j-1]){
          int t = a[j];
          a[j] = a[j-1];
          a[j-1]=t;
        }
      }
    }
    return a;

  }

  public String [] ex4_3(int [] a){

    String [] hantei = {"dummy"};
      return hantei;
  }
  public int ex4_4(int a){

    return a;

  }

  public int ex4_5(int a){

    return -1;

  }
}

