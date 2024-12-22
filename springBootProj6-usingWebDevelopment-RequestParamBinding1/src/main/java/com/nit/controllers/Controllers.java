package com.nit.controllers;

import java.io.PrintWriter;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import jakarta.servlet.ServletConfig;
import jakarta.servlet.ServletContext;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

//write logic

@Controller
public class Controllers {

	/*
	@GetMapping("/home")
	public String procesData(@RequestParam("sno") int no ,
			       @RequestParam("sname") String name)
	{
		System.out.println("Request Param ::"+no+"...."+name);
		
		//return lvn 
		return "show_result";
	}
	
	//solution 1
	@GetMapping("/home")
	//reqired false helps to get with out error means we can pass values or not
	public String procesData(@RequestParam(required = false , defaultValue = "3031"  ) int sno ,
			       @RequestParam(required = false , defaultValue = "pushpa1-The Raise") String sname)
	{
		System.out.println("Request Param ::"+sno+"...."+sname);
		
		//return lvn 
		return "show_result";
	}
	
	//solution 2
	@GetMapping("/home")
	//reqired false helps to get with out error means we can pass values or not
	//wrapper type Integer internally null
	public String procesData(@RequestParam(required = false) Integer sno ,
			       @RequestParam(required = false , defaultValue = "pushpa1-The Raise") String sname)
	{
		System.out.println("Request Param ::"+sno+"...."+sname);
		
		//return lvn 
		return "show_result";
	}
	
	
	//using array , List , Set
	@GetMapping("/home")
	//reqired false helps to get with out error means we can pass values or not
	//wrapper type Integer internally null
	public String procesData(@RequestParam(required = false) Integer sno ,
			       @RequestParam String sname ,
			       @RequestParam String[] sadd ,
			       @RequestParam("sadd") List<String> address ,
			       @RequestParam("sadd") Set<String> location
			)
	{
		System.out.println("Request Param :: " + sno + " .... " + sname 
		        + " .... " + (sadd != null ? Arrays.toString(sadd) : "null")
		        + " .... " + address
		        + " .... " + location);
		
		//return lvn 
		return "show_result";
	}
	*/

	@Autowired
	private ServletContext sc;
	@Autowired
	private ServletConfig cg ;
	
	/*@GetMapping("/home")
	public String processData(Map<String,Object> map ,
			HttpServletRequest req,HttpServletResponse res , HttpSession ses)
	{
		System.out.println("web app current name ::"+sc.getContextPath());
		System.out.println("Dispatcher logical name ::"+cg.getServletName());
		System.out.println("request path ::"+req.getServletPath());
		System.out.println("Session id::"+ses.getId());
		
		//keep the above data in shared memory
		map.put("waName", sc.getContextPath());
		map.put("dispatch", cg.getServletName());
		map.put("reques", req.getServletPath());
		map.put("sess", ses.getId());
		return "welcome";
	}*/
       
	@GetMapping("/home")
	public void processData(Map<String,Object> map ,
			HttpServletRequest req,HttpServletResponse res , HttpSession ses) throws Exception
	{
		//printwriter to print data
		PrintWriter pw = res.getWriter();
	    //set response context
		res.setContentType("Text/Html");
		//print context name and path
		pw.println("web App Name ::"+sc.getContextPath());
		System.out.println("");
		pw.println("Servlet Name ::"+cg.getServletName());
		System.out.println("");
		pw.println("Servlet path ::"+req.getServletPath());
		System.out.println("");
		pw.println("Session id::"+ses.getId());
	}
}
