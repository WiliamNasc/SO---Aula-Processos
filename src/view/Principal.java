package view;

import java.io.IOException;

import controller.ProcController;

public class Principal {

	public static void main(String[] args) throws IOException {
		
		ProcController pCont = new ProcController();
		//pCont.prop();
		
		// comandos como teste de PING funcionam no ler processo 
		// no processo ele executa um processo
		
		//String path = "C:\\Windows\\regedit.exe";
		//pCont.Processo(path);
		
		String info = "5556";
		pCont.mataProcesso(info);
		
		// LISTA DE EXERCICIOS : EXERCICIOS PROCESSOS

	}

}