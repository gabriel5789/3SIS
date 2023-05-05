package com.fiap.produto.controllers;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.fiap.produto.entity.Produto;
import com.fiap.produto.modelo.ProdutoModel;
import com.fiap.produto.repositories.ProdutoRepository;

@Controller
public class ProdutoController {
	
	@Autowired
	private ProdutoRepository produtoRepository;
	
	@RequestMapping("/produtos")
	public ModelAndView index() {
		ModelAndView modelView = new ModelAndView("produtos/index");
		
		ProdutoModel monitor = new ProdutoModel("Monitor", new BigDecimal(300), 100, 1 );
		
		List<ProdutoModel> produtos = Arrays.asList(monitor);
		modelView.addObject("produtos", produtos);
			
		return modelView;		
	}
	
	
	@PostMapping("/create")
	public ResponseEntity<ProdutoModel> create(@RequestBody ProdutoModel model){
		Produto p = new Produto();
		
		p.setCodigo(model.getCodigo());
		p.setDescricao(model.getDescricao());
		p.setNome(model.getNome());
		p.setQuantidade(model.getQuantidade());
		p.setStatus(model.getStatus());
		p.setValor(model.getValor());
		
		produtoRepository.save(p);
		
		model.setId(p.getId());
		
		return new ResponseEntity<ProdutoModel>(model, HttpStatus.CREATED);
	}
}
