package Arquivos;

import java.util.ArrayList;

public class EmitirRelatorio {
	
	public static void Relatorio(ArrayList<?> relatorio) {
		for (var linha : relatorio) {
			System.out.println(linha.toString());
		}
	}
}
