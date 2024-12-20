public class object {
    public static void main(String[] args){
       int [] arr = {1,2,3,4};
       
       temp p1 = new temp();
       temp p2 = new temp();

       
       p1.age = 20;
       p1.name = "알파1";
       p1.home = "베타1"; 

       p2.age = 22;
       p2.name = "알파2";
       p2.home = "베타2"; 
       
    }

    static class temp{
        int age;
        String name;
        String home;
    }
    
}
