package com.example.demo.product.controller;

import com.example.demo.product.model.Product;
import com.example.demo.product.model.ProductRepository;
import com.example.demo.product.service.ProductService;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;
import java.util.Optional;

@CrossOrigin // Allow all domain origins.
@RestController
@RequestMapping("api/v1/products")
public class ProductController {

    private final ProductService productService;

    public ProductController(ProductService productService) {
        this.productService = productService;
    }

    /**
     * Handles getting/finding all products.
     *
     * @return spaceships
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/GET">HTTP GET</a>
     */
    @GetMapping
    ResponseEntity<List<Product>> findAll() {
        return ResponseEntity.ok().body(productService.findAll());
    }


    @GetMapping("/{id}")
    public ResponseEntity<Product> find(@PathVariable("id") Long id) {
        Optional<Product> item = Optional.of(productService.find(id)
                .orElseThrow(() -> new RuntimeException("Product %d not found.".formatted(id))));
        return ResponseEntity.ok().body(item.get());
    }


    @PostMapping
    public ResponseEntity<Product> create(@Valid @RequestBody Product product) {
        return new ResponseEntity<>(productService.create(product), HttpStatus.OK);
    }

    /**
     * Handles putting a product.
     *
     * @param id
     * @param product
     * @return updated spaceship
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PUT">HTTP PUT</a>
     */
    @PutMapping("/{id}")
    public ResponseEntity<Product> put(@PathVariable("id") Long id, @Valid @RequestBody Product product) {
        return ResponseEntity.ok().body(productService.update(id, product));
    }

    /**
     * Handles patching a product.
     *
     * @param id
     * @param product
     * @return updated order
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/PATCH">HTTP PATCH</a>
     */
    @PatchMapping("/{id}")
    public ResponseEntity<Product> patch(@PathVariable("id") Long id, @Valid @RequestBody Product product) {
        return ResponseEntity.ok().body(productService.update(id, product));
    }

    /**
     * Handles deleting a product.
     *
     * @param id
     * @return a null value order
     * @see <a href="http://developer.mozilla.org/en-US/docs/Web/HTTP/Methods/DELETE">HTTP DELETE</a>
     */
    @DeleteMapping("/{id}")
    public ResponseEntity<Product> delete(@PathVariable("id") Long id) {
        productService.find(id).orElseThrow(() -> new RuntimeException("Product %d not found.".formatted(id)));
        return ResponseEntity.ok().body(productService.delete(id));
    }
}
