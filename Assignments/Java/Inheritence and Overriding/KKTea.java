public class KKTea extends Tea{
    public int tea_bags;
    public static int total_sales = 0;
    public static int kk_regular_tea = 0;
    public KKTea(int price, int tea_bags){
        super("KK Regular Tea", price);
        this.tea_bags = tea_bags;
    }
    public void productDetail(){
        super.productDetail();
        System.out.println("Weight: " + (tea_bags * 2) + ", Tea Bags: " + tea_bags);
    }
    public static void totalSales(){
        System.out.println("Total Sales: " + total_sales);
        System.out.println("KK Regular Tea: " + kk_regular_tea);
        if(KKFlavouredTea.kk_flavoured_tea != 0){
            System.out.println("KK Flavoured Tea: " + KKFlavouredTea.kk_flavoured_tea);
        }
    }
    public static void updateSoldStatusRegular(KKTea location){
        location.status = true;
        kk_regular_tea++;
        total_sales++;
        
    }
}