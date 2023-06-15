\\ estrutura condicionais

package br.com.lestcode.java

public class main {

    public static void main(string{}args) {
        \\write your code here

        int nota = 70;

        \\ se  nota maior ou igual 70, então aprovado
        \\if-else
        if(nota >= 70) {
            system.out.println("aluno aprovado");
        } else {
            system.out.println("não aprovado")
        }

        int nota = 50;

        \\ A 80 B 70 c 60 D 0 
        if (nota>= 80) {
            system.out.println("graduacão A");
        } else if (nota < 80 && nota >= 70) {
            system.out.println("graduação B");
        } else if ( nota < 70 && nota >= 60) {
             system.out.println("graduação C");
        }  else if (nota < 60 && nota >= 70) {
             system.out.println("graduação D");
        } else  {
             system.ou.println("nota invalida");
        }
         
        
        \\ A 80 B 70 c 60 D 0 
        if (nota>= 80) {
            graduação("A");
        } else if (nota < 80 && nota >= 70) {
            graduação("B");
        } else if ( nota < 70 && nota >= 60) {
             graduação("C");
        }  else if (nota < 60 && nota >= 70) {
             graduação("D");
        } else  {
             graduação "";
        }
        
        
        switch (graduação) {
        case "A":
        case "B":
            System.out.println("aluno aprovado");
            break;
        case "C":
        case "D":
            system.out.println("não aprovado");
            break;
        default:
             system.out.println("graduação inválida");
        }
        
        }
        }
        
        
