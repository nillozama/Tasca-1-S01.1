package Nivell_3_1;

import java.util.ArrayList;

public class Redactor {
	
	ArrayList <Noticia> llistaNoticies;
	private String nom;
	private final String DNI;
	private static float sou;
	
	public Redactor(String nom, String DNI) {
		
		llistaNoticies=new ArrayList <Noticia>();
		this.nom=nom;
		this.DNI=DNI;
		sou=1500;
	}

	public String getNom() {
		return nom;
	}

	public void setNom(String nom) {
		this.nom = nom;
	}

	public static float getSou() {
		return sou;
	}

	public static void setSou(float sou) {
		Redactor.sou = sou;
	}

	public String getDNI() {
		return DNI;
	}
	
	public void addNews(Noticia noticia){
		
		llistaNoticies.add(noticia);
	}
	
	public void removeNews(Noticia noticia) {
		
		llistaNoticies.remove(noticia);
	}
	
	public Noticia validateNewNews(String titular) {
		
		Noticia noticia=null;
		String message="";
		int index;
		
		index=findNewsInList(titular);
		
		if(index!=-1) {
		
			message="El titular "+titular+"  ja existeix a la base de dades.";
			noticia=llistaNoticies.get(index);
		}
		
		System.out.println(message);
		return noticia;
	}
	public int findNewsInList(String titular) {
		
		int index=-1;;
		int i=0;
		
		if(llistaNoticies.size()>0) {
			do {	
					
				if(titular.equalsIgnoreCase(llistaNoticies.get(i).getTitular())) {
				
					index=i;
				}
			
				i++;
			
			}while (i<llistaNoticies.size()&&!(titular.equalsIgnoreCase(llistaNoticies.get(i-1).getTitular())));
		}
		return index;
	}
	
	public Noticia validateNews(String titular) {
		
		Noticia noticia=null;
		String mensaje="El titular no existeix a la base de dades.";
		int index;
		
		index=findNewsInList(titular);
		
		if(index!=-1) {
			
			noticia=llistaNoticies.get(index);
			mensaje="";
		}
		
		System.out.println(mensaje);
		return noticia;
	}

	@Override
	public String toString() {
		return "[llistaNoticies=" + llistaNoticies + "]";
	}
	
}
