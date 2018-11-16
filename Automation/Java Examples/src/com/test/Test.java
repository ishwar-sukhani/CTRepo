package com.test;

class Test 
{
    public static void main(String [] args) 
    {
    	
    	int [ ][ ] scores = {{2,7,6}, {9,3,45}};
        int x= 0;
        int y= 0;
        
        for (int z = 0; z < 5; z++) 
        {
            if (( ++x > 2 ) && (++y > 2)) 
            {
                x++;
            }
        }
        System.out.println(x + " " + y);
    }
}