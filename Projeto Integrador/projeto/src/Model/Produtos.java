
package Model;

import Vizualizacao.Produto;


public class Produtos {
    public int cod;
    public double precocompra;
    public double produto;
    public int quantidade;  
    public double precovenda;
    public String fornecedor;

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
    }

    public double getPrecocompra() {
        return precocompra;
    }

    public void setPrecocompra(double precocompra) {
        this.precocompra = precocompra;
    }

    public double getProduto() {
        return produto;
    }

    public void setProduto(double produto) {
        this.produto = produto;
    }

    public int getQuantidade() {
        return quantidade;
    }

    public void setQuantidade(int quantidade) {
        this.quantidade = quantidade;
    }

    public double getPrecovenda() {
        return precovenda;
    }

    public void setPrecovenda(double precovenda) {
        this.precovenda = precovenda;
    }

    public String getFornecedor() {
        return fornecedor;
    }

    public void setFornecedor(String fornecedor) {
        this.fornecedor = fornecedor;
    }

    public Iterable<Produto> read() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
    
}
