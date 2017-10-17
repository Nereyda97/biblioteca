import java.io.*;
class leer{
  public static void main(String[] args){
    File archivo = null;
    FileReader fr = null;
    BufferedReader br = null;
    Articulo[] arreglo=new Articulo[10];
    try {
         archivo = new File ("archivos.csv");
         fr = new FileReader (archivo);
         br = new BufferedReader(fr);

         String linea;
         int i=0;
         while((linea=br.readLine())!=null){
           arreglo[i]=new Articulo(linea);
           System.out.println();
           i++;
         }
      }
      catch(Exception e){
         e.printStackTrace();
      }finally{
         try{
            if( null != fr ){
               fr.close();
            }
         }catch (Exception e2){
            e2.printStackTrace();
         }
      }
        arreglo[0].Imprimir();
    /*  for(int i=0;i<10;i++){
        arreglo[i].Imprimir();
      }
*/

  }
}
