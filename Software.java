public class Software extends Produto {
  private double versao;

      // construtor
  public Software (String descricao, double valor, int estoque, double versaoInicial) {
    super(descricao, valor, estoque);
    versao = versaoInicial;
  }

      // getters e setters
    public double getVersao(){
      return versao;
    }
    public void setVersao(double versaoTemp){
      versao = versaoTemp;
    }

    // função imprimir versão
  public void Imprimir(){
    System.out.println("===========================");
    System.out.println("Produto: " + getDescricao());
    System.out.println("Valor: " + getValor());
    System.out.println("Quantidade: " + getEstoque());
    System.out.println("Versão: " + getVersao());
  }
}