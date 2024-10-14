package imposto_teste;

import java.util.Scanner;

public class ImpostoDeRenda {
	
	public static double calcularImpostSal(double rendaAnSal) {
		double imposto = 0.0;
		double rendaM =rendaAnSal / 12;
		
		if(rendaM <= 3000.00) {
 return 0.0;
		}
		else if (rendaM <= 5000.00) {
			imposto = (rendaM - 3000.00) * 0.10 * 12;
		}
		else {
			imposto = (5000.00 - 3000.00) * 0.10 * 12 + (rendaM - 5000.00) * 0.20 * 12;
	}
  return imposto;
	}	
	
	 public static double Servicos(double rendaServicos) {
	        return rendaServicos * 0.15;
	 }
	                
	public static double impostoCapital(double capital) {
		return capital * 0.20;
	}
	
	public static double deducao(double imBruto, double gastosM, double gastosEducacao) {
		double gastosT = gastosM + gastosEducacao;
		double limiteDeducao = imBruto * 0.30;
		
	if( gastosT >= limiteDeducao) {
		return limiteDeducao;
	}
	else {
		return  gastosT;
	}
	
	}
	public static void main(String[] args) {
		Scanner Scanner = new Scanner(System.in);
		
	System.out.println("digite a renda anual: R$ ");	
		double rendaAnSal = Scanner.nextDouble();
	
	System.out.println("digite sua renda com prestações de serviços: R$ ");
		double rendaServicos = Scanner.nextDouble();
	
	System.out.println("Digite o ganho de capital anual: R$ ");
    	double capital = Scanner.nextDouble();
      
    System.out.println("Digite o total de gastos médicos no ano: R$ ");
    	double gastosM = Scanner.nextDouble(); 
      
    System.out.println("Digite o total de gastos educacionais no ano: R$ ");
    	double gastosEducacao = Scanner.nextDouble();
    
    	double impostoSalario =  calcularImpostSal(rendaAnSal);
	
    	double impostoServicos = Servicos(rendaServicos);
    
    	double impostoGanhoCapital = impostoCapital(capital);
    
    	double impostoBruto = impostoSalario + impostoServicos + impostoGanhoCapital;
	
    	double deducao = deducao(impostoBruto, gastosM, gastosEducacao);
    
    	double impostoFinal = impostoBruto - deducao;
    
    
    System.out.printf("Relatório de Imposto de Renda:%n");
    System.out.printf("Imposto sobre salário: R$ %.2f%n", impostoSalario);
    System.out.printf("Imposto sobre prestação de serviços: R$ %.2f%n", impostoServicos);
    System.out.printf("Imposto sobre ganho de capital: R$ %.2f%n", capital);
    System.out.printf("Imposto bruto: R$ %.2f%n", impostoBruto);
    System.out.printf("Deduções permitidas: R$ %.2f%n", deducao);
    System.out.printf("Imposto final a ser pago: R$ %.2f%n", impostoFinal);

    Scanner.close();
    
	}
	
}

