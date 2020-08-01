package worksheet2;
import java.util.Scanner;

/**
 *
 * @author velmurugan
 */
class box
{
int height;
    int width;
    int depth;
   
   void getvalue()
   {
       Scanner obj=new Scanner(System.in);
       System.out.println("Enter the height");
       height=obj.nextInt();
       System.out.println("Enter the width");
       width=obj.nextInt();
       System.out.println("Enter the depth:");
       depth=obj.nextInt();
   }
   void volume()
   {
      float volume =height*width*depth;
       System.out.println("The volume is"+volume);
   }
}
       
   

public class vol {
    public static void main(String[] args){
        //TODO code application logic here
       box obj=new box();
        obj.getvalue();
        obj.volume();
        
          box obj1=new box();
        obj1.getvalue();
        obj1.volume();
    }
    
}