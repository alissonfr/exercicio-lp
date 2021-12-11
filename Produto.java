public class Produto {
  private String descricao;
  private double valor;
  private int estoque;

      // construtor
  public Produto (String descricaoInicial, double valorInicial, int estoqueInicial) {
    descricao = descricaoInicial;
    valor = valorInicial;
    estoque = estoqueInicial;
  }
      // sobrecarregando o construtor
  public Produto(String descricaoInicial){
    descricao = descricaoInicial;
    valor = 0.00;
    estoque = 0;
  }

      // getters e setters
    public String getDescricao(){
      return descricao;
    }
    public void setDescricao(String descricaoTemp){
      descricao = descricaoTemp;
    }
    public double getValor(){
      return valor;
    }
    public void setValor(double valorTemp){
      valor = valorTemp;
    }
    public int getEstoque(){
      return estoque;
    }
    public void setEstoque(int estoqueTemp){
      estoque = estoqueTemp;
    }
    
    // função imprimir produto
  public void Imprimir(){
    System.out.println("===========================");
    System.out.println("Produto: " + getDescricao());
    System.out.println("Valor: " + getValor());
    System.out.println("Quantidade: " + getEstoque());
  }

}