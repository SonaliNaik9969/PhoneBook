package in.career.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.servlet.ModelAndView;

import in.career.entity.Contact;
import in.career.service.ContactService;

@Controller
public class ContactController {

	@GetMapping("/")
	public String loadIndexPage()
	{
		return "Index";
	}
	@GetMapping("/register")
	public ModelAndView AddContactDetail()
	{
		ModelAndView mav = new ModelAndView();
		Contact cont = new Contact();
		mav.addObject("cont", cont);
		mav.setViewName("AddContact");
		return mav;
	}
	@GetMapping(value = {"/save","/update/save"})
	public String saveContact(Contact cont)
	{
		contService.saveContact(cont);
		System.out.println(cont);
		return "redirect:/allContacts";
	}
	@GetMapping("/delete/{id}")
	public String deleteContact(@PathVariable("id")Integer id)
	{
		contService.deleteContactByID(id);
		return "redirect:/allContacts";
	}
	@GetMapping("/allContacts")
	public ModelAndView getAllContacts()
	{
		ModelAndView mav = new ModelAndView();
		
		List<Contact> allContact = contService.getAllContacts();
		mav.addObject("allContact", allContact);
		mav.setViewName("ViewContact");
		System.out.println(allContact);
		return mav;
	}
	@GetMapping("/update/{id}")
	public ModelAndView updateContactDetail(@PathVariable("id") Integer id)
	{
		ModelAndView mav = new ModelAndView();
		Contact cont = contService.findContactById(id);
		mav.addObject("cont", cont);
		mav.setViewName("AddContact");
		return mav;
	}
	@Autowired
	private ContactService contService;
}
