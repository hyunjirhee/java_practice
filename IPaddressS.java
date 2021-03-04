public class IPaddressS
{
   public static void main(String[] args)
      {
      String h= " Host";
      String b= " Broadcast";
      String n= " Network";
      for (int ipa = 0; ipa<= 255; ipa++)
         {
         for(int ipl = 0; ipl <= 255; ipl++)
            {
                    if (ipl == 0)
                     {
                     System.out.println("192.168."+ipa+"."+ipl + n);
                     }
                    else if (ipl == 255)
                     {
                       System.out.println("192.168."+ipa+"."+ipl + b);
                     }
                    else
                     {
                       System.out.println("192.168."+ipa+"."+ipl + h);

                     }
             }
         }     
       }
}  
