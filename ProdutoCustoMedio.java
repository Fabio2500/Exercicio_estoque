class ProdutoCustoMedio extends Produto{
  ProdutoCustoMedio(int c,String n,float qntd,float C){
  	super(c,n,qntd,C);
  }
  public void Repor(float quantidade,float custo_unit){
  super.setCusto(((super.getQuantidade() * super.getCusto()) + (quantidade + custo_unit)) / (super.getQuantidade() + quantidade));
  super.Repor(quantidade);
  }
}