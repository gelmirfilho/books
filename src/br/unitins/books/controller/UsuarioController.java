package br.unitins.books.controller;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

import javax.faces.view.ViewScoped;
import javax.inject.Named;

import org.apache.jasper.tagplugins.jstl.core.Remove;

import br.unitins.books.model.Usuario;

@Named
@ViewScoped
public class UsuarioController implements Serializable {

	private static final long serialVersionUID = -563227102506849534L;

	// Pesquisar Cloneable
	// Terminar os botoes
	private Usuario usuario;
	private List<Usuario> listaUsuario;

	public void incluir() {
		getListaUsuario().add(getUsuario());
		limpar();
	}

	public void limpar() {
		usuario = null;
	}

	//implementar o equals, para dizer se o id � igual, ele ta tratando do mesmo objeto
	//mesma referencia de memoria
	public void excluir() {
		//o remove pega o equals do usuario q a gente implementou para ver se o objeto � igual
		listaUsuario.remove(getUsuario());
		limpar();
	}

	public void alterar() {
		//obtendo o index do objeto que queremos alterar na lista
		int index = listaUsuario.indexOf(getUsuario());
		
		//atualizando os dados da lista com o usuario e o index dele
		listaUsuario.set(index, getUsuario());
		System.out.println(getUsuario().getNome());
		limpar();
	}

	//ele cria um novo usuario com as informacoes antigas do usuario
	//perfeito para editar, pois ele vai editar diretamente o clone dele
	//com isso pode adicionar de novo
	public void editar(Usuario usu) {
		setUsuario(usu.getClone());
	}

	public Usuario getUsuario() {
		if (usuario == null)
			usuario = new Usuario();
		return usuario;
	}

	public void setUsuario(Usuario usuario) {
		this.usuario = usuario;
	}

	public List<Usuario> getListaUsuario() {
		if (listaUsuario == null)
			listaUsuario = new ArrayList<Usuario>();
		return listaUsuario;
	}

}
