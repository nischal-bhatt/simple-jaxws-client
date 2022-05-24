package main;

import ws.*;

public class Main {

	public static void main(String[] args) {
		try {
			DemoImplService demoImplService = new DemoImplServiceLocator();
		    Demo demo = demoImplService.getDemoImplPort();
		    System.out.println(demo.helloWorld());
		    System.out.println(demo.hi("ABV"));
		}catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
