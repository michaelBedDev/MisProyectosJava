package programaDiscos;

import java.util.Scanner;

public class Peso {

	private double input;
	final double barra = 20;
	private Discos [] tipoDisco  = new Discos [20];
	private int maxDiscos = 20;
	private int [] contadorDiscos = new int [7];
	
	
	public void calcularPeso() {
		Scanner sc = new Scanner(System.in);
		do {
			System.out.println("Introduce el peso a calcular. Ejemplo: [50]/[77,5]");
			this.input = sc.nextDouble();
			
			if (input <=0) {
				System.out.println("Por favor, introduce un peso a levantar no a atraer");
			}
		} while (input <=0);
		
		if (input <= barra) {
			System.out.println("Que haceas matao, tira con la barra anda");
		}
		
		this.tipoDisco = calcularDiscos();
		
		
		for (int i = 0; i < tipoDisco.length; i++) {
			
				if (tipoDisco[i] == Discos.DISCO25) {
					contadorDiscos[0]++;
				} else if (tipoDisco[i] == Discos.DISCO20) {
					contadorDiscos[1]++;
				} else if (tipoDisco[i] == Discos.DISCO15) {
					contadorDiscos[2]++;
				} else if (tipoDisco[i] == Discos.DISCO10) {
					contadorDiscos[3]++;
				} else if (tipoDisco[i] == Discos.DISCO5) {
					contadorDiscos[4]++;
				} else if (tipoDisco[i] == Discos.DISCO_250) {
					contadorDiscos[5]++;
				} else if (tipoDisco[i] == Discos.DISCO_125) {
					contadorDiscos[6]++;
				} 
			}
	
		System.out.print("25KG \t20KG \t15 KG \t10KG \t5 KG \t2.5KG \t1.25 KG\n");
		for (int i = 0; i < contadorDiscos.length; i++) {
			System.out.print(contadorDiscos[i]+"\t");
		}
	}
	
	
	private Discos [] calcularDiscos() {
		
		if (input%2.5 != 0) {
			System.out.println("Introduce un peso válido");
			return tipoDisco;
		}
		else {
			if (input-barra >= 50 ) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO25;
						this.tipoDisco[i+1] = Discos.DISCO25;
						input -=50;
						break;
					}
				}
				calcularDiscos();
			}
			
			else if(input-barra >= 40 && input-barra < 50) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO20;
						this.tipoDisco[i+1] = Discos.DISCO20;
						input -=40;
						break;
					}
				}
				calcularDiscos();
			}
			
			else if(input-barra >= 30 && input-barra < 40) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO15;
						this.tipoDisco[i+1] = Discos.DISCO15;
						input -=30;
						break;
					}
				}
				calcularDiscos();
			}
			
			else if(input-barra >= 20 && input-barra < 30) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO10;
						this.tipoDisco[i+1] = Discos.DISCO10;
						input -=20;
						break;
					}
				}
				calcularDiscos();
			}
			
			else if(input-barra >= 10 && input-barra < 20) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO5;
						this.tipoDisco[i+1] = Discos.DISCO5;
						input -=10;
						break;
					}
				}
				calcularDiscos();
			}
			
			else if(input-barra >= 5 && input-barra < 10) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO_250;
						this.tipoDisco[i+1] = Discos.DISCO_250;
						input -=5;
						break;
					}
				}
				calcularDiscos();
			}
			
			else if(input-barra >= 2.5 && input-barra < 5) {
				for (int i = 0; i < maxDiscos; i++) {
					if (tipoDisco[i] == null) {
						this.tipoDisco[i] = Discos.DISCO_125;
						this.tipoDisco[i+1] = Discos.DISCO_125;
						input -=2.5;
						break;
					}
				}
				calcularDiscos();
			}
		}
		
		
		
		return tipoDisco;
	}


	
	
	
	
	
	
	public double getInput() {
		return input;
	}


	public void setInput(double input) {
		this.input = input;
	}


	public Discos[] getTipoDisco() {
		return tipoDisco;
	}


	public void setTipoDisco(Discos[] tipoDisco) {
		this.tipoDisco = tipoDisco;
	}


	public int getMaxDiscos() {
		return maxDiscos;
	}


	public void setMaxDiscos(int maxDiscos) {
		this.maxDiscos = maxDiscos;
	}


	public int[] getContadorDiscos() {
		return contadorDiscos;
	}


	public void setContadorDiscos(int[] contadorDiscos) {
		this.contadorDiscos = contadorDiscos;
	}

	public double getBarra() {
		return barra;
	}
	
}
