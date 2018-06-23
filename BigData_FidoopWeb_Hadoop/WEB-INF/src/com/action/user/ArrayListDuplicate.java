package com.action.user;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayListDuplicate
extends ArrayList{

	@Override
	public boolean add(Object e)
	{
	    if(!contains(e))
	    {
	        return super.add(e);
	    }
	    else
	    {
	        return false;
	    }
	}
	public static void main(String[] args) 
	{
		ArrayListDuplicate element=new ArrayListDuplicate();
		    element.add(1);
		    element.add(2);
		    element.add(2);
		    element.add(3);
		    element.add(3);
		    element.add(4);

		    System.out.println(element);

	}

}




