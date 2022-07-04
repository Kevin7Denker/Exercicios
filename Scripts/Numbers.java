public class Questao1{

  public static void main(String args[]){
       
    int a = 0, b = 0, c = 0;  
      
      
    System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");
       
    System.out.println("- NUMEROS PARES -"); 
    System.out.println(" ");
     
    for(a = 0; a <= 2500; a++){
           
      if( a % 2 == 0){
        
        System.out.print(a + " - ");  
          
      }
    }
      
    System.out.print("FIM");

    System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");
   
    System.out.println("- NUMEROS IMPARES -");
    System.out.println(" ");
      
    for(b = 0; b <= 2500; b++){
  
      if( b % 2 != 0){
        System.out.print( b + " - ");
  
      }
      
    }   
      
    System.out.print("FIM");  
        
    System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");System.out.println(" ");
     
  
    System.out.println("- NUMEROS DIVISIVEIS POR 11 COM FINAL 5 - ");
    System.out.println(" ");
          
    for( c = 0; c < 2500; c++ ){
        
        if( c % 11 ==  5){ 
          System.out.print(c + " - ");
        }
  
  
      }
      
  
    }
         
  }