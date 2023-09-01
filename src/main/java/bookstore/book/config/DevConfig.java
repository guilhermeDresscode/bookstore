package bookstore.book.config;

import bookstore.book.service.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Profile;
@Configuration
@Profile("dev")
public class DevConfig {
   @Autowired
   private DBService dbService;
   private String strategy;
   @Bean
   public Boolean instanciaBaseDeDados(){
      if (strategy.equals("create")) {
         this.dbService.instanciaBaseDeDados();
      }
      return false;
   }
}
