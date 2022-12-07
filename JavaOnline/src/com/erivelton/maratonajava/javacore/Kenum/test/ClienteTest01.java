package com.erivelton.maratonajava.javacore.Kenum.test;

import com.erivelton.maratonajava.javacore.Kenum.dominio.Cliente;
import com.erivelton.maratonajava.javacore.Kenum.dominio.TipoPagamento;
import com.erivelton.maratonajava.javacore.Kenum.dominio.TipoPessoa;

public class ClienteTest01 {

    public static void main(String[] args) {

        Cliente c1 = new Cliente("Gabriel", TipoPessoa.PESSOA_FISICA, TipoPagamento.DEBITO);
        Cliente c3 = new Cliente("Loja", TipoPessoa.PESSOA_JURIDICA, TipoPagamento.CREDITO);

        System.out.println(c1);
        System.out.println(c3);
        System.out.println(TipoPagamento.DEBITO.calcularDesconto(100));
        System.out.println(TipoPagamento.CREDITO.calcularDesconto(100));

        System.out.println(TipoPessoa.tipoPessoaPorNomeRelatorio("Pessoa Física"));
        System.out.println(TipoPessoa.tipoPessoaPorNomeRelatorio("Pessoa Fís"));

    }
}
