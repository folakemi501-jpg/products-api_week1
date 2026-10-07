package uk.ac.westminster.products_api_week1;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController //just to find the mapping
@RequestMapping("/products") //this controller handles every URL that starts with / products
//this is so we don't have to repeat product every time
public class ProductController {

    @GetMapping("/{id}") //the id is a placeholder
    public Product getById(@PathVariable Long id) { //placeholder is transferred to the parameter
        //inside the method which is tucked by thr path annotation
        return new Product(id, "Laptop", 999.99); //returns the objects product
    }
}
