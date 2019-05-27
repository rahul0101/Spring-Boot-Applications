package com.example.demo.cal;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Calculator {
	
	@GetMapping("/add")
	public String add(@RequestParam(value="a", required=false, defaultValue="0") String a, @RequestParam(value="b", required=false, defaultValue="0") String b)
	{
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if(x==0 && y==0)
		{
			return "Please add parameters";
		}
		int z = x+y;
		return ""+x+" + "+y+" = "+z;
	}
	
	@GetMapping("/sub")
	public String sub(@RequestParam(value="a", required=false, defaultValue="0") String a, @RequestParam(value="b", required=false, defaultValue="0") String b)
	{
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if(x==0 && y==0)
		{
			return "Please add parameters";
		}
		int z = x-y;
		return ""+x+" - "+y+" = "+z;
	}
	
	@GetMapping("/mul")
	public String mul(@RequestParam(value="a", required=false, defaultValue="0") String a, @RequestParam(value="b", required=false, defaultValue="0") String b)
	{
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if(x==0 && y==0)
		{
			return "Please add parameters";
		}
		int z = x*y;
		return ""+x+" * "+y+" = "+z;
	}
	
	@GetMapping("/div")
	public String div(@RequestParam(value="a", required=false, defaultValue="0") String a, @RequestParam(value="b", required=false, defaultValue="0") String b)
	{
		int x = Integer.parseInt(a);
		int y = Integer.parseInt(b);
		if(x==0 && y==0)
		{
			return "Please add parameters";
		}
		if(x!=0 && y==0)
		{
			return "Division by 0 is not possible!";
		}
		int z = x/y;
		return ""+x+" / "+y+" = "+z;
	}
}
