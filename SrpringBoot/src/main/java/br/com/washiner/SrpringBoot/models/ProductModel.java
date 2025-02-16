package br.com.washiner.SrpringBoot.models;

import jakarta.persistence.*;

import java.io.Serial;
import java.io.Serializable;
import java.math.BigDecimal;
import java.util.UUID;

@Entity
@Table(name = "TB_PRODUCTS")
public class ProductModel implements Serializable {
    @Serial
    private static final long serialVersionUID = 1L; //A interface Serializable permite transformar objetos em bytes para armazenamento ou transferência, e o serialVersionUID garante compatibilidade entre versões da classe, mas no JPA geralmente não é obrigatório.

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private UUID idProduct;
    private String name;
    private BigDecimal value;

    public ProductModel() {}

    public ProductModel(UUID idProduct, String name, BigDecimal value) {
        this.idProduct = idProduct;
        this.name = name;
        this.value = value;
    }

    public UUID getIdProduct() {
        return idProduct;
    }

    public void setIdProduct(UUID idProduct) {
        this.idProduct = idProduct;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }
}
