package Nivell_3_1;

import java.util.ArrayList;
import java.util.Scanner;

public class Principal1N3 {

	static ArrayList<Redactor> llistaRedactors=new ArrayList<Redactor>();
	
	public static void main(String[] args) {
		
		boolean sortirMenu=false;
		
		do{
			sortirMenu=showMenu(sortirMenu);
			
		}while(!sortirMenu);
	}
	
	public static boolean showMenu(boolean sortirMenu) {

		Redactor redactor;
		Noticia noticia;
		String nom;
		String dni;
		String titular;
		int esport;
		int indexSwitch;

		
		System.out.println("Programa per a gestionar la redacció de noticies.\n \n0- Sortir del programa. \n1- Introduir redactor. "
				+ "\n2- Eliminar redactor. \n3- Introduir notícia a un redactor.\n4- Eliminar notícia. \n5- Mostrar totes les notícies per redactor. \n6- Calcular puntuació de la notícia."
				+ "\n7- Calcular preu-notícia. \n");
		indexSwitch=requireIntNumber("Quina opció del menú vols triar?");
		
		switch(indexSwitch) {
		
		case 0:

			System.out.println("Gracies per utilitzar l'aplicació. Adeu!!");
			sortirMenu=true;

			break;
			
		case 1:
			

			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateNewEditor(dni);
			if(redactor==null) {
				
				nom=requireString("Introdueix nom del redactor.");
				addEditorToList(createEditor(nom, dni));
				System.out.println("El redactor "+nom+" amb DNI "+dni+" s'ha creat.");
			}
			break;
			
		case 2:

			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateEditor(dni);
			
			if(redactor!=null) {
				delateEditor(redactor);
				System.out.println("S'ha eliminat el redactor.");
			}	
			break;
			
		case 3:
					
			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateEditor(dni);
			
			if(redactor!=null) {
				
				titular=requireString("Introdueix el titular de la noticia.");
					
				if (redactor.validateNewNews(titular)==null) {
					
					do{
						esport=showMenuEsports("Introdueix de quin esport es la noticia.");
						
					}while(!(0<esport&& esport<7));
					

					noticia=createNews(titular, esport);
					
					if(noticia!=null) {
						redactor.addNews(noticia);
					}
					else {
							
						System.out.println("No s'ha pogut introduir la noticia. Has d'escollir un esport: Futbol, Basquet, Tenis, F1 o Motociclisme.");
					}
				}
			}
			break;

			
		case 4:

			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateEditor(dni);
			
			if(redactor!=null) {
				
				titular=requireString("Introdueix el titular de la noticia.");
				noticia=redactor.validateNews(titular);
				
				if (noticia!=null) {
					
					redactor.removeNews(noticia);

					System.out.println("S'ha eliminat la noticia de la llista.");
				}
			}
			break;
			
		case 5:

			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateEditor(dni);
			if(redactor!=null) {
				
				showEditor(redactor);
			}
			break;
			
		case 6:
			
			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateEditor(dni);
			
			if(redactor!=null) {
				
				titular=requireString("Introdueix el titular de la noticia.");
				noticia=redactor.validateNews(titular);
				
				if (noticia!=null) {

					System.out.println("La puntuació de la noticia es de: "+ noticia.getPuntuacio()+" punts.");
				}
			}
			break;
			
		case 7:
			
			dni=requireString("Introdueix el DNI del redactor.");
			redactor=validateEditor(dni);
			
			if(redactor!=null) {
				
				titular=requireString("Introdueix el titular de la noticia.");
				noticia=redactor.validateNews(titular);
				
				if (noticia!=null) {
					
					System.out.println("El preu de la noticia es de: "+ noticia.getPreu()+" euros.");
				}
			}
			break;
			
		default:
			
			System.out.println("Has d'escollir un número de la llista.");
		}
		
		return sortirMenu;
	}
	
	public static int showMenuEsports(String message) {
		
		System.out.println("Escull l'esport de la noticia (número del 1 al 6). \n1- Futbol.\n2- Basquet.\n3- Tenis.\n4- F1. \n5- Motociclisme.\n6- Altres.");
		
		return requireIntNumber(message);
	}
	
	public static Redactor createEditor(String nom, String dni) {
		
		Redactor redactor=new Redactor(nom, dni);
		return redactor;
	}
	
	public static void showEditor(Redactor redactor) {
		
		System.out.println(redactor); 
	}
	
	public static void delateEditor(Redactor redactor) {
		
		llistaRedactors.remove(redactor);
	}
	
	public static Noticia createNews(String titular, int esport){
		
		Noticia noticia=null;
		
		switch(esport){
		
			case 1:
				System.out.println("Has escollit futbol");
				noticia=createFutbol(titular, "Futbol", requireString("Introdueix la competició: Lliga de Campions/ Lliga / Altres."), requireString("Introdueix el club de referencia: Barça/ Madrid/ Altres."), requireString("Introdueix el jugador de referencia: Ferran Torres/ Benzema/ Altres."));
				break;
				
			case 2:
				System.out.println("Has escollit basquet");
				noticia=createBasquet(titular, "Basquet", requireString("Introdueix la competició: Eurolliga/ ACB/ Altres."), requireString("Introdueix el club de referencia: Barça/ Madrid/ Altres."));
				break;
				
			case 3:
				System.out.println("Has escollit tenis");
				noticia=createTenis(titular, "Tenis", requireString("Introdueix la competició."), requireString("Introdueix el tenista: Federer/ Nadal/ Djokovic/ Altres."));
				break;
				
			case 4:
				System.out.println("Has escollit F1");
				noticia=createF1(titular, "F1", requireString("Introdueix la escudria: Ferrari/ Mercedes/ Altres."));
				break;
				
			case 5:
				System.out.println("Has escollit motociclisme");
				noticia=createMotociclisme(titular, "Motociclisme", requireString("Introdueix l'equip: Honda/ Yamaha/ Altres."));
				break;
				
			case 6:
				System.out.println("Has escollit altres");
				noticia=new Noticia(titular, "Otro");
				break;
				
			default:
				System.out.println("Has d'escollir un número del 1 al 6 per indicar l'esport de la noticia.");
				
		}

		return noticia;
	}
	public static NoticiaFutbol createFutbol(String titular, String esport, String refCompeticio, String refClub, String refJugador){
		
		NoticiaFutbol futbol=new NoticiaFutbol(titular, esport, refCompeticio, refClub, refJugador);
		
		return futbol;
	}
	
	public static NoticiaBasquet createBasquet(String titular, String esport, String refCompeticio, String refClub){
		
		NoticiaBasquet basquet=new NoticiaBasquet(titular, esport, refCompeticio, refClub);
		
		return basquet;
	}
	
	public static NoticiaTenis createTenis(String titular, String esport, String refCompeticio,String refTenista) {
		
		NoticiaTenis tenis=new NoticiaTenis(titular, esport, refCompeticio, refTenista);
		return tenis;
	}
	
	public static NoticiaF1 createF1(String titular, String esport, String refEscuderia) {
		
		NoticiaF1 f1=new NoticiaF1(titular, esport, refEscuderia);
		return f1;
	}
	
	public static NoticiaMotociclisme createMotociclisme(String titular, String esport, String refEquip) {
		
		NoticiaMotociclisme moto=new NoticiaMotociclisme(titular, esport, refEquip);
		return moto;
	}
	
	public static void showNews(Noticia noticia) {
		
		switch(noticia.getEsport()){
		
		case "Futbol":
			
			NoticiaFutbol futbol=(NoticiaFutbol) noticia;
			System.out.println(futbol);;
			break;
			
		case "Basquet":
			NoticiaBasquet basquet=(NoticiaBasquet) noticia;
			System.out.println(basquet);
			break;
			
		default:
			
			System.out.println("No s'ha trobat cap coincidencia. Mireu si l'esport es correcte");
		}
	}
	
	public static int findListedEditors(String dni) {
		
		int index=-1;
		int i=0;
		
		if(llistaRedactors.size()>0) {
			do {	
					
				if(dni.equalsIgnoreCase(llistaRedactors.get(i).getDNI())) {
				
					index=i;
				}
			
				i++;
			
			}while (i<llistaRedactors.size()&&!(dni.equalsIgnoreCase(llistaRedactors.get(i-1).getDNI())));
		}
		return index;
	}

	public static Redactor validateNewEditor(String dni) {
		
		Redactor redactor=null;
		String message="";
		int index;
		
		index=findListedEditors(dni);
		
		if(index!=-1) {
		
			message="El redactor amb dni número "+dni+"  ja existeix a la base de dades.";
			redactor=llistaRedactors.get(index);
		}
		
		System.out.println(message);
		return redactor;
	}

	public static Redactor validateEditor(String dni) {
		
		Redactor redactor=null;

		String message="El redactor amb dni número "+dni+" no es troba a la base de dades.";
		int index;
		
		index=findListedEditors(dni);
		
		if(index!=-1) {
			
			redactor=llistaRedactors.get(index);
			message="";	
		}
		
		System.out.println(message);
		return redactor;
	}
	
	public static void addEditorToList(Redactor redactor) {
		
		llistaRedactors.add(redactor);
	}
	
	public static int requireIntNumber(String message) {
		
		Scanner sc=new Scanner(System.in);
		int num;
		
		System.out.println(message);
		num=sc.nextInt();
		
		return num;
	}
	
	public static String requireString(String message) {
		
		Scanner sc=new Scanner(System.in);
		String string;
		
		System.out.println(message);
		string=sc.nextLine();
		
		return string;
	}
}


