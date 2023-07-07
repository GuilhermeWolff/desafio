package br.com.exercicio.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.exercicio.model.NbDeps;
import br.com.exercicio.service.NbDepsService;

@RestController
@RequestMapping(value = "/nbdeps")
public class NbDepsController {

	@Autowired
	private NbDepsService service;	
	
	//Inserir os dados na tabela	
	@PostMapping(value = "/post")
	public NbDeps insertNbDeps(@RequestBody NbDeps deps) {
		return service.nbSaveDeps(deps);		
	}
	
	//Atualizar os dados da tabela usando o ID como parametro
	@PutMapping(value = "/put/{id}")
	public NbDeps updateNbDeps(@RequestBody NbDeps updateDeps,@PathVariable("id") Long id){
		NbDeps deps = service.nbFindById(id);		
		
		if(deps != null ) {
			deps.setAvgTolerancePct(updateDeps.getAvgTolerancePct());
			deps.setBudInt(updateDeps.getBudInt());
			deps.setBudMkup(updateDeps.getBudMkup());
			deps.setBuyer(updateDeps.getBuyer());
			deps.setCreateDateTime(updateDeps.getCreateDateTime());
			deps.setCreateId(updateDeps.getCreateId());
			deps.setDeptName(updateDeps.getDeptName());
			deps.setDeptVatInclInd(updateDeps.getDeptVatInclInd());
			deps.setGroupNo(updateDeps.getGroupNo());
			deps.setMarkupCalcType(updateDeps.getMarkupCalcType());
			deps.setMaxAvgCounter(updateDeps.getMaxAvgCounter());
			deps.setMerch(updateDeps.getMerch());
			deps.setOtbCalcType(updateDeps.getOtbCalcType());
			deps.setProfitCalcType(updateDeps.getProfitCalcType());
			deps.setPurchaseType(updateDeps.getPurchaseType());
			deps.setTotalMarketAmt(updateDeps.getTotalMarketAmt());
			deps.setMerche(updateDeps.getMerche());
			return service.nbSaveDeps(updateDeps);
			}				
		return deps;
		}
	
	//Deleta os dados da tabela usando o ID como parametro
	@RequestMapping(value = "/delete/{id}", method = RequestMethod.DELETE)
	public String deleteNbDeps(@PathVariable("id") Long id) {
		service.nbDeleteById(id);
		return "Delete Sucessfull";
	}	
}