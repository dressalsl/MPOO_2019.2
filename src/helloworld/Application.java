package helloworld;


public class Application {
	public static void main(String[] args) {
		
		
		HelloWorld helloWorld = new HelloWorld();
		HelloWorld helloWorld2 = new HelloWorld();
		
		helloWorld.setNome("Andressa");
		System.out.println(helloWorld.getNome());
		System.out.println(helloWorld2.getNome()); // É NULL PQ N APONTA PRA NADA	
		
		helloWorld2.setNome("Gabriel");
		System.out.println(helloWorld2.getNome());
		
		helloWorld.print();
		helloWorld2.print();
		
		
		
	}
}