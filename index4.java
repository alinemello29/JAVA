package br.com.letscode,java;
import java.util.Locale;
import java.line.LocalDate;
import java.line.LocalDateTime;
public class main {
  
  pulic static void main(string[]args) {
    \\olá {nome} hoje é {dia da semana}, Bom dia.
      
    string nome = "Jessé";
    system.out.println(nome.toUpperCase());
    system.out.println(nome.toLoerCase());
    system.out.println(nome.length());
    
    string nome= "Jessé"
      
      \\ISO 8681
      LocalDate hoje - LocalDate.now();
      locale brasil = new locale(languege:"pt", country:"BR"); 
      \\locale brasil = new locale("pt","BR");
      system.out.println(hoje.getdayofweek().getDisplayName(textStyle.FULL,brasil));
      string - diadasemana = (hoje.getdayofweek().getDisplayName(textStyle.FULL,brasil)
      string saudação;
      LocalDateTime agora = LocalDateTime.now();
      if (agora.getHour() >= 8 && agora.getHour() < 12) {
        saudação = "bom dia!";
      } else if(agora.getHOur() >= 12 && agora.Hour() < 18) {
        saudação = "boa tarde!";
      } else if(agora.getHour() >= 18 && agoraHour() < 24 {
        saudação = "boa noite!";
      } else {
         saudação = "olá";
      }
      
      systtem.out.printf("ola, %s. Hoje é %s. %n", nome, diadasemana, saudação;toUpperCase();                  
    }
}

