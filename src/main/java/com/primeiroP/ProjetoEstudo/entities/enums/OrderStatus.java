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

  public static OrderStatus valueOf(int code) {
    // for each pra percorrer todos os enums, o .values() eh um vetor com os enums,
    // e, provavelmente o index dele corresponde ao codigo q nos colocamos ali em
    // cima
    //
    // para cada OrderStatus(a representacao em int dele) no vetor de OrderStatus
    // faca:
    for (OrderStatus value : OrderStatus.values()) {
      // verifica se o value(o OrderStatus em representado em int) eh igual ao index q
      // foi passado no code
      if (value.getCode() == code) {
        return value;
      }
    }
    throw new IllegalArgumentException("Invalid OrderStatus code");
  }
}
