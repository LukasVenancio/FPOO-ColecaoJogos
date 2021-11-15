package br.senai.sp.jandira;

import br.senai.sp.jandira.model.Console;
import br.senai.sp.jandira.model.Fabricante;
import br.senai.sp.jandira.model.Jogo;
import br.senai.sp.jandira.ui.FrameColecao;

public class App {

	public static void main(String[] args) {
		

		Jogo GTA = new Jogo();
		Fabricante RockStar = new Fabricante();
		
		GTA.setTiulo("Grand Teft Auto");
		GTA.setStatus(true);
		GTA.setFabricante(RockStar);
		GTA.setConsole(Console.XBOX);
		GTA.setValor(69.90);
		GTA.setObservacoes("Ainda faltando completar missões secundarias.");
		
		System.out.println(GTA.getTiulo());
		System.out.println(GTA.getValor());
		System.out.println(GTA.getConsole());
		System.out.println(GTA.getFabricante());
		System.out.println(GTA.getObservacoes());
		
		FrameColecao frame1 = new FrameColecao();
		frame1.setVisible(true);
	}

}
