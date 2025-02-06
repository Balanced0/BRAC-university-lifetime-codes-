public class NikeBD{
    public String location;
    public int jordan;
    public int cortez;
    public int kobe;
    public int sold;
    public static int s_jordan;
    public static int s_cortez;
    public static int s_kobe;
    public static int branches = 0;
    public static int s_sold = 0;
    public NikeBD(String location){
        this.location = location;
        branches++;
    }
    public static void status(){
        System.out.println("Nike Bangladesh Status:");
        System.out.println("Branches Opened: " + branches);
        System.out.println("Currently Stocked: Jordan: " + s_jordan + ", Cortez: " + s_cortez + ", Kobe: " + s_kobe);
        System.out.println("Sold: " + s_sold);
    }
    public void details(){
        System.out.println("Nike " + location + " outlet:");
        System.out.println("Products Currently Stocked: Air Jordan: " + jordan + ", Cortez" + cortez + ", Zoom Kobe: " + kobe);
        System.out.println("Sold: " + sold);
    }
    public void restockProducts(String product, int amount){
        if(product.equals("Jordan")){
            jordan += amount;
            NikeBD.s_jordan += jordan;
        }
        else if(product.equals("Cortez")){
            cortez += amount;
            NikeBD.s_cortez += cortez;
        }
        else if(product.equals("Kobe")){
            kobe += amount;
            NikeBD.s_kobe += kobe;
        }
    }
    public void productSold(String p1, int a1, String p2, int a2){
        if(p1.equals("Jordan") && p2.equals("Cortez")){
            jordan -= a1;
            cortez -= a2;
            NikeBD.s_jordan -= jordan;
            NikeBD.s_cortez -= cortez;
            sold = a1 + a2;
            NikeBD.s_sold += sold;
        }
        else if(p1.equals("Jordan") && p2.equals("Kobe")){
            cortez -= a1;
            kobe -= a2;
            NikeBD.s_jordan -= jordan;
            NikeBD.s_kobe -= kobe;
            sold = a1 + a2;
            NikeBD.s_sold += sold;
        }
    }
    public void restockProducts(String []products, int []qty){
        for(int i = 0; i < products.length; i++){
            restockProducts(products[i], qty[i]);
        }
    }
}