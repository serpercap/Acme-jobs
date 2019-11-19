
package acme.features.administrator.customization;

import javax.annotation.PostConstruct;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import acme.entities.customizationParameters.CustomizationParameters;
import acme.framework.components.BasicCommand;
import acme.framework.controllers.AbstractController;
import acme.framework.entities.Administrator;

@Controller
@RequestMapping("/administrator/customization-parameters/")
public class AdministratorCustomizationParametersController extends AbstractController<Administrator, CustomizationParameters> {

	//Internal State
	@Autowired
	AdministratorCustomizationParametersShowService		showService;
	@Autowired
	AdministratorCustomizationParametersListService		listService;
	@Autowired
	AdministratorCustomizationParametersCreateService	createService;
	@Autowired
	AdministratorCustomizationParametersUpdateService	updateService;
	@Autowired
	AdministratorCustomizationParametersDeleteService	deleteService;
	//Constructors


	@PostConstruct
	private void initialise() {
		super.addBasicCommand(BasicCommand.SHOW, this.showService);
		super.addBasicCommand(BasicCommand.LIST, this.listService);
		super.addBasicCommand(BasicCommand.CREATE, this.createService);
		super.addBasicCommand(BasicCommand.UPDATE, this.updateService);
		super.addBasicCommand(BasicCommand.DELETE, this.deleteService);
	}
}
