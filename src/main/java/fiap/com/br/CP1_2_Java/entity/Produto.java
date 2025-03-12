package fiap.com.br.CP1_2_Java.entity;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.Temporal;
import jakarta.persistence.TemporalType;
import jakarta.validation.constraints.*;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.UUID;

public class Produto {

    @Id
    @GeneratedValue
    private UUID id_produto;

    @NotBlank
    private String nm_produto;

    @NotNull
    @DecimalMin(value = "0.00")
    @Digits(integer = 10, fraction = 2)
    private double valor_produto;

    @NotNull
    @Temporal(TemporalType.DATE)
    private LocalDateTime dt_compra;

    @NotBlank
    @Pattern(regexp = "^\\(\\d{2}\\) \\d{4,5}-\\d{4}$", message = "{validation.phone.invalid}")
    private String telefone;


}
