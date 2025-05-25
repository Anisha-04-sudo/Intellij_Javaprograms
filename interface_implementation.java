
   interface  musicalIntruments{
    void play();
   }
   class Guitar implements musicalIntruments{
       public void play(){
           System.out.println("Strumming");
       }
   }
   class Piano implements  musicalIntruments{
           public void play(){
               System.out.println("Playing");
           }
   }


    public class interface_implementation {
        public static void main(String[] args) {
            musicalIntruments myguitar = new Guitar();
            musicalIntruments mypiano = new Piano();

              myguitar.play();
              mypiano.play();
        }
    }




