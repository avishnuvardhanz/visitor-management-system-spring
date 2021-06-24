package net.vishnu.vms.dao;


import java.util.List;

import net.vishnu.vms.model.Visitor;

public interface VisitorDAO {

	
	public int save(Visitor visitor);
	public List<Visitor> list();
	public int update(Visitor visitor);
	
	public Visitor get(Integer id);
	public List<Visitor> search(String freeText);
	public List<Visitor> date(String date1,String date2);
	public int todayvisitors();
	public int yesterdayvisitors();
	public int lastdaysvisitors();
	public int totalvisitors();
	public String make(String freeText, String freeText1);


	
}
