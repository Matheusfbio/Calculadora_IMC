package aula06;

public class ControleRemoto implements Controlador {
	//atributos
	private int volume;
	private boolean ligado;
	private boolean tocando;
	
	//Metodos especiais
	
	public ControleRemoto() {
		this.volume = 50;
		this.ligado = true;
		this.tocando = false;
	}
	
	private int getVolume() {
		return volume;
	
	}
	
	public boolean isLigado() {
		return ligado;
	}

	private void setVolume(int volume) {
		this.volume = volume;
	}
	
	private boolean getligado() {
		return ligado;
	}
	
	private void setLigado(boolean ligado) {
		this.ligado = ligado;
	}
	
	private boolean getTocando() {
		return tocando;
	}
	
	private void setTocando(boolean tocando) {
		this.tocando = tocando;
	}
	//metodos abstratos

	@Override
	public void ligar() {
		 this.setLigado(true);
		
	}

	@Override
	public void desligar() {
		this.setLigado(false);
		
	}

	@Override
	public void abrirMenu() {
		System.out.println("---- MENU ----");
		System.out.println("esta ligado ?? " + this.getligado());	
		System.out.println("esta tocando ?? " + this .getTocando());
		System.out.print("Volume: " + this.getVolume());
		for (int i = 0; i <= this.getVolume(); i+=10) {
				System.out.print("|");
		}
	}

	@Override
	public void fecharMenu() {
		System.out.println("fechando o menu");
		
	}

	@Override
	public void maisVolume() {
		if (this.getligado()) {
			this.setVolume(this.getVolume() + 5);
		} else {
			System.out.println("Impossivel aumentar volume");	
		}
	}

	@Override
	public void menosVolume() {
		if (this.getligado()) {
		this.setVolume(this.getVolume() - 5);
		} else {
			System.out.println("Impossivel diminuir volume");
		}
	}

	@Override
	public void ligarMudo() {
		if (this.getligado() && this.getVolume() > 0) {
			this.setVolume(0);
		}
	}

	@Override
	public void desligarMudo() {
		if (this.getligado() && this.getVolume() == 0) {
			this.setVolume(50);
		}
		
	}

	@Override
	public void play() {
		if (this.getligado() && !(this.getTocando())) {
			this.setTocando(true);
		}
	}

	@Override
	public void pause() {
		if (this.getligado() && this.getTocando()) {
			this.setTocando(false);
		}
		
	}
}
