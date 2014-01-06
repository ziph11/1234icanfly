import java.util.Scanner;
public class Game {
	
	private static int Gam = 1;	
	public static void main(String[] args) {
		while (Gam == 1){
			
			Scanner Game = new Scanner (System.in);
			
		System.out.println ("Choose your class");
		System.out.println ("a) Warrior (150HP 50DM) b) Mage(120HP 80DM)");
		String one;
		
		one = Game.nextLine ();
		if (one.equals ("a")){
			m1();
			String two;
			two = Game.nextLine ();
			if (two.equals ("a")){
				m2();
				String three = Game.nextLine ();
				if (three.equals("a")){
					m3();
					String four = Game.nextLine ();
					if (four.equals("a")){
						m4();
						String f = Game.nextLine ();
						if (f.equals("a")){
							m5();
							String A = Game.nextLine ();
							if (A.equals("a")){
								m6();
								String B = Game.nextLine ();
								if (B.equals("a")){
									m7();
									String C = Game.nextLine ();
									if (C.equals("a")){
										m8();
									}
										else{
											m9();
											Over();
										}
								}
								else{
									m10();
									String D = Game.nextLine ();
									if (D.equals("a")){
										m11();
										Over();
									}
									else{
										m12();
										break;
									}
										}
							}
								else{
									m13();	
									String E = Game.nextLine ();
									if (E.equals("a")){
										m9();
									}
									else{
										m8();
									}
								}//end of else
								}//end of if5
							else{
								m14();
								String F = Game.nextLine ();
								if (F.equals("a")){
									m15();
									String G = Game.nextLine ();
									if (G.equals("a")){
										m16();
										String H = Game.nextLine ();
										if (H.equals("a")){
											m17();
											String I = Game.nextLine ();
											if (I.equals("a")){
												System.out.println ("The gaurds overwhelm you.");
												Over();
												}//end of if4
											else{
												m18();
												Over();
											}//end of else4I
										}//end of if3I
										else{
											System.out.println ("You approach the gaurd.");
											System.out.println ("The gaurd asks what your business is.");
											String J = Game.nextLine ();
											System.out.println ("The gaurd leads you into the castle to have a conference with the king.");
											System.out.println ("'What does this peasant of a soldier want?' asks the King.");
											String K = Game.nextLine ();
											if (K.equals("I seek a Talisman")){
												System.out.println ("THE KING HANDS YOU THE TALISMAN! YOU WIN!");
												break;
											}//end of ifK
											else{
											System.out.println ("'I am sorry' says the King, ' I do not have that.");
											System.out.print ("'Through him in the dungeon!'");
											Over();
											}
										}//end of else3										
									}//end of if2G	
									else{
										System.out.println ("You go to the Town Hall");
										m16();
										String L = Game.nextLine ();
										if (L.equals("a")){
											m17();
											String N = Game.nextLine ();
											if (N.equals("a")){
												System.out.println ("The Gaurds overwhelm you.");
												Over();
											}//end of ifN
											else{
												m18();
												Over();
											}//end of else3-2N
										}//end of elseL
											else{
												pln ("You approach the gaurd.");
											pln ("The gaurd asks you what your business is");
											String O = Game.nextLine ();
											System.out.println ("The gaurd leads you into the town hall to have a conference with the Chancellor.");
											System.out.println ("'What does this peasant of a soldier want?' asks the Chancellor.");
											String P = Game.nextLine ();
											if (P.equals("I seek a Talisman")){
												System.out.println ("THE CHANCELLOR HANDS YOU THE TALISMAN! YOU WIN!");
												break;
											}//end of ifK
											else{
											System.out.println ("'I am sorry' says the Chancellor, ' I do not have that.");
											System.out.print ("'Through him in the dungeon!'");
											Over();
								}//end of if1F								
										}// end of ifP
									}//end of ifG
									}//end of else8
									else{
										System.out.println ("You ignore the man.");
										System.out.println ("The monster hunts you down and kills you.");
										Over();
									}//end of ifF
							}//end of if 5
							}//end of if 4
						
					}//end of if 3
				else{//else 9
					System.out.println ("You chose the forest.");
					System.out.println ("However a monster (100HP 60Dm) stands in your way.");
					System.out.println ("Would you like to a) fight or b) wait?");
					String Q = Game.nextLine ();
					if (Q.equals("a")){//if Q
						System.out.println ("You attack the monster and do 50DM.The Monster is stunned");
						System.out.println ("Monster attacks you but doesn't hit.");
						System.out.println ("You attack the monster again but you miss.");
						System.out.println ("The monster hits you and does 50Dm.");
						System.out.println ("You attack monster and do 50DM. Monster is dead.");
						System.out.println ("You pick up loot 'Potion'");
						System.out.println ("Do you a) drink it or b) leave it?");
						String R = Game.nextLine ();
						if (R.equals("a")){//ifR
							System.out.println ("You drink the potion and you now have 120HP");
							System.out.println ("You spot an elf.");
							System.out.println ("Do you a) attack or b) approach?");
							String S = Game.nextLine ();
							if (S.equals("a")){//if S
								m11();
								Over();								
							}//end of ifS
							else{//else 10
								m12();
							}//end of else 10
						}//end of if R
						else{//else 11
							m13();
							String T = Game.nextLine ();
							if (T.equals("a")){//if T
								m9();
								Over();
							}//end of if T
							else{//else 12
								m8();
								Over();
							}//end of else 12
						}//end of else 11
					}//end of if Q
					else{//else 13
						pln ("You wait for the monster to attack you.");
						pln ("The monster attacks you and stuns you.");
						pln ("You try to attack back but you miss.\nThe monster attacks you again.");
						Over();
					}
					}
				}//end of if 2
						
				else{ //else 14
					pln ("You wait for something to happen.");
					pln ("Suddently a  monster attacks you and stuns you.");
					pln ("You try to attack back but you miss.\nThe monster attacks you again.");
					Over();
				}//end of if 2	
			
								}//end of if1
		else{
			Mage();
			break;
		}
								
		
	Game.close();
							}//end of main
				
		
			
	}//end of while			
			
	
	public static void m1 (){
		System.out.println ("You are now a Warrior.");
		System.out.println ("You are in a carriage.");
		System.out.println ("Would you like to a) jump out or b) wait?");	
	}
	public static void m2 (){
		System.out.println ("You jump out");
		System.out.println ("You lost 50HP when you hit the ground");
		System.out.println ("Would you like to go in a)the City or b)the forest?");
	}
	public static void m3 (){
		System.out.println ("You chose the city.");
		System.out.println ("However a monster (100HP 60Dm) stands in your way.");
		System.out.println ("Would you like to a) fight or b) wait?");
	}
	public static void m4 (){
		pln ("You attack the monster and do 50DM.The Monster is stunned");
		pln ("Monster attacks you but doesn't hit.");
		pln ("You attack the monster again but you miss.");
		pln ("The monster hits you and does 50Dm. You now have 50HP");
		pln ("Would you either like to a) fight or b) flee?");
	}
	public static void m5 (){
		System.out.println ("You attack monster and do 50DM. Monster is dead.");
		pln ("You pick up loot 'Potion'");
		pln ("Do you a) drink it or b) leave it?");
	}
	public static void m6 (){
		pln ("You drink the potion and you now have 120HP");
		System.out.println ("Would you like to a) move on or b) go to the forest");
	}
	public static void m7 (){
		System.out.println ("You spot a mage.");
		System.out.println ("Do you a) attack or b) approach?");
	}
	public static void m8 (){
		System.out.println ("You approach the Mage.");
		System.out.println ("The Mage attacks you and does 80DM.You are stunned.");
		System.out.println ("The Mage attacks you again.");
		System.out.println ("YOU ARE DEAD.");
	}
	public static void m9 (){
		pln ("You attack the Mage and do 50DM");
		pln ("The Mage attacks you and does 80DM.You are stunned");
		pln ("You attack back but miss.");
		pln ("Mage attacks you and does 80DM");
		pln ("YOU ARE DEAD.");
	}
	public static void m10 (){
		System.out.println ("You go to the forest.");
		System.out.println ("You see an elf");
		System.out.println ("Do you a) attack it or b) approach it?");
	}
	public static void m11 (){
		System.out.println ("You attack the elf and 50DM");
		System.out.println ("The elf attacks you and does 70DM");
		System.out.println ("YOU ARE DEAD.");
	}
	public static void m12 (){
		System.out.println ("'Greetings, traveler,' says the elf,");
		System.out.print ("'What do you seek?'");
		System.out.println ("I seek a Talisman");
		System.out.println ("'Do you mean this one?' asks the elf(pulls out Talisman)");
		System.out.println ("YOU TAKE THE TALISMAN YOU WIN");;		
	}
	public static void m13 (){
		System.out.println ("You do not drink the potion.");
		System.out.println ("You spot a Mage.");
		System.out.println ("Do you a) attack or b) approach?");	
	}
	public static void Over (){
		Scanner GameOv = new Scanner (System.in);
		System.out.println ("YOU ARE DEAD. Would you like to a)continue or b) Quit?");
		String K = GameOv.nextLine();
		if (K.equals ("a")){
			Gam = 2;
		}
		else {
			Gam = 0;
		}
		GameOv.close();
	}//end of over method
	public static void m14 (){
		System.out.println ("You flee the monster.");
		System.out.println ("A man offers you to get inside his carriage do you a) get in or b) keep running?");
	}
	public static void m15 (){
		System.out.println ("You get inside the carriage.");
		System.out.println ("The man asks you where you want to go.");
		System.out.println ("Do you want to go to a)the castle or b) the Town hall?");
	}
	public static void m16 (){
		System.out.println ("The carriage pulls up outside.");
		pln ("You spot a gaurd.");
		pln ("Do you a) attack or b) approach?");
	}
	public static void m17 (){
		pln ("You attack the gaurd and do 50DM");
		pln ("3 gaurds come running.");
		pln ("You are out numbered.");
		pln ("Do you a) continue fighting or b) flee?");
	}
	public static void m18 (){
		System.out.println ("You flee the fight but someone shoots an arrow at you doing 30DM");
		System.out.println ("You now have 20HP.");
		System.out.println ("You hide behind a trash can and slowly bleed to death.");
	}
	public static void pln (String s){
		System.out.println (s);
	}
	public static void Mage (){
		Scanner scan = new Scanner (System.in);
		pln ("You chose the Mage.");
		pln ("You are in a carriage.\nDo you a) jump out or b) wait?");
		String a = scan.nextLine();
		if (a.equals("a")){
			jumpout();
		}
		else{
			pln ("You wait for something to happen.");
			pln ("Suddently a  monster attacks you and stuns you.");
			pln ("You try to attack back but you miss.\nThe monster attacks you again.");
			Over();
		}
		
		scan.close();
	}//end of Mage
	public static void  jumpout (){
		Scanner scan = new Scanner (System.in);
		m2();
		String a =scan.nextLine();
		if (a.equals("a")){
			m3();
			String b = scan.nextLine();
			if (b.equals("a")){
				fight();	
			}
			else{
				pln ("You wait for something to happen.");
				pln ("Suddently a  monster attacks you and stuns you.");
				pln ("You try to attack back but you miss.\nThe monster attacks you again.");
				Over();
			}
		}//end of if 1
		else{
			m10();
			String c = scan.nextLine();
			if (c.equals("a")){
				m11();
			}
			else{ 
				m12();
			}
		}//end of else 1
		
		scan.close();
		
	}//end of jump out

	public static void fight (){
		Scanner scan = new Scanner (System.in);
		pln ("You attack the monster and do 80DM.The Monster is stunned");
		pln ("Monster attacks you but doesn't hit.");
		pln ("You attack the monster again.\nMONSTER IS DEAD!");
		pln ("You pick up loot 'Potion'");
		pln ("Do you a) drink it or b) leave it?");
		String a =scan.nextLine();
		if (a.equals("a")){
			pln ("You drink the potion and you now have 120HP");
			m7();
			String b = scan.nextLine();
			if (b.equals("a")){
				pln ("You attack the Mage and do 80DM\nMage is stunned");
				pln ("The Mage attacks you and does 80DM.You are stunned");
				pln ("You attack back and hit.");
				pln ("MAGE IS DEAD");
				pln ("YOU PICK UP LOOT - TALISMAN! YOU WIN!");
			
			
			}
			else{//else 2
				pln("Mage ignores you. ");
				pln("Do you a) go to the castle or b) go to the Town Hall?");
				String d = scan.nextLine();
				if (d.equals("a")){
					castle();
				}
						
			
			
			}//end of else2
		}//end of if 1
		else{//else 1
			m7();
			String c = scan.nextLine();
			if (c.equals("a")){
				m9();
				Over();
			}
			else{
				m8();
				Over();
			}
		}//end of else
		scan.close();
	}//end of fight
	public static void castle (){
		Scanner scan = new Scanner (System.in);
		pln ("You go to the castle.");
		pln ("You spot a gaurd.");
		pln ("Do you a) attack or b) approach?");
		String a =scan.nextLine();
		if (a.equals("a")){
			pln ("You attack the gaurd and do 50DM");
			pln ("3 gaurds come running.");
			pln ("You are out numbered.");
			pln ("YOU ARE DEAD.");
		}
		else{
			pln ("You approach the gaurd.");
			pln ("The gaurd asks you what your business is");
			String O =scan.nextLine();
			System.out.println ("The gaurd leads you into the town hall to have a conference with the King");
			System.out.println ("'What does this peasant of a soldier want?' asks the King");
			String P =scan.nextLine();
			if (P.equals("I seek a Talisman")){
				System.out.println ("THE KING HANDS YOU THE TALISMAN! YOU WIN!");
				
			}//end of if2
			else{
			System.out.println ("'I am sorry' says the King, ' I do not have that.");
			System.out.print ("'Through him in the dungeon!'");
			Over();
		}//end of else 
		}
	scan.close();
	}//end of castle




	
	}//end
	

	

//Izzy is awesome
//Izzy is very awesome

