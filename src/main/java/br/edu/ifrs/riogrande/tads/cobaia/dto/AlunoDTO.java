package br.edu.ifrs.riogrande.tads.cobaia.dto;

import com.fasterxml.jackson.annotation.JsonProperty;

import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;

// Data Transfer Object (intercâmbio), ViewModel
public class AlunoDTO {
  
  @JsonProperty("nomeCompleto") // body/endpoint
  // @jakarta.validation.constraints.*
  @NotNull(message = "O nome é obrigatório")
  @NotBlank(message = "O nome não pode estar em branco")
  private String nome;

}
