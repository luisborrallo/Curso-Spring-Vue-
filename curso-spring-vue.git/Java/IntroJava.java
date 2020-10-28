

public class IntroJava {

	public static void main(String[] args){
		System.out.println("Bienvenidos a ICA");
		repetirMensaje(5);
	}


	private static void repetirMensaje(int veces){
		String mensajeFun="Variable local a la funcion";
		for (int i = 0; i < veces; i++) {
			 String texto =mensajeFun+""+i;
			 System.out.println("<p> "+ mensajeFun+""+i+ "</p>");
			

		}
		System.out.println("<p>"+ mensajeFun+"</P>");
		}
		
}