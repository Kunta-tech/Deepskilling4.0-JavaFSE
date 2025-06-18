package ECommercePlatform;

public class ProductList {
  Product[] list;
  final static int listLength = 7;
  ProductList(){
    list = new Product[listLength];

    String[] names = {"Phone", "Laptop", "Tablet", "Monitor", "Keyboard", "Mouse", "Camera"};
    String[] categories = {"Electronics", "Accessories", "Office", "Gaming"};

    for(int i=0;i<listLength;i++){
      int ID = i*10 + 6;
      list[i] = new Product(ID, names[i], categories[(int)(Math.random()*categories.length)]);
    }
  }

  public Product linearSearch(String name){
    for (Product product : list) {
      if(product.productName.equals(name)) 
        return product;
    }
    return null;
  }
  public Product binarySearch(int id){
    int leftLimit = 0,
        rightLimit = list.length-1,
        mid;
    while (leftLimit<=rightLimit) {
      mid = (leftLimit+rightLimit)/2;
      if(list[mid].productID == id) return list[mid];
      else if(list[mid].productID < id) leftLimit = mid+1;
      else if(list[mid].productID > id) rightLimit = mid-1;
    }
    return null;
  }
  static void result(Product product){
    if (product == null) System.out.println("Product not found");
    else System.out.println("Product found Id: "+product.productID+"\nname: "+product.productName+" category: "+product.category);
  }

  public static void main(String[] args) {
    ProductList productList = new ProductList();

    System.out.println("Searching with Linear Search");
    result(productList.linearSearch("Keyboard"));
    result(productList.linearSearch("Speaker"));

    System.out.println("Searching with Binary Search");
    result(productList.binarySearch(productList.list[1].productID));
  }
}
