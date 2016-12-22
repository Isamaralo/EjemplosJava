package edu.femxa.val;

public enum TipoNota {SOBRESALIENTE, NOTABLE, BIEN, APROBADO, SUSPENSO;
	
	public static TipoNota traduceNota (int nota)
	{
		TipoNota devuelvo = null;
		
		switch (nota){
		case 10:
		case 9: devuelvo = TipoNota.SOBRESALIENTE;
			break;
		case 8:
		case 7: devuelvo = TipoNota.NOTABLE;
			break;
		case 6: devuelvo = TipoNota.BIEN;
			break;
		case 5: devuelvo = TipoNota.APROBADO;
			break;
		case 4:
		case 3:
		case 2:
		case 1:
		case 0: devuelvo = TipoNota.SUSPENSO;
			break;
		default: System.out.println("La nota no es válida, no está entre 0 y 10.");				
		}
		
		return devuelvo;
	}

}
