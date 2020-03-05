package br.unitins.books.model;

public class Usuario extends Entity<Usuario> {

	private String nome, login, senha, email;

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
	/*public Usuario getClone() {
		try {
			return (Usuario) super.clone();
		} catch (CloneNotSupportedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return null;
	}*/
	
	//override do equals para comparar o id
	/*@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Usuario other = (Usuario) obj;
		if (id == null) {
			if (other.id != null)
				return false;
		} else if (!id.equals(other.id))
			return false;
		return true;
	}*/
}
