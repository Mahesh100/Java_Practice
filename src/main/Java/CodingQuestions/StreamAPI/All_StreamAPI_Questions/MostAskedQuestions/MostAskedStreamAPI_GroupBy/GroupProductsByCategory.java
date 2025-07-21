package CodingQuestions.StreamAPI.All_StreamAPI_Questions.MostAskedQuestions.MostAskedStreamAPI_GroupBy;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

class Product {
    private int productId;
    private String category;
    private String productName;

    public Product(int productId, String category, String productName){
        this.productId =productId;
        this.category = category;
        this.productName = productName;
    }

    public int getProductId(){
        return productId;
    }

    public void setProductId(int productId){
        this.productId = productId;
    }

    public String getCategory(){
        return category;
    }

    public void setCategory(String category){
        this.category = category;
    }

    public String getProductName(){
        return productName;
    }

    public void setProductName(String productName){
        this.productName = productName;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productId=" + productId +
                ", category='" + category + '\'' +
                ", productName='" + productName + '\'' +
                '}';
    }
}
public class GroupProductsByCategory {
    public static void main(String [] args) {
        List<Product> products = Arrays.asList(
                new Product(1, "Cloaths", "T-shirt"),
                new Product(2, "Electronics", "Laptop"),
                new Product(3, "Stationary", "Pen"),
                new Product(4, "Electronics", "Mobile"),
                new Product(5, "Cloaths", "Uniform"),
                new Product(6, "Electronics", "Calculator")
        );

        //Group products using category
        Map<String,List<Product>> categoryMap = products.stream().collect(Collectors.groupingBy(product->product.getCategory()));

        categoryMap.forEach((key,value)->{
            System.out.println("Category is: "+key);
            System.out.println("List of product is: "+value);
        });

    }
}
