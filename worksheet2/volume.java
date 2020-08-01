package worksheet2;
class boxc
{
  int height;
  int width;
  int depth;
   
}

/**
 *
 * @author Desktop Pc
 */
public class volume {
    public static void main(String[] args){
        boxc obj=new boxc ();
        obj.height=20;
         obj.width=12;
          obj.depth=20;
       float vol=obj.depth*obj.width*obj.height;
          System.out.println(vol);
          
       
        
    }
    
}
