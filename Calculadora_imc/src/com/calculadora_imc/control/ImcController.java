package com.calculadora_imc.control;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import com.calculadora_imc.model.ImcBean;
import com.calculadora_imc.view.Mainviewer;

public class ImcController implements ActionListener{
	private Mainviewer context;
	private ImcBean imc;
	public ImcController() {
		
	}
	
	public ImcController(Mainviewer context) {
		if(this.context == null)
			this.context = context;
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		imc = new ImcBean(context.getPesotextField().getText(),
						  context.getAlturatextField().getText());
		 
		context.getResultadoPane().setText(imc.toString());
	}
	

}
