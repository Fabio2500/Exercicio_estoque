class MovimentoEstoque{
	public static void main(String[]args){
	Produto p;
	ProdutoCustoAtual a = new ProdutoCustoAtual(1 , "feijao", 60 , 1.50f); 
	ProdutoCustoMedio b = new ProdutoCustoMedio(2 , "Tomate", 120 , 2.50f);
    
    System.out.println("\n");
    
    System.out.println("Dados Iniciais:");
    
    System.out.println("\n");
    
    a.MostrarDados();
    
    System.out.println("\n");
    
    b.MostrarDados();
    
    System.out.println("\n");

    System.out.println("repondo:");

    a.Repor(100,1.60f);
    b.Repor(100,2.60f);
   
    System.out.println("\n");
    
    System.out.println("feijão de reposto:");
    
    a.MostrarDados();
    
    System.out.println("\n");
    
    System.out.println("Tomate depois de reposto:");
    
    b.MostrarDados();
    
    System.out.println("\n");

    System.out.println("baixando:");

    a.baixar(30);
    b.baixar(50);
    
    System.out.println("\n");
    
    System.out.println("feijao depois de baixar:");
    
    a.MostrarDados();
    
    System.out.println("\n");
    
    System.out.println("tomate depois de baixar:");
    
    b.MostrarDados();
    
    System.out.println("\n");
    
    System.out.println("tentativa de baixar o Tomate em 300:");
    
    System.out.println("\n");

    b.baixar(300);
    }


  
}