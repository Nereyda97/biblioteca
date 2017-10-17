class Programa{
  public static void main(String[] args){
    String[] cadena1={"https://assets.digitalocean.com/ghost/2017/06/High-CPU-Droplets_blog.png","https://blog.digitalocean.com/block-storage-comes-to-singapore/","https://assets.digitalocean.com/ghost/2017/09/Spaces-Blog.png"};
    String[] cadena2={"Computo de Alto desempeño","Almacenamiento Dinamico","Almacenamiento por Bloques"};
    String[] cadena3={"https://blog.digitalocean.com/introducing-high-cpu-droplets/","https://blog.digitalocean.com/tag/product/","https://blog.digitalocean.com/introducing-high-cpu-droplets/"};
    int num=1;
    Articulo A=new Articulo(3,cadena1,cadena2,cadena3);

  //A.Imprimir();
    Articulo B=new Articulo("1,http://frompythonimportpodcast.com/static/images/fpip/masthead.jpg,tutorial de python,http://frompythonimportpodcast.com/");
    B.Imprimir();

  }
}
