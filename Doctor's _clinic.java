/*
Doctor's clinic
Time Limit: 2 sec
Memory Limit: 128000 kB
Problem Statement
Given two positive integers N and X, where N is the number of total patients and X is the time duration (in minutes) after which a new patient arrives. Also, doctor will give only 10 minutes to each patient. The task is to calculate the time (in minutes) the last patient needs to wait.
Input
The first line of input contains the number of test cases T. The next subsequent lines denote the total number of patients N and time interval X (in minutes) in which the next patients are visiting.

Constraints:
1 <= T <= 100
0 <= N <= 100
0 <= X <= 30
Output
Output the waiting time of last patient.
Example
Input:
5
4 5
5 3
6 5
7 6
8 2

Output:
15
28
25
24
56*/

import java.io.*; // for handling input/output
import java.util.*; // contains Collections framework

// don't change the name of this class
// you can add inner classes if needed
import java.util.Scanner;
class Main {
	public static void main (String[] args) {
                      // Your code here
					  Scanner sc=new Scanner(System.in);
					  int t=sc.nextInt();
					  int i,N,X,z;
					  for(i=1;i<=t;i++)
					  {
						  N=sc.nextInt();
						  X=sc.nextInt();
						  if(X<10)
					  {
						  z=(N-1)*(10-X);
						  System.out.println(z);
					  }
					  else
					  {
						  System.out.println(0);
					  }
					  }
	}
}
