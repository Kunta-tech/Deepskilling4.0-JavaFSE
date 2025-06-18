package ECommercePlatform;

public class Product {
  String productName;
  int productID;
  String category;

  Product(int ID, String name, String category){
    this.productID = ID;
    this.productName = name;
    this.category = category;
  }
}
