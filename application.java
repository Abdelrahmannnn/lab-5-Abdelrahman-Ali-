package eg.edu.alexu.csd.datastructure.stack.cs41;




/**
 * class to implement the interface IExpressionEvaluator
 */

public class application implements IExpressionEvaluator {
	implement a= new implement();
	
	
	
	/**
	* Takes a symbolic and numeric infix expression as input(given) and converts it to
	* postfix expression.
	* it is not necessary that the length of the term be 1 
	* @param  the infix expression
	* @return  (string f) the postfix expression , or throw exception if the original expression was unbalanced (not matched Parenthesis)
	*/
	
	public String infixToPostfix(String expression) {
		
		/**
		 * f is a string value to store the postfix expression and return it
		 */
		String f="";
		int x=0;
		int y=0;
		boolean v=true;
		boolean b=isParenthesisMatch(expression);
		if(b==false){
			try {
				throw new Exception (" Error:the original expression was unbalanced. ");
			} catch (Exception e) {
				System.out.println(" Error:the original expression was unbalanced. ");
			}
		}
		
		for(int i=0;i<expression.length();) {
			if((expression.charAt(i)>='a'&&expression.charAt(i)<='z')||(expression.charAt(i)>='A'&&expression.charAt(i)<='Z')&&expression.charAt(i)!=' ') {
				f+=expression.charAt(i);
				f+=" ";
				i++;
				
			}else {
				if(expression.charAt(i)==' ') {
					i++;
				
				}else {
				if(a.isEmpty()&&expression.charAt(i)!='('&&expression.charAt(i)!='[') {
					a.push(expression.charAt(i));
					i++;
					
				}
				else {
				if(expression.charAt(i)!='('&&expression.charAt(i)!='[') {
					x=order(expression.charAt(i));
					y=order((char) a.peek());
					if(x<y) {
						a.push(expression.charAt(i));
						i++;
						if(i>=expression.length()) {
							break;
						}
					}else {
						v=a.isEmpty();
						if(v==false) {
						f+=a.pop();
						f+=" ";
						}
						a.push(expression.charAt(i));
						i++;
					
					}
										
				}else  {
					a.push(expression.charAt(i));
					int r=i;
					int p=0;
					i++;
					while(expression.charAt(i)!=')'&&expression.charAt(i)!=']') {
						if((expression.charAt(i)>='a'&&expression.charAt(i)<='z')||(expression.charAt(i)>='A'&&expression.charAt(i)<='Z')&&expression.charAt(i)!=' ') {
							f+=expression.charAt(i);
							f+=" ";
							i++;
							p++;
						} else if(expression.charAt(i)=='('||expression.charAt(i)=='[') {
							a.push(expression.charAt(i));
							int g=0;
							int e=i;
							i++;
							while(expression.charAt(i)!=')'&&expression.charAt(i)!=']') {
								if((expression.charAt(i)>='a'&&expression.charAt(i)<='z')||(expression.charAt(i)>='A'&&expression.charAt(i)<='Z')&&expression.charAt(i)!=' ') {
									f+=expression.charAt(i);
									f+=" ";
									i++;
									g++;
								}	else {
									if(expression.charAt(i)==' ') {
										i++;
										g++;
									}else {
										if(i==(e+g+1)&&expression.charAt(i)!='('&&expression.charAt(i)!='['&&expression.charAt(i)!=')'&&expression.charAt(i)!=']') {
										a.push(expression.charAt(i));
										i++;
										if(i>=expression.length()) {
											break;
										}
										}else {
										x=order(expression.charAt(i));
										y=order((char) a.peek());
										if(x<y&&expression.charAt(i)!='('&&expression.charAt(i)!='['&&expression.charAt(i)!=')'&&expression.charAt(i)!=']') {
											a.push(expression.charAt(i));
											i++;
										}else {
											v=a.isEmpty();
											int o=1;
											while(o==1&&v==false) {
											f+=a.pop();
											f+=" ";	
											v=a.isEmpty();
											if(v==false) {
											x=order(expression.charAt(i));
											y=order((char) a.peek());
											if(x<y||(char)a.peek()=='('||(char)a.peek()=='[') {
												o=0;
											}else {
												o=1;
											}
											}
											}
											a.push(expression.charAt(i));
											i++;
										}
										}
									}
										}
								
							}
							char t=(char) a.peek();
							while(t!='('&&t!='[') {
							v=a.isEmpty();
							if(v==false) {
							f+=a.pop();
							f+=" ";
							}					
								t=(char) a.peek();						
							}
							a.pop();
							i++;
							
						}
						else {
					if(expression.charAt(i)==' ') {
						i++;
						if(i>=expression.length()) {
							break;
						}
						p++;
					}else {
						if(i==(r+p+1)&&expression.charAt(i)!='('&&expression.charAt(i)!='['&&expression.charAt(i)!=')'&&expression.charAt(i)!=']') {
						a.push(expression.charAt(i));
						i++;
						}else {
						x=order(expression.charAt(i));
						y=order((char) a.peek());
						if(x<y&&expression.charAt(i)!='('&&expression.charAt(i)!='['&&expression.charAt(i)!=')'&&expression.charAt(i)!=']') {
							a.push(expression.charAt(i));
							i++;
						}else {
							v=a.isEmpty();
							int o=1;
							while(o==1&&v==false) {
							f+=a.pop();
							f+=" ";	
							v=a.isEmpty();
							if(v==false) {
							x=order(expression.charAt(i));
							y=order((char) a.peek());
							if(x<y||(char)a.peek()=='('||(char)a.peek()=='[') {
								o=0;
							}else {
								o=1;
							}
							}
							}
							a.push(expression.charAt(i));
							i++;
						}
						}
					}
						}
					}
					char u=(char) a.peek();
					while(u!='('&&u!='[') {
					v=a.isEmpty();
					if(v==false) {
					f+=a.pop();
					f+=" ";
					}					
						u=(char) a.peek();						
					}
					a.pop();
					i++;
					if(i>=expression.length()) {
						break;
					}
										
				}
				
				
				}
				
			}
			}		
						
		}		
		v=a.isEmpty();
		while(v==false) {
		f+=a.pop();
		v=a.isEmpty();
		if(v==false) {
			f+=" ";
		}
		
		
		}
	
		
		return f;
	}
	
	
	
	
	
	
	/**
	* Evaluate a postfix numeric expression, with a single space separator between terms
	* @param the postfix expression
	* @return  (int n)the expression evaluated value , or throw exception if there is an operator insted of + or - or * or /
	*/
	
	public int evaluate(String expression) {
		int total;		
		int no1,no2;
		int len = expression.length();
		int d=0;
		int q=0;
		int j=1;
		int t=0;
		int k=1;
		int p=0;
		int i=0;
		if(IsNumber(expression.charAt(expression.length()-1))||expression.charAt(expression.length()-1)==' '){
			try {
				throw new Exception ("Error");
			} catch (Exception e) {
				System.out.println("Error");
			}
			
		}
		for(int l =0;l<expression.length();l++) {
			if(expression.charAt(l)!='+'&&expression.charAt(l)!='-'&&expression.charAt(l)!='/'&&expression.charAt(l)!='*'&&expression.charAt(l)!=' '&&!IsNumber(expression.charAt(l))) {
				try {
					throw new Exception ("Error: invalid operators");
				} catch (Exception e) {
					System.out.println("Error: invalid operators");
				}
			}
		}
		boolean  v= true;
		for( i=0;i<len;) {
			d=0;
			j=0;
			q=0;
			k=1;
			if(expression.charAt(i)==' ') {
				i++;
			}
			else {
			if(expression.charAt(i)=='+'||expression.charAt(i)=='-'||expression.charAt(i)=='*'||expression.charAt(i)=='/'||IsNumber(expression.charAt(i))) {
				if(IsNumber(expression.charAt(i))) {
					t=i;
					while(expression.charAt(i)!=' ') {
						j++;
						i++;
					}
					int[] arr=new int  [j];
					for( p=0;p<j;p++) {
						arr[p]=expression.charAt(t)-'0';
						t++;
					}
					for( p=j-1;p>=0;p--) {
						d+=arr[p]*k;
						k*=10;
					}
					a.push(d);
				}else if(expression.charAt(i)=='-'&&i+1<expression.length()) {
					if(expression.charAt(i)!=' ') {
					i++;
					t=i;	
					while(expression.charAt(i)!=' ') {
						j++;
						i++;
					}
					int [] arr=new int  [j];
					for( p=0;p<j;p++) {
						arr[p]= expression.charAt(t)-'0';
						t++;
					}
					for( p=j-1;p>=0;p--) {
						q+=arr[p]*k;
						k*=10;
					}
					q=-q;
					a.push(q);
					  }else {
						 v=a.isEmpty();
						 if(v==false) {
							 no2= (int)a.pop();
						     no1=(int) a.pop();
						     total= (int)no1 - no2 ;
							    a.push(total);
							    i++;
						     
						 }
					  }
				}
					  else if (expression.charAt(i)=='+'||expression.charAt(i)=='*'||expression.charAt(i)=='/'||(expression.charAt(i)=='-'&&i+1==expression.length())) {
					v=a.isEmpty();
					if(v==false) {
						no2= (int)a.pop();
						no1=(int) a.pop();
						switch (expression.charAt(i)) {
						   case '+' :
						    total=no1 + no2 ;
						    a.push(total);
						    i++;
						    break;
						    
						    case '-' :
						    	total=no1 -no2 ;
								a.push(total);
								i++;
								break;
							   
							case '*' :
							total=no1 * no2 ;
							a.push(total);
							i++;
							break;
							case  '/' :
							total=no1 / no2 ;
							a.push(total);
							i++;
							break;												
					}
						
				}
			}
					  
				}
			}
		}
		
	
				
		/**
		 * int n is the final value that would be returned
		 */
	   int n= (int) a.pop();
	   return   n;
		
	}
	
	
	/**
	* checks if the given char is number or not
	*
	* @param char 
	* @return true if the character is number , false if it is not a number
	*/


	private boolean IsNumber(char charAt) {
		if(charAt<'0'||charAt>'9') {
		return false;
		}
		return true ;
	}
	
	
	
	/**
	* define the order of operators 
	* @param char (the operator)
	* @return int (integer tells the operator order and Precedence  from 1 to 10)
	* (e.g., if the operator has  the highest piriority then the method returns the least number which is 1)    
	*/
	
	
	private int order(char x) {
		if(x=='('||x=='['||x=='.') {
			return 1;
		}else if(x=='!') {
			return 2;
		}else if(x=='*'||x=='/'||x=='%') {
			return 3;
		}else  if(x=='+'||x=='-') {
			return 4;
		}else if(x=='<'||x=='>') {
			return 5;
		}else if(x=='&') {
			return 6;
		}else if(x=='^') {
			return 7;
		}else if(x=='|') {
			return 8;
		}else if(x=='=') {
			return 9;
		}else if(x==',') {
			return 10;
		}
		return 0;
	}
	
	
	
	/**
	* checks if the infix expression is balanced or not (all the Parenthesis in it is matched or not) 
	*
	* @param string (the infix expression)
	* @return true if the infix expression is balanced , false if not
	*/
	
	
	public static boolean isParenthesisMatch(String str) {
		
		implement w =new implement();
	    if (str.charAt(0) == '[')
	        return false;

	    char c;
	    for(int i=0; i < str.length(); i++) {
	        c = str.charAt(i);

	        if(c == '(')
	            w.push(c);
	        else if(c == '[')
	            w.push(c);
	        else if(c == ')')
	            if(w.isEmpty())
	                return false;
	            else if((char)w.peek() == '(')
	                w.pop();
	            else
	                return false;
	        else if(c == ']')
	            if(w.isEmpty())
	                return false;
	            else if((char)w.peek() == '[')
	                w.pop();
	            else
	                return false;
	    }
	    return w.isEmpty();
	}
	
	


}
