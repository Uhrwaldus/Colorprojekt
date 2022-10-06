public class Main {


     public static void main(String[] args) {

         Colours skabelon = new Colours(0, 0, 0);
         Colours black = new Colours(0,0,0);
         Colours red = new Colours(255,0,0);
         Colours green = new Colours(0, 255, 0);
         Colours blue = new Colours(0, 0, 255);
         Colours pink = new Colours(255, 120, 120);






         System.out.println(black.toString());
         System.out.println(red.toString());
         System.out.println(green.toString());
         System.out.println(blue.toString());
         System.out.println(pink.toString());
         System.out.println((skabelon.equals(black)));
         System.out.println((skabelon.equals(red)));

     }
}
