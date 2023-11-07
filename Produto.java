abstract class Produto{
	
private int codigo;
private String nome;
private float quantidade;
private float custo;



public String getNome(){
	return this.nome;
}

public float getCodigo(){
	return this.codigo;
}

public float getCusto(){
	return this.custo;
}

public float getQuantidade(){
	return this.quantidade;
}

public void setNome(String nome){
	this.nome = nome;
}

public void setCusto(float numero){
	this.custo = numero;
}

public void setCodigo(int numero){
	this.codigo = numero;
}




Produto(int c,String n,float qntd,float C){
	this.codigo = c;
	this.nome = n;
	this.quantidade = qntd;
	this.custo = C;

}



public double getValorEstoque(){
	return this.quantidade * custo;
}	
public void Repor(float qntd){
   this.quantidade = qntd + custo + this.quantidade;
}

public boolean ValidarSaldo(float qndt){
	return (this.quantidade >= qndt);
}

public void baixar(float qntd){
	if(ValidarSaldo(qntd)){
	this.quantidade = this.quantidade - qntd;
	}else{
		System.out.println(" WARNING!: não pode ser feita a baixa");
	}
}


public void MostrarDados(){
	System.out.println("Codigo: " + this.codigo);
	System.out.println("Nome: " + this.nome);
	System.out.println("Quantidade: " + this.quantidade);
	System.out.println("Custo: " + this.custo);

}



}