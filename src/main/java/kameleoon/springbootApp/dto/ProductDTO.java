package kameleoon.springbootApp.dto;

import com.fasterxml.jackson.annotation.JsonInclude;
import kameleoon.springbootApp.model.Product;
import kameleoon.springbootApp.model.UserName;

import java.util.Date;

@JsonInclude(JsonInclude.Include.NON_NULL)
public class ProductDTO {

    Long id;
    String name;
    String email;
    char[] password;
    long vote;
    String quote;

    Date createdAt;

    Date updatedAt;

    Long userId;

    public ProductDTO() {

    }

    public ProductDTO(Product productEntity) {
        setName(productEntity.getName());
        setEmail(productEntity.getEmail());
        setPassword(productEntity.getPassword());
        setVote(productEntity.getVote());
        setQuote(productEntity.getQuote());
        setId(productEntity.getId());
        setCreatedAt(productEntity.getCreatedAt());
        setUpdatedAt(productEntity.getUpdatedAt());
        setId(productEntity.getId());
        setUserId(productEntity.getOwner().getId());


    }

    public String getName() {
        return name;
    }

    public Long getUserId() {
        return userId;
    }

    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public char[] getPassword() {
        return password;
    }

    public void setPassword(char[] password) {
        this.password = password;
    }

    public long getVote() {
        return vote;
    }

    public void setVote(long vote) {
        this.vote = vote;
    }

    public String getQuote() {
        return quote;
    }

    public void setQuote(String quote) {
        this.quote = quote;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(Date createdAt) {
        this.createdAt = createdAt;
    }

    public Date getUpdatedAt() {
        return updatedAt;
    }

    public void setUpdatedAt(Date updatedAt) {
        this.updatedAt = updatedAt;
    }

    public ProductDTO(String name, String email, char[] password, long vote, String quote, Long id) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.vote = vote;
        this.quote = quote;
        this.id = id;
    }
}
