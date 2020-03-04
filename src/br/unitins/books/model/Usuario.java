package br.unitins.books.model;

public class Usuario implements Cloneable {

	private Integer id;
	private String nome, login, senha, email;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getLogin() {
		return login;
	}

	public void setLogin(String login) {
		this.login = login;
	}

	public String getSenha() {
		return senha;
	}

	public void setSenha(String senha) {
		this.senha = senha;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	//clone cria uma referencia para um objeto
	//ele retorna somente um objeto inteiro
	//ele deve ser tratado, pois retorna um objeto inteiro
	//se alterar uma informacao no clone altera no objeto que foi clonado tb
	public Object clone() {
		try {
			return super.clone();
		}catch(CloneNotSupportedException e) {
			System.out.println("Não foi possivel clonar");
			return this;
		}
	}
}
