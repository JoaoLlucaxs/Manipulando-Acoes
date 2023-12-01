package com.acoes;

import java.util.ArrayList;
import java.util.List;

import javax.faces.bean.ManagedBean;
import javax.faces.bean.SessionScoped;

@ManagedBean
@SessionScoped
public class ProdutoBean {
	private List<Produto> listaProduto;
	private Produto produto;
	private Produto produtoSelecionado;
	
	
	public ProdutoBean() {
		this.listaProduto=new ArrayList<Produto>();
		this.produto=new Produto();
		
	}
	
	public String obterAjuda() {
		if(this.listaProduto.isEmpty()) {
			return "AjudaGestaoProduto?faces-redirect=true";
		}else {
			return "AjudaGestaoProdutoTelefone?redirect=true";
		}
	}
	
	public void incluir() {
		System.out.println("Incluindo");
		if(this.produto.getFabricante().equals("")) {
			listaProduto.add(produto);
			produto.setFabricante("Sem Fabricante");
			produto=new Produto();
		}else {
			listaProduto.add(produto);
			produto=new Produto();
		}
	};
	
	public void excluir() {
		this.listaProduto.remove(produtoSelecionado);
	}

	public Produto getProduto() {
		return produto;
	}

	public void setProduto(Produto produto) {
		this.produto = produto;
	}

	public List<Produto> getListaProduto() {
		return listaProduto;
	}

	public Produto getProdutoSelecionado() {
		return produtoSelecionado;
	}

	public void setProdutoSelecionado(Produto produtoSelecionado) {
		this.produtoSelecionado = produtoSelecionado;
	}
}
