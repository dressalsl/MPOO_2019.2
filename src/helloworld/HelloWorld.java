package helloworld;

import java.text.SimpleDateFormat;
import java.util.Date;

public class HelloWorld {

	private String nome;

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}
	
	public String getHora() {	
		SimpleDateFormat hora_final = new SimpleDateFormat("HH:mm:ss");
		return hora_final.format(new Date());
	}
	public void print(){
		System.out.printf("%s - Olá %s. Você acabou de fazer o seu primeiro programa em Java.Parabens! \n",this.getHora(), this.getNome());
		
    }

		
	}