package com.devinhouse.enums;

public class TesteCafe {
    public static void main(String[] args) {
        Cafe cafe = new Cafe();
        cafe.setTipo("Cappuccino");
        cafe.setTamanho(Tamanho.EXTRA_GRANDE);

        System.out.println(cafe);

    }
}
