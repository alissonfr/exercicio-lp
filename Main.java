class Main {
  public static void main(String[] args) {

        //objetos
    Produto p1 = new Produto("Mouse",  9.99, 22);
    Produto p2 = new Produto("Teclado",  29.99, 3);
    Produto s1 = new Software("Video-Game",  50.00, 10, 1.67);
    Produto s2 = new Software("Fone de Ouvido",  40.00, 44, 1.4);

      // array
    Produto [] produtoLista = {p1, p2, s1, s2};
    
    for(int i = 0; i < produtoLista.length; i++){
    produtoLista[i].Imprimir();

  }
 }
}