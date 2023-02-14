package kameleoon.springbootApp.service;

import kameleoon.springbootApp.dto.ProductDTO;


import java.util.List;

public interface ProductService {
    ProductDTO createProduct(ProductDTO product);
    ProductDTO updateProduct(ProductDTO product);
    List<ProductDTO> getAllProduct();
    ProductDTO getProductById(long product);
    void deleteProduct(long id);
}
