package com.devinhouse.ex02;

public class TestaFunc {
    public static void main(String[] args) {
        Func func = new Func("Thiago");
        Func func2 = new Func("Thiago", 1000);

        float aumento = func2.aumentar(300);
        System.out.println("O salário com aumento é = " + aumento);

        float aumentoComissao = func.aumentar(135, 200);
        System.out.println("Salário com aumento e comissão é = " + aumentoComissao);

    }
}
