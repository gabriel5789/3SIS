package br.com.fiap.viagens.controller;

import java.util.LinkedList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import br.com.fiap.viagens.model.Viagem;

@Controller
@RequestMapping("viagem")
public class ViagemController {
	
	private List<Viagem> viagens = new LinkedList<Viagem>();
	
	@GetMapping("create")
	public ModelAndView index(Model model) {
		ModelAndView modelAndView = new ModelAndView("viagens/create");
		model.addAttribute("viagem", new Viagem());
		return modelAndView;
	}
	
	@PostMapping("create")
	public String cadastrar(@ModelAttribute @RequestBody Viagem viagem, RedirectAttributes redirectAttributes) {
		viagens.add(viagem);
		redirectAttributes.addFlashAttribute("message", "Viagem cadastrada com sucesso!");
		return "redirect:list";
	}
	
	@GetMapping("list")
	public ModelAndView listar() {
		ModelAndView modelAndView = new ModelAndView("viagens/list");
		modelAndView.addObject("viagens", viagens);
		return modelAndView;
	}
	
	@GetMapping("editar")
	public ModelAndView editar() {
		ModelAndView modelAndView = new ModelAndView("viagens/edit");
		return modelAndView;
	}
	
}
