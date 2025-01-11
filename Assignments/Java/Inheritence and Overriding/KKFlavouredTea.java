public class KKFlavouredTea extends KKTea{
    public static int kk_flavoured_tea = 0;
    public KKFlavouredTea(String name, int price, int tea_bags){
        super(price, tea_bags);
        this.name = "KK " + name + " Tea";
    }
    public void productDetail(){
        super.productDetail();
    }
    public static void updateSoldStatusFlavoured(KKFlavouredTea location){
        location.status = true;
        kk_flavoured_tea++;
        total_sales = (kk_regular_tea + kk_flavoured_tea);
        
    }
}