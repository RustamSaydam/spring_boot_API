package kameleoon.springbootApp.service;

import kameleoon.springbootApp.dto.ProductDTO;
import kameleoon.springbootApp.exception.ResourceNotFoundException;
import kameleoon.springbootApp.model.Product;
import kameleoon.springbootApp.repository.ProductRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;


@Service
@Transactional
public class ProductServiceImpl implements ProductService {

    @Autowired
    private ProductRepository productRepository;


    @Override
    public ProductDTO createProduct(ProductDTO product) {

        var result = productRepository.save(new Product(product));
        product.setId(result.getId());
        return product;
    }

    @Override
    public ProductDTO updateProduct(ProductDTO product) {
        var  productOpt = productRepository.findById(product.getId());

        if (productOpt.isPresent()) {
            Product productUpdate = productOpt.get();
            productUpdate.setId(product.getId());
            productUpdate.setName(product.getName());
            productUpdate.setEmail(product.getEmail());

            productUpdate.setPassword(product.getPassword());
            productUpdate.setVote(product.getVote());

            productUpdate.setQuote(product.getQuote());

            productRepository.save(productUpdate);
            return product;
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + product.getId());
        }

    }

    @Override
    public List<ProductDTO> getAllProduct() {
        return productRepository.findAll().stream().map(ProductDTO::new).collect(Collectors.toList());

    }

    @Override
    public ProductDTO getProductById(long productId) {
        var productOpt = productRepository.findById(productId);

        if (productOpt.isPresent()) {

            return new ProductDTO(productOpt.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }

    @Override
    public void deleteProduct(long productId) {

        Optional<Product> productDb = this.productRepository.findById(productId);

        if (productDb.isPresent()) {
            this.productRepository.delete(productDb.get());
        } else {
            throw new ResourceNotFoundException("Record not found with id : " + productId);
        }
    }
}
