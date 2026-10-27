public class altezza{
    public static void main(String[] args){
        int altezzaPersona1= 165; 
        int altezzaPersona2= 140;
        int altezzaMinima= 150;
        boolean puosalire1= altezzaPersona1>=altezzaMinima;
        boolean puosalire2= altezzaPersona2>=altezzaMinima; 

        System.out.println(Math.max(altezzaPersona1, altezzaPersona2));    
    }
}