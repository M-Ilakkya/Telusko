
    class computer{
        public void playmusic(){
            System.out.println("Music playing");
                
        }
        public String getbrand(int cost){
            if(cost>10000000){
                return "Apple";
            }
            else if(cost>5000000){
                return "HP";
            }
            else{
                return "Dell";
            }
           
        }
        public int speed(int cost){
            if(cost>10000000){
                return 100;
            }
            else if(cost>5000000){
                return 80;
            }
            else{
                return 60;
            }
        }
    }
        public class twofour {
        public static void main(String[] args) {
        computer comp=new computer();
        comp.playmusic();
        int co=10000000;
        String brand=comp.getbrand(co);
        System.out.println("The brand is: " + brand);
        
        System.out.println("The cost is: " + co);
        int spd=comp.speed(co);
        System.out.println("The speed is: " + spd);
        
    }
    
}
