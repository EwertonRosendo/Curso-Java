package entities;

public class Hotel {
	
	String nome = "null";
	String email= "null";
	int quarto_Escolhido;
	
	
	public Hotel(String nome, String email, int quarto_Escolhido) {
		this.nome = nome;
		this.email = email;
		this.quarto_Escolhido = quarto_Escolhido;
	}


	public String getNome() {
		return nome;
	}


	public void setNome(String nome) {
		this.nome = nome;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public int getQuarto_Escolhido() {
		return quarto_Escolhido;
	}


	public void setQuarto_Escolhido(int quarto_Escolhido) {
		this.quarto_Escolhido = quarto_Escolhido;
	}
	
		
	
	
	

}
