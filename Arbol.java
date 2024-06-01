public class Arbol {
    public static void main(String[] args) {
      int i, j,es = 9;
      for(i = 1; i <= 10; i++) {
         for(j = 1; j < es; j++){
            System.out.print(" ");
         }
         if(i == 1){
            System.out.print("*");
         }else{
            for(j = 0; j < i-1; j++){
               System.out.print("0");
            }
            if(i >= 3){
               for(j = 0; j < i-2; j++){
                  System.out.print("0");
               }
            }
            es=es-1;
         }
         System.out.println("");
      }
    }
}