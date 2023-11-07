class ProdutoCustoAtual extends Produto{
	ProdutoCustoAtual(int c,String n,float qntd,float C){
		super (c,n,qntd,c);
     }

	public void Repor(float qntd, float custo_unitario){
      super.setCusto(custo_unitario);
      super.Repor(qntd);
	}


}