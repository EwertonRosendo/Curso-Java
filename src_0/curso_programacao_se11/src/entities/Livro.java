package entities;

public class Livro {
	private String titulo, autor, genero, pessoa_emprestada;

	public Livro(String titulo, String autor, String genero) {
		this.titulo = titulo;
		this.autor = autor;
		this.genero = genero;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getAutor() {
		return autor;
	}

	public void setAutor(String autor) {
		this.autor = autor;
	}

	public String getGenero() {
		return genero;
	}

	public void setGenero(String genero) {
		this.genero = genero;
	}

	public String getPessoa_emprestada() {
		return pessoa_emprestada;
	}

	public void setPessoa_emprestada(String pessoa_emprestada) {
		this.pessoa_emprestada = pessoa_emprestada;
	}
	
	
	
}
