package net.vishnu.vms.controller;



import java.util.List;

import javax.servlet.http.HttpServletRequest;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;


import net.vishnu.vms.dao.VisitorDAO;

import net.vishnu.vms.model.Visitor;

@Controller
public class MainController {
	
	@Autowired
	private VisitorDAO visitorDAO;
	
	@RequestMapping(value="/login")
	 ModelAndView login(ModelAndView model,HttpSession session,@RequestParam("freeText") String freeText,@RequestParam("freeText1") String freeText1)
	{
		  
		
		String game = visitorDAO.make(freeText,freeText1);
	
		
		
		if(game!=null)
			
		{
			
		 session.setAttribute("username",game);
		
			int today = visitorDAO.todayvisitors();
			int yesterday = visitorDAO.yesterdayvisitors();
			int lastdays = visitorDAO.lastdaysvisitors();
			int totalvisitors = visitorDAO.totalvisitors();
			model.addObject("message",today);
			model.addObject("message1",yesterday);
			model.addObject("message2",lastdays);
			model.addObject("message3",totalvisitors);
			model.setViewName("my-header");
			model.setViewName("new");
		 
		
		
		}
		
		else 
		{
			model.addObject("msg","invalid user id or password");
			model.setViewName("index");
		
		}
		return model;
	}
	
	@RequestMapping(value="/dm1")
	public ModelAndView listVisitor3(ModelAndView model,HttpSession session)
	{
	
	
		model.setViewName("logout");
		return model;
		
	}
	
	@RequestMapping(value="/dm2")
	public ModelAndView listVisitor4(ModelAndView model,HttpSession session)
	
	{	
		
		
		session.removeAttribute("username");
		model.setViewName("index");
		return model;
		
	}
	@RequestMapping(value="/")
	public ModelAndView dashboard(ModelAndView model)
	{
		model.setViewName("index");
	
		
		return model;
		
	}
	@RequestMapping(value="/newvisitorcall",method=RequestMethod.GET)
	public ModelAndView newVisitor(ModelAndView model)
	{
		Visitor newvisitor=new Visitor();
		model.addObject("visitor",newvisitor);
		model.setViewName("newvisitor");
		return model; 
		
	}
	@RequestMapping(value="/about")
	public ModelAndView about(ModelAndView model)
	{
		model.setViewName("about");
		return model;
		
	}
	@RequestMapping(value="/save",method = RequestMethod.POST)
	public ModelAndView saveVisitor(@ModelAttribute Visitor visitor)
	{		if(visitor.getId()==null)
	{
		visitorDAO.save(visitor);
	}
	else
	{
		visitorDAO.update(visitor);
	}
		
		return new ModelAndView("redirect:/managevisitorcall");
	}
	
	@RequestMapping(value="/managevisitorcall")
	public ModelAndView listVisitor(ModelAndView model)
	{
		List<Visitor>listVisitor=visitorDAO.list();
		model.addObject("listVisitor",listVisitor);
		model.setViewName("managevisitor");
		return model;
		
	}
	@RequestMapping(value="/edit", method = RequestMethod.GET)
	public ModelAndView editVisitor(HttpServletRequest request)
	{
		Integer id=Integer.parseInt(request.getParameter("id"));
		Visitor visitor=visitorDAO.get(id);
		
		ModelAndView model=new ModelAndView("updateform");
		model.addObject("visitor",visitor);
	
		
		return model;
		
	}
	@RequestMapping(value="/dashboardcall")
	public ModelAndView listVisitor1(ModelAndView model)
	{	
	int today = visitorDAO.todayvisitors();
	int yesterday = visitorDAO.yesterdayvisitors();
	int lastdays = visitorDAO.lastdaysvisitors();
	int totalvisitors = visitorDAO.totalvisitors();
	model.addObject("message",today);
	model.addObject("message1",yesterday);
	model.addObject("message2",lastdays);
	model.addObject("message3",totalvisitors);
	model.setViewName("new");
		
	return model;
		
	}
	
	@RequestMapping(value="/visitor_search")
	public ModelAndView searchvisitor(ModelAndView model,HttpSession session,@RequestParam("freeText") String freeText)
	{
		List<Visitor>searchvisitor=visitorDAO.search(freeText);
		model.addObject("listVisitor",searchvisitor);
		model.setViewName("managevisitor");
		return model;
		
	}
	@RequestMapping(value="/datesort")
	public ModelAndView listVisitor2(ModelAndView model)
	{
		
	
		model.setViewName("date");
		return model;
		
	}
	@RequestMapping(value="/date_search")
	public ModelAndView datevisitor(ModelAndView model,HttpSession session,@RequestParam("date1") String date1,@RequestParam("date2") String date2)
	{
		List<Visitor>datevisitor=visitorDAO.date(date1,date2);
		model.addObject("listVisitor",datevisitor);
		model.addObject("txt1",date1);
		model.addObject("txt2",date2);
		model.setViewName("report");
		return model;
		
	}

	
	}
