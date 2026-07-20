package com.primeiroP.ProjetoEstudo.entities.enums;

public enum OrderStatus {

  WAITING_PAYMENT(1),
  PAID(2),
  PACKING(3),
  SHIPPED(4),
  DELIVERED(5),
  CANCELED(6);

  private int code;

  private OrderStatus(int code) {
    this.code = code;
  }

  public int getCode() {
    return code;
  }

  // Converte um código (int) no enum correspondente.
  // Percorre os valores do enum e retorna aquele cujo código coincide com o informado.
  public static OrderStatus valueOf(int code) {
    for (OrderStatus value : OrderStatus.values()) {
      if (value.getCode() == code) {
        return value;
      }
    }
    throw new IllegalArgumentException("Invalid OrderStatus code");
  }
}
