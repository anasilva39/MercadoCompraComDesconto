

package desafiomercadodesconto;

import java.util.Scanner;


public class DesafiomercadoDesconto {

    
    public static void main(String[] args) {
        
        String prod;
        float total;
       
        Scanner entrada = new Scanner(System.in);
        
        System.out.println("Informe o nome do Produto: ");
        prod = entrada.nextLine();
        
        System.out.println("Digite a quantidade do Produto: ");
        int quant = entrada.nextInt();
       
        System.out.println("Digite o preço do Produto: ");
        float preco= entrada.nextFloat();
        
        float desc = 0;
        
        total = quant * preco;
        
        if(quant >=1 && quant <=10){
             total = total;
             
           }else if(quant >=11 && quant <= 20){
                 
                  desc = total * 10/100;        
            
                }else if(quant >=21 && quant < 50){
               
                         desc = total * 20/100;
                     
                   }else if(quant >=50){
                    
                            desc = total * 25/100;
       }
            
        float totalPagar = total - desc;

       System.out.printf("Total da Compra: R$ %.2f%n", total);

       System.out.printf("Desconto: R$ %.2f%n", desc);

       System.out.printf("Total a pagar: R$ %.2f%n", totalPagar);

       
       
        
    }
        
    
                
    }    
     
       
    
    

