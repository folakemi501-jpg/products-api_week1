package uk.ac.westminster.products_api_week1;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.security.PrivateKey;
import java.util.ArrayList;
import java.util.List;

@RestController //just to find the mapping
@RequestMapping("/products") //this controller handles every URL that starts with / products
//this is so we don't have to repeat product every time
public class ProductController {

    @Autowired
    private ProductService productService;

    Product p1 = new Product(1L, "Laptop",999.99);
    Product p2 = new Product(2L, "Mouse",19.9);
    Product p3 = new Product(3L, "Monitor",249.99);

    @GetMapping("/products")
    public Product[] all(){
        return new Product[]{p1,p2,p3};
    }

    @GetMapping("/{id}") //the id is a placeholder
    public Product getById(@PathVariable Long id) { //placeholder is transferred to the parameter
        //inside the method which is tucked by thr path annotation
        return new Product(1L, "Laptop", 999.99); //returns the objects product
    }
}
