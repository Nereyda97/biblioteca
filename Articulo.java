
class Articulo{
  String[] img=null;
  String[] titulo=null;
  String[] url=null;
  int num;
  public Articulo(int a, String[] B, String[] C, String[] D){
    this.num=a;
    this.img=B;
    this.url=D;
    this.titulo=C;

  }
  public void Imprimir(){
      System.out.println(this.num);
      for(int i=0;i<this.num;i++){
        System.out.println(this.titulo[i]);
      }
  }
  Articulo(String linea){
      System.out.println(linea);
      String Temporal[]=linea.split(",");
      int num=Integer.parseInt(Temporal[0]);
      String Arreglo1[]=new String[num];
      String Arreglo2[]=new String[num];
      String Arreglo3[]=new String[num];

      if (num==1){
        Arreglo1[0]=Temporal[1];
        Arreglo2[0]=Temporal[2];
        Arreglo3[0]=Temporal[3];
      }else{
        Arreglo1=slice(1,num,Temporal);
        Arreglo2=slice(num+1,num*2,Temporal);
        Arreglo3=slice(num*2+1,num*3,Temporal);
      }
      this.img=Arreglo1;
      this.titulo=Arreglo2;
      this.url=Arreglo3;
      this.num=num;
  }
  public String[] slice(int a, int b,String[] S) {
    String Temporal[]=new String[b];
    for(int i=0;a<=b;a++,i++){
      Temporal[i]=S[a];
    }
    return Temporal;
  }

}
